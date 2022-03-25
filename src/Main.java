public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int BmiService = service.calculate(80, 1.80);
        System.out.println("Ваша масса тела составляет =" + BmiService);


        //int weight = 82;
        //double height = 1.82;

        //double bodyMassIndex;

        //bodyMassIndex = weight / (height * height);

        //System.out.println("BMI for weight " + weight + "kg");
        //System.out.println("and height " + height + "m");
        //System.out.println("Body mass " + bodyMassIndex + ".");


    }
}


