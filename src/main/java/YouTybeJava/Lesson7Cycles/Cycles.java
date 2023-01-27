package YouTybeJava.Lesson7Cycles;

import java.io.IOException;

public class Cycles {
    public static void main(String[] args) throws IOException {
        int count = 0;
        while (count < 10) {
            count++;
            if ((count % 2) != 0) continue;
            System.out.println(count);
        }
    }

}
