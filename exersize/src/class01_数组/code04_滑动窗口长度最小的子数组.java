package class01_数组;

/**
 * @Author: ajie
 * @Date: 2022/11/15
 */
public class code04_滑动窗口长度最小的子数组 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 11;
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        System.out.println(result == Integer.MAX_VALUE ? 0 : result);
    }
}
