public class StartString10 {
    public static void main(String[] args) {
        String str1 = new String("World");
        String[] str2 = {"Hello", "world", "People"};
        System.out.println(args[0] + " " + args[1]);

        //варианты для String
        //String str3 = str2.toUpperCase(); все заглавные
        //String str3 = str1 + str2; конкретинация
        //String str3 = str2.substring(0, 3);       индекс строк
        //System.out.println(str1.equals(str2)); сравнение идентичность 100% (метод equals)
        /*System.out.println(str1.equalsIgnoreCase(str2)); сравнение эквивалентности не
        обращая внимания на заглавные буквы*/

    }
}
