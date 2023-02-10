package ops;

public class Add implements Operator {
    @Override
    public double getResult(double... args) {
        double sum = 0;
        for (double i:
             args) {
            sum += i;
        }
        return sum;
    }

    @Override
    public String getName() {
        return "+";
    }

    public Add(){ }

    public static Operator get(){

        return new Add();

    }
}
