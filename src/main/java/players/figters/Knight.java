package players.figters;

import behaviour.IWeapon;

public class Knight extends Fighter {
    private IWeapon currentWeapon;

    public Knight(String name) {
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
