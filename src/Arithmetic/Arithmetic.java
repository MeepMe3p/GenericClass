package Arithmetic;

public class Arithmetic <T1 extends Number, T2 extends Number> {
    T1 first_num;
    T2 second_num;

    public Arithmetic(T1 first_num, T2 second_num) {
        this.first_num = first_num;
        this.second_num = second_num;
    }

    public Number add(){

        System.out.print(first_num+" + "+second_num+" = ");
        return first_num.doubleValue() + second_num.doubleValue();

    }
    public Number subtract(){
        System.out.print(first_num+" - "+second_num+" = ");
        return first_num.doubleValue() - second_num.doubleValue();
    }
    public Number multiply(){
        System.out.print(first_num+" * "+second_num+" = ");
        return first_num.doubleValue() * second_num.doubleValue();

    }
    public Number divide(){
        System.out.print(first_num+" / "+second_num+" = ");
        try{
            return first_num.doubleValue() / second_num.doubleValue();
        }catch (ArithmeticException e){
            System.err.println("Cant dividde by zero");
        }
        return 0;
    }
    public Number getMin(){
        System.out.print("Minimum is: ");
        if(first_num.doubleValue() >= second_num.doubleValue()){
            return second_num;
        }else{
            return first_num;
        }
    }
    public Number getMax(){
        System.out.print("Maximum is: ");
        if(first_num.doubleValue() <= second_num.doubleValue()){
            return second_num;
        }else{
            return first_num;
        }
    }
}
