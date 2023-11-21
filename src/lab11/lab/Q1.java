package lab11.lab;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        Member a = new SeniorMember("PQrSt","Bits",500000);
        System.out.println("fee for senior member is " +a.fee());
        Member b=new StandardMember("Rstq","Bits");
        System.out.println("fee for standard member is "+b.fee());



            Society society = new Society("s1");

            society.addMember("PQRSt", "Bits Dubai");
            society.addMember("UVXyz", "Bits Pilani");

            society.addSeniorMember("senior1", "bits", 100);
            society.addSeniorMember("senior2", "bits2", 200);

            System.out.println(society.getTotalFee());


    }
}
abstract class Member{
   private String name,address;

    public Member(String name, String address) {
        this.name=name;
        this.address=address;
    }

    public String getName(){
            return name;
   }
   public String getAddress(){
             return address;
   }
   abstract int fee();
   }

   class StandardMember extends Member{

       public StandardMember(String name, String address) {
           super(name, address);
       }

       @Override
       int fee() {
           return 1000;
       }
   }
   class SeniorMember extends Member{
    public int fee;

       public SeniorMember(String name, String address,int fee) {
           super(name, address);
           this.fee=fee;
       }

       @Override
       int fee() {
           return fee;
       }
   }
   class Society {
    public String name;
    List<Member> members=new ArrayList<>();

       public Society(String name) {
           this.name=name;
       }

       void addMember(String name,String address){
        members.add(new StandardMember(name,address));
    }
    void addSeniorMember(String name,String address, int fee){
        members.add(new SeniorMember(name,address,fee));
    }
    int getTotalFee(){
           int total=0;
           for(Member m:members){
               total+=m.fee();
           }
           return total;
    }
   }

