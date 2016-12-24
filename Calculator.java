public class Calculator {
	private double result;

	public void add(double... params) {
		for (double param: params) {
		  this.result += param;
		}
	}

	public void sub(double... params) {
		this.result = params[0] - params[1];
	}

	public void mult(double... params) {
		this.result = params[0] * params[1];
	}	

	public void div(double... params) {
		if (params[1] != 0) {
		  this.result = params[0] * params[1];
		}
	}	


	public double getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}
}