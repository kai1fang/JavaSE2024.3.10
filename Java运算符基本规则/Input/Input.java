import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//��ʾ�����û�����
		//1.����Scanner�����ڵİ�
		//2.����Scanner������new
		//myScanner����Scanner��Ķ���
		Scanner myScanner = new Scanner(System.in);
		//3.��������
		System.out.println("����������");
		//����next��������ִ�е�next����ʱ����ȴ��û�����
		String name = myScanner.next();//����String����
		System.out.println("����������");
		int age = myScanner.nextInt();//����int����
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//����double����	
		//4.����˵���Ϣ
		System.out.println("�˵���Ϣ���£�");
		System.out.println("����=" + name + " ����=" + age 
	     				 + " нˮ=" + sal);	
	}
}