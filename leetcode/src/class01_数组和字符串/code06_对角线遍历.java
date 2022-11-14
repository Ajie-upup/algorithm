package class01_数组和字符串;

/**
 * @BelongsProject: algorithm
 * @BelongsPackage: class01_数组和字符串
 * @Author: ajie
 * @Date: 2022/10/31 17:30
 * @Description: 给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素
 */
public class code06_对角线遍历 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int x = 0;
        int y = 0;
        int xLen = mat[0].length;
        int yLen = mat.length;
        int[] res = new int[xLen * yLen];
        for (int i = 0; i < res.length; i++) {
            res[i] = mat[x][y];
            //(y + x) 为遍历的层数，趟数是奇数向下遍历，偶数向上遍历
            if ((x + y) % 2 == 0) {
                if (y == xLen - 1) {
                    x++;
                } else if (x == 0) {
                    y++;
                } else {
                    x--;
                    y++;
                }
            } else {
                if (x == yLen - 1) {
                    y++;
                } else if (y == 0) {
                    x++;
                } else {
                    x++;
                    y--;
                }

            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
