/*
	��ʾ�����������ʹ��
*/
public class ArithmeticOperator{
	public static void main(String[] args){

		//������ʹ��
		System.out.println(10 / 4); //�����2
		// ע�Ϳ�ݼ� ctrl + /,�ٴ�����ʱȡ��ע��
		double d = 10 / 4;	
		System.out.println(d); //double���ͣ������2.0
		
		//ȡģ��ʹ��
		//ȡģ�Ĺ�ʽ��a % b = a - a / b * b 
		//����������뱻������������ͬ���ɺ��Գ�������������
		System.out.println(10 % 3);  //�����1
		System.out.println(-10 % 3); //�����-1
		System.out.println(10 % -3); //�����1
		System.out.println(-10 % -3);//�����-1

		//�������Լ�����ʹ��
		int i = 10;
		i++; 
		//	��Ϊ�������ʹ��ʱ��
		//  ǰ++��++i���ͺ�++��i++���ȼۣ���i = i + 1
		System.out.println("i = " + i); // 11
		/*
			��Ϊ���ʽʹ��ʱ��
			ǰ++��++i����������ֵ��
			��++��i++���ȸ�ֵ��������
		*/
		int j = 8;
		//int k = ++j; // j = j + 1; k = j;
		//System.out.println("k = " + k + " j = " + j); // 9 9
		int k = j++; // k = j; j = j + 1;
		System.out.println("k = " + k + " j = " + j); // 8 9
	}
}
