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
        hp = MAX_HP;
        MAX_MANA = _mana;
        mana = MAX_MANA;
        CLASS = _class;
    }

    public int getMaxHP() {
        return MAX_HP;
    }

    public int getMaxMana() {
        return MAX_MANA;
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

    public Element getElement() {
        return element;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public WeaponClasses getWClass() {
        return CLASS;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public Equipement getEquipement() {
        return equipement;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Body getArmor() {
        return armor;
    }

    public Leggings getLeggings() {
        return leggings;
    }

    public void setLeggings(Leggings _leggings) {
        leggings = _leggings;
    }
}
