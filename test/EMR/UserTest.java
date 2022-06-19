package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User myUser;

    @BeforeEach
    void setUp() {
        myUser = new User("Eden");
    }

    @Test
    void testThatARecordCanBeAdded() {
        myUser.addRecord("Eden", "HIV", 1, 1, 1);
        var name = myUser.getRecords().get(0).getNameOfTest();
        var user = myUser.getRecords().get(0).getCardId();
        var test = myUser.getRecords().get(0).getTestId();
        var consultant = myUser.getRecords().get(0).getConsultantId();
        var size = myUser.getRecords();
        assertEquals("HIV", name);
        assertEquals(1, user);
        assertEquals(1, test);
        assertEquals(1, consultant);
        assertEquals(1, size.size());
    }

    @Test
    void testThatARecordCanBeDeleted() {
        myUser.addRecord("Eden", "HIV", 1, 1, 1);
        myUser.deleteRecord(1);
        var size = myUser.getRecords();
        assertEquals(0, size.size());
    }

    @Test
    void testThatExceptionMessageIsThrownInMethodDeleteARecord() {
        assertThrows(UserException.class,
                () -> myUser.deleteRecord(1));
    }

    @Test
    void testThatUserNameCanBeGotten(){
        var name = myUser.getUserName();
        assertEquals("Eden", name);
    }

    @Test
    void testThatCardNumberCanBeGotten() {
        var card = myUser.getUserCardNumber();
        assertEquals(1, card);
    }
}
