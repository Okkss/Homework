package Homework_1;

public class MathOperationsDemo  {
    public static void main (String[] arg) {
        System.out.println("Welcome to the 'Math Operations'!");

        int a = 50;
        int b = 18;

        System.out.println("1) Addition '+':"); //1
        System.out.print("a = ");              //2
        System.out.print(a);                   //3
        System.out.print(", ");                //4
        System.out.print("b = ");              //5
        System.out.print(b);                   //6

        int sum = a + b;

        System.out.println();
        System.out.print("a + b = ");
        System.out.print(a);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(" = ");
        System.out.print(sum);

        System.out.println();
        System.out.println();
        System.out.println("2) Substraction '-':");

        long x = 48;
        long y = 13;

        System.out.println("x = " + x + "y =" + y);

        long difference = x - y;

        System.out.println("x - y = " +x+ " - "+y+ " = "+ difference);

        System.out.println();
        System.out.println("3) Division '/':");

        short m = 15;
        short n = 3;

        System.out.println("m = "+m+ "n = "+n);
        System.out.println("m/n ="+m+" / "+n+" = "+15/3);

        System.out.println();
        System.out.println();
        System.out.println("4) Multiplication '*':");

        double e = 12.0;
        double f = 4.0;

        System.out.println("e = "+e+ "f = "+f);
        System.out.println("e*f ="+e+" * "+f+" = "+12.0*4.0);


    }
}

