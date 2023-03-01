package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+"í not a prime");
        }else {
            int i= 2;
            boolean check =true;
            while (i<number){
                if(number%1==0){
                    check=false;
                }
                i++;
            }
            if (check)
                System.out.println(number+"ís a prime");
            else
                System.out.println(number+"ís not a prime");
        }
    }
}
