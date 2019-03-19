import attacks.Element;
import features.Equipement;
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
    private String nom;
    private Equipement equipement;
    //private Armor armor;


    public Character(String _nom, Element _element, int _hp, int _mana, WeaponClasses _class) {
        nom = _nom;
        element = _element;
        MAX_HP = _hp;
        hp = _hp;
        MAX_MANA = _mana;
        mana = _mana;
        CLASS = _class;
    }
}
