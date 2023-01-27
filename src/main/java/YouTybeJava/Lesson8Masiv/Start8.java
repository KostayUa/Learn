package YouTybeJava.Lesson8Masiv;

public class Start8 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = i;
        }

        arr[3] = 100;

        //for (int i = 0; i < 4; i++) {
        for (int i : arr) {
           // System.out.println("Элкмент[" + i + "]" + arr[i]);
            System.out.println(i);
        }
    }
}


/*Многомерные массивы (пример двумерного массива)
        int arr[][] = new arr[3][];
        arr[0] = new int[4];
        arr[1] = new int[4];
        arr[2] = new int[40];*/
