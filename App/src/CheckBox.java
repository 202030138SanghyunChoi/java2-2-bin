import javax.swing.*;
import java.awt.*;

public class CheckBox extends JFrame {
    public CheckBox() {
        // 제목설정
        setTitle("체크 박스 예제");
        // 창을 닫을 때 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // 패널 창 생성 및 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 체크 박스 객체 생성(true는 checked 기능)
        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox cherry = new JCheckBox("체리", true);

        // 체크 박스  패널 창에다 추가
        c.add(apple);
        c.add(pear);
        c.add(cherry);

        // 크기 및 출력 설정
        setSize(250, 150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CheckBox();
    }
}
