package EMR;

import java.util.ArrayList;
import java.util.Objects;

public class Hospital {

//   private static int IdCount = 1;

    private int hospitalId;
    private String nameOfHospital;
    private String addressOfHospital;

    private ArrayList<Consultant> consultants = new ArrayList<Consultant>();
    private ArrayList<MedTest> tests = new ArrayList<MedTest>();

    public Hospital(String name, String address) {
        nameOfHospital = name;
        addressOfHospital = address;
    }


    public ArrayList<Consultant> getConsultants() {
        return consultants;
    }

    public ArrayList<MedTest> getTests() {
        return tests;
    }


    public int getHospitalId() {
        return hospitalId;
    }

    public String getNameOfHospital() {
        return nameOfHospital;
    }

    public String getAddressOfHospital() {
        return addressOfHospital;
    }

    public void addConsultant(String name, ConsultantType consultant) {
        Consultant myConsultant = new Consultant(consultant, name);
        consultants.add(myConsultant);
    }


    public void deleteConsultant(int Id) {
        for (Consultant consultant : consultants) {
            if (consultant.getId() == Id) {
                consultants.remove(consultant);
                System.out.println("Consultant with Id number" + " " + Id + " " + "has been removed!");
                return;
            }
        }
        throw new ConsultantException("Consultant with Id number" + " " + Id + " " + "does not exist!");
    }

    public Consultant getAConsultant(int Id) {
        for (Consultant consultant : consultants) {
            if (consultant.getId() == Id) {
                return consultant;
            }
        }
        throw new ConsultantException("Consultant with Id number" + " " + Id + " " + "does not exist!");
    }


    public void createTest(String type) {
        MedTest myTest = new MedTest(type);
        tests.add(myTest);
    }

    public void deleteTest(int Id) {
        for (MedTest myTest : tests) {
            if (myTest.getTestId() == Id) {
                tests.remove(myTest);
                return;
            }
        }
        throw new TestException("Test with Id number" + Id + " does not exist!");
    }
}
