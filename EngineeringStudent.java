class EngineeringStudent extends Student {
    private int internalMarks;
    private int externalMarks;

    public EngineeringStudent(int r, String n, int s, int i, int e) {
        super(r, n, s);
        internalMarks = i;
        externalMarks = e;
    }

    @Override
    double calculateGrade() {
        return (internalMarks * 0.4 + externalMarks * 0.6) / 10;
    }
}
