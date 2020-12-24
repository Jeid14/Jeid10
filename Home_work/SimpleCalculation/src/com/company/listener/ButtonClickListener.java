package com.company.listener;

import com.company.constants.Constants;
import com.company.logikMath.Calculations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {

    private final JTextField chisloA;
    private final JTextField chisloB;
    private final JTextField command;
    private final JTextField res;
    private final Calculations calculations;

    public ButtonClickListener(JTextField chisloA,JTextField chisloB,JTextField command,JTextField res,Calculations calculations) {
        this.chisloA = chisloA;
        this.chisloB = chisloB;
        this.res = res;
        this.command = command;
        this.calculations = calculations;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(chisloA.getText());
        double b = Double.parseDouble(chisloB.getText());
        double answer;
        try {
            if (command.getText().equals("*")) {
                answer = calculations.multiplication(a, b);
            } else if (command.getText().equals("/")) {
                answer = calculations.division(a, b);
            } else if (command.getText().equals("+")) {
                answer = calculations.addition(a, b);
            } else if (command.getText().equals("-")) {
                answer = calculations.subtraction(a, b);
            } else if (command.getText().equals("%")) {
                answer = calculations.remainder(a, b);
            } else {
               res.setText(Constants.ERROR_TEXT);
                return;
            }
        }
        catch (ArithmeticException ex){
            res.setText(ex.getMessage());
            return;
        }
        String result = answer % 1 == 0 ? String.valueOf((int) answer) : String.valueOf(answer);
        res.setText(result);

    }
}
