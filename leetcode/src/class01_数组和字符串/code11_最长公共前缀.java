package class01_数组和字符串;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组和字符串
 * @Author: ajie
 * @Date: 2022/11/2 10:43
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class code11_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        if (strs == null || strs.length==0){
//            return "";
//        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
//                    return strs[0].substring(0, i);
                    System.out.println(strs[0].substring(0, i));
                    System.exit(0);
                }
            }
        }
//        return strs[0];
        System.out.println(strs[0]);
    }
}
