import java.util.List;
import java.util.Scanner;
//do not worry about any of the code below

public class AudioBookInterface {


    private List<AudioBook> catalog;
    private boolean keepRunning = true;

    public AudioBookInterface(List<AudioBook> catalog){
        this.catalog = catalog;
    }

    public void run(){

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        while(keepRunning){
            System.out.println("Options: " +
                    "\n1)Type 1 to print all author names" +
                    "\n2)Type 2 to print all titles" +
                    "\n3)Type 3 to print all first and last names (if present)" +
                    "\n4)Type 4 to print all metadata" +
                    "\n Or, if you are done, type \"exit\"");
            String input = scanner.nextLine();  // Read user input

            if(input.toLowerCase().contentEquals("exit")){
                keepRunning = false;
                break;
            }else if(input.contentEquals("1")){
                for (AudioBook book : this.catalog){
                    System.out.println(book.getAuthor());
                }
            }
            else if(input.contentEquals("2")){
                for (AudioBook book : this.catalog){
                    System.out.println(book.getTitle());
                }
            }
            else if(input.contentEquals("3")){
                for (AudioBook book : this.catalog){
                    if(book.getFirstName()!=null && book.getLastName()!=null){
                        System.out.println(book.getFirstName()+" "+book.getLastName());
                    }else{
                        System.out.println("No names to provide.");
                    }
                }
            } else if(input.contentEquals("4")) {
                for (AudioBook book : this.catalog) {
                    book.printOutAllMetadata();
                }
            } else {
                System.out.println("Invalid Option. Try again.");
            }
            System.out.println();

        }
        System.out.println("Goodbye!");
    }
}
