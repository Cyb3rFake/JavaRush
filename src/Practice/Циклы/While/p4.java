package Practice.Циклы.While;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'
 */
public class p4 {
    public void out() {
        int i = 0;
        while (i < 5) {
            int c = 0;
            while (c < 10) {
                System.out.print("Q");
                c++;
            }
            System.out.println("");
            i++;
        }
    }
}
