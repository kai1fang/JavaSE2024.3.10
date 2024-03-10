import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//演示接受用户输入
		//1.引入Scanner类所在的包
		//2.创建Scanner对象，用new
		//myScanner就是Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//3.接受输入
		System.out.println("请输入姓名");
		//调用next方法，当执行到next方法时，会等待用户输入
		String name = myScanner.next();//接收String数据
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//接收int数据
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//接收double数据	
		//4.输出人的信息
		System.out.println("人的信息如下：");
		System.out.println("姓名=" + name + " 年龄=" + age 
	     				 + " 薪水=" + sal);	
	}
}