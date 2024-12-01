package homework_23.Task2;

public class GameCharactersApp {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        warrior.attack();

        System.out.println("\n==================");

        GameCharacter[] gameCharacters = new GameCharacter[]{warrior, new Monk(), new Mage(), new Healer(), new Archer()};

        for (int i = 0; i < gameCharacters.length; i++) {

            gameCharacters[i].attack();
        }
    }
}
