package Practice.Циклы.While;

import org.junit.Test;

import java.util.Scanner;

/*
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:
 */
public class p2 {
    public void out(){
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int c = 0;
            while (c !=10){
            c++;
            System.out.println(name+""+text);
    }
    }
}
