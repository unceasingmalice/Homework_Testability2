public class BmiService {
    public double calculate(double m, double h) {

        double h2;
        h2 = Math.pow(h, 2);

        double bmi;
        bmi = m / h2;

        return bmi;

    }
}

