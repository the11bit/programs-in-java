import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double dot;
        boolean isHeads;

        number = random.nextInt(1,9);
        System.out.println(number);

        dot = random.nextDouble(); //this will give random number from 0 to 1 just decimal portion.
        System.out.println(dot);

        isHeads = random.nextBoolean();
        if(isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}