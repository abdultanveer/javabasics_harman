package design.patterns.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		 
		 PostOffice postoffice = new PostOffice(); //observable
		 Person chris = new Person("741");
		 Person john = new Person("963");
		 
		 Mail m = new Mail("741", "Dundee", "You've got a secret chris");
		 
		 postoffice.subscribe(chris);  //subscribing with the post office
		 postoffice.subscribe(john);
		 
		 postoffice.addMail(m);  //post office received a passport
		 }

}
