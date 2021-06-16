package enemies;

public abstract class Enemy {

    private int noOfHealthPoints;
    private String name;

    public Enemy(String name) {
        this.name = name;
        this.noOfHealthPoints = 100;
    }

    public int getNoOfHealthPoints() {
        return noOfHealthPoints;
    }

    public String getName() {
        return name;
    }

    public void updateHealthPoints(int damageValue) {
        int currentHealthPoints = getNoOfHealthPoints();
        if (damageValue > this.noOfHealthPoints) {
            this.noOfHealthPoints = 0;
        } else {
            this.noOfHealthPoints -= currentHealthPoints;
        }
    }
}
