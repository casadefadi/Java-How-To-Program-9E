/*
 *       Filename:  CAIProblemVaryingTest.java
 *
 *    Description:  Exercise 6.39 - Computer-Assisted Instruction: Varying the
 *                  Types of Problems.
 *
 *        Created:  15/10/15 00:38:44
 *       Revision:  15/10/15 16:43:38
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CAIProblemVaryingTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CAIProblemVarying cai = new CAIProblemVarying();

        char cont = 'y';

        while(cont == 'y'){

            cai.run();

            System.out.print("Continue? (y/n) ");
            cont = sc.next().charAt(0);

            if(cont == 'y')
                cai.reset();
        }
    }
}
