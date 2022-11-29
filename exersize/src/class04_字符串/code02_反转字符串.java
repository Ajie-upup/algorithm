package class04_字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */
public class code02_反转字符串 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        char[] chars = s.toCharArray();
        int n = s.length() - 1;
        int count = 0;
        while (count < n) {
            //反转前k个字符
            int end = Math.min(n, count + k - 1);
            swap(chars, count, end);
            count += 2 * k;
        }
        System.out.println(new String(chars));
    }

    public static void swap(char[] chars, int start, int end) {
        while (start < end) {
            chars[start] ^= chars[end];
            chars[end] ^= chars[start];
            chars[start] ^= chars[end];
            start++;
            end--;
        }
    }

}
