package Practice.Циклы.While;

import java.util.Scanner;

public class p3 {
    /*
    Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
    Вывести на экран полученную сумму и завершить программу.
     */
    public void out() {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        int sum = console.nextInt();
        while (!isExit && console.hasNextInt()) {
            String s = console.nextLine();
            isExit = s.equals("ENTER");
            int x = console.nextInt();
            sum += x;
        }
        System.out.println(sum);

    }
}
