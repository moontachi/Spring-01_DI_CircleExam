package sample4;

public class CalcImpl implements Calc {
	private int su1;
	private int su2;
	
	public CalcImpl(int su2) {
		System.out.println("setSu1(int su2)");
		this.su2 = su2;
	}
	
	
	public void setSu1(int su1) {
		System.out.println("setSu1(int su1)");
		this.su1 = su1;
	}


	@Override
	public void calculate() {
		System.out.println("���� :" + (su1+su2));
		System.out.println("���� :" + (su1-su2));
		System.out.println("���� :" + (su1*su2));
		System.out.println("������ :" + (su1/su2));
		System.out.println("������ :" + (su1%su2));
	}


	
	
	
	
}
