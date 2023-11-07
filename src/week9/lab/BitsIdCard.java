package week9.lab;

import java.util.Random;
import java.util.Scanner;


public class BitsIdCard {
    private int Year;
    private String Discipline;
    private String assume, Campus;
    Random random = new Random();
    int rand = random.nextInt(0, 1000);
    String actual=String.format("%03d",rand);// Generate a random number between 1 and 1000

    public BitsIdCard(int year, String discipline, String assume, String campus) {
        Year = year;
        Discipline = discipline;
        this.assume = assume;
        Campus = campus;
    }

    public String getCampusemail() {
        switch (Campus) {
            case "P"-> {return "@pilani.bits-pilani.ac.in";}
            case "H"->
            {return "@hyderabad.bits-pilani.ac.in";}
            case "G"->
            {return "@goa.bits-pilani.ac.in";}
            case "U"-> {
                return "@dubai.bits-pilani.ac.in";
            }
            default->{
                return "";}
        }
    }

    public String getDisciplineinidform() {
        switch (Discipline) {
            case "CHEM":
                return "A1";
            case "EEE":
                return "A3";
            case "MECH":
                return "A4";
            case "CS":
                return "A7";
            default:
                return "";
        }
    }

    public String generateStudentEmail() {
        return "f" + Year + actual + getCampusemail()+getDisciplineinidform();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Discipline (CHEM, EEE, MECH, CS): ");
        String discipline = scanner.nextLine().toUpperCase();

        System.out.print("Enter PS/TS: ");
        String psOrTs = scanner.nextLine().toUpperCase();

        System.out.print("Enter Campus (Pilani P, Hyderabad H, Goa G, Dubai U): ");
        String campusCode = scanner.nextLine().toUpperCase();

        BitsIdCard student = new BitsIdCard(year, discipline, psOrTs, campusCode);
        System.out.println(student.generateStudentEmail());
    }
}
