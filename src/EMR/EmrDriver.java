package EMR;

import java.util.Scanner;

public class EmrDriver {
    static Hospital hospital;
    static MedTest medTest;
    static  User user;
    static Scanner input = new Scanner(System.in);

    private static void hospPortal(){
        int sentinel=0;
        while (sentinel !=-1){
            System.out.println("Enter 1 to register a doctor");
            System.out.println("Enter 2 to create a test");
            System.out.println("Enter 3 to register a patient");
            int response = input.nextInt();

            switch (response){
                case 1:
                    System.out.println("Enter doctors Name: ");
                    String doctorsName = input.next();
                    System.out.println("choose for doctor's expertise: \n 1-->NEUROLOGIST \n 2 --> RADIOLOGIST \n 3 --> ANESTHESIOLOGIST \n 4 --> PEDIATRICIAN \n 5 --> OBSTETRICIANS_GYNECOLOGIST \n 6 --> FAMILY_PHYSICIANS \n 7 --> EMERGENCY_PHYSICIAN" );
                    int adminResponse = input.nextInt();
                    ConsultantType expertise = null;
                    switch (adminResponse){
                        case 1: expertise = ConsultantType.NEUROLOGIST;
                            break;
                        case 2: expertise = ConsultantType.RADIOLOGIST;
                            break;
                        case 3: expertise = ConsultantType.ANESTHESIOLOGIST;
                            break;
                        case 4: expertise = ConsultantType.PEDIATRICIAN;
                            break;
                        case 5: expertise = ConsultantType.OBSTETRICIANS_GYNECOLOGIST;
                            break;
                        case 6: expertise = ConsultantType.FAMILY_PHYSICIANS;
                            break;
                        case 7: expertise = ConsultantType.EMERGENCY_PHYSICIAN;
                    }
                    hospital.addConsultant(doctorsName, expertise);
                    System.out.println("The doc info you entered are: " + hospital.getAConsultant(1));
                case 2:
                    System.out.println("Enter test name");
                    String testType = input.next();
                    hospital.createTest(testType);
                    System.out.println("The test is: " + hospital.getTests());

            }
        }
    }

    public static void main(String[] args) {
        String hospitalName = "Semi-Care";
        String hospitalAddress = "Yaba, Lagos";
        Scanner input = new Scanner(System.in);
        hospital= new Hospital(hospitalName, hospitalAddress);
        System.out.println("WELCOME TO " + hospital.getNameOfHospital().toUpperCase() + " " + "We CARE");
        int sentinel = 0;
        while (sentinel != -1){
            System.out.println("Enter 1 for hospital portal");
            int answer = input.nextInt();
            switch (answer){
                case 1:
                    hospPortal();
            }
        }

    }
}
