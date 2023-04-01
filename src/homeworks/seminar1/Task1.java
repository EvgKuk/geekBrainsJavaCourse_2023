package homeworks.seminar1;

import java.util.Scanner;

public class Task1 {

    //Вычислить n-ое треугольного числа
    // т.е. (сумма чисел от 1 до n)
    public static void sumNumbers() {
        System.out.println("Введите число n: ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int sumNum = 0;

        for (int i = 0; i <= n; i++){
            sumNum = sumNum + i;
        }

        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sumNum);
    }

    public static void sumNumbers2() {
        System.out.println("Введите число n: ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int sumNum = 0;

        for (int i = 1; i < n; i++){
            System.out.print(i + "+");
            sumNum += i;
        }
        sumNum += n;
        System.out.print(n + "=" + sumNum);
    }

// Высичслить факториал n! (произведение чисел от 1 до n)
    public static void factorial(){
        System.out.println("Введите число n: ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int fact = 1;

        for (int i = 1; i < n; i++){
            System.out.print(i + " * ");
            fact = fact * i;
        }
        fact = fact * n;
        System.out.print(n + " = " + fact);
    }
// Вывести все простые числа от 1 до 1000
// простое число - то число которое делится без остатка
// только на 1 и на само себя (1 - это не простое число);
    public static void simpleNums(){
        System.out.println("Введите число (по типу 100, 200 ... или 1000, 2000 ....): ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        System.out.println("Простые числа от 1 до " + n + ":\n");
        for (int i = 2; i < n; i++){
            boolean a = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    a = false;
                }
            }
            if (a) System.out.print(i + " ");
        }

    }
// Реализовать простой калькулятор
// Привести строку к double типу:
// Double.parseDouble(str); либо использовать Scanner.nextInt или nextDouble
    public static void calc(){
        double number1;
        double number2;
        double result;
        char operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        number1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        number2 = sc.nextDouble();

        System.out.print("\n Выберите действие (+, -, *, /): ");
        operation = sc.next().charAt(0);
        switch(operation) {
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1 / number2;
                break;
            default:  System.out.printf("Невозможно вычислить, так как вы ввели некорретное действие");
                return;
        }
        System.out.print("\nРезультат вычисления:\n");
        System.out.printf(number1 + " " + operation + " " + number2 + " = " + result);
    }


}
