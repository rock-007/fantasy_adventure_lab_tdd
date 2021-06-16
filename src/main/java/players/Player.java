package players;

public abstract class Player {

    private String name;
    private Integer noOfHealthPoints;

    public Player(String name) {
        this.name = name;
        this.noOfHealthPoints = 100;
    }

    public String getName() {
        return name;
    }

    public Integer getNoOfHealthPoints() {
        return noOfHealthPoints;
    }

    public void setNoOfHealthPoints(Integer noOfHealthPoints) {
        this.noOfHealthPoints = noOfHealthPoints;
    }
}
