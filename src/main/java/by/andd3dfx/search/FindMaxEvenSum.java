package by.andd3dfx.search;

/**
 * Дано множество из N натуральных чисел.
 * Необходимо выбрать его подмножество с максимальной четной суммой.
 * Вывести эту сумму.
 */
public class FindMaxEvenSum {

    /**
     * Очевидно, что в результат войдут ВСЕ четные числа исходного набора.
     * А из нечетных - войдет их четное кол-во.
     * Т.к. все числа натуральные, т.е. положительные, а нам нужна максимальная сумма -
     * то из нечетных войдут все либо все кроме минимального.
     * <p>
     * В итоге решением будет одинарный проход по всем числам с поиском минимального нечетного числа и подсчетом суммы.
     * Поток из суммы вычитаем это минимально нечетное, если сумма нечетная.
     */
    public static int find(int[] a) {
        int minOdd = -1;
        int sum = 0;

        for (int item : a) {
            sum += item;
            if (item % 2 == 1) {

                if (minOdd == -1) {
                    minOdd = item;
                    continue;
                }

                if (item < minOdd) {
                    minOdd = item;
                }
            }
        }

        if (sum % 2 == 1) {
            return sum - minOdd;
        }
        return sum;
    }
}
