package Practice.Циклы.While;

import java.util.Scanner;
/*
Программа должна считывать целые числа с клавиатуры до тех пор,
пока не будет введено что-то другое: например, строка или символ.
Выведи на экран максимальное четное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
 */
public class p9 {
    static void out(){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = Integer.MIN_VALUE;
        if (!sc.hasNextInt()){
            System.out.println(min);
        }
        else{
            while (sc.hasNextInt()){
                int x = sc.nextInt();
                if (x%2==0){
                    if (x>max){
                        max = x;
                    }
                }
            }
            if (max==0){
                System.out.println(min);
            }else{
                System.out.println(max);
            }
        }
    }
}
/*
8
9
8
4
5
e
 */