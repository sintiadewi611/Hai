public class MainOperator	{
	public static void main(String[]args)	{
		Calculator cal = new Calculator();
		Operator opr = new Operator();
		opr.setX(4);
		opr.setY(2);


		System.out.println(cal.tambah(opr.getX(), opr.getY()));

		System.out.println(cal.kurang(opr.getX(), opr.getY()));
}
}
