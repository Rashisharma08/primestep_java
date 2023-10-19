// program showing the concept of conditional control statement
// program to check whether entered year is a leap year or not
import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter year : ");
       int year = sc.nextInt();

       if(year%4==0){
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.println("Year is a leap year");
                else
                    System.out.println("Year is not a leap year");
            }else{
                 System.out.println("Year is a leap year");
            }
       }
       else{
        System.out.println("Year is not a leap year");
       }
    }
}