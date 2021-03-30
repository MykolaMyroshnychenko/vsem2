package myr.vsem.module2.builder;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class MyInteger
 * @since 30.03.2021 - 17.29
 */
public class MyInteger {
    public static boolean isPrime(int num) {

// determine is the number prime  or not

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(111));
        System.out.println(isPrime(5));
        System.out.println(isPrime(257));
        System.out.println(isPrime(65537));
        System.out.println(isPrime(416));
    }
}

/* result
false
true
true
true
false
 */

