package emr_project;

import org.junit.jupiter.api.Test;

class RecordTest {

    Record record;
    Hospital hospital;
    Doctor doctor;

    void setUp() {
        hospital = new Hospital();
        doctor = new Doctor();
        record = new Record(hospital, doctor);
    }

    @Test
    void test(){   }
}