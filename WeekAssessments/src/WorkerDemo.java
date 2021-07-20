import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//using comparator to sort salary of workers

public class WorkerDemo {
	public static void main(String[] args) {
		
		//to create a list of workers
		List <Worker> workers=new ArrayList<Worker>();
		workers.add(new DailyWorker("raju",200,"D"));
		workers.add(new SalariedWorker("sia",1000,"S"));
		workers.add(new SalariedWorker("lasya",15000, "S"));
		workers.add(new DailyWorker("elsa", 400,"D"));
		workers.add(new DailyWorker("luca", 500, "D"));
		workers.add(new SalariedWorker("stella",16000, "S"));
		
		//to print normally unsorted
		System.out.println(workers);
		System.out.println();
		System.out.println("sort by salary: ");
		
		//using comparator
		Comparator<Worker> comparator=(o1,o2)->o1.getSalary()-o2.getSalary();
		Collections.sort(workers,comparator);
		
		//sorted by salary
		System.out.println(workers);
	
}
	
}