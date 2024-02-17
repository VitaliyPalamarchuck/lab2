public class Main {
    public static void main(String[] args) {
//       Завдання 1. Створити програму з двома змінними типу int таким чином, щоб
//       вона виводила у консоль результат їх ділення та залишку від ділення.
        int a=4; int b=7;
        double c=(double)a/b;
        int d = a%b;
        System.out.println("Завдання 1");
        System.out.println("Результат ділення:"+c);
        System.out.println("Результат залишку від ділення:"+d);

//       Завдання 2. Створити програму, яка виводитиме
//       у консоль суму цифр двозначного числа записаного до змінної типу int.
        int a1=51;
        int b1=a1/10; int b2=a1%10;

        int sum=b1+b2;
        System.out.println("Завдання 2");
        System.out.println("Сума цифр двозначного числа"+a1+" дорівнює"+sum);

//        Завдання 3. Створити програму, яка виводитиме у консоль округлене число,
//                записане до змінної типу double, до найближчого цілого
        double number = 6.4;
        int intPart = (int) number;
        double decimalPart = number - intPart;
        double round = (decimalPart >= 0.5) ? 1 : 0;
        System.out.println("Завдання 3");
        System.out.println(intPart + round+" - заокруглене число");

    }
}