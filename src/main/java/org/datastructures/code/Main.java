package org.datastructures.code;

public class Main {
    public static void main(String[] args) {
    //     System.out.println("Hello world!");
    //    System.out.println(computeRemainder(2, 4, 4));
    runBillionTimes();

    }

    //power of a number and then returns modulus (remainder)
    public static long computeRemainder(long base, long power, long divisor){
        long baseRaisedToPower = 1;
        for (int i = 1; i<=power; i++) {
            baseRaisedToPower*=base;
            // System.out.println(baseRaisedToPower);
        }
        return baseRaisedToPower % divisor;
    }

    //running our program a billion times
    //executes in approx 20.817 seconds or 20817 millis (this was infered to when we raised to power 1000)
    public static void runBillionTimes(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000_000_000; i++) {
            //takes / executes in approximately 20.817 nanonseconds per run 
            computeRemainder(2,1000,7);
        }
        long endTime =System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(startTime);
        System.out.println(endTime);

        //Therefore, we can say our program execution in nanoseconds is 0.20817 X Power approximately
    }


}