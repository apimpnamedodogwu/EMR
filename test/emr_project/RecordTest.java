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
    void testThatAMedicalTestCanBeAdded(){
        MedTest malariaTest = new MedTest();
        record.addTests(malariaTest);
        assertEquals(1, record.getTests().size());
    }

    @Test
    void testThatManyMedicalTestCanBeAdded(){
        MedTest testForSugarLevel = new MedTest();
        MedTest testForAids = new MedTest();
        record.addTests(testForSugarLevel);
        record.addTests(testForAids);
        assertEquals(2, record.getTests().size());
    }

    @Test
    void testThatMedicalTestReportCanBeGottenAtAParticularIndex(){
        MedTest testForSugarLevel = new MedTest();
        MedTest testForAids = new MedTest();
        record.addTests(testForSugarLevel);
        record.addTests(testForAids);
        assertEquals(testForSugarLevel, record.tests.get(0));
        assertEquals(testForAids, record.tests.get(1));
    }

    @Test
    void testRecordHasValidId(){
        MedTest testForSugarLevel = new MedTest();
        MedTest testForAids = new MedTest();
        record.addTests(testForSugarLevel);
        assertEquals(100, record.getRecordId());
//        record.addTests(testForAids);
//        assertEquals(101, record.getRecordId());
    }
}