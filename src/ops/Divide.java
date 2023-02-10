package ops;

public class Divide implements Operator {
    @Override
    public double getResult(double... args) {
        double sum = args[0] * args[0];
        for (double i:
                args) {
            sum /= i;
        }
        return sum;
    }

    @Override
    public String getName() {
        return "+";
    }
    public Divide(){ }

    public static Operator get(){

        return new Divide();

    }
}
