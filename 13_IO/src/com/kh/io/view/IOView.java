package com.kh.io.view;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.io.model.service.ByteService;

public class IOView {

	private Scanner sc = new Scanner(System.in);
	private ByteService bService = new ByteService();
	
	public void displayMain() {
		int sel = 0;
		
		do {
			try {
				System.out.println("=== ����� �޴��� ===");
				System.out.println("1. BYTE ��� ���� �ۼ�(���)");
				System.out.println("2. BYTE ��� ���� ����(�Է�)");
				System.out.println("3. ���� ��� ���� �ۼ�(���)");
				System.out.println("4. ���� ��� ���� ����(�Է�)");
				System.out.println("5. ���� ����(�Է� & ���)");
				System.out.println("0. ����");
				System.out.print("�޴� ���� >> ");
				sel = sc.nextInt();
				sc.nextLine(); // ���ĵ��ۿ��� ���ڿ��� �Է¹��� �� �����Ƿ� �̸� ���๮�� ����
				
				switch(sel) {
				case 1: byteFileSave(); break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 0: System.out.println("�����Ѵ� �ּ���"); break;
				default : System.out.println("�ٽ� �Է��ض� �ּ���");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("������ �Է��� ���� ���ϳ� ��¥�� �츮���� ����~~~~");
				sel = -1; // sel�� 0���� �����Ǿ� ����Ǵ°� ����
				sc.nextLine(); // ���ۿ� ���� �߸� �Էµ� ���� ����
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		} while(sel != 0);
	}

	// ����Ʈ ��� �Է�
	private void byteFileSave() throws FileNotFoundException {
		System.out.println("--- ����Ʈ ��� ���� �Է� ---");
		System.out.print("���� ������ ���ϸ� : ");
		String fileName = sc.nextLine();
		
		// �ԷµǴ� ��� ������ ���ļ� ����
		StringBuffer content = new StringBuffer();
		
		// �ԷµǴ� ���� �� ���� �ӽ�����
		String input = null;
		
		System.out.println("----- ���� ���� �Է�(exit �Է� �� ����) -----");
		
		while(true) {
			input = sc.nextLine();
			
			// �Է¹��� ���ڿ��� exit�� ��� �ݺ��� ����
			if(input.equals("exit")) break;
			
			// StringBuffer�� �Է¹��� ���� + ���๮�� �߰�
			content.append(input + "\n");
		}
		
		// �Է� ���� ���ϸ�� ������ ByteService�� �ִ� 
		// ByteFileSave() �޼ҵ忡 �����Ͽ� ����� ��ȯ �ޱ�
		int result = bService.byteFileSave(fileName, content.toString());
		
		if(result == 1) {
			System.out.println(fileName + ".txt ���� ���� �����ߵ���");
		} else {
			System.out.println(fileName + ".txt ���� ���� �����ߵ���");
		}
//		System.out.println("---------------------------------------");
//		System.out.println(content.toString());
	}
}
