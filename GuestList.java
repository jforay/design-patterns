import java.util.ArrayList;

public class GuestList
{
    private String title;
    private ArrayList<String> people = new ArrayList<String>();
    private SearchBehavior searchBehavior;
    
    /**\
     *creates method called Guestlist
     *
     *  @param title the name of the GuestList
     */
    public GuestList(String title)
    {
        
        this.title=title;

    }
    /**
     * adds person to GuestList if they are not on it already
     * @param person who you are searching for inside GuestList
     * @return false if person matches name in 'people' GuestList
     * refereced stack overflow to help with how to ignore the case
     */
    public Boolean add(String person)
    {
        if(people.stream().anyMatch(person::equalsIgnoreCase))
        {
            
            return false;
        } 
        else
        {
            people.add(person);
        }
        return true;
    } 
    /**
     * removes person from guestList if they are on it
     * @param person who you are looking for inside the GuestList
     * @return true if person matches any name in 'people' GuestList
     */
    public boolean remove(String person)
    {
        if(people.stream().anyMatch(person::equalsIgnoreCase))
        {
            people.remove(person);
            return true;
            
        }
        return false;
        

    }
    /**
     * tells user title of GuestList
     * @return title of GuestList
     */
    public String getTitle()
    {
       return this.title;
    }
    /**
     * switches the searchBehavior from linear to Binary
     * @param searchBehavior how it searches through the list
     */
    public void setSearchBehavior(SearchBehavior searchBehavior)
    {
       if(searchBehavior!=null)
       {
        this.searchBehavior=searchBehavior;
       }
    }
    /**
     * iterates through the entire GuestList to print it to the user
     * @return people the ArrayList that has the names of the Dinner guests
     */
    public ArrayList<String> getList()
    {
        for(String names : people)
        {
            
        }
        return people;
    }
}