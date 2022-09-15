public class LinePrograms
{
	public static void main(String[] args) {
		System.out.println(findZ(5,1,3));
	}

//first task
  public static int findZ(int a, int b, int c) {
    int z = ((a-3)*b/2)+c;
    return z;
  }
}
