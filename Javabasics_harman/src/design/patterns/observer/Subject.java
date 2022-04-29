package design.patterns.observer;
public interface Subject
{
 void subscribe(Observer o);
 void unSubscribe(Observer o);
 void Notify();
}