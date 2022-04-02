package Practice.Циклы.While;
public class p1 {
    /*
    Вывести 100раз
     */
    int c = 1;
    String quote = "Я никогда не буду работать за копейки. Амиго";

    public void out() {
        while (c != 101) {
            System.out.println(quote + " " + c);
            c++;
        }
    }
}
