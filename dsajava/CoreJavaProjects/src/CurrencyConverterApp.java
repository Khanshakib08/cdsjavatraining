import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CurrencyConverterApp {
public static void main(String[] args) {
     JFrame jFrame =new JFrame("Currency Calculator");
     JLabel inrLabel=new JLabel("Enter the INR amount:");
     
     JLabel usdLabel=new JLabel("Enter the USD amount:");

     JLabel resultLabel= new JLabel();

     JTextField inrField=new JTextField();
     JTextField usdField=new JTextField();

     JButton resultButton=new JButton("Currency Calculator");

     inrLabel.setBounds(20, 20, 150, 40);
     usdLabel.setBounds(20, 60, 150, 40);
     inrField.setBounds(170, 20, 60, 40);
     usdField.setBounds(170, 60, 60, 40);

    resultButton.setBounds(20, 110, 150, 40);
    resultLabel.setBounds(170, 110, 250, 40);

    jFrame.add(inrLabel);
    jFrame.add(usdLabel);
    jFrame.add(inrField);
    jFrame.add(usdField);
    jFrame.add(resultLabel);
    jFrame.add(resultButton);

    resultButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            if(!inrField.getText().isEmpty() && usdField.getText().isEmpty())
            {
                float inrvalue=Float.parseFloat(inrField.getText().toString());
                float inrtousd=(float) (inrvalue/83.73);
                resultLabel.setText(String.valueOf(inrtousd)+"USD");
            }
            else if(inrField.getText().isEmpty() && !usdField.getText().isEmpty())
            {
                float usdvalue=Float.parseFloat(usdField.getText().toString());
                float usdtoinr=(float)(usdvalue*83.73);
                resultLabel.setText(String.valueOf(usdtoinr)+"INR");
            }
            else if(inrField.getText().isEmpty() || usdField.getText().isEmpty())
            {
                resultLabel.setText("Please enter data in at least one field");
            }
            else{
            float inrvalue=Float.parseFloat(inrField.getText().toString());
            float usdvalue=Float.parseFloat(usdField.getText().toString());
            float inrtousd=(float) (inrvalue/83.73);
            float usdtoinr=(float)(usdvalue*83.73);
            resultLabel.setText(String.valueOf(inrtousd)+"USD      "+String.valueOf(usdtoinr)+"INR");
        }

        }
    });



    jFrame.setLayout(null);
    jFrame.setSize(600, 600);
    jFrame.setVisible(true);
}
}
