package design.pattern.study.inflearn.strategy;

public class Strategy {
    public static void main(String[] args) {

        GameCharacter character = new GameCharacter();

        character.attack();


        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Sword());
        character.attack();

    }
}
