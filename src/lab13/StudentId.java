package lab13;

import java.util.regex.Pattern;

public class StudentId {
    private String name;
    private int age,year;
    private String idNo;

    public StudentId(String name, int age, int year, String idNo) throws InvalidNameException,InvalidAgeException,InvalidYearException,InvalidIdException{
        validateName(name);
        validateAge(age);
        validateYear(year);
        validateIdNo(idNo);

        this.name = name;
        this.age = age;
        this.year = year;
        this.idNo = idNo;
    }

    private void validateName(String name) throws InvalidNameException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new InvalidNameException("Invalid name format. Name should consist of only upper and lower case letters.");
        }
    }
    private void validateAge(int age) throws InvalidAgeException {
        if (age>=35) {
            throw new InvalidAgeException("Invalid age. Age should be less than 35.");
        }
    }
    private void validateYear(int year) throws InvalidYearException {
        if (year < 1 || year > 4) {
            throw new InvalidYearException("Invalid year. Year should be between 1 and 4.");
        }
    }
    private void validateIdNo(String idNo) throws InvalidIdException {
        if (!idNo.matches("[fF]\\d{4}[a-zA-Z]")) {
            throw new InvalidIdException("Invalid id format. Id should be in the format like 'fXXXXU'.");
        }
    }

    public static void main(String[] args) {
        try {
            StudentId studentId=new StudentId("Pawan",19,2,"f0065U");
            System.out.println("Name: " + studentId.name);
            System.out.println("Age: " + studentId.age);
            System.out.println("Year: " + studentId.year);
            System.out.println("ID No: " + studentId.idNo);
        }catch (InvalidNameException|InvalidAgeException|InvalidYearException|InvalidIdException e){
            System.out.println("Exception found: "+e.getMessage());
        }
    }
}
class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
}

class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}
