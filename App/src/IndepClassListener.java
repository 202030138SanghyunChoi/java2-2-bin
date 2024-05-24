import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        // 제목 설정
        setTitle("Action 이벤트 리스너 예제");
        // 닫을 때 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 객체 선언
        Container c = getContentPane();
        // 패널 레이아웃 플로우로 설정
        c.setLayout(new FlowLayout());

        // 버튼 레이아웃 선언
        JButton btn = new JButton("Action");
        // 버튼에 이벤트 리스너 추가
        btn.addActionListener(new MyActionListener());
        // 패널에다 버튼 추가
        c.add(btn);

        // 사이즈 및 보여주기 설정
        setSize(250, 120);
        setVisible(true);
    }
    public static void main(String[] args) {
        new IndepClassListener();
    }
}

// 이벤트 리스너 ActionListener에서 상속(독립 클래스로 사용한 경우)
class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        // 이벤트 소스 버튼의 객체 알아내기(밑에 필요함)
        JButton b = (JButton)e.getSource();
        // 버튼의 텍스트가 Action이랑 같다면
        if(b.getText().equals("Action")) {
            // 한글로 번역
            b.setText("액션");
        }
        // 그게 아니라면
        else {
            // Action 그대로
            b.setText("Action");
        }
    }
}
