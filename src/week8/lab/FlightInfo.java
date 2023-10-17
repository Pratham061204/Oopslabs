package week8.lab;

import java.util.ArrayList;

class FlightInfo {
    ArrayList<FlightDest> info;
    public FlightInfo(){
        info=new ArrayList<>();
    }
    public void addFlightDestPair(String fNo, String dest){
        info.add(new FlightDest(fNo,dest));
    }
    public ArrayList<String> getFlightsDest(String dest){
        ArrayList<String> FlightNos=new ArrayList<>();
        for(FlightDest a:info){
            if(a.getDestination().matches(dest)){
                FlightNos.add(a.getFlightNo());
            }
        }
        return FlightNos;
    }

}
class FlightDest{
    private String flightNo,destination;

    public FlightDest(String flightNo, String destination) {
        this.flightNo = flightNo;
        this.destination = destination;
    }
    public String getDestination(){
        return destination;
    }

    public String getFlightNo() {
        return flightNo;
    }
}
class FlightDestinationTester{
    public static void main(String[] args) {
        FlightInfo a=new FlightInfo();
        a.addFlightDestPair("#100","Pakistan");
        a.addFlightDestPair("1000","a");
        a.addFlightDestPair("101","Pakistan");
        a.addFlightDestPair("102","Pakistan");

        ArrayList<String>  flightstoPakistan=a.getFlightsDest("Pakistan");
        System.out.println("Flights to Pakistan are "+flightstoPakistan);
    }
}
