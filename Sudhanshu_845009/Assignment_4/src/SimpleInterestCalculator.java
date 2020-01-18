class SimpleInterestCalculator {
	double principalAmount;
	int numberOfYears;
	void calculateSimpleInterest() {
		double simpleInterest;
		if (principalAmount>100000){
			if (numberOfYears>10){
				simpleInterest = (double)(principalAmount * numberOfYears *10)/100;
				System.out.println("The interest amount for a principal of " +principalAmount+" and years "+ numberOfYears+" is " +simpleInterest);
			}
			else if(numberOfYears<10) {
				simpleInterest = (double)(principalAmount * numberOfYears *9.5)/100;
				System.out.println("The interest amount for a principal of " +principalAmount+" and years "+ numberOfYears+" is " +simpleInterest);
			}
		}
		else if(principalAmount<100000) {
			if(numberOfYears>10) {
				simpleInterest = (double)(principalAmount * numberOfYears *5)/100;
				System.out.println("The interest amount for a principal of " +principalAmount+" and years "+ numberOfYears+" is " +simpleInterest);
			}
			else if(numberOfYears<10) {
				simpleInterest = (double)(principalAmount * numberOfYears *4.5)/100;
				System.out.println("The interest amount for a principal of " +principalAmount+" and years "+ numberOfYears+" is " +simpleInterest);
			}
		}
	}
	public static void main(String[] args) {
		SimpleInterestCalculator t = new SimpleInterestCalculator();
		t.principalAmount = 50000;
		t.numberOfYears = 5;
		t.calculateSimpleInterest();
	}
}
