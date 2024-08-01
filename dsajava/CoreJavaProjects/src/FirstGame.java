import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstGame {
    public static void main(String[] args) {
         JFrame jFrame =new JFrame("First Game");
         Random random = new Random();
        int inputFirst = random.nextInt(10000);
        int inputSecond= random.nextInt(10000);
        int timeleft=30;

         JLabel input1=new JLabel(String.valueOf(inputFirst));
         JLabel input2=new JLabel(String.valueOf(inputSecond));
         JLabel operator=new JLabel("+");
         JLabel score=new JLabel("SCORE:");
         JLabel scoreout=new JLabel("0");
         JTextField output=new JTextField();
         JButton next=new JButton("Next");
         JLabel gameover=new JLabel();
         JLabel empty=new JLabel();
         JLabel time=new JLabel("Time left: "+timeleft);

         input1.setBounds(20, 20, 60, 40);        
         operator.setBounds(90, 20, 60, 40);
         input2.setBounds(160, 20, 60, 40);
         
         output.setBounds(60, 70, 70, 40);
         next.setBounds(60, 120, 70, 40);
         score.setBounds(120, 170, 50, 40);
         time.setBounds(20, 170, 80, 40);
         scoreout.setBounds(170, 170, 50, 40);
         gameover.setBounds(120, 190, 100, 40);
         empty.setBounds(40, 150, 200, 40);

         jFrame.add(input1);
         jFrame.add(input2);
         jFrame.add(operator);
         jFrame.add(output);
         jFrame.add(next);
         jFrame.add(score);
         jFrame.add(gameover);
         jFrame.add(empty);
         jFrame.add(scoreout);
         jFrame.add(time);
         
         next.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e){
            if(output.getText().isEmpty())
            {
                empty.setText("Please enter the answer");
            }
            else{
            empty.setText("");
            int value1=Integer.parseInt(input1.getText().toString());
            int value2=Integer.parseInt(input2.getText().toString());
            int result=value1+value2;
            int outputcheck=Integer.parseInt(output.getText().toString());
            
            
           if(outputcheck == result )
            {
                
                Random random=new Random();
                int inputFirst=random.nextInt(10000);
                int inputSecond= random.nextInt(10000);
                int timeleft=30;
                input1.setText((String.valueOf(inputFirst)));
                input2.setText((String.valueOf(inputSecond)));
                output.setText("");
                //int scorecheck=(Integer.parseInt(scoreout.getText().toString()));
                scoreout.setText(String.valueOf(((Integer.parseInt(scoreout.getText().toString()))+1)));
                time.setText("Timeleft: "+String.valueOf(timeleft));
            }
            
            else{
                    gameover.setText("GAME OVER");
                    time.setText("");
            }

        }}
            
         });





         jFrame.setLayout(null);
         jFrame.setSize(600, 600);
         jFrame.setVisible(true);
    }

}
