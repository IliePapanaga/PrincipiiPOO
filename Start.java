import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car data");
        System.out.println("Power");
        int power = scanner.nextInt();
        System.out.println("Wheels");
        short wheels = (short) scanner.nextInt();
        System.out.println("Doors");
        short doors = (short) scanner.nextInt();

        if (wheels==4) {
            System.out.println("A car");

            if (doors==2) {
                System.out.println("Coupe");
            }
        }
    }
}
