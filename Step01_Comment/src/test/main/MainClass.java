package test.main;
// �� �� �ּ��Դϴ�.
// ���� �� �� �ּ��Դϴ�.

/*
 	���� �� �ּ� �Դϴ�.
 		�ϳ�
 		�ο�
 		����
*/

// ���ϸ� : MainClass.java 
// ���ϸ�� Ŭ�������� ���ƾ� �Ѵ�!
public class MainClass { // Ŭ���� �� : MainClass
	
	// ���� ������ ���۵Ǵ� Ư���� main �޼ҵ�(Method)
	// function main(args){
	// }
	public static void main(String[] args) { // �޼ҵ�� : main
		// syso + ctrl + space
		System.out.println("�ȳ��ϼ���.");
		
		// �񱳿����� ����� ����� boolean type �����͸� ������ ���
		boolean isGreater= 10>1;
		
		if(isGreater) {
			System.out.println("10�� 1���� Ŀ��");
		}
		
		// �������� ����� ����� boolean type �����͸� ������ ���
		// or => ||		and => &&
		boolean result=  true || false;

		System.out.println("main �޼ҵ尡 ����(����) �˴ϴ�.");
	}
}
