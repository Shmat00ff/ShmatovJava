package TestCase;
import java.util.Scanner;

public class main {
    
    // Задача 1: Работа с числами
    public static void numbersOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        
        // Сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Математические операции
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        if (b != 0) {
            System.out.println("Частное: " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }
    
    // Задача 2: Сравнение строк
    public static void compareStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
    
    // Задача 3: Вывод четных чисел из массива
    public static void printEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные числа: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        numbersOperations();
        compareStrings();
        printEvenNumbers();
    }
}
