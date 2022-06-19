package EMR;

public class Consultant {
    private ConsultantType consultantType;

    private String consultantName;
    private static int idCount = 1;
    private int Id;

    public Consultant(ConsultantType consultantType, String consultantName) {
        this.consultantType = consultantType;
        this.consultantName = consultantName;
        Id = idCount;
        idCount++;
    }

    public ConsultantType getConsultantType() {
        return consultantType;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public int getId() {
        return Id;
    }

    public static void resetId() {
        idCount = 1;
    }

    @Override
    public String toString() {
        return String.format("""
                Consultant Name: %s
                Consultant Type: %s
                Consultant Id: %d
                """, getConsultantName(), getConsultantType(), getId());
    }
}
