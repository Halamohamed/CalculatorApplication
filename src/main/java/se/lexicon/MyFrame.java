package se.lexicon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JTextField number1, number2, result;
    JButton addition, substraction, multiplication, division;
    JLabel label1, label2, label3;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setTitle("GUI Calculator");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        label1 = new JLabel("First number");
        label1.setBounds(25,50,150,40);
        label1.setFont(new Font("Consolas",Font.BOLD,20));
        label1.setForeground(Color.blue);

        label2 = new JLabel("Second number");
        label2.setBounds(25,100,150,40);
        label2.setFont(new Font("Consolas",Font.BOLD,20));
        label2.setForeground(Color.blue);

        label3 = new JLabel("Result");
        label3.setBounds(25,150,150,40);
        label3.setFont(new Font("Consolas",Font.BOLD,20));
        label3.setForeground(Color.blue);

        number1 = new JTextField();
        number1.setBounds(200,50,300,40);

        number2 = new JTextField();
        number2.setBounds(200,100,300,40);

        result = new JTextField();
        result.setBounds(200,150,300,40);

        addition = new JButton("+");
        addition.setBounds(200,220,60,40);
        addition.setFont(new Font("Consolas",Font.BOLD,20));

        substraction = new JButton("-");
        substraction.setBounds(280,220,60,40);
        substraction.setFont(new Font("Consolas",Font.BOLD,20));

        multiplication = new JButton("*");
        multiplication.setBounds(360,220,60,40);
        multiplication.setFont(new Font("Consolas",Font.BOLD,20));

        division = new JButton("/");
        division.setBounds(440,220,60,40);
        division.setFont(new Font("Consolas",Font.BOLD,20));

        addition.addActionListener(this);
        substraction.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);


        this.add(label1);

        this.add(label2);
        this.add(label3);

        this.add(number1);
        this.add(number2);
        this.add(result);

        this.add(addition);
        this.add(substraction);
        this.add(multiplication);
        this.add(division);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String num1 = number1.getText();
        String num2 = number2.getText();

        double value1 = Double.parseDouble(num1);
        double value2 = Double.parseDouble(num2);

        double resultValue = 0;

        if (e.getSource()== addition){
            resultValue = value1 + value2;
        } else if (e.getSource() == substraction) {
            resultValue = value1 - value2;
        } else if (e.getSource() == multiplication) {
            resultValue = value1 * value2;
        } else if (e.getSource() == division) {
            resultValue = value1 / value2;
        }

        String res = String.valueOf(resultValue);
        result.setText(res);

    }
}
