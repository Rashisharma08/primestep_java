// program to print Hello world
class Demo3{
    public static void main(String args[]){
//        int a=012; // octal number system
//          int a=018; // error
//            int a = 0x12; // hexadecimal number system
              int a = 0xa12; // hexadecimal number system

        System.out.println("value of a : "+a);
    }
}

/*
int a=012; octal number system
           0-7

       1x8^1 + 2x8^0
       1x8 + 2x1
       8 + 2
       10    

int a=0x12; hexadecimal number system
            0-15
            0-9 10 11 12 13 14 15
                a  b  c  d  e  f

       1x16^1 + 2x16^0
       1x16 + 2x1
       16 + 2
       18    

int a = 0xa12;
          a=10

          ax16^2 + 1x16^1 + 2x16^0
          10x256 + 16 + 2
          2560 +18
          2578
*/