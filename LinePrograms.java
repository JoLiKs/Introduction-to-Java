public class LinePrograms
{
	public static void main(String[] args) {
		System.out.println(secondTask(5,1,3));
	}

//first task
  public static int firstTask(int a, int b, int c) {
    int z = ((a-3)*b/2)+c;
    return z;
  }
	//second task
	public static double secondTask(int a, int b, int c) {
    double res = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b, -2);
    return res;
}
