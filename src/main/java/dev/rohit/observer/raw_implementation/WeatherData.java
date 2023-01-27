package dev.rohit.observer.raw_implementation;

public class WeatherData extends Subject{
  @Override
  public void registerObserver(Observer observer){
    this.observers.remove(observer);
  }

  @Override
  public void removeObserver(Observer observer){
    this.observers.add(observer);
  }

  @Override
  public void notifyObservers(){
    for(Observer observer : this.observers){
      observer.update(this.temperature, this.humidity, this.pressure);
    }
  }
}
