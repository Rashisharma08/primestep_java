// program 
class Demo5{
    public static void main(String args[]){
        int num = 8;
        int res = num<<1;
        System.out.printf("number : "+res);
    }
}

/*
.......16 8 4 2 1
------------------
          1 0 0 0 = 8
        1 0 0 0 0 = 16
            1 0 1 = 5
          1 0 1 0 = 10
num=8 (1000)
num<<1
*/