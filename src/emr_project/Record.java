package emr_project;

import javax.net.ssl.HostnameVerifier;
import java.util.ArrayList;

public class Record {
    ArrayList<MedTest> tests = new ArrayList<MedTest>();
    private static int id = 100;
    private final int recordId;
    private Doctor doctor;
    private BloodGroup bloodGroup;
    private Hospital hospital;

//    private Genotype genotype;
//    this is supposed to be in the user class, because a user have just one genotype that doesn't change



    public Record(Hospital hospital, Doctor doctor){
        this.hospital = hospital;
        this.doctor = doctor;
        recordId = id++;
    }


    public void addTests(MedTest medTest){
        tests.add(medTest);
    }

    public ArrayList<MedTest> getTests(){
        return tests;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public String getBloodGroup() {
        return String.valueOf(bloodGroup);
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

}
