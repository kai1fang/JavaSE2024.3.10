/*
	演示算术运算符的使用
*/
public class ArithmeticOperator{
	public static void main(String[] args){

		//除法的使用
		System.out.println(10 / 4); //结果是2
		// 注释快捷键 ctrl + /,再次输入时取消注释
		double d = 10 / 4;	
		System.out.println(d); //double类型，结果是2.0
		
		//取模的使用
		//取模的公式：a % b = a - a / b * b 
		//结果的正负与被除数的正负相同，可忽略除数的正负符号
		System.out.println(10 % 3);  //结果是1
		System.out.println(-10 % 3); //结果是-1
		System.out.println(10 % -3); //结果是1
		System.out.println(-10 % -3);//结果是-1

		//自增（自减）的使用
		int i = 10;
		i++; 
		//	作为独立语句使用时，
		//  前++（++i）和后++（i++）等价，是i = i + 1
		System.out.println("i = " + i); // 11
		/*
			作为表达式使用时，
			前++（++i）先自增后赋值，
			后++（i++）先赋值后自增。
		*/
		int j = 8;
		//int k = ++j; // j = j + 1; k = j;
		//System.out.println("k = " + k + " j = " + j); // 9 9
		int k = j++; // k = j; j = j + 1;
		System.out.println("k = " + k + " j = " + j); // 8 9
	}
}
