import java.util.Scanner;

class Subject{
    int subjectMarks;
    int credits;
    int grade;

    public void calculateGrade(){
        if (subjectMarks < 40) {
            grade = 0;
        } else if (subjectMarks >= 90 && subjectMarks <= 100) {
            grade = 10;
        } else if (subjectMarks >= 80){
            grade = 9;
        } else if (subjectMarks >= 70){
            grade = 8;
        } else if (subjectMarks >= 60){
            grade = 7;
        } else if (subjectMarks >= 50){
            grade = 6;
        } else if (subjectMarks >= 40){
            grade = 5;
        } else{
            grade = 0;
        }
    }
}

class Student1 {
    String name;
    String usn;
    double SGPA;
    Subject[] subjects;
    Scanner s;

    Student1() {
        subjects = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subjects[i] = new Subject();
        }
        s = new Scanner(System.in);
    }

    public void getStudentDetails() {
        System.out.print("Enter student name: ");
        this.name = s.nextLine();
        System.out.print("Enter student USN: ");
        this.usn = s.nextLine();
    }

    public void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjects[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subjects[i].credits = s.nextInt();
            subjects[i].calculateGrade();
        }
        s.nextLine();
    }

    public void computeSGPA() {
        double totalPoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < 8; i++) {
            totalPoints += subjects[i].grade * subjects[i].credits;
            totalCredits += subjects[i].credits;
        }
        SGPA = (totalCredits == 0) ? 0 : totalPoints / totalCredits;
    }

    public void displayResults() {
        System.out.println("Student Name: " + this.name);
        System.out.println("USN: " + this.usn);
        System.out.printf("SGPA: %.2f%n", SGPA);
    }
}

public class Student2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayResults();
    }
}
