package lab4.lab;

import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        int [] count=new int[5];
                int spoiltVotes = 0;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of Voters: ");
                int voters = scanner.nextInt();
                for (int i = 0; i < voters; i++) {
                    System.out.print("Enter the candidate number (1 to 5) for voter " + (i + 1) + ": ");
                    int candidateNumber = scanner.nextInt();
                    if (candidateNumber >=1 && candidateNumber <= 5) {
                        count[candidateNumber-1]++;
                    } else {
                        spoiltVotes++;
                    }
                }


                for (int i = 0; i < count.length; i++) {
                    System.out.println("Votes for Candidate " + (i + 1) + ": " + count[i]);
                }

                System.out.println("Spoilt Votes: " + spoiltVotes);

                scanner.close();
            }
        }




