import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[3];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            System.out.println(arr[index]);
        }
        System.out.println();

        double[] doubles = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        System.out.println();

        String[] fruits = {"яблоко", "апельсин", "персик", "ананас", "киви", "фейхоа"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[3];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            if (index != 2) {
                System.out.print(arr[index] + ", ");
            } else {
                System.out.print(arr[index]);
            }
        }
        System.out.println();

        double[] doubles = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            if (i != 2) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.println();

        String[] fruits = {"яблоко", "апельсин", "персик", "ананас", "киви", "фейхоа"};
        for (int i = 0; i < fruits.length; i++) {
            if (i != 5) {
                System.out.print(fruits[i] + ", ");
            } else {
                System.out.print(fruits[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        double[] doubles = {1.57, 7.654, 9.986};
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }
        String[] fruits = {"яблоко", "апельсин", "персик", "ананас", "киви", "фейхоа"};
        for (int i = fruits.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(fruits[i] + ", ");
            } else {
                System.out.println(fruits[i]);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}