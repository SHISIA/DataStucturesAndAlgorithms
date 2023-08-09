package stackDS;

public class Card {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Card(int id, String name){
        this.id=id;
        this.name=name;
    }
}
