package corejavabasics.learningpackage;

public class Learner {

	String learnerName;
	int hrsLearnt;
	
	public Learner(String name) {
		this.learnerName = name;
	}
	
	public Learner(String name, int hrs) {
		this.learnerName = name;
		this.hrsLearnt = hrs;
	}
	
	public void displayLearner() {
		System.out.println(this.learnerName + " has learnt for " + this.hrsLearnt + " hrs.");
	}
}