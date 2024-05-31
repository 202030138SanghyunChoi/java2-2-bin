import javax.swing.*;
import java.awt.*;

public class ButtonimageEx extends JFrame {
    public ButtonimageEx() {
        // 제목 설정
        setTitle("이미지 버튼 예제");
        
        // 창 닫을 때 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 창 생성 및 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 이미지 3개 생성
        ImageIcon normalIcon = new ImageIcon("image/click.png");
        ImageIcon rolloverIcon = new ImageIcon("image/yellowclick.png");
        ImageIcon pressedIcon = new ImageIcon("image/redclick.png");

        // 버튼 객체 생성(1번 이미지 첨가)
        JButton btn = new JButton("call~~", normalIcon);
        // 버튼 눌렸을 때 이미지 메서드
        btn.setPressedIcon(pressedIcon);
        // 버튼에 마우스 호버링했을 때 메서드
        btn.setRolloverIcon(rolloverIcon);
        // 패널 창에 버튼 추가
        c.add(btn);

        // 크기 및 출력 설정
        setSize(250, 150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ButtonimageEx();
    }
}
