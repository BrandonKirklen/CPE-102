package Card;

/**
 * Created by Brandon Kirklen on 4/18/2015.
 */
public class Card {
    private String cardValue;
    private char cardSuit;

    public Card(String cardData)
    {
        cardSuit =  cardData.charAt(cardData.length()-1);
        cardValue = cardData.substring(0, cardData.length()-1);
    }

    public String getDescription()
    {
        String cardValueDescription = null, cardSuitDescription = null;
        switch(cardValue)
        {
            case "A": cardValueDescription = "Ace";
                break;
            case "J": cardValueDescription = "Jack";
                break;
            case "Q": cardValueDescription = "Queen";
                break;
            case "K": cardValueDescription = "King";
                break;
            case "2": cardValueDescription = "Two";
                break;
            case "3": cardValueDescription = "Three";
                break;
            case "4": cardValueDescription = "Four";
                break;
            case "5": cardValueDescription = "Five";
                break;
            case "6": cardValueDescription = "Six";
                break;
            case "7": cardValueDescription = "Seven";
                break;
            case "8": cardValueDescription = "Eight";
                break;
            case "9": cardValueDescription = "Nine";
                break;
            case "10": cardValueDescription = "Ten";
                break;
        }
        switch (cardSuit)
        {
            case 'S': cardSuitDescription = "spades";
                break;
            case 'H': cardSuitDescription = "hearts";
                break;
            case 'D': cardSuitDescription = "diamonds";
                break;
            case 'C': cardSuitDescription = "clubs";
                break;
        }
        if ( cardValueDescription == null || cardSuitDescription == null)
        {
            return "Unknown";
        }
        else
        {
            return cardValueDescription + " of " + cardSuitDescription;
         }
    }
}
