package ZooObservable;

import ZooObservable.Workers.Worker;

public interface Observable {
    public void subscribe(Worker observer);
    public void unsubscribe(Worker observer);
    public void notifyAllObservers();
}
