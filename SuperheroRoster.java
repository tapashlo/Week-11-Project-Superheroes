public class SuperheroRoster {
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "Thor", "Hulk"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat", "God of Thunder", "Super strength"};
        int[] powerLevels = {85, 90, 80, 95, 92};

        // 2. Print each hero's details using a loop
        System.out.println("Hero Details:");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.printf("Name: %s, Ability: %s, Power Level: %d%n", heroNames[i], abilities[i], powerLevels[i]);
        }

        // 3. Call the searchHero method to find a specific hero by name
        System.out.println("\nSearching for 'Iron Man':");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");

        System.out.println("\nSearching for 'Captain America':");
        searchHero(heroNames, abilities, powerLevels, "Captain America");

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double averagePower = calculateAveragePower(powerLevels);
        System.out.printf("\nAverage Power Level: %.2f%n", averagePower);

        // Optional: Sorting heroes by power level (Bonus Task)
        System.out.println("\nHeroes sorted by Power Level (Descending):");
        sortHeroesByPower(heroNames, abilities, powerLevels);
        for (int i = 0; i < heroNames.length; i++) {
            System.out.printf("Name: %s, Ability: %s, Power Level: %d%n", heroNames[i], abilities[i], powerLevels[i]);
        }
    }

    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.printf("Hero Found! Name: %s, Ability: %s, Power Level: %d%n", names[i], abilities[i], powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }

    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }

    // Bonus Method: sortHeroesByPower
    public static void sortHeroesByPower(String[] names, String[] abilities, int[] powerLevels) {
        for (int i = 0; i < powerLevels.length - 1; i++) {
            for (int j = i + 1; j < powerLevels.length; j++) {
                if (powerLevels[i] < powerLevels[j]) {
                    // Swap powerLevels
                    int tempPower = powerLevels[i];
                    powerLevels[i] = powerLevels[j];
                    powerLevels[j] = tempPower;

                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    // Swap abilities
                    String tempAbility = abilities[i];
                    abilities[i] = abilities[j];
                    abilities[j] = tempAbility;
                }
            }
        }
    }

    class Superhero {
        private String name;
        private String ability;
        private int powerLevel;
    
        // Constructor to initialize name, ability, and powerLevel
        public Superhero(String name, String ability, int powerLevel) {
            this.name = name;
            this.ability = ability;
            this.powerLevel = powerLevel;
        }
    
        // Method: displayHero
        public void displayHero() {
            System.out.printf("Name: %s, Ability: %s, Power Level: %d%n", name, ability, powerLevel);
        }
    }
}