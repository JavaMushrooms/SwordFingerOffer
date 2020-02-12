package first;

/**
 * 二维数组中的查找
 */
public class FindTwoDimensionalArray {

    public static boolean find(int[][] array, int number) {
        boolean falg = false;
        if (array == null) return falg;
        int rows = array.length;
        int columns = array[0].length;

        int row = 0;
        int column = columns - 1;
        while (row < rows && column >= 0) {
            if (array[row][column] == number) {
                falg = true;
                break;
            }
            if (array[row][column] > number) {
                column --;
            } else {
                row ++;
            }
        }
        return falg;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {3,4,6}
        };
        System.out.println(find(array, 9));
    }
}
