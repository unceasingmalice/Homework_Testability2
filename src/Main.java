public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double m = 100;
        double h = 1.9;

        double index = service.calculate(m, h);

        System.out.println((int) index);

    }
}