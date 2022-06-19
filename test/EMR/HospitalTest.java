package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTest {
    Hospital myHospital;
    @BeforeEach
    void setUp() {
        myHospital = new Hospital("Eden Life", "The Garden");
    }

    @Test
    void testThatConsultantsCanBeAdded() {
        myHospital.addConsultant("Amarachi Elenwoke", ConsultantType.PEDIATRICIAN);
        var list = myHospital.getConsultants().get(0).getConsultantName();
        var listTwo = myHospital.getConsultants().get(0).getConsultantType();
        var size = myHospital.getConsultants();
        assertEquals("Amarachi Elenwoke", list);
        assertEquals(ConsultantType.PEDIATRICIAN, listTwo);
        assertEquals(1, size.size());
    }

    @Test
    void testThatConsultantCanBeDeleted() {
        myHospital.addConsultant("Amarachi Elenwoke", ConsultantType.PEDIATRICIAN);
        myHospital.deleteConsultant(1);
        var size = myHospital.getConsultants();
        assertEquals(0, size.size());
    }

    @Test
    void testThatExceptionMessageIsThrownInMethodDeleteConsultant() {
       assertThrows(ConsultantException.class,
               () -> myHospital.deleteConsultant(1));
    }

    @Test
    void testThatAConsultantCanBeRetrieved() {
        myHospital.addConsultant("Amarachi Elenwoke", ConsultantType.ANESTHESIOLOGIST);
        myHospital.addConsultant("Eddy Owarume", ConsultantType.ANESTHESIOLOGIST);
        Consultant aConsultant = myHospital.getAConsultant(1);
        Consultant aConsultantTwo = myHospital.getAConsultant(2);
        assertEquals(ConsultantType.ANESTHESIOLOGIST, aConsultant.getConsultantType());
        assertEquals("Eddy Owarume", aConsultantTwo.getConsultantName());
    }

    @Test
    void testThatExceptionMessageIsThrownInMethodGetACustomer() {
        assertThrows(ConsultantException.class,
                () -> myHospital.getAConsultant(1));
    }

    @Test
    void testThatMedTestCanBeCreated() {
        myHospital.createTest("HIV");
        var type = myHospital.getTests().get(0).getTestType();
        var resultTwo = myHospital.getTests().get(0).getTestId();
        var result = myHospital.getTests();
        assertEquals("HIV", type);
        assertEquals(1, result.size());
        assertEquals(1, resultTwo);
    }

    @Test
    void testThatMedTestCanBeDeleted() {
        myHospital.createTest("HIV");
        myHospital.deleteTest(1);
        var result = myHospital.getTests();
        assertEquals(0, result.size());
    }



    @Test
    void testThatIdCanBeGotten() {
        var hosp = myHospital.getHospitalId();
        assertEquals(0, hosp);
    }

    @Test
    void testThatHospitalNameCanBeGotten() {
        var hosp = myHospital.getNameOfHospital();
        assertEquals("Eden Life", hosp);
    }

    @Test
    void testThatHospitalAddressCanBeGotten() {
        var hosp = myHospital.getAddressOfHospital();
        assertEquals("The Garden", hosp);
    }
}