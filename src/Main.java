import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Create HashMap of states and their capitals
        Map<String, String> stateCapitalMap = new HashMap<>();

        // Add all key/value pairs to HashMap
        stateCapitalMap.put("Alabama", "Montgomery");
        stateCapitalMap.put("Alaska", "Juneau");
        stateCapitalMap.put("Arizona", "Phoenix");
        stateCapitalMap.put("Arkansas", "Little Rock");
        stateCapitalMap.put("California", "Sacramento");
        stateCapitalMap.put("Colorado", "Denver");
        stateCapitalMap.put("Connecticut", "Hartford");
        stateCapitalMap.put("Delaware", "Dover");
        stateCapitalMap.put("Florida", "Tallahassee");
        stateCapitalMap.put("Georgia", "Atlanta");
        stateCapitalMap.put("Hawaii", "Honolulu");
        stateCapitalMap.put("Idaho", "Boise");
        stateCapitalMap.put("Illinois", "Springfield");
        stateCapitalMap.put("Indiana", "Indianapolis");
        stateCapitalMap.put("Iowa", "Des Moines");
        stateCapitalMap.put("Kansas", "Topeka");
        stateCapitalMap.put("Kentucky", "Frankfort");
        stateCapitalMap.put("Louisiana", "Baton Rouge");
        stateCapitalMap.put("Maine", "Augusta");
        stateCapitalMap.put("Maryland", "Annapolis");
        stateCapitalMap.put("Massachusetts", "Boston");
        stateCapitalMap.put("Michigan", "Lansing");
        stateCapitalMap.put("Minnesota", "St. Paul");
        stateCapitalMap.put("Mississippi", "Jackson");
        stateCapitalMap.put("Missouri", "Jefferson City");
        stateCapitalMap.put("Montana", "Helena");
        stateCapitalMap.put("Nebraska", "Lincoln");
        stateCapitalMap.put("Nevada", "Carson City");
        stateCapitalMap.put("New Hampshire", "Concord");
        stateCapitalMap.put("New Jersey", "Trenton");
        stateCapitalMap.put("New Mexico", "Santa Fe");
        stateCapitalMap.put("New York", "Albany");
        stateCapitalMap.put("North Carolina", "Raleigh");
        stateCapitalMap.put("North Dakota", "Bismarck");
        stateCapitalMap.put("Ohio", "Columbus");
        stateCapitalMap.put("Oklahoma", "Oklahoma City");
        stateCapitalMap.put("Oregon", "Salem");
        stateCapitalMap.put("Pennsylvania", "Harrisburg");
        stateCapitalMap.put("Rhode Island", "Providence");
        stateCapitalMap.put("South Carolina", "Columbia");
        stateCapitalMap.put("South Dakota", "Pierre");
        stateCapitalMap.put("Tennessee", "Nashville");
        stateCapitalMap.put("Texas", "Austin");
        stateCapitalMap.put("Utah", "Salt Lake City");
        stateCapitalMap.put("Vermont", "Montpelier");
        stateCapitalMap.put("Virginia", "Richmond");
        stateCapitalMap.put("Washington", "Olympia");
        stateCapitalMap.put("West Virginia", "Charleston");
        stateCapitalMap.put("Wisconsin", "Madison");
        stateCapitalMap.put("Wyoming", "Cheyenne");

        // Prompt user to press enter to continue the program
        // While user input is not an empty string, continue to prompt
        do {
            System.out.print("Press enter to print the HashMap: ");
            input = scanner.nextLine();
        } while (!input.equals(""));

        // Print each state/capital pair
        for (Map.Entry<String, String> entry : stateCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Create a Treemap from the HashMap, ignore case when searching
        Map<String, String> stateCapitalTreeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        stateCapitalTreeMap.putAll(stateCapitalMap);

        // Prompt user to press enter to continue the program
        // While user input is not an empty string, continue to prompt
        do {
            System.out.print("\nPress enter to print the TreeMap: ");
            input = scanner.nextLine();
        } while (!input.equals(""));

        // Print each state/capital pair, now in natural order
        for (Map.Entry<String, String> entry : stateCapitalTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Prompt user to enter a state name while valid name is not entered
        do {
            System.out.print("\nEnter a state name to return it's capital city: ");
            input = scanner.nextLine();
            if (stateCapitalTreeMap.containsKey(input)) {
                System.out.println(stateCapitalTreeMap.get(input));
            } else {
                System.out.println("Not a valid state name!");
            }
        } while (!stateCapitalTreeMap.containsKey(input));
    }
}