package org.datastructures.code.unitTesting;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Grader {
    static  final Logger logger= LogManager.getLogger(Grader.class);
    public static char returnLetterGrader(int numberGrader){
        if (numberGrader < 0){
            logger.log(Level.ERROR,"Logged");
            throw new IllegalArgumentException("Number grade cannot be zero");
        } else if (numberGrader < 60) {
            logger.log(Level.FATAL,"Grade is F");
            return 'F';
        } else if (numberGrader < 70) {
            logger.log(Level.WARN,"Logged");
            return 'D';
        } else if (numberGrader < 80) {
            logger.log(Level.ERROR,"Grade is C ");
            return 'C';
        } else if (numberGrader < 90) {
            logger.log(Level.DEBUG,"Grade is B");
            return 'B';
        }
        else {
           if (numberGrader <= 100){
               logger.log(Level.INFO,"Grade is A");
               return 'A';
           }
        }
        return 'Y';
    }

    public static void main(String[] args) {
        System.out.println(getGrade(100));
    }

    //pass grades  recursively
    public static int getGrade(int grade){
        if (grade < 0) return -1;
        return getGrade(grade - 10) ;
    }
}