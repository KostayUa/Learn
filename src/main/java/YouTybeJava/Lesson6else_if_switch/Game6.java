package YouTybeJava.Lesson6else_if_switch;

import java.io.IOException;

public class Game6 {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какую букву я загадал ? ");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.print("Поздровляем! ");
        } else if (ch > answer) {
            System.out.print("Перестарался ! ");
        } else {
            System.out.print("Недостарался !");
        }
    }
}