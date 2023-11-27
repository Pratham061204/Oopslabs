package lab12.lab;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface movable{
    public void move(String newPos);
}
abstract class ChessPiece implements movable{
    String name,color,curPos;

    public ChessPiece(String name, String color, String curPos) {
        this.name = name;
        this.color = color;
        this.curPos = curPos;
    }
}

class King extends ChessPiece{

    public King(String color, String curPos) {
        super("King", color, curPos);
    }

    @Override
    public void move(String newPos) {
        curPos=newPos;
    }
    public String getcurPos(){
        return curPos;
    }
    public String toString() {
        return color + " King at " + curPos;
    }
}
class Queen extends ChessPiece{

    public Queen( String color, String curPos) {
        super("Queen", color, curPos);
    }

    @Override
    public void move(String newPos) {
        curPos=newPos;
    }
    public String getcurPos(){
        return curPos;
    }
    public String toString() {
        return color + " Queen at " + curPos;
    }

}
class Horse extends ChessPiece{

    public Horse( String color, String curPos) {
        super("Horse", color, curPos);
    }

    @Override
    public void move(String newPos) {
        curPos=newPos;
    }
    public String getcurPos(){
        return curPos;
    }
    public String toString() {
        return color + " Horse at " + curPos;
    }

}
public class Q1 {
    public static void main(String[] args) {


        King a = new King( "White", "a1");
        Queen b = new Queen( "Black", "b2");
        Horse c = new Horse( "White", "c3");

        ArrayList<ChessPiece> lists = new ArrayList<>(List.of(a, b, c));
        for(ChessPiece z:lists){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter which piece to be moved (0 to Quit) ");
            int s1=scanner.nextInt()-1;
            if(s1>-1){
                System.out.println("Enter new position of "+lists.get(s1));
                String z1=scanner.next();
                System.out.println("Old position of "+lists.get(s1).name+" was "+lists.get(s1).curPos);
                lists.get(s1).move(z1);
                System.out.println("New position of "+lists.get(s1).name+" is "+z1);
            }
            else {
                System.exit(0);
            }

        }

    }
}