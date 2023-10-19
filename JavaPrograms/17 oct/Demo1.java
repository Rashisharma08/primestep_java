// program to swap to numbers

class Demo1{
    public static void main(String args[]){
        int a=5,b=6;
        System.out.println("Before swapping : \na : "+a+"\nb : "+b);
            /*
            a=a-b;
            b=a+b;
            a=b-a;
            */
           /*
            a=a*b;
            b=a/b;
            a=a/b;
            */

            a = a^b;
            b = a^b;
            a = a^b;
        System.out.println("After swapping : \na : "+a+"\nb : "+b);
    }
}

/*
a = 4 (100)
b = 5 (101)

a = a ^ b
  100 ^ 101

    100
    101
    ---
a = 001 

b = a ^ b
  001 ^ 101

     001
     101
    ----
 b = 100 (4)

a = a ^ b
  001 ^ 100

     001
     100
     ---
a =  101 (5) 
*/

