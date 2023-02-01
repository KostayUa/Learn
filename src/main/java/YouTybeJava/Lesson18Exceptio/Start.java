package YouTybeJava.Lesson18Exceptio;

public class Start {
    public static void main(String[] args) {
        int nams[] = new int[4];

        try {
            System.out.println("Начало");
            nams[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Упс... у нас ошибка!!!");
        } catch (ArithmeticException exc) {
            System.out.println("Упс... у нас ошибка!!!");
        }
    }
}
/*InstantiationException попытка создать обстрактный класс
    ClassNotFoundException класс не найден
    UnsupportedOperationException операция не поддерживается
    TypeNotPresentException неизвестный тип
    NullPointerException негативная пустая ссылка
    NegativeArraySizeException негативный результат
    ArrayStoreException несовместимый тип
    ArrayIndexOutOfBoundsException обращениеза пределы массива
    ArrayStoreException недопустимое приведение типов
    IllegalAccessException недопустимый параметр*/

