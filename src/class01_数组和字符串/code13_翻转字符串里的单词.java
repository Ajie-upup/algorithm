package class01_数组和字符串;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组和字符串
 * @Author: ajie
 * @Date: 2022/11/6 14:47
 * @Description: 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串
 */
public class code13_翻转字符串里的单词 {
    public static void main(String[] args) {
//        String s = "the sky is blue";
//        String s = "  hello world  ";
        String s = "a good   example";
        String ss = s.trim();
        String[] split = ss.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].length() == 0) {
                continue;
            }
            String trim = split[i].trim();
            sb.append(trim);
            if (i != 0) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
