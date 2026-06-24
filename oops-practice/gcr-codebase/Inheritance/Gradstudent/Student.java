class Student extends Person {
    private final int studentId;
    protected double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStudent ID: " + studentId +
                "\nGPA: " + gpa;
    }
}