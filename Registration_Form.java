package abc;

import javax.swing.*;

public class Registration_Form {
    public static void main(String[] args) {

            JFrame j1 = new JFrame("Registration Form");
            JLabel l1 = new JLabel("Name: ");
            l1.setBounds(20, 20, 50, 20);
            JTextField t1 = new JTextField();
            t1.setBounds(100, 20, 70, 20);
            JLabel l2 = new JLabel("Gmail: ");
            l2.setBounds(20, 45, 70, 20);
            JTextField t2 = new JTextField();
            t2.setBounds(100, 45, 90, 20);
            JLabel l3 = new JLabel("Mobile No: ");
            l3.setBounds(20, 75, 100, 20);
            JTextField t3 = new JTextField();
            t3.setBounds(100, 75, 110, 20);
            JLabel l4 = new JLabel("Gender: ");
            l4.setBounds(20, 100, 120, 20);
            JTextField t4 = new JTextField();
            t4.setBounds(100, 100, 120, 20);
            JLabel l5 = new JLabel("Address: ");
            l5.setBounds(20, 130, 90, 20);
            JTextField t5 = new JTextField();
            t5.setBounds(100, 130, 130, 20);
            JCheckBox c1 = new JCheckBox("I Agree");
            c1.setBounds(20, 190, 150, 20);
            JButton jb1 = new JButton("Submit");
            jb1.setBounds(120, 250, 90, 20);
            JButton jb2 = new JButton("Reset");
            jb2.setBounds(120, 280, 90, 20);
            j1.add(l1);
            j1.add(t1);
            j1.add(l2);
            j1.add(t2);
            j1.add(l3);
            j1.add(t3);
            j1.add(l4);
            j1.add(t4);
            j1.add(l5);
            j1.add(t5);
            j1.add(c1);
            j1.add(jb1);
            j1.add(jb2);
            j1.setLayout(null);
            j1.setSize(400, 600);
            j1.setVisible(true);

    }
}

