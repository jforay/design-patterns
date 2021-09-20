import java.util.ArrayList;

/**
 * creates an abract class houseplan, so we can create house plans for different houses
 * @author Joe Foray
 */
public abstract class HousePlan {
    protected ArrayList<String> materials = new ArrayList<String>();
    protected ArrayList<String> features = new ArrayList<String>();
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    /**
     * creates a house plan and initailizes the number of rooms, windows, and square feet
     * @param numRooms passes to th child the number of rooms
     * @param numWindows passes to the child the number of windows
     * @param squareFeet passes to the child the number of square feet
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    protected abstract void setMaterials();
    protected abstract void setFeatures();
    /**
     * allows acces to the list of features
     * @return returns the arrayList of features for this house
     */
    public ArrayList<String> getFeatures(){
        return this.features;
        
    }
    /**
     * allows acces to the list of features
     * @return return the arrayList of materials for this house
     */
    public ArrayList<String> getMaterials(){
        return this.materials;
    }
    /**
     * allows acces to the number of rooms
     * @return returns the number of rooms in the house
     */
    public int getNumRooms(){
        
        return numRooms;
    }
    /**
     * allows access to the number of square feet
     * @return the square feet of this house
     */
    public int getSquareFeet(){
        return this.squareFeet;
    }
    /**
     * allows acess to the number of windows
     * @return the number of windows in this house
     */
    public int getNumWindows(){
        return this.numRooms;
    }
    /**
     * turns the house plan into a string showing the number of rooms, windows, and square feet
     * @return the house plan as a string
     */
    public String toString(){
        return "Square Feet: "+this.squareFeet+"\n"+"Room: "+this.numRooms+"\n"+"Windows: "+
        this.numWindows+"\n\nMaterials:\n- ";
    }

}
