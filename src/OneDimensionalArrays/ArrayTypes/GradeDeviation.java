package OneDimensionalArrays.ArrayTypes;

import java.util.Arrays;

public class GradeDeviation {
    public void sortGrades(int[] gradeArray) {
        int[] grades = new int[100];
        for (int j : gradeArray) {
            grades[99 - j]++;
        }
        System.out.println(Arrays.toString(grades));

        int[] mostCommonGradeFrequency = new int[10];
        for (int i = 0; i < grades.length; i+=10) {
            int counter = 0;
            for (int j = i; j < i+10; j++) {
                counter += grades[j];
            }
            mostCommonGradeFrequency[i / 10] = counter;
        }
        int maximumGradeIndex = 0;
        for (int i = 0; i < mostCommonGradeFrequency.length; i++) {
            if (mostCommonGradeFrequency[i] > mostCommonGradeFrequency[maximumGradeIndex]) {
                maximumGradeIndex = i;
            }

        }
        System.out.println(maximumGradeIndex);

    }
    public static void main(String[] args) {
        GradeDeviation gradeDeviation = new GradeDeviation();
        int[] gradeArray = new int[200];
        for (int i = 0; i < 200; i++) {
            gradeArray[i] = (int) (Math.random() * 100);
        }
        gradeDeviation.sortGrades(gradeArray);
    }
}
