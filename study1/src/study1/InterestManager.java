package study1;

public class InterestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestManager manger = new InterestManager();

		for(int day=10; day<=365; day+=10) {
			double amount = manger.calculateAmount(day, 1000000);
			System.out.println("day:"+day+"amount:"+amount);
		}
	}// main

	public double getInterestRate(int day) {
		double num;
		if (day <= 90) {
			num = 0.5;

		} else if (day > 90 && day <= 180) {
			num = 1;

		} else if (day > 180 && day <= 364) {
			num = 2;

		} else {
			num = 5.6;

		}
		return num;
	}// getInterestRate

	public double calculateAmount(int day, long amount) {

		double totalAmount;
		double interest = getInterestRate(day);
		double interestAmount = amount * interest / 100.0;
		totalAmount = interest + interestAmount;

		return totalAmount;
	}
}
