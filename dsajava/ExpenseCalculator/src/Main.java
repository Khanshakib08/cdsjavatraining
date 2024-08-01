import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Expense Calculator");
        Connection connection =null;
        
        JLabel expenseLabel=new JLabel("Expenses");
        expenseLabel.setBounds(190,20,120,50);
        expenseLabel.setForeground(Color.red);
        expenseLabel.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        frame.add(expenseLabel);
        JLabel expenseType=new JLabel("Expense Type: ");
        expenseType.setBounds(20,60,120,50);      
        frame.add(expenseType);

        JTextField expenseTypeField=new JTextField();
        expenseTypeField.setBounds(140,70,120,30);
        frame.add(expenseTypeField);

        JLabel expenseAmountLabel=new JLabel("Expense Amount: ");
        expenseAmountLabel.setBounds(20,100,120,50);
        frame.add(expenseAmountLabel);
        
        JTextField expenseAmountField=new JTextField();
        expenseAmountField.setBounds(140,110,120,30);
        frame.add(expenseAmountField);

        JLabel incomeLabel=new JLabel("Income");
        incomeLabel.setBounds(190,150,120,50);
        incomeLabel.setForeground(Color.green);
        incomeLabel.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20)); //"ARIAL",Font.PLAIN,20
        frame.add(incomeLabel);

        JLabel incomeAmountLabel=new JLabel("Income");
        incomeAmountLabel.setBounds(20,200,120,50);     
        frame.add(incomeAmountLabel);
        JTextField incomeAmountField=new JTextField();
        incomeAmountField.setBounds(140,210,120,30);
        frame.add(incomeAmountField);

        JButton add=new JButton("ADD");
        add.setBounds(20, 270,115,40);
        add.setBackground(Color.GREEN);
        frame.add(add);

        JButton view=new JButton("VIEW");
        view.setBounds(145, 270,115,40);
        frame.add(view);

        String url="jdbc:mysql://localhost:3306/expensecalculator";
            String username="root";
            String password="";
            try {
                connection =DriverManager.getConnection(url, username, password);
                System.out.println("DB Connected");
            } 
            catch (SQLException e) {
                throw new RuntimeException(e+"not connected");
            }
            Connection conn=connection;
        add.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
            String expenseType=expenseTypeField.getText();
            int expenseAmount=expenseAmountField.getText().isEmpty()? 0:Integer.valueOf(expenseAmountField.getText());
        if(!expenseType.isEmpty() && expenseAmount!=0)
        {
            //insert the record for my sql
            String insertData="INSERT INTO expensesTB (expense_type,expense_amount,income) VALUES(?,?,?)";
           try {
            PreparedStatement statement=conn.prepareStatement(insertData);
            statement.setString(1, expenseType);
            statement.setInt(2, expenseAmount);
            statement.setInt(3, Integer.parseInt(incomeAmountField.getText()));
            statement.execute();

               
           } catch (SQLException ex) {
            throw new RuntimeException(ex);
           } //PreparedStatement statement=connection.prepareStatement(insertData);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "The value can't be 0 or empty");
            //System.out.println("Form Can't be Empty");
        }
        
        }
        });


        frame.setLayout(null);
        frame.setSize(500, 400); 
        frame.setVisible(true);


    }

}
