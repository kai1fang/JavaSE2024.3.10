public class LogicOperator{
	public static void main(String[] args){
		//&&和&的案例演示
		int age = 50;
		if(age > 20 && age < 90){
			System.out.println("ok100");
		}
		//&的使用
		if(age > 20 & age < 90){
			System.out.println("ok200");
		}
		//区别
		int a = 4;
		int b = 9;
		//对&&短路与，若首个条件为false，则不再判断后续条件，节省时间
		//对&逻辑与，需要判断所有条件后才能下结论，更耗时
		//多用&&短路与
		if(a < 1 && ++b < 50){
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);//4 9，未执行后一语句
		if(a < 1 & ++b < 50){
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);//4 10，执行了后一语句
	} 
}