package design.patterns.observer;
import java.util.ArrayList;
 
public class Person implements Observer
{
 String name;
 
 public Person(String name)
 {
   this.name = name;
 }
 
 public void checkMail(ArrayList<Mail> m)
 {
   for ( int i =0; i < m.size(); i++)
   {
    if (name.compareTo(m.get(i).receiverName) == 0)
      System.out.println(name + ": " + m.get(i).content);
   }
 }
 
 public void update(Object obj)
 {
   if (obj instanceof PostOffice)
   {
     PostOffice po = (PostOffice) obj;
     checkMail(po.getState());
   }
 }
}