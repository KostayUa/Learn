package YouTybeJava.Lesson7Cycles;

import java.io.IOException;

public class Start7_1 {

        public static void main(String[] args) throws IOException {
            for (int i = 0;(char) System.in.read() !='s'; i++) {
                System.out.println("Итерация" + i);
            }
        }
}
