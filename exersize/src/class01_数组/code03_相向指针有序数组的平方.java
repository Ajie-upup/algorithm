package class01_数组;

import java.util.Arrays;

/**
 * @Author: ajie
 * @Date: 2022/11/15
 */
public class code03_相向指针有序数组的平方 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                left++;
            } else if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
