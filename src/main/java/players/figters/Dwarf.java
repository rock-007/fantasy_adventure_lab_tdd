package players.figters;

import behaviour.IWeapon;

public class Dwarf extends Fighter {
    private IWeapon currentWeapon;

    public Dwarf(String name) {
        super(name);
    }
    public IWeapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(IWeapon weapon) {
        //weaponStock
        if (this.getWeaponStock().contains(weapon)) {
            this.currentWeapon = weapon;
        }

    }

}
