package class03_哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ajie
 * @Date: 2022/11/22
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 示例 1: 输入: s = "anagram", t = "nagaram" 输出: true
 * 示例 2: 输入: s = "rat", t = "car" 输出: false
 */
public class code01_有效字母的异位词 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        if (s.length() != t.length()) {
//            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
//                return false;
            }
        }
//        return true;
    }



    /*
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        if (s.length() != t.length()) {
            return;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
//                return false;
            }
        }
//        return true;
    }
     */

}
