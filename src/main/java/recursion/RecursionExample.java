package recursion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RecursionExample {
    private static Logger logger=Logger.getLogger(String.valueOf(RecursionExample.class));
    public static void main(String[] args) {
        printOneToFive(1);
    }
    static void  printOneToFive(int n){
        logger.log(Level.INFO," Start printing "+n);
        System.out.println(n);
        if(n==5){
            return;
        }
        printOneToFive(n+1);
        logger.log(Level.INFO," Finished printing "+n);

    }

}
