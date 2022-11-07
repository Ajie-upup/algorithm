package class01_数组和字符串;

import java.util.Arrays;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组和字符串
 * @Author: ajie
 * @Date: 2022/11/7 11:27
 * @Description: 给定长度为2n的整数数组 nums ，你的任务是将这些数分成n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到n 的 min(ai, bi) 总和最大
 * 返回该 最大总和
 */
public class code22_数组拆分 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}
