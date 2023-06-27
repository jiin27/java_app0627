package org.sp.app0627.frame;

import java.awt.Button;
//import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class LoginForm {

	public static void main(String[] args) {
		Frame f = new Frame();
		//Frame의 default 레이아웃은 BorderLayout 이므로 , FlowLayout 으로 변경하자
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 레이아웃 적용.
		
		Label la_id = new Label("ID");
		Label la_pass = new Label("Password");
		
		TextField t_id = new TextField();
		TextField t_pass = new TextField();
		
		Button bt_login = new Button("Login");
		Button bt_regist = new Button("Join");
		
		//부착하기 전에 속성을 적용해놓자
		//la_id.setBackground(Color.YELLOW);
		Dimension d = new Dimension(130, 30);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		
		
		// 컴포넌트들을 프레임에 부착하기
		f.add(la_id);
		f.add(t_id);
		f.add(la_pass);
		f.add(t_pass);
		f.add(bt_login);
		f.add(bt_regist);		
		
		// 프레임의 크기 설정 및 보이게
		f.setSize(300, 145);
		f.setVisible(true);
	}
}
