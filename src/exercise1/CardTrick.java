package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 *
 * @author Sanjana
 * @date January 30, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = generateRandomHand();
        Card userCard = getUserCard();

        if (isMatch(hand, userCard)) {
            printInfo();
        } else {
            System.out.println("your guess was incorrect sorry ");
        }
    }

    private static Card[] generateRandomHand() {
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        return hand;
    }

    private static Card getUserCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your guess:");
        System.out.print("Card Value (1-13): ");
        int guessValue = scanner.nextInt();
        System.out.print("Card Suit (0-3): ");
        int guessSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(guessValue);
        userCard.setSuit(Card.SUITS[guessSuit]);

        return userCard;
    }

    private static boolean isMatch(Card[] hand, Card userCard) {
        for (Card card : hand) {
            if (card.equals(userCard)) {
                return true;
            }
        }
        return false;
    }

    private static void printInfo() 
{
          // I'm done! 
        System.out.println("Congratulations, you guessed right!");
        System.out.println("My name is Sanjana, but you can call me sanju");
        System.out.println("My career ambitions: software developer ");
        System.out.println("Have a semester with no violations of academic integrity!");
        System.out.println("My hobbies:");
        System.out.println("--Hiking");
        System.out.println("--Reading");
        System.out.println("-- Gardening");
        System.out.println("-- Shopping");
    }
}

