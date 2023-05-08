public class student {
    // CLass Variable
    public static String studentUniversity = "Golden University";

    // Instance Variable
    String studentName;
    int studentAge;
    float studentMaster;
    boolean studentProject;
    String studentNote_Math;
    String studentSchool_Year;
    boolean studentExercise;
    float studentExamination;
    String studentClass;
    String studentStock_Exchange;

    // Methods
    /* Création des setters*/

    public static void setStudentUniversity(String studentUniversity) {
        student.studentUniversity = studentUniversity;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentMaster(float studentMaster) {
        this.studentMaster = studentMaster;
    }

    public void setStudentProject(boolean studentProject) {
        this.studentProject = studentProject;
    }

    public void setStudentNote_Math(String studentNote_Math) {
        this.studentNote_Math = studentNote_Math;
    }

    public void setStudentSchool_Year(String studentSchool_Year) {
        this.studentSchool_Year = studentSchool_Year;
    }

    public void setStudentExercise(boolean studentExercise) {
        this.studentExercise = studentExercise;
    }

    public void setStudentExamination(float studentExamination) {
        this.studentExamination = studentExamination;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void setStudentStock_Exchange(String studentStock_Exchange) {
        this.studentStock_Exchange = studentStock_Exchange;
    }

    /* Création des getters*/

    public static String getStudentUniversity() {
        return studentUniversity;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public float getStudentMaster() {
        return studentMaster;
    }

    public boolean isStudentProject() {
        return studentProject;
    }

    public String getStudentNote_Math() {
        return studentNote_Math;
    }

    public String getStudentSchool_Year() {
        return studentSchool_Year;
    }

    public boolean isStudentExercise() {
        return studentExercise;
    }

    public float getStudentExamination() {
        return studentExamination;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getStudentStock_Exchange() {
        return studentStock_Exchange;
    }

    public void display() {
        System.out.println("Name the student is : " + this.studentName);
        System.out.println("Age the student is : " + this.studentAge);
        System.out.println("Master the student is : " + this.studentMaster);
        System.out.println("Project the student is : " + this.studentProject);
        System.out.println("Note_Math the student is : " + this.studentNote_Math);
        System.out.println("School_Year the student is : " + this.studentSchool_Year);
        System.out.println("Exercise the student is : " + this.studentExercise);
        System.out.println("Examination the student is : " + this.studentExamination);
        System.out.println("Class the student is : " + this.studentClass);
        System.out.println("Stock_Exchange the student is : " + this.studentStock_Exchange);
    }
}


