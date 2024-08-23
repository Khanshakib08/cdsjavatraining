import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static JLabel taskNamelb, taskDatelb, taskTimelb;
    static JTextField taskNametf,taskDatetf,taskTimetf;
    static JButton addTaskbt, deleteTaskbt, updateTaskbt,viewTaskbt;
    static MongoDatabase todoDB;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    var client= MongoClients.create("mongodb://localhost:27017/");

    var todoDB=client.getDatabase("todoApp");

   // todoDB.createCollection("todolist");

   // var todoCollection=todoDB.getCollection("todoList");

   /* var document =new Document();

    document.append("taskName","Work on MongoDB");
    document.append("taskDate","13 Aug 2024");
    document.append("taskTime","20 hrs");
    document.append("taskStatus",false);

    todoCollection.insertOne(document);*/

    // create GUI
        createToDoUI();
    }

    private static void createToDoUI() {
        JFrame frame=new JFrame("ToDo App");



        taskNamelb=new JLabel("Enter the task name:");
        taskDatelb=new JLabel("Enter the task date:");
        taskTimelb=new JLabel("Enter the task time:");

        taskNametf=new JTextField("");
        taskDatetf=new JTextField("");
        taskTimetf=new JTextField("");

        addTaskbt=new JButton("ADD Task");
        deleteTaskbt=new JButton("DELETE");
        updateTaskbt=new JButton("UPDATE");
        viewTaskbt=new JButton("VIEW");
        taskNamelb.setBounds(50,50,150,40);
        taskDatelb.setBounds(50,100,150,40);
        taskTimelb.setBounds(50,150,150,40);
        taskNametf.setBounds(200,50,150,40);
        taskDatetf.setBounds(200,100,150,40);
        taskTimetf.setBounds(200,150,150,40);
        addTaskbt.setBounds(50,200,100,40);
        deleteTaskbt.setBounds(160,200,100,40);
        updateTaskbt.setBounds(50,250,100,40);
        viewTaskbt.setBounds(160,250,100,40);
        frame.add(taskNamelb);
        frame.add(taskNametf);
        frame.add(taskDatelb);
        frame.add(taskDatetf);
        frame.add(taskTimelb);
        frame.add(taskTimetf);
        frame.add(addTaskbt);
        frame.add(deleteTaskbt);
        frame.add(updateTaskbt);
        frame.add(viewTaskbt);

        frame.setLayout(null);
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        addTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertTaskIntoDB();
            }


        });
        updateTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatetask();
            }
        });

        deleteTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletetask();
            }
        });

        viewTaskbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtask();
            }
        });
    }

    private static void viewtask() {
        var todoCollection=todoDB.getCollection("todoList");
        String taskId=JOptionPane.showInputDialog(null,"Enter the taskID you want to view");
        BasicDBObject whereQuery=new BasicDBObject();
        whereQuery.put("taskID",Integer.parseInt(taskId));
        FindIterable<Document> cursor=todoCollection.find(whereQuery);
        taskNametf.setText(String.valueOf(cursor.iterator().next().get("taskName")));
        taskDatetf.setText(String.valueOf(cursor.iterator().next().get("taskDate")));
        taskTimetf.setText(String.valueOf(cursor.iterator().next().get("taskTime")));
    }

    private static void deletetask() {
        var todoCollection=todoDB.getCollection("todoList");
        String deletetaskId=JOptionPane.showInputDialog(null,"Enter the ID you want to delete");
        todoCollection.deleteOne(new Document("taskID",Integer.parseInt(deletetaskId)));
    }

    private static void updatetask() {
        var todoCollection=todoDB.getCollection("todoList");
        String taskID=JOptionPane.showInputDialog(null,"Enter the ID you want to update");
        todoCollection.updateOne( new Document("taskID",Integer.parseInt(taskID)),new Document("$set",new Document("taskStatus",true)));
    }

    private static void insertTaskIntoDB() {
        var todoCollection=todoDB.getCollection("todoList");
        var random=new Random();
         var document =new Document();

    document.append("taskName",taskNametf.getText());
    document.append("taskDate",taskDatetf.getText());
    document.append("taskTime",taskTimetf.getText());
    document.append("taskStatus",false);
    document.append("taskID",random.nextInt(999));

    todoCollection.insertOne(document);

    JOptionPane.showMessageDialog(null,"Task Added Successfully");
    clearForm();

    }

    private static void clearForm() {
        taskNametf.setText("");
        taskDatetf.setText("");
        taskTimetf.setText("");
    }
}