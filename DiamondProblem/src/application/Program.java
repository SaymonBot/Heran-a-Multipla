package application;


import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		ConcreteScanner scan = new ConcreteScanner("2003");
		scan.processDoc("My Email");
		System.out.println("Scan  result: " + scan.scan());
		
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}