package Creational;


/***
 * Singleton Pattern:
 * It ensures that a class has oly one instance, and provides a global point of access to that.
 * This is useful when you want to restrict the instantiation of a class to a single object.
 * This implementation is not thread safe, you can synchronize the getInstance(), or double-checked locking
 * The constructor includes a check to prevent instantiation via reflection. This prevents a Singleton from being
 * created even if the client tries to create using reflection
 */
public class Singleton{

    private static Singleton instance;

    private Singleton(){
        if (instance != null){
            throw new IllegalStateException("Singleton instance already exists");
        }
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());

    }
}


