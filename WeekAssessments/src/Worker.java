//parent class worker which have name salary and type of work

public class Worker {
	String workerName;
	int salary;
	String workType;
	

	
public Worker(String workerName, int salary, String workType) {
		this.workerName = workerName;
		this.salary = salary;
		this.workType = workType;
	}



	public int getSalary() {
	return salary;
}



public void setSalary(int salary) {
	this.salary = salary;
}



	@Override
	public String toString() {
		return "\n Worker [workerName=" + workerName + ", salary=" + salary + ", workType=" + workType + "]";
	}

	
	

	
}
