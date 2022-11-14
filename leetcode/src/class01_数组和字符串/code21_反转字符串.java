package class01_数组和字符串;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组和字符串
 * @Author: ajie
 * @Date: 2022/11/7 11:17
 * @Description: 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间
 */
public class code21_反转字符串 {
    public static void main(String[] args) {
        String str = "hello";
        char[] s = str.toCharArray();
        int left = 0, right = s.length - 1;
        while (left < right) {
            exchangeChar(s, left, right);
            left++;
            right--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

    public static void exchangeChar(char[] s, int l, int r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}
