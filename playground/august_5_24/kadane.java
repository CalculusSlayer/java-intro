package august_5_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kadane {
    public static List<Integer> maxSum(List<Integer> nums) {
        if (nums.isEmpty()) {
            return new ArrayList<>(Arrays.asList(1));
        }
        int maxCurrent = nums.get(0);
        int maxGlobal = nums.get(0);
        int start = 0, end = 0, tempStart = 0;

        for (int index = 1; index < nums.size(); index++) {
            if (maxCurrent < 0) {
                maxCurrent = nums.get(index);
                tempStart = index;
            } else {
                maxCurrent += nums.get(index);
            }

            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
                start = tempStart;
                end = index;
            }

        }
        return Arrays.asList(start, end);
    }
    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        System.out.println(String.format(
            "max sum interval of %s: %s", a1, kadane.maxSum(a1))
        );
    }
}
