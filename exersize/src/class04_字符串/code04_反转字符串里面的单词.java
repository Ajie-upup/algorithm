package class04_字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/28
 */
public class code04_反转字符串里面的单词 {
    public static void main(String[] args) {
        String s = "  the sky  is    blue   ";
        /*
            String ss = s.trim();
            String[] split = ss.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = split.length - 1; i >= 0; i--) {
                if (split[i].length() == 0) {
                    continue;
                }
                sb.append(split[i]);
                if (i != 0) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
         */
        /*
            不使用内置函数，反转字符串中的单词
            1.去除首尾中间的空格
            2.反转整个字符串
            3.反转各个单词
         */
        //1.去除首尾中间的空格
        StringBuilder sb = removeSpace(s);
        //2.反转整个字符串
        reverseString(sb, 0, sb.length() - 1);
        //3.反转各个单词
        reverseEachWord(sb);
        System.out.println(sb);

    }

    //    去除首尾中间的空格
    private static StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        //去除首部空格
        while (s.charAt(start) == ' ') {
            start++;
        }
        //去除尾部空格
        while (s.charAt(end) == ' ') {
            end--;
        }
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    //反转 [start,end] 之间的字符串
    private static void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char c = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, c);
            start++;
            end--;
        }
    }

    //反转每个单词
    private static void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }
}
