package sample3;

public class PointImpl implements Point{
	
	private double xpos;
	private double ypos;
	
	public PointImpl() {
		System.out.println("PointImpl()»ý¼ºÀÚ");
	}

	@Override
	public double getXpos() {
		return xpos;
	}

	@Override
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	@Override
	public double getYpos() {
		return ypos;
	}

	@Override
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	
}
