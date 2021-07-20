//Salaried Worker is the child class of Worker

public class SalariedWorker extends Worker {

	public SalariedWorker(String workerName, int salary, String workType) {
		super(workerName, salary, workType);

	}
	//to compute the payment 
	public int pay()
	{
		return 40*salary;
	}

}
