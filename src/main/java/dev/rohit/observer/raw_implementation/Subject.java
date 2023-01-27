package dev.rohit.observer.raw_implementation;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{
  protected double temperature;
  protected double humidity;
  protected double pressure;

  protected List<Observer> observers;

  protected Subject(){
    this.observers = new ArrayList<>();
  }

  protected abstract void registerObserver(Observer observer);

  protected abstract void removeObserver(Observer observer);

  protected abstract void notifyObservers();
}
