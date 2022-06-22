package EMR;

import java.util.ArrayList;

public class User {
    private ArrayList<Records> records = new ArrayList<>();
    private String userName;
    private static int cardNumberCount = 1;
    private int userCardNumber;

    public User(String name) {
        this.userName = name;
        this.userCardNumber = cardNumberCount;
        cardNumberCount++;
    }

    public ArrayList<Records> getRecords() {
        return records;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserCardNumber() {
        return userCardNumber;
    }

    public void addRecord(String userName, String nameOfTest, int cardId, int testId, int consultantId) {
        Records myRecord = new Records(userName, nameOfTest, cardId, testId, consultantId);
        records.add(myRecord);
    }

    public void deleteRecord(int cardId) {
        for (Records myRecord : records) {
            if (myRecord.getCardId() == cardId) {
                records.remove(myRecord);
                System.out.println("Patient with card Id " + cardId + " has been successfully deleted!");
                return;
            }
        }
        throw new UserException("Patient with card Id " + cardId + " does not exist!");
    }

    public static void resetId() {
        cardNumberCount = 1;
    }


}
