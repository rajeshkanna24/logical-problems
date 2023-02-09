public class PrimeNumber {
    public static void main(String[] args) {
        int i,m=0,raj=0;
        int num=9;
        m = num / 2;
        if(num==0||num==1)
        {
            System.out.println(num+"is not prime number");
        }
        else
        {
        for(i=2;i<=m;i++)
        {
        if (num%i==0)
        {
            System.out.println(num+"is not prime number");
            raj=1;
            break;
        }
        }
        if(raj==0)
        {
            System.out.println(num+"is prime number");
        }
        }
    }
}
