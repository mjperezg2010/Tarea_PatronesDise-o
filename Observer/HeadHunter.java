package Observer;

import java.util.ArrayList;

public class HeadHunter implements Subject {

    ArrayList<String> jobs = new ArrayList();
    ArrayList<Observer> observadores = new ArrayList();

    public HeadHunter() {
    }

    @Override
    public void registerObserver(Observer observer) {
        observadores.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

 

    public void addJob(String agregar) {
        this.jobs.add(agregar);

    }

    public ArrayList<String> getJobs() {
        return jobs;
    }
    

    @Override
    public void notifyAllObservers() {
        observadores.forEach((o) -> {
            o.update(this);
        });
    }

    @Override
    public String toString() {
        return "HeadHunter{" + "jobs=" + jobs + ", observadores=" + observadores + '}';
    }

}
