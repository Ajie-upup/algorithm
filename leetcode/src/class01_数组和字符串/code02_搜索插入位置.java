package class01_数组和字符串;

import java.util.Scanner;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组
 * @Author: ajie
 * @Date: 2022/10/31 14:12
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法
 */
public class code02_搜索插入位置 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        if (target > nums[nums.length - 1]) {
            System.out.println(nums.length);
            System.exit(0);
        }
        int i ;
        for (i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                System.out.println(i);
                break;
            }
        }
    }
}
