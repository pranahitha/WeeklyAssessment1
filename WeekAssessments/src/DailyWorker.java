//Daily worker is the child class of Worker

public class DailyWorker extends Worker {

	public DailyWorker(String workerName, int salary, String workType) {
		super(workerName, salary, workType);
		// TODO Auto-generated constructor stub
	}
	//to compute the daily wages
	public int pay()
	{
		return 7*salary;
		
	}
}
