import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: ajie
 * @Date: 2022/11/14
 * @Description: 生成长度为18得随机整数数组，范围为0到100
 */
public class code01_随机数组 {
    public static void main(String[] args) {
        int[] array = new int[18];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        ArrayList<ArrayList<Integer>> twoArrayList = new ArrayList<>();
        int total = 0;
        int startIndex = 0;
        while (total < 18) {
            int a = (int) (Math.random() * 18) + 1;
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (total + a > 18) {
                continue;
            }
            for (int i = 0; i < a; i++) {
                arrayList.add(array[startIndex + i]);
            }
            twoArrayList.add(arrayList);
            total += a;
            startIndex += a;
        }
        System.out.println(Arrays.toString(twoArrayList.toArray()));
    }
}
