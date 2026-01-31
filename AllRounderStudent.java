class AllRounderStudent extends Student
        implements SportsParticipant, CulturalParticipant {

    public AllRounderStudent(int r, String n, int s) {
        super(r, n, s);
    }

    @Override
    double calculateGrade() {
        return 9.0;
    }
    @Override
public void displayDetails() {
     System.out.println(" ");
    System.out.println("Category: All-Rounder Student");
    super.displayDetails();
}

    public void playSport() {
          
        System.out.println("Allrounder student Plays inter-university sports");
    }

    public void performActivity() {
        System.out.println(" Participates in cultural events");
    }
}
