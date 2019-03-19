package features;

public class Weapon {
    private final WeaponClasses CLASS;
    private final int INITIAL_DAMAGE;

    public Weapon(WeaponClasses _class, int initial_damage) {
        CLASS = _class;
        INITIAL_DAMAGE = initial_damage;
    }

    public int getINITIAL_DAMAGE() {
        return INITIAL_DAMAGE;
    }

    public WeaponClasses getCLASS() {
        return CLASS;
    }
}
