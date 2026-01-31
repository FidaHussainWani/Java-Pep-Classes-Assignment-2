class MedicalStudent extends Student {
    private int theoryMarks;
    private int practicalMarks;

    public MedicalStudent(int r, String n, int s, int t, int p) {
        super(r, n, s);
        theoryMarks = t;
        practicalMarks = p;
    }

    @Override
    double calculateGrade() {
        return (theoryMarks + practicalMarks) / 20.0;
    }
}
