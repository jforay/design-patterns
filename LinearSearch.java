import java.util.ArrayList;

/**
 * creating the Linear Search program implementing the SearchBehavior interface
 */
public class LinearSearch implements SearchBehavior
{

    /**
     * the Linear search method that I used
     */
    public boolean contains(ArrayList<String> data, String item) 
    {
        for(String name : data)
        {
            if(item.equals(name))
            {
                return true;
            }
        }
        return false;
    }

    

   
}