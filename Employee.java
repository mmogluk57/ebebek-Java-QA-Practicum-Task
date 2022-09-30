

public class Employee {

	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
	
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	private double tax() {
		double tax=0;
		if(this.salary>1000) {
			tax=this.salary*3/100;
		}
		return tax;
	}
	private int bonus() {
		int bonus=0;
		if(this.workHours>40)
			bonus=(workHours-40)*30;
		return bonus;
			
	}
	private double raiseSalary() {
		int currentYear = 2021;
		int workYear = currentYear - this.hireYear; // how long they have been working as year
		
		double interest=0;
		if(workYear<10) {
			interest = (this.salary*5)/100;
		} else if (workYear>9 && workYear<20) {
			interest = (this.salary*10)/100;
		}
		else {
			interest = (this.salary*15)/100;
		}
		return interest;
		
	}
	public String toString() {
		int bonus=bonus();
		double tax = tax();
		double raisedSalary = raiseSalary();
		return "Adı: " +this.name+"\n"+
				"Maaşı: " + this.salary +"\n"+
				"Çalışma Saati: " + this.workHours+"\n"+
				"Başlangıç Yılı: " +this.hireYear+"\n" + 
				"Vergi: " + tax +"\n" +
				"Bonus:" + bonus + "\n" +
				"Maaş Artışı: " + raisedSalary +"\n"+
				"Vergi ve Bonuslarla birlikte maaş (Maaş+ vergi + bonus): " +(this.salary + bonus + tax) +"\n" +
				"Toplam Maaş (Maaş + vergi + bonus + maaş artışı): " + (this.salary+bonus+tax+raisedSalary);
	}
	
	
}
