public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float Bmi = service.calculate(165F, 58F);
        String diagnosis = service.diagnosis(Bmi);
        System.out.println(String.format("%.2f", Bmi));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi1 = service.calculate(165F, 40F);
        diagnosis = service.diagnosis(Bmi1);
        System.out.println(String.format("%.2f", Bmi1));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi2 = service.calculate(165F, 70F);
        diagnosis = service.diagnosis(Bmi2);
        System.out.println(String.format("%.2f", Bmi2));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi3 = service.calculate(0F, 0F);
        diagnosis = service.diagnosis(Bmi3);
        System.out.println(String.format("%.2f", Bmi3));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi4 = service.calculate(-10F, -10F);
        diagnosis = service.diagnosis(Bmi4);
        System.out.println(String.format("%.2f", Bmi4));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi5 = service.calculate(10F, -10F);
        diagnosis = service.diagnosis(Bmi5);
        System.out.println(String.format("%.2f", Bmi5));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi6 = service.calculate(165F, 50F);
        diagnosis = service.diagnosis(Bmi6);
        System.out.println(String.format("%.2f", Bmi6));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi7 = service.calculate(165F, 90F);
        diagnosis = service.diagnosis(Bmi7);
        System.out.println(String.format("%.2f", Bmi7));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi8 = service.calculate(165F, 100F);
        diagnosis = service.diagnosis(Bmi8);
        System.out.println(String.format("%.2f", Bmi8));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

        float Bmi9 = service.calculate(165F, 150F);
        diagnosis = service.diagnosis(Bmi9);
        System.out.println(String.format("%.2f", Bmi9));
        System.out.println(diagnosis);
        System.out.println("---------------------------");

    }
}
