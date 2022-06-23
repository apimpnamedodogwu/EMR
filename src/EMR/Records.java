package EMR;

public class Records {
    private String nameOfTest;
    private int cardId;
    private int consultantId;
    private int testId;
    private String userName;

    public Records(String userName, String testName, int cardId, int testId, int consultantId) {
        this.userName = userName;
        nameOfTest = testName;
        this.cardId = cardId;
        this.consultantId = consultantId;
        this.testId = testId;
    }

    public String getNameOfTest() {
        return nameOfTest;
    }

    public int getCardId() {
        return cardId;
    }

    public int getConsultantId() {
        return consultantId;
    }

    public int getTestId() {
        return testId;
    }

    @Override
    public String toString() {
        return "Records{" +
                "nameOfTest='" + nameOfTest + '\'' +
                ", cardId=" + cardId +
                ", consultantId=" + consultantId +
                ", testId=" + testId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
