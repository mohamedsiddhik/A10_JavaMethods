

//method with parameter and with return type

public  class Method2
{
    int a;
    int b;
    Method2(int num1, int num2)
    {
        a = num1;
        b = num2;
    }
    public  int addition(int a , int b)
    {
        int sum = a +b;
        System.out.println("Method - My addition Value : " + sum);
        return  sum;
    }
    public  int subtraction (int a , int b)
    {
        int sum = a - b;
        System.out.println("Method - My addition Value : " + sum);
        return  sum;
    }
    public static void main(String[] args) {
        Method2 m2 = new Method2(99,99);
        int resultAdd = m2.addition(37 , 76);
        int resultSub = m2.subtraction(22,12);
    }
}