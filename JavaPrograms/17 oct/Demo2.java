// program to find out compound interest

class Demo2{
    public static void main(String args[]){
        int p=1000;
        float r=2.4f;
        int t = 2;

        double amt = p*Math.pow(1+r/100,t);
        double ci = amt-p;

        System.out.println("Amount : "+amt);
        System.out.println("Compound Interest : "+ci);
    }
}