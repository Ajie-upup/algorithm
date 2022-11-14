package class01_数组;

/**
 * @Author: ajie
 * @Date: 2022/11/14
 */
public class code02_快慢指针解决数组移动元素 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int low = 0;
        int fast = 0;
        int len = nums.length;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[low] = nums[fast];
                fast++;
                low++;
                continue;
            }
            if (nums[fast] == val) {
                if (fast + 1 < nums.length) {
                    nums[low] = nums[fast + 1];
                }
                len--;
                fast++;
            }
        }
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    /* 题解
    int low = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[low++] = nums[i];
        }
     */
}
