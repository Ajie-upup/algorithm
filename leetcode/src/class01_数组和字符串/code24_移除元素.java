package class01_数组和字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/9
 */
public class code24_移除元素 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int low = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[low++] = nums[i];
        }
        System.out.println(low);
    }
}
