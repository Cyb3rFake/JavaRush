package Practice.Циклы.While;
/*
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
 */
public class p7 {
        public void out() {
            int i = 0;
            int sum = 0;
            while (i <= 100) {
                if ((i % 3 ) == 0) {
                    i++;
                    continue;
                }
                sum = sum+i;
                i++;
            }
            System.out.println(sum);
        }
    }
