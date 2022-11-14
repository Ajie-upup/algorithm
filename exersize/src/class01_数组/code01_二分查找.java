package class01_数组;

/**
 * @Author: ajie
 * @Date: 2022/11/14
 */
public class code01_二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int left = 0;
        int right = nums.length - 1;
        int mid = right / 2;
        while (mid < right) {
            if (nums[mid] == target) {
                break;
            }
            if (nums[mid] > target) {
                right = mid - 1;
                mid = (right - left) / 2 + left;
                continue;
            }
            if (nums[mid] < target) {
                left = mid + 1;
                mid = (right - left) / 2 + left;
                continue;
            }
        }
        if (nums[mid] == target) {
            System.out.println(mid);
        } else {
            System.out.println(-1);
        }

    }

}
