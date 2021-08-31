import java.util.ArrayList;
import java.util.Collections;

/**
 * creating Binary search program, implementing the SearchBehavior interface 
 */
public class BinarySearch implements SearchBehavior
{
      
    /**
     * this is the contains method for Binary linked search.
     * I used geeksforgeeks.com as a reference
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        Collections.sort(data);
        int start =0, end =data.size()-1;
        while (start<=end)
        {
            String[] object = (String[]) data.toArray();
            int mid = start +(end-start)/2;
            int temp =item.compareTo(object[mid]);
            if(temp==0)
            {
                return true;
            }
            if(temp>0)
            {
                start=mid+1;
            }
            else 
            {
                end =mid-1;
            }
            

            
        }
        return false;
    }
}