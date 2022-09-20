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
	public static double fourthTask(double a) {
		    String s = Double.toString(a);
		    String[] arr = s.split("\\.");
		    s = arr[1]+"."+arr[0];
    double res = Double.parseDouble(s); 
    return res;
}
	public static String fifthTask(int a) {
		    int HH = a/60/60;
		    int MM = a/60;
		    int SS = a;
		    if (HH > 0) MM = (a-3600*HH)/60;
		    if (MM > 0) SS = (a-60*MM)-3600*HH;
		String res = "HH"+HH+"MM"+MM+"SS"+SS;
    return res;
}
}
