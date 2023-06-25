package Homework_1;


public class Main {
    public static void main(String[] args) {
        Homework1.infinityWhile();
        System.out.println(Homework1.divide(1,0));
        System.out.println(Homework1.getValue(new int[10]));
        int[] subArray = Homework1.subArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{5, 4, 3, 2, 1});
        Homework1.printIntArray(subArray);
        int[] divArray = Homework1.divArrays(new int[]{1, 2, 3, 4, 5}, new int[]{0, 4, 3, 2, 1});
        Homework1.printIntArray(divArray);
    }
}