import javax.swing.plaf.PanelUI;

public class director {
    // CLass Variable
    public static String directorUniversity = "Golden University";

    // Instance Variable

    String directorName;
    int directorAge;
    int directorYears_Of_Service;
    boolean directorField;
    float directorOffice;
    boolean directorGender;
    String directorManaging_The_University;
    String directorManage_The_Schedule;
    String directorRecruiter;
    String directorSupervisor;

    // Constructors

    public director () {this.directorName = directorUniversity; }

    // Methods
    /* Création des setters*/

    public static void setDirectorUniversity(String directorUniversity) {
        director.directorUniversity = directorUniversity;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setDirectorAge(int directorAge) {
        this.directorAge = directorAge;
    }

    public void setDirectorYears_Of_Service(int directorYears_Of_Service) {
        this.directorYears_Of_Service = directorYears_Of_Service;
    }

    public void setDirectorField(boolean directorField) {
        this.directorField = directorField;
    }

    public void setDirectorOffice(float directorOffice) {
        this.directorOffice = directorOffice;
    }

    public void setDirectorGender(boolean directorGender) {
        this.directorGender = directorGender;
    }

    public void setDirectorManaging_The_University(String directorManaging_The_University) {
        this.directorManaging_The_University = directorManaging_The_University;
    }

    public void setDirectorManage_The_Schedule(String directorManage_The_Schedule) {
        this.directorManage_The_Schedule = directorManage_The_Schedule;
    }

    public void setDirectorRecruiter(String directorRecruiter) {
        this.directorRecruiter = directorRecruiter;
    }

    public void setDirectorSupervisor(String directorSupervisor) {
        this.directorSupervisor = directorSupervisor;
    }

    /* Création des getters*/

    public static String getDirectorUniversity() {
        return directorUniversity;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getDirectorAge() {
        return directorAge;
    }

    public int getDirectorYears_Of_Service() {
        return directorYears_Of_Service;
    }

    public boolean getDirectorField() {
        return directorField;
    }

    public float getDirectorOffice() {
        return directorOffice;
    }

    public boolean getDirectorGender() {
        return directorGender;
    }

    public String getDirectorManaging_The_University() {
        return directorManaging_The_University;
    }

    public String getDirectorManage_The_Schedule() {
        return directorManage_The_Schedule;
    }

    public String getDirectorRecruiter() {
        return directorRecruiter;
    }

    public String getDirectorSupervisor() {
        return directorSupervisor;
    }

    public void display() {
        System.out.println("Name the director is : " + this.directorName);
        System.out.println("Age the director is : " + this.directorAge);
        System.out.println("Years_Of_Service the director is : " + this.directorYears_Of_Service);
        System.out.println("Field the director is : " + this.directorField);
        System.out.println("Office the director is : " + this.directorOffice);
        System.out.println("Gender the director is : " + this.directorGender);
        System.out.println("Managing_The_University the director is : " + this.directorManaging_The_University);
        System.out.println("Manage_the_Schedule the director is : " + this.directorManage_The_Schedule);
        System.out.println("Recruiter the director is : " + this.directorRecruiter);
        System.out.println("Supervisor the director is : " + this.directorSupervisor);
    }
}

