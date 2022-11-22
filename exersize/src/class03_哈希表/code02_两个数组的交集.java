package class03_哈希表;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: ajie
 * @Date: 2022/11/22
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 方法一：set集合
 * 方法二：排序加双指针
 */
public class code02_两个数组的交集 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] res = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            res[i++] = iterator.next();
        }
//        return set2.stream().mapToInt(x -> x).toArray();

    }
}
