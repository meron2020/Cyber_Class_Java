package TestExercises;

public class Exercise1 {

    public static int findBiggestNumInArr(int[] arr) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void mostCommonNum(int[] arr) {
        int maxNum = findBiggestNumInArr(arr);
        int[] countingArr = new int[maxNum+1];

        for (int i = 0; i < arr.length; i++) {
            countingArr[arr[i]]++;
        }

        int countingMaxNum = findBiggestNumInArr(countingArr);
        for (int i = 0; i < countingArr.length; i++) {
            if (countingArr[i] == countingMaxNum) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {34,1325,32,13,23,32,32,532,13,13};
        Exercise1.mostCommonNum(arr);
    }
}
