package emr_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecordTest {

    Record record;
    Hospital hospital;
    Doctor doctor;

    @BeforeEach
    void setUp() {
        hospital = new Hospital();
        doctor = new Doctor();
        record = new Record(hospital, doctor);
    }

    @Test
    void testThatCanGetHospital(){
        
    }
}