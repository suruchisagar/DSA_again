import java.util.*;

// Class to hold solution logic
class solution {
    // Function to get all meetings that can be scheduled
    
}

// Separate main class
public class nmeetings {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start,end));
    }

    public static int maxMeetings(int[] start, int[] end) {
        // Store meetings as (end_time, start_time, index)
        List<int[]> meetings = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            // i+1 for 1-based index
            meetings.add(new int[]{end[i], start[i], i + 1}); 
            
        }

        // Sort by end time
        meetings.sort(Comparator.comparingInt(a -> a[0]));
        int lastEnd = -1;
        int count=0;

        // Traverse sorted meetings
        for (int[] m : meetings) {
            // If meeting can be scheduled
            if (m[1] > lastEnd) { 
                count++; 
                // Update last meeting end time
                lastEnd = m[0];   
            }
        }
        return count;
    }
}
