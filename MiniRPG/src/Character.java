import attacks.Element;
import features.*;

public class Character {
    private Element element;
    private final int MAX_HP;
    private int hp;
    private final int MAX_MANA;
    private int mana;
    private final WeaponClasses CLASS;
    private Weapon weapon;
    private String name;
    private Equipement equipement;
    private Helmet helmet;
    private Body armor;
    private Leggings leggings;


    public Character(String _name, Element _element, int _hp, int _mana, WeaponClasses _class) {
        name = _name;
        element = _element;
        MAX_HP = _hp;
        hp = _hp;
        MAX_MANA = _mana;
        mana = _mana;
        CLASS = _class;
    }

    public void setEquipement(Equipement _equipement) {
        equipement = _equipement;
    }

    public void setHelmet(Helmet _helmet) {
        helmet = _helmet;
    }

    public void setArmor(Body _armor) {
        armor = _armor;
    }

    public void setLeggings(Leggings _leggings) {
        leggings = _leggings;
    }
}
