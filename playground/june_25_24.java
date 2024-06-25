public class june_25_24 {
    public static void main(String[] args) {
        System.out.println("Testing different sorting algorithms\n");

        SortingAlgorithms s = new SortingAlgorithms();

        int[] A1 = {1, 2, 3, 4, 5};
        System.out.print("Before sorting A1: ");
        s.printArray(A1, 5);
        System.out.println();
        s.bubbleSort(A1, 5);
        System.out.print("After sorting A1: ");
        s.printArray(A1, 5);
        System.out.println("\n");

        int[] A2 = {5, 4, 3};
        System.out.print("Before sorting A2: ");
        s.printArray(A2, 3);
        System.out.println();
        s.bubbleSort(A2, 3);
        System.out.print("After sorting A2: ");
        s.printArray(A2, 3);
        System.out.println("\n");

        int[] A3 = {2, 4, 1, 6, 3};
        System.out.print("Before sorting A3: ");
        s.printArray(A3, 5);
        System.out.println();
        s.bubbleSort(A3, 5);
        System.out.print("After sorting A3: ");
        s.printArray(A3, 5);
        System.out.println("\n");
    }
}

/*
 * Design sorting algorithm class.
 * 
 * Assume we are sorting arrays
 * of integers.

 * REMEMBER: There can only be 1
 * public class per file, so don't add public
 * keyword to the below class.
 * 
 * 
 */

 class SortingAlgorithms {
    // bubble sort
    /*
    * 
    procedure bubbleSort( A : list of sortable items )
        n = length(A)
        repeat
            swapped = false
            for i = 1 to n-1 inclusive do
                if A[i-1] > A[i] then
                    swap(A[i-1], A[i])
                    swapped = true
                end if
            end for
        until not swapped
    end procedure
    */

    public void printArray(int [] A, int n) {
        for (int index=0; index < n; index++) {
            System.out.print(A[index] + " ");
        }
    }

    public void bubbleSort(int[] A, int n) {    
        /*
        A - array of integers
        n - size of array `A`
         */
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i <= n-1; i++) {
                if (A[i-1] > A[i]) {
                    // swap(A[i-1], A[i])
                    int temp = A[i-1];
                    A[i-1] = A[i];
                    A[i] = temp;
                    swapped = true;
                }
            }
        }
    }
 }
