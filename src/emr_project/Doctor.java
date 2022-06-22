package emr_project;

public class Doctor {
    private String name;

    public Doctor(){
    }

    public void setDoctorName(String hospitalName){
        name = hospitalName;
    }
    public String getDoctorFullName() {
        return name;
    }
}
