
import java.util.*;

class maximumwindowsubarray {
    public static ArrayList<Integer> maxOfSubarrays(int[] nums, int k) {
        // code here
        Deque<Integer> dq = new LinkedList<>();

        // List to store result
        ArrayList<Integer> result = new ArrayList<>();

        // Loop through each element
        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller values from the back of deque
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Add to result once the first window is formed
            if (i >= k - 1) {
                result.add(nums[dq.peekFirst()]);
            }
        }

        // Return result list
        return result;
    }

    public static void main(String[] args) {
         maximumwindowsubarray obj = new maximumwindowsubarray();

        int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;

        List<Integer> ans = obj.maxOfSubarrays(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}