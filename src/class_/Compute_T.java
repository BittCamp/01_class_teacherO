package class_;
//[ 김찬영  2023-07-19 오후 04:02:59 ]
class Compute_T {
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = (double)x / y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public String getDiv() {
		return String.format("%.2f",div);
	}
}