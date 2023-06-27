package org.sp.app0627.frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

// 배치관리자 중 GridLayout 을 학습한다
// GridLayout 은 행, 열을 갖는 배치 방법을 지원한다
public class GridTest {
	
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout 학습");
		
		// 프레임에 GridLayout 적용하기
		GridLayout gr = new GridLayout(5, 3);
		f.setLayout(gr); //프레임에 배치관리자 적용
		
		//객체 자료형도 자료형이므로, 객체 자료형에 대한 배열 선언이 당연히 가능하다.
		Button[][] btn= new Button[5][3]; //2차원 배열로 구현
		
		for(int a=0; a<btn.length; a++) {	//층수만큼	
			for(int i=0; i<btn[a].length; i++) { //호수만큼
				btn[a][i]=new Button(a+"F "+i);
				f.add(btn[a][i]);
			}
		}

	
		
		
		f.setSize(300, 400);
		f.setVisible(true);
		
	}

}
