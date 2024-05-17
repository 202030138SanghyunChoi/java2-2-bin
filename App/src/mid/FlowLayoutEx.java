package mid;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        // FlowLayout
        // 디폴트 값은 CENTER, 5 px, 5 px 이다.
        // contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        // contentPane.add(new JButton("add"));
        // contentPane.add(new JButton("sub"));
        // contentPane.add(new JButton("mul"));
        // contentPane.add(new JButton("div"));
        // contentPane.add(new JButton("Calculate"));

        // BorderLayout
        // 디폴트 값은 0, 0 이다.
        // contentPane.setLayout(new BorderLayout(20, 20));
        // contentPane.add(new JButton("add"), BorderLayout.CENTER);
        // contentPane.add(new JButton("sub"), BorderLayout.EAST);
        // contentPane.add(new JButton("mul"), BorderLayout.WEST);
        // contentPane.add(new JButton("div"), BorderLayout.SOUTH);
        // contentPane.add(new JButton("Calculate"), BorderLayout.NORTH);

        // GirdLayout
        // contentPane.setLayout(new GridLayout(4, 3, 5, 5));
        // for (int i = 7; i>0; i= i-3) {
        //     for (int j = 0; j <= 2; j++) {
        //         contentPane.add(new JButton(Integer.toString(i+j)));
        //     }
        // }
        // contentPane.add(new JButton("*"));
        // contentPane.add(new JButton("0"));
        // contentPane.add(new JButton("#"));

        // CardLayout 또는 배치관리자가 없는 컨테이너
        contentPane.setLayout(null);
        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        contentPane.add(la);
        for (int i=1; i<=9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15, i*15);
            b.setSize(50, 20);
            contentPane.add(b);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
