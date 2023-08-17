import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        printTitle();

        //TODO task 1: create three new audioMetadata objects for each book then pass them into the constructors below
        // HINT: replace "new AudiobookMetadata() with your new variables
        
        List<String> audiobook1Stores = new ArrayList<>((Arrays.asList("US","UK","EU")));
        List<String> audiobook2Stores = new ArrayList<>((Arrays.asList("US")));
        List<String> audiobook3Stores = new ArrayList<>((Arrays.asList("EU")));

        
        AudiobookMetadata audioBook1Metadata = new AudiobookMetadata(audiobook1Stores, "Fantasy", "6/22/21", 9000);
        AudiobookMetadata audioBook2Metadata = new AudiobookMetadata(audiobook2Stores, "Autobiography", "9/1/22", 11000);
        AudiobookMetadata audioBook3Metadata = new AudiobookMetadata(audiobook3Stores, "Non-fiction", "1/15/23", 13400);



        AudioBook audioBook1 = new AudioBook("Harrie Potter And The Prisoner Of Azkaban", "J. K. Rowling",  audioBook1Metadata);
        AudioBook audioBook2 = new AudioBook("Becoming", "Michelle Obamaaa",  audioBook2Metadata);
        AudioBook audioBook3 = new AudioBook("Tha Mountain Is You", "Brianna West", audioBook3Metadata);

        audioBook1.getAuthor();

        System.out.println(audioBook1.getAuthor());  


        List<AudioBook> myCatalog = new ArrayList<>();

        myCatalog.add(audioBook1);
        myCatalog.add(audioBook2);
        myCatalog.add(audioBook3);
    
        SpellChecker spellChecker = new SpellChecker();

        //boolean isSpelledCorrectly = spellchecker.isSpelledCorrect(String aString);

        //spellChecker has a method called "isSpelledCorrect()" which takes in a String and returns if it is spelled incorrectly or not
        //to use, type spellChecker.isSpelledCorrect(String);

        //TODO: task 2: write some code that goes through each audiobook in the catalog and counts up the typos, using the spellchecker
        // HINT: you made need to use for loops

        int typos = 0;
        for (AudioBook thisAudioBook : myCatalog) {
            boolean thisTitleisSpelledCorrectly = spellChecker.isSpelledCorrect(thisAudioBook.getTitle());
            boolean thisAuthorisSpelledCorrectly = spellChecker.isSpelledCorrect(thisAudioBook.getAuthor());
            if (thisTitleisSpelledCorrectly == false){
                typos++;
            }
            if (thisAuthorisSpelledCorrectly == false){
                typos++;
            }
        }
        System.out.println(typos +  " typos in Audiobooks");
        



//do not worry about any of the code below
        AudioBookInterface audioBookInterface = new AudioBookInterface(myCatalog);
        audioBookInterface.run();
    }

    public static void printTitle(){

        System.out.println("**********************************************");
        System.out.println("****Welcome to the AudioBook Data Manager!****");
        System.out.println("**********************************************\n");

    }
}