package com.kh.poly.ex1.model.service;

import com.kh.poly.ex1.model.vo.AllinOnePrinter;
import com.kh.poly.ex1.model.vo.LGAP;
import com.kh.poly.ex1.model.vo.SamsungAP;

public class AbstractService {
	public void example1() {
		
		// �߻�Ŭ������ �̿��� ��ü ����
		// AllinOnePrinter ap1 = new AllinOnePrinter();
		// -> �߻�Ŭ������ ��ü ������ �Ұ����ϴ�.
		//	  ��? �̿ϼ� Ŭ������!
		
		// �߻�Ŭ������ ��ӹ��� Ŭ������ ��ü ����
		SamsungAP sap = new SamsungAP();
		
		// �߻� Ŭ������ ��ü ������ �Ұ��� ������
		// �θ� ���� ������ ��Ӱ��迡 �ִ� �ڽ� ��ü ������ ������.
		AllinOnePrinter ap2 = new SamsungAP();
		
		ap2.setBrand("�Ｚ");
		
		// ��ü�迭
		// �߻� Ŭ������ �θ�Ÿ�� ���������� Ȱ��
		AllinOnePrinter[] apArr = new AllinOnePrinter[2];
		
		// ��� + ������(��ĳ����)
		apArr[0] = new SamsungAP("Samsung", "������ ���ձ�S1");
		apArr[1] = new LGAP("LG", "V ���ձ� v.3D"); 
		
		for(int i = 0; i < apArr.length; i++) {
			// ���
			System.out.print(apArr[i].getBrand() + " ���ձ��� �ִ� ���� ������ : ");
			
			// �������̵� + �������ε�
			System.out.println(apArr[i].maxPaperSize()); // ���� ���ε�
			
			// instanceof
			if(apArr[i] instanceof SamsungAP) {
				// ������(�ٿ� ĳ����)
				((SamsungAP)apArr[i]).connectPhone();
			} else if(apArr[i] instanceof LGAP){
				// ������(�ٿ� ĳ����)
				((LGAP)apArr[i]).print3D();
			}
		}
		
	}
}
