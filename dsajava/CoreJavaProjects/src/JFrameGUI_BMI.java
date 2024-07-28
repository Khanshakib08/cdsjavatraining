
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameGUI_BMI {
public static void main(String[] args) {
    System.out.println("Jframe is used to build GUI Java application.");
    JFrame jFrame =new JFrame("BMI Calculator");
    JLabel userWeightLabel= new JLabel("Enter your weight in kg: ");
    userWeightLabel.setBounds(40, 40, 200, 40);

    JTextField userWeightTextField= new JTextField("0");
    userWeightTextField.setBounds(250, 40, 60, 40);

    JLabel userHeightLabel= new JLabel("Enter your height in meter: ");
    userHeightLabel.setBounds(40, 80, 200, 40);

    JTextField userHeightTextField=new JTextField();
    userHeightTextField.setBounds(250, 80, 60, 40);

    JLabel userResultLabel= new JLabel("");
    userResultLabel.setBounds(200, 160, 200, 50);

    JButton calculateBMI= new JButton("Calculate BMI");
    calculateBMI.setBounds(200, 120, 150, 50);
    jFrame.add(calculateBMI);

    jFrame.add(userWeightLabel);
    jFrame.add(userWeightTextField);

    
    jFrame.add(userHeightLabel);
    jFrame.add(userHeightTextField);

    jFrame.add(userResultLabel);

    jFrame.add(calculateBMI);
    calculateBMI.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
               float weight=Float.parseFloat(userWeightTextField.getText().toString());
             float height=Float.parseFloat(userHeightTextField.getText().toString());
             float bmivalue=weight/(height*height);
            calculateBMI.setText(String.valueOf(bmivalue));

            
            if(bmivalue<18.5)
        {
            userResultLabel.setText("You are underweight.");
        }
            else if(bmivalue<25)
        {
            userResultLabel.setText("You are normal.");
        }
            else if(bmivalue<30)
        {
            userResultLabel.setText("You are overweight.");
        }
            else
        {
            userResultLabel.setText("You are obese.");
        }
        

        }
    });
    // calculateBMI.addActionListener(new ActionListener() { 
    //     public void actionPerformance(ActionEvent e){
    //         float weight=Float.parseFloat(userWeightTextField.getText().toString());
    //         float height=Float.parseFloat(userHeightTextField.getText().toString());
    //         float bmivalue=weight/(height*height);
    //         calculateBMI.setText(String.valueOf(bmivalue));
    //     }
        
    // });


    jFrame.setLayout(null);
    jFrame.setSize(400, 300);
    jFrame.setVisible(true);
}
}
