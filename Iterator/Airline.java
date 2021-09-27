import java.util.Iterator;

public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title){
        size = 2;
        flights = new Flight[size];
    }
    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
       Flight flight = new Flight(flightNum, from, to, duration, transfers);
        
        if(flights.length < size){
            for(int i = 0; i < size; i++){
                if(flights[i] == null){
                    flights[i] = flight;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        else{
            flights = growArray(flights);
            for(int i = 0; i < flights.length; i++){
                if(flights[i] == null){
                    flights[i] = flight;
                    break;
                }
                else{
                    continue;
                }
            }
        }
       
    }
    public String getTitle(){
        return this.title;
    }
    private Flight[] growArray(Flight[] flights){
        Flight[] flights2 = new Flight[flights.length*2];
        for(int i = 0; i < flights.length;i++){
            flights2[i] = flights[i];
        }
        flights = flights2;
        return flights;
    }
    public FlightIterator createIterator(){
        return new FlightIterator(flights);
        
    }
}
