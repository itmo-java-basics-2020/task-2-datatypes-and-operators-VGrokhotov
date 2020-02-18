package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        int intNumber = (int)realNumber;
        return realNumber - intNumber;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return Integer.compare(a, b) == 0 ? true : false;
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if ( number == null || leftBound == null || rightBound == null || inclusively == null) { return  false; }
        if (inclusively){
            return Integer.compare(number, leftBound) != -1 && Integer.compare(number, rightBound) != 1 ? true : false;
        } else {
            return Integer.compare(number, leftBound) == 1 && Integer.compare(number, rightBound) == -1 ? true : false;
        }
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        return (47 < c1 && c1 < 58) || (47 < c2 && c2 < 58) ||  (47 < c3 && c3 < 58);
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        if (a > b){
            if (a - b <= 10e-10 ){
                return true;
            } else {
                return false;
            }
        } else {
            if (b - a <= 10e-10 ){
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        return n / 100 + n / 10 % 10 + n % 10;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        return n % 2 == 0 ? n + 2 : n + 1;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int result = 0;
        result += num1 % 2 == 0 ? num1 / 2 : num1 / 2 + 1;
        result += num2 % 2 == 0 ? num2 / 2 : num2 / 2 + 1;
        result += num3 % 2 == 0 ? num3 / 2 : num3 / 2 + 1;
        return result;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int first = N % 10;
        int second = N % 100 / 10;
        return first ^ second;
    }

}
