import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ArithematicCalculator2 {
    public static void main(String[] args) {
    
    JFrame jFrame =new JFrame("Arithematic Calculator");
    JLabel userInputLabel1= new JLabel("Input 1");
    userInputLabel1.setBounds(50, 0, 100, 40);
    JLabel userInputLabel2= new JLabel("Input 2");
    userInputLabel2.setBounds(150, 0, 100, 40);
    JTextField userInputTextField1= new JTextField("");
    userInputTextField1.setBounds(50, 40, 100, 40);
    JTextField userInputTextField2= new JTextField("");
    userInputTextField2.setBounds(150, 40, 100, 40);
    
    JLabel userResultLabel= new JLabel(" ");
    userResultLabel.setBounds(50, 120, 200, 40);
    

    JButton divide= new JButton("/");
    divide.setBounds(50, 80, 50, 40);
    jFrame.add(divide);
    JButton mul= new JButton("*");
    mul.setBounds(100, 80, 50, 40);
    jFrame.add(mul);
    JButton add= new JButton("+");
    add.setBounds(150, 80, 50, 40);
    jFrame.add(add);
    JButton sub= new JButton("-");
    sub.setBounds(200, 80, 50, 40);
    jFrame.add(sub);
    



    jFrame.add(userInputTextField1);
    jFrame.add(userInputTextField2);
    jFrame.add(userResultLabel);
    jFrame.add(userInputLabel1);
    jFrame.add(userInputLabel2);


    add.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            float input1=Float.parseFloat(userInputTextField1.getText().toString());
            float input2=Float.parseFloat(userInputTextField2.getText().toString());
            float resultvalue=input1+input2;
            
            userResultLabel.setText(String.valueOf(resultvalue));
            
            
        }
    });
    sub.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            float input1=Float.parseFloat(userInputTextField1.getText().toString());
            float input2=Float.parseFloat(userInputTextField2.getText().toString());
            float resultvalue=input1-input2;
            
            userResultLabel.setText(String.valueOf(resultvalue));
            
            
        }
    });
    mul.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            float input1=Float.parseFloat(userInputTextField1.getText().toString());
            float input2=Float.parseFloat(userInputTextField2.getText().toString());
            float resultvalue=input1*input2;
            
            userResultLabel.setText(String.valueOf(resultvalue));
            
            
        }
    });
    divide.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            float input1=Float.parseFloat(userInputTextField1.getText().toString());
            float input2=Float.parseFloat(userInputTextField2.getText().toString());
            float resultvalue=input1/input2;
            
            userResultLabel.setText(String.valueOf(resultvalue));
            
            
        }
    });

    

    jFrame.setLayout(null);
    jFrame.setSize(600, 600);
    jFrame.setVisible(true);

}
}