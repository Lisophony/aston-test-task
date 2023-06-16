package com.aston.tasks.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JTextField input1;
    private final JTextField input2;
    private final JTextField input3;
    private final JTextField outputText1;
    private final JTextField outputText2;
    private final JTextField outputText3;
    private final JButton okButton;

    public MainWindow() {
        super("Aston test tasks");
        setSize(800, 360);
        setLocation(700, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        JPanel inputsPanel = new JPanel();
        inputsPanel.setLayout(new BoxLayout(inputsPanel, BoxLayout.Y_AXIS));
        JPanel buttonOkPanel = new JPanel();
        buttonOkPanel.setLayout(new BoxLayout(buttonOkPanel, BoxLayout.Y_AXIS));
        JPanel outputsPanel = new JPanel();
        outputsPanel.setLayout(new BoxLayout(outputsPanel, BoxLayout.Y_AXIS));

        label1 = new JLabel("Привет!");
        label2 = new JLabel("Привет, Вячеслав");
        label3 = new JLabel("Массив из значений кратных 3");
        input1 = new JTextField(10);
        input2 = new JTextField(10);
        input3 = new JTextField(10);

        okButton = new JButton("OK");
        okButton.addActionListener(this);

        outputText1 = new JTextField(10);
        outputText2 = new JTextField(10);
        outputText3 = new JTextField(10);

        Font textfieldFont = input1.getFont().deriveFont(Font.PLAIN, 14f);

        input1.setFont(textfieldFont);
        input2.setFont(textfieldFont);
        input3.setFont(textfieldFont);

        outputText1.setFont(textfieldFont);
        outputText2.setFont(textfieldFont);
        outputText3.setFont(textfieldFont);
        outputText1.setEditable(false);
        outputText2.setEditable(false);
        outputText3.setEditable(false);

        inputsPanel.add(label1);
        inputsPanel.add(input1);
        inputsPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        inputsPanel.add(label2);
        inputsPanel.add(input2);
        inputsPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        inputsPanel.add(label3);
        inputsPanel.add(input3);
        inputsPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        buttonOkPanel.add(okButton);

        outputsPanel.add(Box.createRigidArea(new Dimension(0, 16)));
        outputsPanel.add(outputText1);
        outputsPanel.add(Box.createRigidArea(new Dimension(0, 54)));
        outputsPanel.add(outputText2);
        outputsPanel.add(Box.createRigidArea(new Dimension(0, 54)));
        outputsPanel.add(outputText3);
        outputsPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        mainPanel.add(Box.createRigidArea(new Dimension(40, 0)));
        mainPanel.add(inputsPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(40, 0)));
        mainPanel.add(buttonOkPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(40, 0)));
        mainPanel.add(outputsPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(40, 0)));
        getContentPane().add(mainPanel);
        this.getRootPane().setDefaultButton(okButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        outputText1.setText(TasksActions.sayHello(input1.getText()));
        outputText2.setText(TasksActions.helloViacheslav(input2.getText()));
        outputText3.setText(TasksActions.getArrayDivisibleBy3(input3.getText()));
    }
}
