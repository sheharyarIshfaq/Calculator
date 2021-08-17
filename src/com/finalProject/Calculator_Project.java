package com.finalProject;

import javax.swing.*;
import java.awt.*;

public class Calculator_Project {

    //some Variables for performing the Arithmetic Operations
    double num, answer;
    int calculation;

    //Declaring and Assigning values to some variables that will be used throughout the program
    int Frame_Width = 410;
    int Frame_Height = 610;
    int Button_Width = 80;
    int Button_Height = 70;

    //Initializing the GUI Components such as JFrame, Label, Buttons, text Field, etc
    JFrame frame;
    JTextField textField;
    JLabel label;
    //buttons are declared according to their position in the Calculator
    JButton btnC, btnBack, btnPow, btnDivide, btn7, btn8, btn9, btnMultiply, btn4,
            btn5, btn6, btnSubtract, btn1, btn2, btn3, btnAdd, btnPoint, btn0, btnEqual;
    JRadioButton btnON, btnOFF;
    ButtonGroup radioBtns;
    ImageIcon logo;

    //Constructor
    Calculator_Project()
    {

        logo = new ImageIcon("calculator.png");

        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setIconImage(logo.getImage());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(Frame_Width,Frame_Height);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); //Open the program window in the center of the screen

        //Fonts for Buttons
        Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);

        btnON = new JRadioButton("ON");
        btnON.setBounds(20,20,60,30);
        btnON.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
        btnON.setFocusable(false);
        btnON.setEnabled(false);
        frame.add(btnON);

        btnOFF = new JRadioButton("OFF");
        btnOFF.setBounds(100,20,60,30);
        btnOFF.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
        btnOFF.setFocusable(false);
        frame.add(btnOFF);

        //Button group to attach the two radio buttons to collectively work
        radioBtns = new ButtonGroup();
        radioBtns.add(btnOFF);
        radioBtns.add(btnON);

        label = new JLabel("");
        label.setBounds(180,20,180,30);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN,18));
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(label);

        textField = new JTextField("");
        textField.setBounds(20,60,350,70);
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setFont(new Font("Comic Sans MS", Font.PLAIN,33));
        frame.add(textField);

        //Adding the buttons to the frame and setting their properties

        btnC = new JButton("C");
        btnC.setBounds(20,160, Button_Width, Button_Height);
        btnC.setFocusable(false);
        btnC.setFont(btnFont);
        btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnC);

        btnBack = new JButton("<-");
        btnBack.setBounds(110,160, Button_Width, Button_Height);
        btnBack.setFocusable(false);
        btnBack.setFont(btnFont);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnBack);

        btnPow = new JButton("^");
        btnPow.setBounds(200,160, Button_Width, Button_Height);
        btnPow.setFocusable(false);
        btnPow.setFont(btnFont);
        btnPow.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnPow);

        btnDivide = new JButton("/");
        btnDivide.setBounds(290,160, Button_Width, Button_Height);
        btnDivide.setFocusable(false);
        btnDivide.setFont(btnFont);
        btnDivide.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnDivide);

        btn7 = new JButton("7");
        btn7.setBounds(20,240, Button_Width, Button_Height);
        btn7.setFocusable(false);
        btn7.setFont(btnFont);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(110,240, Button_Width, Button_Height);
        btn8.setFocusable(false);
        btn8.setFont(btnFont);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(200,240, Button_Width, Button_Height);
        btn9.setFocusable(false);
        btn9.setFont(btnFont);
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn9);

        btnMultiply = new JButton("*");
        btnMultiply.setBounds(290,240, Button_Width, Button_Height);
        btnMultiply.setFocusable(false);
        btnMultiply.setFont(btnFont);
        btnMultiply.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnMultiply);

        btn4 = new JButton("4");
        btn4.setBounds(20,320, Button_Width, Button_Height);
        btn4.setFocusable(false);
        btn4.setFont(btnFont);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(110,320, Button_Width, Button_Height);
        btn5.setFocusable(false);
        btn5.setFont(btnFont);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(200,320, Button_Width, Button_Height);
        btn6.setFocusable(false);
        btn6.setFont(btnFont);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn6);

        btnSubtract = new JButton("-");
        btnSubtract.setBounds(290,320, Button_Width, Button_Height);
        btnSubtract.setFocusable(false);
        btnSubtract.setFont(btnFont);
        btnSubtract.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnSubtract);

        btn1 = new JButton("1");
        btn1.setBounds(20,400, Button_Width, Button_Height);
        btn1.setFocusable(false);
        btn1.setFont(btnFont);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(110,400, Button_Width, Button_Height);
        btn2.setFocusable(false);
        btn2.setFont(btnFont);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(200,400, Button_Width, Button_Height);
        btn3.setFocusable(false);
        btn3.setFont(btnFont);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn3);

        btnAdd = new JButton("+");
        btnAdd.setBounds(290,400, Button_Width, Button_Height);
        btnAdd.setFocusable(false);
        btnAdd.setFont(btnFont);
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnAdd);

        btnPoint = new JButton(".");
        btnPoint.setBounds(20,480, Button_Width, Button_Height);
        btnPoint.setFocusable(false);
        btnPoint.setFont(btnFont);
        btnPoint.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnPoint);

        btn0 = new JButton("0");
        btn0.setBounds(110,480, Button_Width, Button_Height);
        btn0.setFocusable(false);
        btn0.setFont(btnFont);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btn0);

        btnEqual = new JButton("=");
        btnEqual.setBounds(200,480, 2 * Button_Width + 10, Button_Height);  //multiplied button width by 2 and added 10 because we want it double of other buttons
        btnEqual.setFocusable(false);
        btnEqual.setFont(btnFont);
        btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(btnEqual);


        //Adding Action Listeners to the Buttons to perform different actions when a button is clicked

        btn1.addActionListener(e->{
            textField.setText(textField.getText() + "1");
        });
        btn2.addActionListener(e->
        {
            textField.setText(textField.getText() + "2");
        });
        btn3.addActionListener(e->
        {
            textField.setText(textField.getText() + "3");
        });
        btn4.addActionListener(e->
        {
            textField.setText(textField.getText() + "4");
        });
        btn5.addActionListener(e->
        {
            textField.setText(textField.getText() + "5");
        });
        btn6.addActionListener(e->
        {
            textField.setText(textField.getText() + "6");
        });
        btn7.addActionListener(e->
        {
            textField.setText(textField.getText() + "7");
        });
        btn8.addActionListener(e->
        {
            textField.setText(textField.getText() + "8");
        });
        btn9.addActionListener(e->
        {
            textField.setText(textField.getText() + "9");
        });
        btn0.addActionListener(e->
        {
            textField.setText(textField.getText() + "0");
        });
        btnPoint.addActionListener(e->
        {
            textField.setText(textField.getText() + ".");
        });
        btnAdd.addActionListener(e->
        {
            arithmetic_operation(); //we are calling the arithmetic method and it will perform the calculation when the arithmetic operator is pressed
            label.setText(Double.toString(answer));
            num = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(num + " + ");
        });
        btnSubtract.addActionListener(e->
        {
            arithmetic_operation(); //we are calling the arithmetic method and it will perform the calculation when the arithmetic operator is pressed
            num = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(num + " - ");
        });
        btnMultiply.addActionListener(e->
        {
            arithmetic_operation(); //we are calling the arithmetic method and it will perform the calculation when the arithmetic operator is pressed
            num = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(num + " * ");
        });
        btnDivide.addActionListener(e->
        {
            arithmetic_operation(); //we are calling the arithmetic method and it will perform the calculation when the arithmetic operator is pressed
            num = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(num + " / ");
        });
        btnPow.addActionListener(e->{
            arithmetic_operation(); //we are calling the arithmetic method and it will perform the calculation when the arithmetic operator is pressed
            num = Double.parseDouble(textField.getText());
            calculation = 5;
            textField.setText("");
            label.setText(num + " ^ ");
        });
        btnC.addActionListener(e->{
            textField.setText("");
            label.setText("");
            answer=0;
            num=0;
            calculation=0;
        });

        btnEqual.addActionListener(e->{
            arithmetic_operation(); //calling the arithmetic_operation  method to perform the calculations when user press equals button
            label.setText(""); //clearing the label when the operation is performed
            answer=0;
            num=0;
            calculation=0;
        });

        //adding action listener on Backspace button to delete the number
        btnBack.addActionListener(e->
        {
            int length = textField.getText().length();
            int toDelete = length -1; //we will use this toDelete variable to Delete the last number in the text Filed
            String newText; //new Text will be stored in this after deleting the the last number
            if(length>0)
            {
                StringBuilder backSpace = new StringBuilder(textField.getText());
                backSpace.deleteCharAt(toDelete); // deletes the last number
                newText = backSpace.toString(); //stores the number in the newText variable after converting from stringBuilder into String
                textField.setText(newText); //displaying the newText in the Text Field after deleting the last number
            }
        });

        //adding action listeners to the radio buttons
        btnOFF.addActionListener(e->
        {
            //calling the disable() method that will disable every component
            disable();
        });

        btnON.addActionListener(e->
        {
            //calling the enable() method that will enable every component
            enable();
        });


        frame.setVisible(true);
    }

    //some method to perform the tasks


    public void arithmetic_operation()
    {
        switch (calculation)
        {
            case 1: //For Addition
            {
                answer = num + Double.parseDouble(textField.getText());  //parse will convert the string to Double and perform the calculation on it
                textField.setText(Double.toString(answer)); //now we will convert the number again to string to display it in the text field
                break;
            }
            case 2: //For Subtraction
            {
                answer = num - Double.parseDouble(textField.getText());  //parse will convert the string to Double and perform the calculation on it
                textField.setText(Double.toString(answer)); //now we will convert the number again to string to display it in the text field
                break;
            }
            case 3: //For Multiplication
            {
                answer = num * Double.parseDouble(textField.getText());  //parse will convert the string to Double and perform the calculation on it
                textField.setText(Double.toString(answer)); //now we will convert the number again to string to display it in the text field
                break;
            }
            case 4: //For Division
            {
                answer = num / Double.parseDouble(textField.getText());  //parse will convert the string to Double and perform the calculation on it
                textField.setText(Double.toString(answer)); //now we will convert the number again to string to display it in the text field
                break;
            }
            case 5: //Calculating Power
            {
                answer = Math.pow(num, Double.parseDouble(textField.getText()));  //parse will convert the string to Double and perform the calculation on it
                textField.setText(Double.toString(answer)); //now we will convert the number again to string to display it in the text field
                break;
            }
        }
    }


    public void disable() //Disabling the entire components including text filed buttons
    {

        btnON.setEnabled(true); //enabling the on button
        btnOFF.setEnabled(false); //disabling the Off button

        textField.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn0.setEnabled(false);
        btnPoint.setEnabled(false);
        btnSubtract.setEnabled(false);
        btnAdd.setEnabled(false);
        btnMultiply.setEnabled(false);
        btnDivide.setEnabled(false);
        btnEqual.setEnabled(false);
        btnPow.setEnabled(false);
        btnBack.setEnabled(false);
        btnC.setEnabled(false);

    }
    public void enable() //Enabling the entire components including text filed buttons
    {

        btnON.setEnabled(false); //disabling the on button
        btnOFF.setEnabled(true); //enabling the Off button

        textField.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn0.setEnabled(true);
        btnPoint.setEnabled(true);
        btnSubtract.setEnabled(true);
        btnAdd.setEnabled(true);
        btnMultiply.setEnabled(true);
        btnDivide.setEnabled(true);
        btnEqual.setEnabled(true);
        btnPow.setEnabled(true);
        btnBack.setEnabled(true);
        btnC.setEnabled(true);

    }
    public static void main(String[] args) {
        Calculator_Project calculator = new Calculator_Project();
    }


}
