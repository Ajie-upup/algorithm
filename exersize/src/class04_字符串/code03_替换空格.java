package class04_字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code03_替换空格 {
    public static void main(String[] args) {
        String s = "We are happy.";
        String res = s.replace(" ", "%20");
        System.out.println(res);
    }
}
