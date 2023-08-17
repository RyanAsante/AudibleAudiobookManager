public class AudioBook {

    private String title;

    private String author;

    private String firstName = null;

    private String lastName = null;

    private AudiobookMetadata metadata;

    // this is called a constructor method you can recognize a constructor method because
    // it's name will ALWAYS be the same as the class name.
    // this is the method called to actually turn a class into an object.
    public AudioBook(String title, String author, AudiobookMetadata metadata){
        this.title = title;
        this.author = author;
        this.metadata = metadata;
    }

    //you can have as many constructor methods as you want. this constructor does not have any metadata set.
    public AudioBook(String title, String author){
        this.title = title;
        this.author = author;
        this.metadata = null;
    }

    //these types of methods are called your "getters". they just return private attrributes to the user.
    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //TODO: task 4: update function to set first and last name if the author variable is two words.

    public void setFirstAndLastName(){
        String thisAuthor = this.author;
        String[] names  = thisAuthor.split(" "); 
        if (names.length == 2){
            this.firstName = names[0];
            this.lastName = names[1];
        }
        
    }

    //TODO: task 5: update function to set first and last name if the author variable is two words.

    public void printOutAllMetadata(){
        System.out.println("This is the metadata for the audiobook " + this.title + ":" );
        System.out.println("This is the genres for the audiobook " + this.metadata.getGenre());
        System.out.println("This is the publishdate for the audiobook " + this.metadata.getPublishDate());
        System.out.println("This is the duration for the audiobook " + this.metadata.getdurationInSeconds());
        System.out.println("This is the stores for the audiobook " + this.metadata.getStores());
        System.out.println(" ");
    }
}
