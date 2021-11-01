public class Overloadingdemo
{
    public void sum(int a, int b)
    {

        System.out.println("sum is= "+(a+b));
    }
    public void sum(double a,double b)
    {

        System.out.println("sum is= "+(a+b));
    }
    public void sum(float a,float b)
    {

        System.out.println("sum is= "+(a+b));
    }
    public void sum(int a, int b, int c)
    {
        System.out.println("sum is = "+ (a+b+c));
    }

    public static void main(String[] args)
    {
        Overloadingdemo calculate= new Overloadingdemo();
        calculate.sum(30,60);
        calculate.sum(37.6,20.9);
        calculate.sum(35.6f,23.4f);
        calculate.sum(800,567,865);

    }
}
