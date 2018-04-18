package by.bsuir.convertor.action;

public class Convertor {

	StringBuilder res;
	
	public void init() {
		res = new StringBuilder();
	}
	
	public String convert(int num) {
		init();
		StringBuilder res = new StringBuilder();
		while(num>0) {
			res.append(num%2);
			num/=2;
		}
		res.reverse();
		return res.toString();
	}
}
