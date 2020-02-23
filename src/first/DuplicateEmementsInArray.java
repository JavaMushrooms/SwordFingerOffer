package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数组中重复的元素
 *
 */
public class DuplicateEmementsInArray {
    public static boolean duplicate(int[] arrays, List<Integer> result) {
        if (arrays == null || arrays.length <= 0) {
            return false;
        }

        for (int i = 0; i < arrays.length; i ++) {
            if (arrays[i] < 0 || arrays[i] > arrays.length - 1) {
                return false;
            }
        }

        for (int i = 0; i < arrays.length - 1; i ++) {
            while (i != arrays[i]) {
                System.out.println("while " + i);
                if (arrays[i] == arrays[arrays[i]]) {
                    System.out.println(i);
                    result.add(arrays[i]);
                    return true;
                }
                int temp = arrays[i];
                arrays[i] = arrays[arrays[i]];
                arrays[arrays[i]] = temp;
            }
        }
        return result != null && result.size() > 0;
    }

    public static void main(String[] args) {
        System.out.println("start---------");
        int[] array = {1, 2, 3, 4, 5, 2};
        List<Integer> results = new ArrayList<>();
        boolean duplicate = duplicate(array, results);
        System.out.println(duplicate);
        System.out.println(results.toString());
    }
}
