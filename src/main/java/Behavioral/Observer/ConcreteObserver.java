package Behavioral.Observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(Subject subject) {
        ConcreteSubject concreteSubject = (ConcreteSubject) subject;
        System.out.println("Observer notified: Subject state changed to " + concreteSubject.getState());
    }
}
