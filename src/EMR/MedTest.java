package EMR;

public class MedTest {
    private static  int testCount = 1;
    private int testId;
    private String testType;


    public MedTest(String typeOfTest) {

        testType = typeOfTest;
        testId = testCount;
        testCount++;
    }

    public int getTestId() {
        return testId;
    }

    public String getTestType() {
        return testType;
    }

}
