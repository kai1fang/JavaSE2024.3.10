public class LogicOperator{
	public static void main(String[] args){
		//&&��&�İ�����ʾ
		int age = 50;
		if(age > 20 && age < 90){
			System.out.println("ok100");
		}
		//&��ʹ��
		if(age > 20 & age < 90){
			System.out.println("ok200");
		}
		//����
		int a = 4;
		int b = 9;
		//��&&��·�룬���׸�����Ϊfalse�������жϺ�����������ʡʱ��
		//��&�߼��룬��Ҫ�ж���������������½��ۣ�����ʱ
		//����&&��·��
		if(a < 1 && ++b < 50){
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);//4 9��δִ�к�һ���
		if(a < 1 & ++b < 50){
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);//4 10��ִ���˺�һ���
	} 
}