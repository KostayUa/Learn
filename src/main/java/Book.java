public class Book {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /**
         * Разъяснение содержания и особенностей прогоаммы...
         * @author Имя Фамилия (автора)
         * @version 1.0 (это версия программы)
         */
        class Book2 { // Book - это только имя
            // следующий метод начинает выполнение программы
            public static void main(String[] args) { // args не используется
                /* Следующий метод просто выводит свой аргумент
                 * на экран дисплея
                 */
                System.out.println("Hello World");
                // Следующий метод закомментирован,
                // метод не будет выполняться
                // System.out.print("Farewell, XX Century!");
            }
        }
    }
}