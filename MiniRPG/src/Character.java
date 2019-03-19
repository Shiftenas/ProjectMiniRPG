import attacks.Element;
import features.Weapon;
import features.WeaponClasses;

public class Character {
    private Element element;
    private final int MAX_HP;
    private int hp;
    private final int MAX_MANA;
    private int mana;
    private final WeaponClasses CLASS;
    private Weapon weapon;


    public Character(Element element, int _hp, int _mana, WeaponClasses _class) {
        this.element = element;
        MAX_HP = _hp;
        hp = _hp;
        MAX_MANA = _mana;
        mana = _mana;
        CLASS = _class;
    }
}
