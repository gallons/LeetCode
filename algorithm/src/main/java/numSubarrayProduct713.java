import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.ReentrantLock;

public class numSubarrayProduct713{
        public int numSubarrayProductLessThanK(int[] nums, int k) {

            if (k <= 1) return 0;
            int prod = 1, ans = 0, left = 0;
            for (int right = 0; right < nums.length; right++) {
                prod *= nums[right];
                while (prod >= k) prod /= nums[left++];
                ans += right - left + 1;
            }
            return ans;
        }
}
