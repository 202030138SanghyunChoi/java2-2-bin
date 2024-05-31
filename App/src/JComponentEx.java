import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메서드 예제");
        // 패널 객체 생성 및 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 버튼 3개 객체 생성
        JButton b1 = new JButton("Magenta/Yeloow Button");
        JButton b2 = new JButton(" Disabled Button ");
        JButton b3 = new JButton("getX(), getY()");

        // b1의 색 설정
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.MAGENTA);
        // b1의 폰트 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20));
        // b2는 클릭 안되게
        b2.setEnabled(false);
        // b3 누를 시 액션 추가
        b3.addActionListener(new ActionListener() {
            // 제목은 b3의 x,y좌표 출력
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                setTitle(b.getX() + "," + b.getY());
            }
        });

        // 패널에다 버튼 넣기
        c.add(b1);
        c.add(b2);
        c.add(b3);

        // 창 크기 설정
        setSize(260,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponentEx();
    }
}