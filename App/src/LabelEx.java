import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        // 창 제목 설정
        setTitle("레이블 예제");

        // 창 닫을시 프로세스 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 창 생성 및 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 텍스트 라벨 객체 생성
        JLabel textLabel = new JLabel("제이스 고슬링입니다!");

        // 이미지 아이콘 객체 생성 후 라벨에 이미지 아이콘을 넣는 객체 생성
        ImageIcon img = new ImageIcon("image/gosling.jpg");
        JLabel imageLabel = new JLabel(img);
        ImageIcon icon = new ImageIcon("image/coffee.jpg");
        JLabel label = new JLabel("커피 한잔 하시겠습니까?", icon, SwingConstants.CENTER);

        // 패널 창에 텍스트 라벨과 이미지 라벨 추가
        c.add(textLabel);
        c.add(imageLabel);
        c.add(label);

        // 크기 설정
        setSize(300, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }
}