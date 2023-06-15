package com.aston.tasks;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Aston test tasks");
        setSize(700, 300);
        setLocation(700, 200);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        JPanel inputsPanel = new JPanel();
        inputsPanel.setLayout(new BoxLayout(inputsPanel, BoxLayout.Y_AXIS));
        JPanel buttonOkPanel = new JPanel();
        buttonOkPanel.setLayout(new BoxLayout(buttonOkPanel, BoxLayout.Y_AXIS));
        JPanel outputsPanel = new JPanel();
        outputsPanel.setLayout(new BoxLayout(outputsPanel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Say Hello");
        JLabel label2 = new JLabel("Hi Viacheslav");
        JLabel label3 = new JLabel("Print array");
        JTextField task1 = new JTextField(10);
        JTextField task2 = new JTextField(10);
        JTextField task3 = new JTextField(10);

        JButton confirm = new JButton("OK");

        JTextField outputText1 = new JTextField(10);
        JTextField outputText2 = new JTextField(10);
        JTextField outputText3 = new JTextField(10);

        Font textfieldFont = task1.getFont().deriveFont(Font.PLAIN, 14f);

        task1.setFont(textfieldFont);
        task2.setFont(textfieldFont);
        task3.setFont(textfieldFont);

        outputText1.setFont(textfieldFont);
        outputText2.setFont(textfieldFont);
        outputText3.setFont(textfieldFont);

        inputsPanel.add(label1);
        inputsPanel.add(task1);
        inputsPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        inputsPanel.add(label2);
        inputsPanel.add(task2);
        inputsPanel.add(Box.createRigidArea(new Dimension(0, 40)));
        inputsPanel.add(label3);
        inputsPanel.add(task3);
        inputsPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        buttonOkPanel.add(confirm);

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
        setVisible(true);
    }
}
