// program showing the concept of conditional control statement

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter salary : ");
       int sal = sc.nextInt();

       System.out.println("Enter experience : ");
       int exp = sc.nextInt();

        if(sal>=20000 && exp>=5)
            System.out.println("eligible to get hike");
        else
            System.out.println("not eligible to get hike");
    }
}