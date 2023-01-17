import java.io.IOException;

public class Start7_3 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;

            if (count == 5) break;

        }


//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int i = 0;
        /*while (i < arr.length) {
            int value = arr[i];
            System.out.println(value);
            if (value % 2 == 0) break;
            i++;
        }*/

        /*while (i < arr.length) {
            int value = arr[i];

            if (value % 2 == 0) {
                System.out.println(value);
            } else {
                System.out.println("-");
                i++;
            }
            i++;
        }*/

        /*for (int index = 0; index < arr.length; index++) {
            int value = arr[index];
            if (value % 2 == 0) {
                System.out.println(value);
            } else {
                System.out.println("-");
            }
        }*/

        /*for (int value : arr) {
            if (value % 2 == 0) {
                System.out.println(value);
            } else {
                System.out.println("-");
            }
        }*/

        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) break;
        }*/
    }
}
