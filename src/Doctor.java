public class Doctor {

    private String doctorName;
    private String doctorSpeciality;
    private String doctorStatus;
    private Gender gender;
    private int age;
    private static int id = 1000;
    private final int doctorId;


    public Doctor(String doctorName, String docSpeciality, String docStatus, Gender gender, int age ){
        this.doctorId = id++;
        this.doctorName = doctorName;
        doctorSpeciality = docSpeciality;
        doctorStatus = docStatus;
        this.gender = Gender.valueOf(String.valueOf(gender));
        this.age = age;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public String getDoctorStatus() {
        return doctorStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static int getId() {
        return id;
    }

    public int getDoctorId() {
        return doctorId;
    }
}
