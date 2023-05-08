import java.util.Random;
import java.util.Scanner;

public class RandomSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Peter", "Michell", "Jane", "Steve"};
        String[] places ={"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};
        System.out.println("Hello, this is your first random-generated sentence: ");

        while (true){

            String randomNames = randomWord(names);
            String randomPlaces = randomWord(places);
            String randomVerbs = randomWord(verbs);
            String randomNouns = randomWord(nouns);
            String randomAdverbs = randomWord(adverbs);
            String randomDetails = randomWord(details);


            System.out.printf("%s from %s %s %s %s %s%n",randomNames,randomPlaces,randomAdverbs,randomVerbs,randomNouns,randomDetails);
            System.out.println("Click [Enter] to generate a new one.");
            String enter = scanner.nextLine();
        }


    }

    public static String randomWord(String[]words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}