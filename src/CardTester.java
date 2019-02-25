/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args) {
        Card one = new Card("3", "Hearts", 3);
        Card two = new Card("2", "Spades",3);
        Card three = new Card("3", "Diamond", 3);

        System.out.println("Does one match two? " + one.matches(two));
        System.out.println("Does one match three? " + one.matches(three));
        System.out.println("Suit of Card Two: " + one.suit());
        System.out.println("Card two is " + one.toString());
    }
}
