package EMR;

import java.util.Scanner;

public class EmrDriver {
    static Hospital hospital;
    static User user;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String hospitalName = "HealthTech Hospital";
        String hospitalAddress = "Yaba, Lagos";
        hospital = new Hospital(hospitalName, hospitalAddress);
        user = new User("Tolu");
        dummyData();
        System.out.println("##########################################################################");
        System.out.println("WELCOME TO " + hospital.getNameOfHospital().toUpperCase() + "," + " " + "We CARE!");
        System.out.println("##########################################################################");

        int sentinel = 0;
        while (sentinel != -1) {
            System.out.println("Enter 1 to register a new doctor");
            System.out.println("Enter 2 to create a Test");
            System.out.println("Enter 3 to view a doctor info");
            System.out.println("Enter 4 to view list of doctors");
            System.out.println("Enter 5 to view all available Tests");
            System.out.println("Enter 6 to delete a dokita");
            System.out.println("Enter 7 to delete a Test");
            System.out.println("Enter 8 to add patient record");
            System.out.println("Enter 9 to view patients record");
            System.out.println("Enter 10 to delete record");
            System.out.println("Enter 0 to quit");
            int answer = input.nextInt();
            switch (answer) {
                case 1 -> registerADoc();
                case 2 -> {
                    System.out.println("Enter Test Name");
                    String testName = input.next();
                    hospital.createTest(testName);
                }
                case 3 -> {
                    System.out.println("Enter doc ID");
                    int docID = input.nextInt();
                    System.out.println(hospital.getAConsultant(docID));
                }
                case 4 -> System.out.println(hospital.getConsultants());
                case 5 -> System.out.println(hospital.getTests());
                case 6 -> {
                    System.out.println("Enter doctors ID");
                    int dokitaID = input.nextInt();
                    hospital.deleteConsultant(dokitaID);
                }
                case 7 -> {
                    System.out.println("Enter Test ID");
                    int testID = input.nextInt();
                    hospital.deleteTest(testID);
                }
                case 8 -> {
                    System.out.println("Enter userName");
                    String userName = input.next();
                    System.out.println("Enter name of test");
                    String testName = input.next();
                    System.out.println("Enter the patient card ID");
                    int cardId = input.nextInt();
                    System.out.println("Enter the test ID");
                    int testId = input.nextInt();
                    System.out.println("Enter the doctor's ID");
                    int consultantId = input.nextInt();
                    user.addRecord(userName, testName,cardId,testId,consultantId);
                }
                case 9 -> System.out.println(user.getRecords());
                case 10 -> {
                    System.out.println("Enter card ID");
                    int cardID = input.nextInt();
                    user.deleteRecord(cardID);
                }

                case 0 -> sentinel = -1;
            }
        }

    }
    private static void registerADoc() {
        System.out.println("Enter doctors name: ");
        String docName = input.next();
        System.out.println("choose for doctor's expertise: \n 1-->NEUROLOGIST \n 2 --> RADIOLOGIST \n 3 --> ANESTHESIOLOGIST \n 4 --> PEDIATRICIAN \n 5 --> OBSTETRICIANS_GYNECOLOGIST \n 6 --> FAMILY_PHYSICIANS \n 7 --> EMERGENCY_PHYSICIAN");
        int response = input.nextInt();
        ConsultantType expertise = switch (response) {
            case 1 -> ConsultantType.NEUROLOGIST;
            case 2 -> ConsultantType.RADIOLOGIST;
            case 3 -> ConsultantType.ANESTHESIOLOGIST;
            case 4 -> ConsultantType.PEDIATRICIAN;
            case 5 -> ConsultantType.OBSTETRICIANS_GYNECOLOGIST;
            case 6 -> ConsultantType.FAMILY_PHYSICIANS;
            case 7 -> ConsultantType.EMERGENCY_PHYSICIAN;
            default -> null;
        };
        hospital.addConsultant(docName, expertise);
    }
    private static void dummyData() {
        hospital.addConsultant("Eden", ConsultantType.ANESTHESIOLOGIST);
        hospital.addConsultant("Philip", ConsultantType.NEUROLOGIST);
        hospital.createTest("Malaria");
        hospital.createTest("Diabetes");
        user.addRecord("Kola", "Malaria", 101, 1, 1);
        user.addRecord("Ayo", "Malaria", 102, 2, 2);
    }
}
