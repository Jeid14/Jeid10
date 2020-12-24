package com.company.view;

import com.company.listener.ButtonClickListener;
import com.company.logikMath.Calculations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator {
    public Calculator(){
        JFrame frame= new JFrame("CALCULATOR");
        JTextField chisloA = new JTextField(10);
        JLabel label1 = new JLabel("Чисто 1");
        JLabel label2 = new JLabel("Операция");
        JLabel label3 = new JLabel("Число 2");
        JLabel label4 = new JLabel("Результат");
        JTextField comand = new JTextField(10);
        JTextField chisloB = new JTextField(10);
        JTextField res = new JTextField(20);
        JButton button = new JButton("Посчитать");

        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.pink);
        frame.setSize(400,500);

        frame.add(chisloA);
        chisloA.setBounds(150, 50, 190, 40);

        frame.add(label1);
        label1.setBounds(45, 50, 100, 40);

        frame.add(comand);
        comand.setBounds(150, 110, 190, 40);

        frame.add(label2);

        frame.add(label3);
        label2.setBounds(45, 110, 100, 40);

        frame.add(chisloB);
        chisloB.setBounds(150, 170, 190, 40);

        label3.setBounds(45, 170, 100, 40);
        frame.add(button);
        button.setBounds(45, 230, 295, 40);
        frame.add(label4);

        label4.setBounds(45, 290, 100, 40);
        frame.add(res);

        res.setBounds(150, 290, 190, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        ActionListener actionListener = new ButtonClickListener(chisloA,chisloB,comand,res,new Calculations());
        button.addActionListener(actionListener);
    }
}
