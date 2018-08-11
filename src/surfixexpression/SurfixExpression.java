/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surfixexpression;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author huang
 */
public class SurfixExpression {

    static Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sExp=sc.nextLine();
        calculate(sExp);
    }

    private static void calculate(String sExp) {
        Stack<Integer> operands=new Stack();
        String[] tockens=sExp.split(" ");
        for (int i=0;i<tockens.length;i++) {
            char op=tockens[i].charAt(0);
            switch (op) {
                case '+':
                    int b=operands.pop();
                    int a=operands.pop();
                    operands.push(a+b);
                    break;
                case '-':
                    b=operands.pop();
                    a=operands.pop();
                    operands.push(a-b);
                    break;
                case '*':
                    b=operands.pop();
                    a=operands.pop();
                    operands.push(a*b);
                    break;
                case '/':
                    b=operands.pop();
                    a=operands.pop();
                    operands.push(a/b);
                    break;
                default:
                    operands.push(Integer.parseInt(tockens[i]));
                    break;
            }
                
        }
        System.out.println(operands.pop());
    }
    
}


