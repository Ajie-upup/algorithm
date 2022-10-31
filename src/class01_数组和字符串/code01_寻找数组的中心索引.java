package class01_数组和字符串;

import java.util.Arrays;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组
 * @Author: ajie
 * @Date: 2022/10/31 12:24
 * @Description: 给你一个整数数组nums ，请计算数组的中心下标。
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1
 */
public class code01_寻找数组的中心索引 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i + 1] == total) {
                System.out.println(i + 1);
                break;
            }
            sum += nums[i];
        }
        System.out.println(-1);
    }
}
