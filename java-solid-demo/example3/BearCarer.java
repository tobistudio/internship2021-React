package example3;

public class BearCarer implements I_BearCleaner, I_BearFeeder {

    public void washTheBear() {
        System.out.println("Day 20 of washing this bear... I wanna go home :(");
    }

    public void feedTheBear() {
        System.out.println("Do not fear the bear. Do not look at the bear. Do not breathe near the bear.");
    }
}
