public class Main {
    public static void main(String[] args) {
        // Crear un mazo
        Deck deck = new Deck();

        // Mezclar el mazo
        deck.shuffle();

        // Obtener la primera carta
        System.out.println("Primera carta del mazo:");
        Card firstCard = deck.head();
        System.out.println("Primera carta obtenida: " + firstCard);

        // Seleccionar una carta al azar
        System.out.println("Carta seleccionada al azar:");
        Card randomCard = deck.pick();
        System.out.println("Carta al azar obtenida: " + randomCard);

        // Obtener una mano de cinco cartas
        System.out.println("Mano de cinco cartas:");
        deck.hand();
    }
}
