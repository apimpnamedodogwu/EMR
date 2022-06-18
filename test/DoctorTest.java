import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    Doctor doctor1;
    Doctor doctor2;

    @BeforeEach
    void setUp() {
        doctor1 = new Doctor("Omotola fashola", "LabAttendant",
                "morningShift", Gender.FEMALE, 16);
        doctor2 = new Doctor("AbudurRahman fashola", "LabAssistant",
                "morningShift", Gender.MALE, 16);
    }

   @Test
    void testThatDoctorHasValidId(){
        assertEquals(1000, doctor1.getDoctorId());
        assertEquals(1001, doctor2.getDoctorId());
    }
    @Test
    void test(){

    }
}