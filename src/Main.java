
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*

    ФУНКЦИИ К КАЖДОЙ ЗАДАЧЕ ВНИЗУ!

    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1. Функция для нахождения максимума
        //Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.


//        System.out.println("Введите первое число");
//        double a = in.nextDouble();
//        System.out.println("Введите второе число");
//        double b = in.nextDouble();
//        try
//        {
//            System.out.println("Максимальное число: "+ max(a,b));
//        }
//        catch (Exception Ex)
//        {
//            System.out.println(Ex.getMessage());
//        }



        //2. Калькулятор деления
        //Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.


//        System.out.println("Введите делимое!");
//        double num = in.nextDouble();
//        System.out.println("Введите делитель!");
//        double del = in.nextDouble();
//        try {
//            System.out.println(quotient(num,del));
//        }
//        catch (ArithmeticException Ex) {
//            System.out.println(Ex.getMessage());
//        }


        //3. Конвертер строк в числа
        //Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может быть конвертирована, выбрасывайте NumberFormatException.

//        System.out.println("Введите строку, которую необходимо конвертировать в целое число!");
//        String str =in.nextLine();
//        try {
//            System.out.println(strToInt(str) );// можно было использовать просто Integer.parseInt, но это скучно
//        }
//        catch (NumberFormatException Ex) {
//            System.out.println(Ex.getMessage());
//        }

        //4. Проверка возраста
        //Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.

//        System.out.println("Введите сколько Вам полных лет!");
//        int age =in.nextInt();
//        try
//        {
//            System.out.println("Спасибо, запомнили, что Вам " + checkAge(age) + " лет!");
//        }
//        catch (IllegalArgumentException Ex)
//        {
//            System.out.println(Ex.getMessage());
//        }




        //5. Нахождение корня
        //Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.

//        System.out.println("Введите положительное число, корень которого необходимо получить!");
//        try {
//            double num = in.nextDouble();
//            System.out.println("Введите основание корня");
//            int degree = in.nextInt();
//            System.out.println("Корень числа " + num + " равен " + getSqrt(num,degree));
//        }
//            catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            in.close();
//        }

        //6. Факториал
        //Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        try
//        {
//           System.out.println(getFactorial(num));
//        }
//        catch (InputMismatchException e)
//        {
//            System.out.println(e.getMessage());
//        }


        //7. Проверка массива на нули
        //Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.

//        System.out.println("Введите количество чисел в массиве!");
//        try {
//            int end = in.nextInt();
//            if (end <= 0)
//                throw new IllegalArgumentException("Число должно быть больше 0");
//            else {
//                int[] nums = new int[end];
//                for (int i = 0; i < end; i++) {
//                    System.out.println("Введите число");
//                    nums[i] = in.nextInt();
//                }
//                boolean hasnull=hasNull(nums);
//                System.out.println(hasnull?"Error":"Массив заполнен, спасибо!");
//            }
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //8. Калькулятор возведения в степень
        //Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.

//        System.out.println("Введите число");
//        double num = in.nextDouble();
//        System.out.println("Введите в какую степень возвести число");
//        double degree = in.nextDouble();
//        try
//        {
//            System.out.println(getDegree(num,degree));
//        }
//        catch (InputMismatchException e)
//        {
//            System.out.println(e.getMessage());
//        }


        //9. Обрезка строки
        //Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.

//        System.out.println("Введите строку!");
//        String str = in.nextLine();
//        System.out.println("Введите до скольких символов необходимо обрезать строку!");
//        int max = in.nextInt();
//        try {
//            System.out.println("Итоговая строка: "+cutOfString(str,max));
//        }
//        catch (IllegalArgumentException ex)
//        {
//            System.out.println(ex.getMessage());
//        }



        //10. Поиск элемента в массиве
        //Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.

//        System.out.println("Какой символ будем искать в массиве?");
//        String el = in.nextLine();
//        System.out.println("Введите количество элементов в массиве!");
//        try {
//            int end = in.nextInt();
//            if (end <= 0)
//                throw new IllegalArgumentException("Число должно быть больше 0");
//            else {
//                String[] elements = new String[end];
//                for (int i = 0; i < end; i++) {
//                    System.out.println("Введите элемент");
//                    elements[i] = in.next();
//                }
//                boolean found=Found(elements,el);
//                System.out.println("Массив содержит элемент \"" +el +"\"");
//            }
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }


        //11. Конвертация в двоичную систему
        //Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        try
//        {
//            System.out.println(Tobinary(num));
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //12. Проверка делимости
        //Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.

//        System.out.println("Введите делимое");
//        double num = in.nextDouble();
//        System.out.println("Введите делитель");
//        double del = in.nextDouble();
//        try
//        {
//            System.out.println(divisible(num,del)? "Число делится без остатка.":"Число НЕ делится без остатка.");
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }


        //13. Чтение элемента списка
        //Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.

//        System.out.println("Введите количество элементов в списке!");
//        try {
//            int end = in.nextInt();
//            if (end <= 0)
//                throw new IllegalArgumentException("Число должно быть больше 0");
//            else {
//                in.nextLine();
//                ArrayList<String> elements = new ArrayList<String>(end);
//                for (int i = 0; i < end; i++) {
//                    System.out.println("Введите элемент");
//                    elements.add(in.nextLine());
//                }
//                System.out.println("Элемент с каким индексом необходимо найти?");
//                int index = in.nextInt();
//                System.out.printf("Элементом списка на %d месте является \"%s\"",index,FoundForIndex(elements,index));
//            }
//        }
//        catch (IndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //14. Парольная проверка
        //Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.

//        System.out.println("Введите пароль для проверки надежности!");
//        String password = in.nextLine();
//        try {
//            System.out.printf(PasswordOK(password)? "Пароль %s надежный!":"Пароль %s слишком слабый!",password);
//        }
//        catch (WeakPasswordException e)
//        {
//            System.out.println(e.getMessage());
//        }
        //15. Проверка даты
        //Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.

//        System.out.println("Введите пароль для проверки надежности!");
//        String datestr = in.nextLine();
//        try {
//            dateOK(datestr);
//            System.out.println("Дата корректна!");
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }

        //16. Конкатенация строк
        //Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.
//
//        System.out.println("Введите первую строку");
//        String onestr = in.nextLine();
//        System.out.println("Введите вторую строку");
//        String twostr = in.nextLine();
//        try {
//            System.out.println(kon(onestr,twostr));
//
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }


        //17. Остаток от деления
        //Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.

//        System.out.println("Введите делимое");
//        double num = in.nextDouble();
//        System.out.println("Введите делитель");
//        double del = in.nextDouble();
//        try
//        {
//            System.out.printf("Остаток от деления = %f",rest(num,del));
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //18. Квадратный корень
        //Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.
        System.out.println("Введите положительное число, корень которого необходимо получить!");
        try {
            double num = in.nextDouble();
            System.out.println("Квадратный корень числа " + num + " равен " + getSqrt(num,2));
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            in.close();
        }


        //19. Конвертер температуры
        //Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.
        //F = C*(9/5)+32

//        System.out.println("Введите температуру в Цельсиях!");
//        try {
//            int num = in.nextInt();
//            System.out.println("Температура в Фаренгейтах = "+ ToF(num));
//        }
//            catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            in.close();
//        }
        //20. Проверка строки на пустоту
        //Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.
//
//        System.out.println("Введите строку.");
//        String str = in.nextLine();
//        try
//        {
//            CheckStr(str);
//            System.out.println("Вы ввели :   " + str);
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
    public static double max(double a,double b) // функция для 1 задачи
    {
        if(a==b) {
            throw new IllegalArgumentException("Числа должны быть не равны!");
        }
        else {
            return (a > b) ? a : b;
        }
    }
    public static double quotient(double num,double del) // функция для 2 задачи
    {
        if (del == 0) {
            throw new ArithmeticException("Ошибка: деление на ноль недопустимо.");
        }
        else
            return num/del;
    }
    public static int strToInt(String s) // функция для 3 задачи
    {   if (s.isEmpty()) {
        throw new NumberFormatException("Введена пустая строка!");
    }

        s = s.trim(); // Удалить пробелы
        boolean negative = false;
        int result = 0;

        // Проверка знака
        int startIndex = 0;
        if (s.startsWith("-")) {
            negative = true;
            startIndex++;
        } else if (s.startsWith("+")) {
            startIndex++;
        }

        for (int i = startIndex; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = c - '0';
            if (digit < 0 || digit > 9) {
                throw new NumberFormatException("Неправильный ввод. Убедитесь, что не введено букв или знаков препинания");
            }
            result = result * 10 + digit;

            if (result < 0) {
                throw new NumberFormatException("Слишком большое или слишком маленькое число!");
            }
        }

        return negative ? -result : result;
    }
    public static int checkAge(int age) // функция для 4 задачи
    {
        if(age<0 ||age>150)
            throw new IllegalArgumentException("Введен некорректный возраст!");
        else
        {
            return age;
        }
    }
    public static double getSqrt(double num,int degree) // функция для 5 задачи
    {
        if (num < 0 || degree<=0)
            throw new IllegalArgumentException("Введенное число НЕ должно быть отрицательным!");
        else {
            if (num == 0 || num == 1) {
                return num;
            }

            double guess = num / degree;
            double epsilon = 0.00001;

            while (Math.abs(Math.pow(guess, degree) - num) >= epsilon) {
                guess = (guess * (degree - 1) + num / Math.pow(guess, degree - 1)) / degree;
            }
            return guess;
        }
    }
    public static double getFactorial(int num) // функция для 6 задачи
    {
        if(num<0)
            throw new IllegalArgumentException("Введенное число НЕ должно быть отрицательным!");
        else
        {
            int count=1;
            for (int i=1;i<=num;i++)
                count = count*i;
            return count;
        }
    }
    public static boolean hasNull(int[] nums) // функция для 7 задачи
    {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0)
                {
                throw new IllegalArgumentException("Ни одно число в массиве не должно быть равно 0!");
                }
            else return false;
        }
        return false;
    }
    public static double getDegree(double num,double degree) // функция для 8 задачи
    {if (degree < 0) {
        throw new IllegalArgumentException("Степень должна быть больше или равна 0!");
    } else if (degree == 0) {
        return 1.0;
    }
        double result = 1.0;
        for (int i = 0; i < degree; i++) {
            result *= num;
        }

        return result;
    }

    public static String cutOfString(String str,int max) // функция для 9 задачи
    {
        if (max > str.length())
            throw new IllegalArgumentException("Введенное число больше длины строки!");
        else {
            StringBuilder res = new StringBuilder();
            char[] letters = new char[max];
            for (int i = 0; i < max; i++) {
                letters[i] = str.charAt(i);
            }
            for (int j = 0; j < max; j++) {
                res.append(letters[j]);
            }
            return res.toString();
        }
    }
    public static boolean Found(String[] elements, String el) // функция для 10 задачи
    {
        for (String element : elements) {
            if (!Objects.equals(element, el)) {
                throw new IllegalArgumentException("Не найдено ни одного совпадения!");
            } else return false;
        }
        return false;
    }
    public static String Tobinary(int num) {
        if(num<0)
            throw new IllegalArgumentException("Число должно быть больше или равно 0!");
        if (num==0) {
            return String.valueOf(num);
        }
        else {
            StringBuilder binaryString = new StringBuilder();
            while (num > 0) {
                int binarynum = num % 2;
                binaryString.insert(0, binarynum);
                num = num / 2;
            }
            return binaryString.toString();
        }
    }
    public static boolean divisible(double num,double del) {
        if(del==0)
            throw new ArithmeticException("Делить на 0 нельзя!");
        else {
            return num % del == 0;
        }
    }

    public static String  FoundForIndex(ArrayList<String> list,int index)
    {
        if(index>=list.size())
            throw new IndexOutOfBoundsException("Размер списка меньше заявленного индекса!");
        else
        {
            return list.get(index);
        }
    }
    public static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }
    public static boolean PasswordOK (String password) throws WeakPasswordException
    {
        if(password.length()<8){
            throw new WeakPasswordException("Пароль должен содержать минимум 8 символов!");}
        else
            return true;
    }
    public static class DateTimeParseException extends Exception {
        public DateTimeParseException(String message) {
            super(message);
        }
    }
    public static void dateOK (String dateStr) throws DateTimeParseException
    {
        if (dateStr == null || dateStr.length() != 10) {
            throw new DateTimeParseException("Некорректный формат даты");
        }

        String[] parts = dateStr.split("\\.");

        if (parts.length != 3) {
            throw new DateTimeParseException("Некорректный формат даты");
        }

        int day, month, year;

        try {
            day = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new DateTimeParseException("Некорректный формат даты");
        }

        if (!isValidDate(day, month, year)) {
            throw new DateTimeParseException("Некорректная дата");
        }
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = {31, (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return day > 0 && day <= daysInMonth[month - 1];
    }
    public static String kon(String one,String two)
    {
        if (one.isEmpty()||two.isEmpty())
            throw new NullPointerException("Ни одна строка не может быть пустой!");
        else
            return one+two;
    }
    public static double rest(double num,double del) {
        if(del==0)
            throw new ArithmeticException("Делить на 0 нельзя!");
        else {
            return num % del;
        }
    }

    public static String ToF(int num)
    {
        //F = C*(9/5)+32
        if(num<-273)
        {
            throw new IllegalArgumentException("Температура должна быть больше абсолютного нуля!");
        }
        else
            return String.valueOf(num *9/5+32);
    }
    public static void CheckStr(String str)
    {
        if(str.trim().length()==0 ||str==null)
            throw new IllegalArgumentException("Введена пустая строка!");
    }
}
