public class LinePrograms
{
	public static void main(String[] args) {
		System.out.println("");
	}

  	public static int firstTask(int a, int b, int c) {
    int z = ((a-3)*b/2)+c;
    return z;
}
	
	public static double secondTask(int a, int b, int c) {
    double res = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b, -2);
    return res;
}
	public static double thirdTask(int x, int y) {
    double res = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x)*y;
    return res;
}
}
