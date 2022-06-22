package emr_project;

import javax.net.ssl.HostnameVerifier;
import java.util.ArrayList;

public class Record {
    ArrayList<MedTest> tests = new ArrayList<>();
    private static int id = 100;
    private final int recordId;
    private Doctor doctor;
    private Hospital hospital;



    public Record(Hospital hospital, Doctor doctor){
        this.hospital = hospital;
        this.doctor = doctor;
        this.recordId = id++;
    }

    public int getRecordId() {
        return recordId;
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

    @Override
    public String toString(){
        return String.format("""
                RecordId: %d
                Hospital name: %s
                Doctor name: %s
                
                """, getRecordId(), hospital.getHospitalName(), doctor.getDoctorFullName());
    }
}
