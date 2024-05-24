import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
    // 안내 메시지 라벨
    private JLabel la = new JLabel("<Enter> 키로 배경 색이 바뀝니다.");
    public KeyCharEx() {
        // 
        super("keyListener의 문자 키 입력 예제");
        // 종료 시 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 패널 생성
        Container c = getContentPane();
        // 플로우 레이아웃
        c.setLayout(new FlowLayout());
        // 라벨 추가
        c.add(la);
        // 키 이벤트 리스너
        c.addKeyListener(new MyKeyListener());

        // 패널 크기 및 출력 설정
        setSize(300, 300);
        setVisible(true);

        // 포커스 허용 및 포커스(어느 키를 입력해도 패널 c로 포커스됨.)
        c.setFocusable(true);
        c.requestFocus();
    }

    // 키 입력 이벤트 객체
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            //  r g b 변수 생성(랜덤 수)
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            // e의 유니코드 값에 따라 스위치 문
            switch (e.getKeyChar()) {
                // 엔터를 치면
                case '\n':
                // 라벨의 이름을 rgb 정보로 변경하고
                la.setText("r= " + r + ", g= " + g + ", b= " + b);
                // 배경을 rgb 변수로 설정
                getContentPane().setBackground(new Color(r, g, b));
                    
                    break;

                // q를 친다면
                case 'q':
                // 종료
                System.exit(0);
            
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new KeyCharEx();
    }
}
