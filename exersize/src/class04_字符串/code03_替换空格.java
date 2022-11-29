package class04_字符串;

/**
 * @Author: ajie
 * @Date: 2022/11/20
 */
public class code03_替换空格 {
    public static void main(String[] args) {
        String s = "We are happy.";
        /*
            方法一：利用内置函数
            String res = s.replace(" ", "%20");
            System.out.println(res);
         */
        /*
            方法二：逐个替换
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    sb.append("%20");
                }else {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
         */
        /*
            方法三：双指针法，先扩容，再从后向前填充

         */
        StringBuilder sb = new StringBuilder();
        //数组扩容
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                //替换词与空格的差值
                sb.append("  ");
            }
        }
        if (sb.length() == 0) {
            //扩容长度为0，则没有空格，可以直接返回
            return;
        }
        //左指针指向源字符串的末尾
        int left = s.length() - 1;
        s += sb;
        //右指针指向扩容字符串的末尾
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right] = '0';
                chars[--right] = '2';
                chars[--right] = '%';
            } else {
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        System.out.println(new String(chars));

    }
}
