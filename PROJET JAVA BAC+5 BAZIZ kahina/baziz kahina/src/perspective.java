public class perspective {
    // Class Variable
    public static String perspectiveUniversity = "Golden University";

    // Instance Variable
    String perspectiveFirst_Name;
    String perspectiveLast_Name;
    int perspectiveAge;
    int perspectivePhone_Number;
    String perspectiveAddress;
    float perspectiveEmail;
    boolean perspectiveLanguage;
    String perspectiveDiploma;
    String perspectiveJob;
    String perspectiveSalary;

    // Constructors
    public perspective () {this.perspectiveFirst_Name = perspectiveUniversity; }

    // Methods
    /* Création des setters*/

    public static void setPerspectiveUniversity(String perspectiveUniversity) {
        perspective.perspectiveUniversity = perspectiveUniversity;
    }

    public void setPerspectiveFirst_Name(String perspectiveFirst_Name) {
        this.perspectiveFirst_Name = perspectiveFirst_Name;
    }

    public void setPerspectiveLast_Name(String perspectiveLast_Name) {
        this.perspectiveLast_Name = perspectiveLast_Name;
    }

    public void setPerspectiveAge(int perspectiveAge) {
        this.perspectiveAge = perspectiveAge;
    }

    public void setPerspectivePhone_Number(int perspectivePhone_Number) {
        this.perspectivePhone_Number = perspectivePhone_Number;
    }

    public void setPerspectiveAddress(String perspectiveAddress) {
        this.perspectiveAddress = perspectiveAddress;
    }

    public void setPerspectiveEmail(float perspectiveEmail) {
        this.perspectiveEmail = perspectiveEmail;
    }

    public void setPerspectiveLanguage(boolean perspectiveLanguage) {
        this.perspectiveLanguage = perspectiveLanguage;
    }

    public void setPerspectiveDiploma(String perspectiveDiploma) {
        this.perspectiveDiploma = perspectiveDiploma;
    }

    public void setPerspectiveJob(String perspectiveJob) {
        this.perspectiveJob = perspectiveJob;
    }

    public void setPerspectiveSalary(String perspectiveSalary) {
        this.perspectiveSalary = perspectiveSalary;
    }

    /* Création des getters*/

    public static String getPerspectiveUniversity() {
        return perspectiveUniversity;
    }

    public String getPerspectiveFirst_Name() {
        return perspectiveFirst_Name;
    }

    public String getPerspectiveLast_Name() {
        return perspectiveLast_Name;
    }

    public int getPerspectiveAge() {
        return perspectiveAge;
    }

    public int getPerspectivePhone_Number() {
        return perspectivePhone_Number;
    }

    public String getPerspectiveAddress() {
        return perspectiveAddress;
    }

    public float getPerspectiveEmail() {
        return perspectiveEmail;
    }

    public boolean isPerspectiveLanguage() {
        return perspectiveLanguage;
    }

    public String getPerspectiveDiploma() {
        return perspectiveDiploma;
    }

    public String getPerspectiveJob() {
        return perspectiveJob;
    }

    public String getPerspectiveSalary() {
        return perspectiveSalary;
    }

    public void display() {
        System.out.println("First_Name the director is : " + this.perspectiveFirst_Name);
        System.out.println("Last_Name the director is : " + this.perspectiveLast_Name);
        System.out.println("Age the director is : " + this.perspectiveAge);
        System.out.println("Phone_Number the director is : " + this.perspectivePhone_Number);
        System.out.println("Address the director is : " + this.perspectiveAddress);
        System.out.println("Email the director is : " + this.perspectiveEmail);
        System.out.println("Language the director is : " + this.perspectiveLanguage);
        System.out.println("Diploma the director is : " + this.perspectiveDiploma);
        System.out.println("Job the director is : " + this.perspectiveJob);
        System.out.println("Salary the director is : " + this.perspectiveSalary);
    }
}
