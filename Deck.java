import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    // Constructor
    public Deck() {
        this.cards = new ArrayList<>();
        initializeDeck();
    }

    // Método para inicializar el mazo con las 52 cartas
    private void initializeDeck() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] colores = {"Rojo", "Negro"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            for (String color : colores) {
                for (String valor : valores) {
                    cards.add(new Card(palo, color, valor));
                }
            }
        }
    }

    // Método para mezclar el mazo
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // Método para obtener la primera carta del mazo y removerla
    public Card head() {
        Card card = cards.remove(0);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en el deck");
        return card;
    }

    // Método para seleccionar una carta al azar del mazo y removerla
    public Card pick() {
        int randomIndex = (int) (Math.random() * cards.size());
        Card card = cards.remove(randomIndex);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en el deck");
        return card;
    }

    // Método para obtener una mano de cinco cartas del mazo y removerlas
    public List<Card> hand() {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(cards.remove(0));
        }
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("Quedan " + cards.size() + " cartas en el deck");
        return hand;
    }
}
