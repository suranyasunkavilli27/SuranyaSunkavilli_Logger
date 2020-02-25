package cleancode.com.intersetandconstruction;

class Simpleinterest{
	double principalamount;
	double years;
	double rateofinterestpyear;
	Simpleinterest(double principalamount, double  years, double rateofinterestpyear){
		this.principalamount = principalamount;
		this.years = years;
		this.rateofinterestpyear = rateofinterestpyear;
		}	
	public double findsimpleinterest(){
		double result = (principalamount * years * rateofinterestpyear);
		result /= 100;
		return result;
	}
}
	
	