package Homework_1;

public class Homework1 {
    public static void infinityWhile() {
        infinityWhile();
    }

    public static int divide(int a1, int a2) {
        return a1 / a2;
    }

    public static int getValue(int[] array) {
        return array[array.length];
    }

    public static int[] subArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            throw new RuntimeException("Size of the arrays is not equals");
        int[] subArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            subArray[i] = array1[i] - array2[i];
        }
        return subArray;
    }

    public static int[] divArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            throw new RuntimeException("Size of the arrays is not equals");
        int[] divArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0)
                throw new RuntimeException("Divide on zero no permitted. Index " + i);
            divArray[i] = array1[i] / array2[i];
        }
        return divArray;
    }

    public static void printIntArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
