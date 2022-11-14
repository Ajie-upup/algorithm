package class01_数组和字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/9
 */
public class code23_输入有序数组 {
    public static void main(String[] args) {
        //双指针法
        int[] numbers = {2, 7, 11, 15};
        int target = 17;
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                System.out.println(low + 1 + " " + high + 1);
                System.exit(0);
            }
            if (sum < target) {
                low++;
            }
            if (sum > target) {
                high--;
            }
        }
        System.out.println("0 0");
    }
}
