package dev.rohit.observer.raw_implementation;

public class CurrentConditionDisplay implements Observer, DisplayElement{

  private double temperature;
  private double humidity;
  private double pressure;

  private CurrentConditionDisplay(){
  }

  public CurrentConditionDisplay(Subject subject){
    this();
    subject.registerObserver(this);
  }

  @Override
  public void display(){
    System.out.println(String.format("Current conditions are Temperature :- %s, Humidity :- %s, Pressure :- %s",
        this.temperature, this.humidity, this.pressure));
  }

  @Override
  public void update(double temperature, double humidity, double pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
