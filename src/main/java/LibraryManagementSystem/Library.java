package LibraryManagementSystem;

public class Library {
    private String name;
    private Address address;

    private Library(){};
    private Address getAddress();

    private static Library library = null;

    public static Library getInstance(){
        if( library == null){
            library = new Library();
        }
        return library;
    }

}
