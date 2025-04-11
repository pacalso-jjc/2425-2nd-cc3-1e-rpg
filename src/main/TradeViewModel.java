import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TradeViewModel {
    public ObservableList<String> player1Items;
    public ObservableList<String> player2Items;

    public StringProperty player1Name;
    public StringProperty player2Name;

    public TradeViewModel() {
        player1Items = FXCollections.observableArrayList();
        player2Items = FXCollections.observableArrayList();

        player1Name = new SimpleStringProperty("Player 1");
        player2Name = new SimpleStringProperty("Player 2");
    }

    public void addItemToPlayer1(String item) {
        player1Items.add(item);
    }

    public void addItemToPlayer2(String item) {
        player2Items.add(item);
    }

    public void removeItemFromPlayer1(String item) {
        player1Items.remove(item);
    }

    public void removeItemFromPlayer2(String item) {
        player2Items.remove(item);
    }

    public String confirmTrade() {
        // Just simulate trade confirmation
        return "Trade confirmed between " + player1Name.get() + " and " + player2Name.get() + ".";
    }

    public String cancelTrade() {
        // Just simulate canceling trade
        player1Items.clear();
        player2Items.clear();
        return "Trade canceled. Items cleared.";
    }
}
