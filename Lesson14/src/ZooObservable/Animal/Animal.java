package ZooObservable.Animal;

import ZooObservable.Workers.Observer;
import ZooObservable.Workers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Animal implements Observable {
    private final int id;
    private String message = "";
    private String name;
    private boolean isHungry = false;
    private boolean isIll = false;
    private boolean isManyHairs = false;
    private List<Observer> hairSubscribers = new ArrayList<>();
    private List<Observer> feedSubscribers = new ArrayList<>();
    private List<Observer> illSubscribers = new ArrayList<>();
    private List<Observer> allSubscribe = new ArrayList<>();

    public Animal(int id, String name) {
        this.id = id;
        this.feedSubscribers = new ArrayList<>();
        this.hairSubscribers = new ArrayList<>();
        this.illSubscribers = new ArrayList<>();
        this.allSubscribe = new ArrayList<>();

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void hungry() {
        isHungry = true;
        message = " Hey! I'm HUNGRYY! ";
        notifyAllObservers();
    }

    public void getIll() {
        isIll = true;
        message = " Hey! I'm get ILL! ";
        notifyAllObservers();
    }

    public void getGroom() {
        isManyHairs = true;
        message = " Hey! Cut my hairs! ";

        if (this instanceof Domestic) {
            notifyAllObservers();
        } else {
            throw new NoSuchElementException("You can't grooming wild animal!!!");
        }
    }


    @Override
    public void subscribe(Worker observer) {
        if (observer == null) {
            throw new NullPointerException("I can't subscribe no one!");
        } else if (observer instanceof Groomer) {
            observer.add(this);
            this.hairSubscribers.add(observer);
        } else if (observer instanceof Veterinarian) {
            observer.add(this);
            this.illSubscribers.add(observer);
            this.feedSubscribers.add(observer);
        } else if (observer instanceof Feeder) {
            observer.add(this);
            this.feedSubscribers.add(observer);
        } else {
            this.allSubscribe.add(observer);
        }

    }

    @Override
    public void unsubscribe(Worker observer) {
        if (observer == null) {
            throw new NullPointerException("I can't unsubscribe no one!");
        } else if (observer instanceof Groomer) {
            observer.add(this);
            this.hairSubscribers.remove(observer);
        } else if (observer instanceof Veterinarian) {
            observer.add(this);
            this.illSubscribers.remove(observer);
            this.feedSubscribers.remove(observer);
        } else if (observer instanceof Feeder) {
            observer.add(this);
            this.feedSubscribers.remove(observer);
        } else {
            this.allSubscribe.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        if (isHungry) {
            notifyAllFeedObservers();
            notifyDirector();
            isHungry = false;
        }
        if (isIll) {
            notifyAllIllObservers();
            notifyDirector();
            isIll = false;
        }
        if (isManyHairs) {
            notifyAllHairObservers();
            notifyDirector();
            isManyHairs = false;
        }
    }

    private void notifyAllFeedObservers() {
        if (this instanceof Domestic) {
            for (int i = 0; i < feedSubscribers.size(); i+=2) {
                feedSubscribers.get(i).notifyObserver(this);
            }
        }if (this instanceof Wild){
            for (int i = 1; i<feedSubscribers.size();i+=2){
                feedSubscribers.get(i).notifyObserver(this);
            }
        }
        for (Observer subscriber : feedSubscribers) {
            if (subscriber instanceof Veterinarian){
                subscriber.notifyObserver(this);
            }
        }
    }

    private void notifyAllIllObservers() {
        for (Observer subscriber : illSubscribers) {
            subscriber.notifyObserver(this);
        }
    }

    private void notifyAllHairObservers() {
        for (Observer subscriber : hairSubscribers) {
            subscriber.notifyObserver(this);
        }
    }

    private void notifyDirector() {
        for (Observer subscriber : allSubscribe) {
            subscriber.notifyObserver(this);
        }
    }
}
