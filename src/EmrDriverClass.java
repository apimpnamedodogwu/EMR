import emr_project.Hospital;

import java.util.Scanner;

public class EmrDriverClass {
    public static void main(String[] args) {
        String hospitalName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Hospital Name");
        hospitalName = input.next();
        Hospital hospital = new Hospital();
        hospital.setHospitalName(hospitalName);

        System.out.println("Welcome to " + hospital.getHospitalName());
    }

}
