abstract class Student {
    private int rollNumber;
    private String name;
    private int semester;

    static String universityName;

    final int MAX_SEMESTER = 8;

    static {
        universityName = "Lovely Professional University";
    }

    public Student(int rollNumber, String name, int semester) {
        this.rollNumber = rollNumber;
        this.name = name;
        if (semester > 0 && semester <= MAX_SEMESTER)
            this.semester = semester;
        else
            this.semester = 1;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    abstract double calculateGrade();

    public void displayDetails() {
        System.out.println(" ");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
    }

    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }

    final void showRules() {
        System.out.println("Maximum semester allowed: " + MAX_SEMESTER);
    }
}
