package org.sp.app0627.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//자바에서 지원하는 GUI 컴포넌트 들을 개발자가 원하는 위치에 배치하려면, 배치관리자를 이용해야 한다. 만일 개발자가 아무런 배치관리자를 적용하지 않으면 디폴트 배치관리자가 적용된다.
// 자바에서 배치 방법은 총 5가지
/*
 * 1) FlowLayout (중요)
 * 		남은 공간으로 컴포넌트들이 흘러다닌다고 해서 Flow 배치라고 한다.
 * 		이때 흐르는 방향은 수평 및 수직 이 있다.
 * 2) BorderLayout (중요)
 * 		동, 서, 남, 북, 센터의 배치를 갖는 레이아웃 
 * 		특징) 각 방위에 붙는 컴포넌트들은 각 방위 공간을 가득 채운다.
 * 				ex) html의 block 처럼 빈 공간을 채워버린다. (center 가)
 * 3) GridLayout (중요) 
 * 4) FrameLayout
 * 5) GridBagLayout
 * */
public class LayoutTest {

	//
	public static void main(String[] args) {
		Button bt_north = new Button("North");
		Button bt_south = new Button("South");
		Button bt_east = new Button("East");
		Button bt_west = new Button("West");
		Button bt_center = new Button("Center");
		
		Frame f = new Frame("BorderLayout 학습");
		
		//BorderLayout 생성
		BorderLayout br = new BorderLayout();
		f.setLayout(br); //윈도우에 배치 적용
		
		// Frame 은 디폴트 배치관리자로 BorderLayout 이 적용된다!!! ***
		
		f.add(bt_north, BorderLayout.NORTH);
		f.add(bt_south, BorderLayout.SOUTH);
		f.add(bt_east, BorderLayout.EAST);
		f.add(bt_west, BorderLayout.WEST);
		f.add(bt_center, BorderLayout.CENTER);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
