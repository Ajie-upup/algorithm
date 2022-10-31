package class01_数组和字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组
 * @Author: ajie
 * @Date: 2022/10/31 14:26
 * @Description: 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间
 */
public class code03_合并区间 {
    public static void main(String[] args) {
        int[][] intervals = {{2, 6}, {1, 3}, {8, 10}, {15, 18}};
        //1、对二维数组按照第一列升序排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //2、合并区间
        List<int[]> list = new ArrayList<>();
        int[] term = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (term[1] >= intervals[i][0]) {
                term[1] = Math.max(term[1], intervals[i][1]);
            } else {
                list.add(term);
                term = intervals[i];
            }
        }
        list.add(term);
        System.out.println(list.toArray(new int[list.size()][2]));
    }
}
