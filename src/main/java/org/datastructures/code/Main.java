package org.datastructures.code;

public class Main {
    public static void main(String[] args) {
    //     System.out.println("Hello world!");
    //    System.out.println(computeRemainderCorrected(2,1000,7));
    runBillionTimes();

    }

    //power of a number and then returns modulus (remainder)
    /**
     * Original problem
     * @param base
     * @param power
     * @param divisor
     * @return
     */
    public static long computeRemainder(long base, long power, long divisor){
        long baseRaisedToPower = 1;
        for (long i = 1; i<=power; i++) {
            baseRaisedToPower*=base;
            // System.out.println(baseRaisedToPower);
        }
        return baseRaisedToPower % divisor;
    }

    //running our program a billion times
    //executes in approx 20.817 seconds or 20817 millis (this was infered to when we raised to power 1000)
    public static void runBillionTimes(){
        System.out.println(computeRemainderUsingEBS(13, 10_000_000, 7));
        // long startTime = System.currentTimeMillis();
        // for (int i = 0; i < 1000; i++) {
        //     //takes / executes in approximately 20.817 nanonseconds per run 
        //     computeRemainderCorrected(13, 10_000_000, 7);
        // }
        // long endTime =System.currentTimeMillis();
        // System.out.println(endTime - startTime);

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            //takes / executes in approximately 20.817 nanonseconds per run 
            computeRemainderUsingEBS(13, 10_000_000, 7);
        }
        long endTime1 =System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);

        //Therefore, we can say our program execution in nanoseconds is 0.20817 X Power approximately
        //In shortm, time taken is a CONSTANT X the Power
    }

    /**
     * Fixed power values output
     */
    public static long computeRemainderCorrected(long base, long power, long divisor){
        long baseRaisedToPower=1;
        for (long i = 1; i <= power; i++) {
            baseRaisedToPower*=base;
            baseRaisedToPower%=divisor;  
        }
        return baseRaisedToPower;
    }

    /**
     * Improved time complexity 
     */
    public static long computeRemainderUsingEBS(long base,long power,long divisor) {
        long baseRaisedToPower=1;
        long powerBitsReversed = 0;
        int numBits = 0;
        //First reverse the bits of our power so that it is easier to access them from the least
        //important side, which is more easily accessible
        while(power>0){
            powerBitsReversed <<=1;
            powerBitsReversed+=power & 1;
            power >>>=1;
            numBits ++;
        }

        // Now we extract one bit at a time. Since we have already reversed the order of bit,
        // the first one we get is the most significant one. Just to get an intuition on the order,
        // the first bit we collect will eventually be squared the maximum number of times and
        // hence will act like the most significant bit:
        while(numBits -- > 0){
            if(powerBitsReversed % 2 == 1){
                baseRaisedToPower *= baseRaisedToPower * base;
            }
            else{
                baseRaisedToPower *= baseRaisedToPower;
            }
            baseRaisedToPower %= divisor;
            powerBitsReversed >>>= 1;
        }
        return baseRaisedToPower;
    }


}