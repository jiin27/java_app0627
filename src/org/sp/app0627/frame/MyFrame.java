package org.sp.app0627.frame;

// 나와는 다른 위치에 있는 클래스를 사용할 때는 import 를 사용해 위치를 명시해준다.
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class MyFrame {
	
	public static void main(String[] args) {
		// GUI 프로그래밍을 위해서는 그 바탕이 되는 컨테이너가 필요한데, 
		// 최상위 컨테이너는 모든 프로그래밍 언어에서 Window 이다.
		// 특히 자바에서는 Window를 표현하는 클래스로 Frame 이라는 클래스를 지원하고 있다.
		
		// 클래스 종류를 알아야 호출하는 방식이 결정된다!
		// 일반클래스 - new
		// 추상클래스 - 자식을 정의 후 new
		// 인터페이스 - 자식을 정의 후 new
		Frame f = new Frame();
		f.setSize(300, 400); //너비, 높이 지정
		f.setVisible(true); //윈도우 창 보이게.
		// 프레임에 부착될 여러 컴포넌트들에 대해 개발자가 원하는 레이아웃을 명시하지 않으면
		// 디폴트 레이아웃이 적용되어, 모든 컴포넌트가 윈도우 크기만해진다.
		// 레이아웃 수업 전, 이 부분만 방지하기 위해서 FlowLayout을 적용해보자
		FlowLayout flow = new FlowLayout();
		
		// 생성된 레이아웃을 윈도우인 프레임에 적용하기
		f.setLayout(flow);
		
		// TextField
		TextField t1 = new TextField("여기에 뭔가 넣기");
		
		// html에서 부모 요소에 appendChild 하듯, 자바도 마찬가지로
		// 바깥쪽 컨테이너인 frame 에 각종 컴포넌트들을 붙여보자
		f.add(t1);
		
		//버튼을 생성해서 윈도우 프레임에 부착해보기
		Button bt = new Button("버튼임");
		f.add(bt);
		
		//체크박스 부착하기
		Checkbox ch1 = new Checkbox("라이딩");
		Checkbox ch2 = new Checkbox("독서");
		Checkbox ch3 = new Checkbox("드라마");
		Checkbox ch4 = new Checkbox("만화");
		
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.add(ch4);
		
		//TextArea
		TextArea area = new TextArea(10, 15);
		f.add(area);
		
		// select박스 라는 표현 X -> Choice
		Choice c = new Choice(); //select
		c.add("pjiin211@naver.com");
		c.add("pjiin21@daum.com");
		c.add("pjiin21@google.com");
		
		f.add(c);
	}
}
