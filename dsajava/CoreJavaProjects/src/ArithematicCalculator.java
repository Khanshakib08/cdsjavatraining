import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ArithematicCalculator {
    public static void main(String[] args) {
    
    JFrame jFrame =new JFrame("Arithematic Calculator");
    
    JTextField userInputTextField= new JTextField("Input");
    userInputTextField.setBounds(50, 40, 150, 40);


    JButton clr= new JButton("clr");
    clr.setBounds(200, 40, 50, 40);
    jFrame.add(clr);
    JButton num7= new JButton("7");
    num7.setBounds(50, 80, 50, 40);
    jFrame.add(num7);
    JButton num8= new JButton("8");
    num8.setBounds(100, 80, 50, 40);
    jFrame.add(num8);
    JButton num9= new JButton("9");
    num9.setBounds(150, 80, 50, 40);
    jFrame.add(num9);
    JButton divide= new JButton("/");
    divide.setBounds(200, 80, 50, 40);
    jFrame.add(divide);
    JButton num4= new JButton("4");
    num4.setBounds(50, 120, 50, 40);
    jFrame.add(num4);
    JButton num5= new JButton("5");
    num5.setBounds(100, 120, 50, 40);
    jFrame.add(num5);
    JButton num6= new JButton("6");
    num6.setBounds(150, 120, 50, 40);
    jFrame.add(num6);
    JButton mul= new JButton("*");
    mul.setBounds(200, 120, 50, 40);
    jFrame.add(mul);
    JButton num1= new JButton("1");
    num1.setBounds(50, 160, 50, 40);
    jFrame.add(num1);
    JButton num2= new JButton("2");
    num2.setBounds(100, 160, 50, 40);
    jFrame.add(num2);
    JButton num3= new JButton("3");
    num3.setBounds(150, 160, 50, 40);
    jFrame.add(num3);
    JButton add= new JButton("+");
    add.setBounds(200, 160, 50, 40);
    jFrame.add(add);
    JButton num0= new JButton("0");
    num0.setBounds(50, 200, 50, 40);
    jFrame.add(num0);
    JButton equal= new JButton("=");
    equal.setBounds(100, 200, 100, 40);
    jFrame.add(equal);
    JButton sub= new JButton("-");
    sub.setBounds(200, 200, 50, 40);
    jFrame.add(sub);
    
    jFrame.add(userInputTextField);





    jFrame.setLayout(null);
    jFrame.setSize(600, 600);
    jFrame.setVisible(true);
    }

}
