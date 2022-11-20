package class04_字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code01_字符串的反转 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int start = 0;
        int last = s.length - 1;
        while (start < last) {
            swap(s, start, last);
            start++;
            last--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }

    public static void swap(char[] s, int start, int last) {
        s[start] ^= s[last];
        s[last] ^= s[start];
        s[start] ^= s[last];
    }
}
