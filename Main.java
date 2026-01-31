public class Main {
    public static void main(String[] args) {

        Student.displayUniversityName();

        Student s1 = new EngineeringStudent(1, "Fida", 6, 80, 90);
        Student s2 = new MedicalStudent(2, "Ilyas", 5, 85, 75);
        Student s3 = new AllRounderStudent(3, "Ayaan", 4);

        s1.displayDetails();
        System.out.println("Grade: " + s1.calculateGrade());
        s2.displayDetails();
        System.out.println("Grade: "+s2.calculateGrade());
        
        s3.displayDetails();
        System.out.println("Grade: "+s3.calculateGrade());
        

        SportsParticipant sp = new AllRounderStudent(4, "Sameer", 6);
        sp.playSport();
    }
}
