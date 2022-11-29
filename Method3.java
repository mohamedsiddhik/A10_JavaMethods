

//Method  without parameter and with a return type

public  class Method3
{
    public  int  addition()
    {
        int a = 50, b = 90 , sum;
        sum = a + b;
        System.out.println("Addition is : " + sum);
        return  sum;
    }
    public static void main(String[] args) {
        Method3 m1 = new Method3();
        int result =  m1.addition();
        System.out.println("main Method - Addition is : " + result );

    }
}