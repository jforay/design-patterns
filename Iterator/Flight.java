public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
    
    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    public String getFrom(){
        return this.from;
    }
    public String getTo(){
        return to;
    }
    public String getDuration(){
        
        int hours = this.duration/60;
        int min = this.duration % 60;
        return hours+" hours "+min+" minutes";
    }
    public int getNumTransfers(){
        return this.transfers;
    }
    public String toString(){
        if(this.getNumTransfers() == 0){
            return "Flight Number: "+this.flightNum+"\n"+"From: "+getFrom()+"\n"+"To: "+getTo()+"\n"+"Duration: "+getDuration()+"\nDirect Flight";
        }
        else if(this.getNumTransfers() == 1){
            return "Flight Number: "+this.flightNum+"\n"+"From: "+getFrom()+"\n"+"To: "+getTo()+"\n"+"Duration: "+getDuration()+"\n"+getNumTransfers()+" Transfer";
        }
        else {
            return "Flight Number: "+this.flightNum+"\n"+"From: "+getFrom()+"\n"+"To: "+getTo()+"\n"+"Duration: "+getDuration()+"\n"+getNumTransfers()+" Transfers";
        }    
    }
}