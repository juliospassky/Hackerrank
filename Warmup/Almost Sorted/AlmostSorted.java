import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.List;

public class Solution {

    public static int swapIndex1 = 0;
    public static int swapIndex2 = 0;
    public static int reverseIndex1 = 0;
    public static int reverseIndex2 = 0;

    // Complete the almostSorted function below.
   static void almostSorted(int[] arr) {
        int[] arr2= arr.clone();
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        boolean swap = isSwap(arr, sortedArr);
        if (swap) {
            System.out.println("yes");
            System.out.printf("swap %d %d", swapIndex1 + 1, swapIndex2);
            return;
        }

        boolean reverse = isReverse(arr2, sortedArr);
        if (reverse) {
            System.out.println("yes");
            System.out.printf("reverse %d %d", reverseIndex1 + 1, reverseIndex2 + 1);
            return;
        }

        System.out.println("no");
    }

    private static boolean isSwap(int[] arr, int[] sortedArr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && arr[i] > arr[i + 1]) {
                swapIndex1 = i;

                makeSwap(arr);

                if (Arrays.equals(arr, sortedArr))
                    return true;
                else {
                    break;
                }
            }
        }

        return false;
    }



    private static void makeSwap(int[] arr) {
        int finalIndex = arr.length - swapIndex1;
        for (int i = swapIndex1; i < swapIndex1 + finalIndex; i++) {
            if (arr[swapIndex1] < arr[i]) {
                int temp = arr[swapIndex1];
                arr[swapIndex1] = arr[i - 1];
                arr[i - 1] = temp;
                swapIndex2 = i;
                break;
            }
        }
    }

    private static boolean isReverse(int[] arr, int[] sortedArr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && arr[i] > arr[i + 1]) {
                reverseIndex1 = i;

                for (int j = i; j < arr.length; j++) {
                    if (arr[i] >= arr[j])
                        reverseIndex2 = j;
                    else
                        break;
                }

                arr = reverseArray(arr);

                return Arrays.equals(arr, sortedArr);
            }
        }
        return false;
    }

    private static int[] reverseArray(int[] arr) {
        int[] auxArr = arr.clone();
        int aux = 0;

        for (int i = reverseIndex2; i >= reverseIndex1; i--) {
            auxArr[reverseIndex1 + aux] = arr[i];
            aux++;
        }

        return auxArr;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();
        almostSorted(arr);
    }
}
