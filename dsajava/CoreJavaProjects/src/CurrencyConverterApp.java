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
            String rupees=inrField.getText();
            String dollar=usdField.getText();
            if(!rupees.isEmpty() && dollar.isEmpty())
            {   
                resultLabel.setText(String.valueOf(calculateINRtoUSD(rupees))+"USD");
            }
            else if(rupees.isEmpty() && !dollar.isEmpty())
            {
                resultLabel.setText(String.valueOf(calculateUSDtoINR(dollar))+"INR");
            }
            else if(rupees.isEmpty() || dollar.isEmpty())
            {
                resultLabel.setText("Please enter data in at least one field");
            }
            else{
            resultLabel.setText(String.valueOf(calculateINRtoUSD(rupees))+"USD      "+String.valueOf(calculateUSDtoINR(dollar))+"INR");
        }

        }

         private float  calculateINRtoUSD(String rupees) {
             float inrvalue=Float.parseFloat(rupees.toString());
             return (float) (inrvalue/83.73);
         }

         private float calculateUSDtoINR(String dollar) {
            float usdvalue=Float.parseFloat(dollar.toString());
            return (float)(usdvalue*83.73);
             
         }
    });



    jFrame.setLayout(null);
    jFrame.setSize(600, 600);
    jFrame.setVisible(true);
}
}
