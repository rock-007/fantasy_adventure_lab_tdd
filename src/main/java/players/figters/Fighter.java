package players.figters;

import behaviour.IHeal;
import behaviour.IWeapon;
import players.Player;
import players.figters.heal.Cleric;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<IWeapon> weaponStock;
    private Cleric cleric;


    public Fighter(String name) {
        super(name);
        this.weaponStock = new ArrayList<>();
        // this.cleric = new Cleric();
    }

    public void setWeaponStock(IWeapon weapon) {
        this.weaponStock.add(weapon);
    }

    public ArrayList<IWeapon> getWeaponStock() {
        return weaponStock;
    }

    public Cleric getCleric() {
        return cleric;
    }

    public void setCleric(IHeal heal) {
        this.cleric = new Cleric(heal);
    }

    public void clericAddHealing(){
        this.cleric.getHeal().heal(this);
    }

    public void addHealing(int healingPower) {
        int health = this.getNoOfHealthPoints();
        if (health + healingPower > 100) {
            this.setNoOfHealthPoints(100);
        } else {
            this.setNoOfHealthPoints(health + healingPower);
        }
    }

    public void addWeapon(IWeapon weapon) {
        this.weaponStock.add(weapon);
    }

}
