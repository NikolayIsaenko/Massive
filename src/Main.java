import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1");
        int[] weights = new int[]{1, 2, 3};
        float[] numbers = {1.57f, 7.654f, 9.986f};
        int[] others = {1235, 987654, 654654, 321987};

        // Задача 2
        System.out.println(" Задача 2");

        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.print(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }


        System.out.println();

        for (int j = 0; j < numbers.length; j++) {
            if (j == numbers.length - 1) {
                System.out.print(numbers[j]);
                break;
            }
            System.out.print(numbers[j] + ", ");
        }
        System.out.println();

        for (int k = 0; k < others.length; k++) {
            if (k == others.length - 1) {
                System.out.print(others[k]);
                break;
            }
            System.out.print(others[k] + ", ");
        }
        System.out.println();
        // Задача 3
        System.out.println(" Задача 3");

        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        System.out.println();

        for (int j = 2; j >= 0; j--) {
            if (j == 0) {
                System.out.print(numbers[j]);
                break;
            }
            System.out.print(numbers[j] + ", ");
        }
        System.out.println();

        for (int k = 3; k >= 0; k--) {
            if (k == 0) {
                System.out.print(others[k]);
                break;
            }
            System.out.print(others[k] + ", ");
        }
        System.out.println();
        // Задача 4
        System.out.println(" Задача 4");
        int[] arr1 = new int[]{1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));






    }

}





            




