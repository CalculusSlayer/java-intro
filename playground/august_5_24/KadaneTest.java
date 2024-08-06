package august_5_24;

import java.util.Arrays;
import java.util.List;

public class KadaneTest {
    public static void main(String[] args) {
        // Test Case 1: Maximum sum subarray is [4, -1, 2, 1] with indices [3, 6]
        List<Integer> testCase1 = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        List<Integer> result1 = kadane.maxSum(testCase1);
        assert result1.equals(Arrays.asList(3, 6)) : "Test Case 1 Failed - Expected [3, 6] but got " + result1;

        // Test Case 2: Maximum sum subarray is the entire array [1, 2, 3, 4, 5] with indices [0, 4]
        List<Integer> testCase2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result2 = kadane.maxSum(testCase2);
        assert result2.equals(Arrays.asList(0, 4)) : "Test Case 2 Failed - Expected [0, 4] but got " + result2;

        // Test Case 3: Maximum sum subarray is [-1] with indices [0, 0]
        List<Integer> testCase3 = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> result3 = kadane.maxSum(testCase3);
        assert result3.equals(Arrays.asList(0, 0)) : "Test Case 3 Failed - Expected [0, 0] but got " + result3;

        // Test Case 4: Maximum sum subarray is [3, -2, 5, -1, 2] with indices [0, 4]
        List<Integer> testCase4 = Arrays.asList(3, -2, 5, -1, 2);
        List<Integer> result4 = kadane.maxSum(testCase4);
        assert result4.equals(Arrays.asList(0, 4)) : "Test Case 4 Failed - Expected [0, 4] but got " + result4;

        // Test Case 5: Maximum sum subarray is [2, 3, -4, 5] with indices [1, 4]
        List<Integer> testCase5 = Arrays.asList(-1, 2, 3, -4, 5, -2, 1);
        List<Integer> result5 = kadane.maxSum(testCase5);
        assert result5.equals(Arrays.asList(1, 4)) : "Test Case 5 Failed - Expected [1, 4] but got " + result5;

        // Test Case 6: Maximum sum subarray is [5, 4, -1, 7, 8] with indices [0, 4]
        List<Integer> testCase6 = Arrays.asList(5, 4, -1, 7, 8);
        List<Integer> result6 = kadane.maxSum(testCase6);
        assert result6.equals(Arrays.asList(0, 4)) : "Test Case 6 Failed - Expected [0, 4] but got " + result6;

        List<Integer> emptyTestCase = Arrays.asList();
        List<Integer> emptyResult = kadane.maxSum(emptyTestCase);
        assert emptyResult.equals(Arrays.asList()) : "Empty Test Case Failed - Expected [ ] but got " + emptyResult;

        System.out.println("All test cases passed!");
    }
}
