import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
    // 갖고 놀 마우스 라벨 생성
    private JLabel la = new JLabel("Hello");

    public MouseListenerEx() {
        // 제목 설정
        setTitle("Mouse 이벤트 예제");
        // 닫을 때 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 패널 생성
        Container c = getContentPane();
        // 마우스 이벤트 리스너 생성
        c.addMouseListener(new MyMouseListener());

        // 라벨을 마음대로 움직여야 하기때문에 배치관리자를 삭제해야함 . 따라서 레이아웃을 null로 
        c.setLayout(null);
        // 라벨 초기 크기와 위치 설정
        la.setSize(50, 30);
        la.setLocation(30, 30);
        // 라벨 추가
        c.add(la);

        // 컴포넌트 크기 및 출력 설정
        setSize(200, 200);
        setVisible(true);
    }

    // 마우스 이벤트 리스너
    class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
            // 마우스의 포지션을 받은 다음 setLocation으로 라벨의 위치 설정
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }

        // 나머지 추상 메서드 일일히 구현(어댑터를 통해 해소)
        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}