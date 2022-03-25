public class BmiService {

    public int calculate(int weight, double height) {

        double BodyMassIndex;

        BodyMassIndex = weight / (height * height);

        System.out.println("BMI for weight " + weight + "kg");
        System.out.println("And height " + height + "m");
        System.out.println("Body mass " + BodyMassIndex + ".");


        return (int) BodyMassIndex;

    }


}


