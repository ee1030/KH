package com.kh.basic.run;

//import com.kh.basic.A_MethodCall;
import com.kh.basic.B_PrintExample;
// �ٸ� Ŭ������ �ش� Ŭ������ ��� �� �� �ֵ��� �����ϴ� ����

public class BasicRun {
	// xxxRun Ŭ���� : Java Application�� �����ϴ� Ŭ����
	
	public static void main(String[] args) {
		// BasicRun Ŭ������ main() �޼��� ����(run)
		
		//A_MethodCall amc = new A_MethodCall();
		// new ������ -> ���ο� ��ü ����
		//amc.methodA();
		// ��Ʈ�� ����Ʈ o -> import �ڵ��ϼ�
		//amc.introduce();
		
		B_PrintExample bpe = new B_PrintExample();
		bpe.printEx1();
		bpe.printEx2();
		bpe.printEx3();
	}
}
