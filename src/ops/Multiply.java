package ops;

public class Multiply implements Operator {
    @Override
    public double getResult(double... args) {
        double sum = 1;
        for (double i:
                args) {
            sum *= i;
        }
        return sum;
    }

    @Override
    public String getName() {
        return "*";
    }

    public Multiply(){ }

    public static Operator get(){

        return new Multiply();

    }

}

