package Grade_11.StudiesForTests.Matkonet.Question3;

public class CardSeq {
    Card[] arrCards;
    String[] colors = new String[5];

    public int howManyCardsWithColor(String oneColor) {
        int counter = 0;
        for (int i = 0; i < arrCards.length; i++) {
            if (arrCards[i].getColor1().equals(oneColor) || arrCards[i].getColor2().equals(oneColor)) {
                counter++;
            }
        }

        return counter;
    }

    public int colorsNotInCards() {
        int counter = 0;
        for (int i = 0; i < colors.length; i++) {
            if (howManyCardsWithColor(colors[i]) == 0) {
                counter++;
            }
        }
        return counter;
    }
}
