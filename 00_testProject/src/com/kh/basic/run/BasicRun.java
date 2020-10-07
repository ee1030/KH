package com.kh.basic.run;

//import com.kh.basic.A_MethodCall;
import com.kh.basic.B_PrintExample;
// 다른 클래스를 해당 클래스에 사용 할 수 있도록 포함하는 구문

public class BasicRun {
	// xxxRun 클래스 : Java Application을 실행하는 클래스
	
	public static void main(String[] args) {
		// BasicRun 클래스의 main() 메서드 실행(run)
		
		//A_MethodCall amc = new A_MethodCall();
		// new 연산자 -> 새로운 개체 생성
		//amc.methodA();
		// 컨트롤 쉬프트 o -> import 자동완성
		//amc.introduce();
		
		B_PrintExample bpe = new B_PrintExample();
		bpe.printEx1();
		bpe.printEx2();
		bpe.printEx3();
	}
}
