public class professor {
    // Class Variable
    public static String professorUniversity = "Golden University";

    // Instance Variable

    String professorName;
    int professorAge;
    String professorDepartment;
    float professorCourse;
    float professorClass;
    boolean professorTable;
    boolean professorComputer;
    int professorSalary;
    String professorSkill;
    String professorJob;

    // Constructors
    public professor () {this.professorName = professorUniversity; }

    // Methods
    /* Création des setters*/

    public static void setProfessorUniversity(String professorUniversity) {
        professor.professorUniversity = professorUniversity;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public void setProfessorAge(int professorAge) {
        this.professorAge = professorAge;
    }

    public void setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
    }

    public void setProfessorCourse(float professorCourse) {
        this.professorCourse = professorCourse;
    }

    public void setProfessorClass(float professorClass) {
        this.professorClass = professorClass;
    }

    public void setProfessorTable(boolean professorTable) {
        this.professorTable = professorTable;
    }

    public void setProfessorComputer(boolean professorComputer) {
        this.professorComputer = professorComputer;
    }

    public void setProfessorSalary(int professorSalary) {
        this.professorSalary = professorSalary;
    }

    public void setProfessorSkill(String professorSkill) {
        this.professorSkill = professorSkill;
    }

    public void setProfessorJob(String professorJob) {
        this.professorJob = professorJob;
    }

    /* Création des getters*/

    public static String getProfessorUniversity() {
        return professorUniversity;
    }

    public String getProfessorName() {
        return professorName;
    }

    public int getProfessorAge() {
        return professorAge;
    }

    public String getProfessorDepartment() {
        return professorDepartment;
    }

    public float getProfessorCourse() {
        return professorCourse;
    }

    public float getProfessorClass() {
        return professorClass;
    }

    public boolean getProfessorTable() {
        return professorTable;
    }

    public boolean getProfessorComputer() {
        return professorComputer;
    }

    public int getProfessorSalary() {
        return professorSalary;
    }

    public String getProfessorSkill() {
        return professorSkill;
    }

    public String getProfessorJob() {
        return professorJob;
    }
    public void display(){
        System.out.println("Name the professor is : " + this.professorName);
        System.out.println("Age the professor is : " + this.professorAge);
        System.out.println("Department the professor is : " + this.professorDepartment);
        System.out.println("Course the professor is : " + this.professorCourse);
        System.out.println("Class the professor is : " + this.professorClass);
        System.out.println("Table the professor is : " + this.professorTable);
        System.out.println("Computer the professor is : " + this.professorComputer);
        System.out.println("Salary the professor is : " + this.professorSalary);
        System.out.println("Skill the professor is : " + this.professorSkill);
        System.out.println("Job the professor is : " + this.professorJob);
    }
}
