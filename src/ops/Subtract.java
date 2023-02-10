package ops;

public class Subtract implements Operator {
    @Override
    public double getResult(double... args) {
        double sum = 2 * args[0];
        for (double i:
                args) {
            sum -= i;
        }
        return sum;
    }

    @Override
    public String getName() {
        return "-";
    }
    public Subtract(){ }

    public static Operator get(){

        return new Subtract();

    }
}
