public class Main {

    public static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("===== Battle Begins =====");

        for (GameCharacter character : characters) {

            character.performAttack();

            if (character instanceof Warrior)
                warriorCount++;
            else if (character instanceof Mage)
                mageCount++;
            else if (character instanceof Archer)
                archerCount++;
        }

        System.out.println("\n===== Battle Summary =====");
        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages    : " + mageCount);
        System.out.println("Archers  : " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Aragorn"),
                new Mage("Gandalf"),
                new Archer("Legolas"),
                new Warrior("Leon"),
                new Mage("Merlin")
        };

        startBattle(characters);
    }
}