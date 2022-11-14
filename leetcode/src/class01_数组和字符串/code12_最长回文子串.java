package class01_数组和字符串;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组和字符串
 * @Author: ajie
 * @Date: 2022/11/3 9:31
 * @Description: 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class code12_最长回文子串 {
    public static void main(String[] args) {
        String s = "babad";
//        if (s == null || s.length() < 1){
//            return "";
//        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
//        return s.substring(start, end + 1);
        System.out.println(s.substring(start, end + 1));
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return (R - 1) - (L + 1) + 1;
    }
}
