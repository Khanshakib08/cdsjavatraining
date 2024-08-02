import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RailwayBookingSystem {
public static void main(String[] args) {
        String username="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/railwaybookingdb";
       try{ 
        Connection connnection=DriverManager.getConnection(url, username, password);
    System.out.println("DB connected");

    JFrame frame=new JFrame("Railway Booking System");

        JLabel personalLabel=new JLabel("Personal Details");
        personalLabel.setBounds(10, 10, 120, 30);
        frame.add(personalLabel);

        JLabel ticketLabel=new JLabel("Train Details");
        ticketLabel.setBounds(310, 10, 120, 30);
        frame.add(ticketLabel);

        JLabel usernameLabel=new JLabel("USERNAME:");
        usernameLabel.setBounds(10, 50, 120, 30);
        frame.add(usernameLabel);
        JTextField usernameField=new JTextField();
        usernameField.setBounds(130, 50, 120, 30);
        frame.add(usernameField);

        JLabel dojLabel=new JLabel("Date of Journey:");
        dojLabel.setBounds(310, 50, 120, 30);
        frame.add(dojLabel);
        JTextField dojField=new JTextField();
        dojField.setBounds(430, 50, 120, 30);
        frame.add(dojField);

        JLabel ageLabel=new JLabel("AGE:");
        ageLabel.setBounds(10, 80, 120, 30);
        frame.add(ageLabel);
        JTextField ageField=new JTextField();
        ageField.setBounds(130, 80, 120, 30);
        frame.add(ageField);

        JLabel sourceLabel=new JLabel("Source:");
        sourceLabel.setBounds(310, 80, 120, 30);
        frame.add(sourceLabel);
        JTextField sourceField=new JTextField();
        sourceField.setBounds(430, 80, 120, 30);
        frame.add(sourceField);

        JLabel genderLabel=new JLabel("GENDER:");
        genderLabel.setBounds(10, 110, 120, 30);
        frame.add(genderLabel);
        JTextField genderField=new JTextField();
        genderField.setBounds(130, 110, 120, 30);
        frame.add(genderField);

        JLabel destinationLabel=new JLabel("Destination:");
        destinationLabel.setBounds(310, 110, 120, 30);
        frame.add(destinationLabel);
        JTextField destinationField=new JTextField();
        destinationField.setBounds(430, 110, 120, 30);
        frame.add(destinationField);

        JLabel mobileLabel=new JLabel("MOBILE:");
        mobileLabel.setBounds(10, 140, 120, 30);
        frame.add(mobileLabel);
        JTextField mobileField=new JTextField();
        mobileField.setBounds(130, 140, 120, 30);
        frame.add(mobileField);

        JLabel ticketpriceLabel=new JLabel("Ticket Price:");
        ticketpriceLabel.setBounds(310, 140, 120, 30);
        frame.add(ticketpriceLabel);
        JTextField ticketpriceField=new JTextField();
        ticketpriceField.setBounds(430, 140, 120, 30);
        frame.add(ticketpriceField);

        JLabel emailLabel=new JLabel("EMAIL:");
        emailLabel.setBounds(10, 170, 120, 30);
        frame.add(emailLabel);
        JTextField emailField=new JTextField();
        emailField.setBounds(130, 170, 120, 30);
        frame.add(emailField);

        JLabel seatpreferenceLabel=new JLabel("Seat Preference:");
        seatpreferenceLabel.setBounds(310, 170, 120, 30);
        frame.add(seatpreferenceLabel);
        JTextField seatpreferenceField=new JTextField();
        seatpreferenceField.setBounds(430, 170, 120, 30);
        frame.add(seatpreferenceField);


        frame.setLayout(null);
        frame.setSize(600, 400); 
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);

    /*String updateQuery="update ticketbookingtb set username=? where bookingid=?";
    PreparedStatement ps=connnection.prepareStatement(updateQuery);
    ps.setString(1, "Hamza");
    ps.setInt(2, 2);
    ps.execute();
    System.out.println("updation is done");*/


   /*  String deleteQuery="delete from ticketbookingtb where bookingid=?";
    PreparedStatement ps=connnection.prepareStatement(deleteQuery);
    ps.setInt(1, 1);
    ps.execute();
    System.out.println("one record deleted");*/
       /* String insertQuery="INSERT INTO ticketbookingtb (username,age,gender,mobile,email,doj,source,destination,ticketprice,seatpreference) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=connnection.prepareStatement(insertQuery);
        ps.setString(1, "Shakib");
        ps.setInt(2, 21);
        ps.setString(3, "Male");
        ps.setString(4, "8299744037");
        ps.setString(5, "khanshakib4142@gmail.com");
        ps.setString(6, "26/08/2024");
        ps.setString(7, "Lucknow");
        ps.setString(8, "Delhi");
        ps.setString(9, "₹1099");
        ps.setString(10, "side lower");
        ps.execute();
        System.out.println("Your ticket is booked");*/
}
    catch(SQLException e){
        throw new RuntimeException(e+"not connected");
         
    }
    }
}

