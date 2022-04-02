package Practice.Циклы.While;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
 */
public class p5 {
    public void out() {
        int i = 0;
        int c = 0;
        while (c < 9) {
            System.out.println("ББББББББББББББББББББ");
            while (i < 8) {
                System.out.println("Б                  Б");
                i++;
            }
            c += i;
        }
    }
}
