package Arithmetic;

public class Arithmetic <T1 extends Number, T2 extends Number> {
    T1 first_num;
    T2 second_num;

    public Arithmetic(T1 first_num, T2 second_num) {
        this.first_num = first_num;
        this.second_num = second_num;
    }

    public void add(){
//        double res = first_num + second_num;
        System.out.print(first_num+" + "+second_num+" = ");
        System.out.println(first_num.doubleValue()+ second_num.doubleValue());
    }
    public void subtract(){
        System.out.print(first_num+" - "+second_num+" = ");
        System.out.println(first_num.doubleValue() - second_num.doubleValue());
    }
    public void multiply(){
        System.out.print(first_num+" * "+second_num+" = ");
        System.out.println( first_num.doubleValue()*second_num.doubleValue());
    }
    public void divide(){
        System.out.print(first_num+" / "+second_num+" = ");
        try{
            System.out.println(first_num.doubleValue()/second_num.doubleValue());
        }catch (ArithmeticException e){
            System.err.println("Cant dividde by zero");
        }

    }
    public void getMin(){
        System.out.print("Minimum is: ");
        if(first_num.doubleValue() >= second_num.doubleValue()){
            System.out.println(first_num);
        }else{
            System.out.println(second_num);
        }
    }
    public void getMax(){
        System.out.print("Maximum is: ");
        if(first_num.doubleValue() <= second_num.doubleValue()){
            System.out.println(first_num);
        }else{
            System.out.println(second_num);
        }
    }
}
