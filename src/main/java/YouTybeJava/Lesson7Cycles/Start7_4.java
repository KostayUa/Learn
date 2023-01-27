package YouTybeJava.Lesson7Cycles;

public class Start7_4 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++;

            if ((count % 2) != 0) continue;
            System.out.println(count);
        }
    }
}
