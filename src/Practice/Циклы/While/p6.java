package Practice.Циклы.While;

import java.util.Scanner;

/*
    Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
    Слово "enough" выводить не нужно.
    Для этого необходимо использовать бесконечный цикл (while(true)).

    Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
     */
public class p6 {
    public void out() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        String read;
        while (!isExit) {
            read = sc.nextLine();
            if (isExit = read.equals("enough")) {
                break;
            }
            System.out.println(read);
        }
    }
}
