package com.aston.tasks.gui;

import com.aston.tasks.Task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MainWindow extends JFrame implements ActionListener {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JTextField task1;
    private final JTextField task2;
    private final JTextField task3;
    private final JTextField outputText1;
    private final JTextField outputText2;
    private final JTextField outputText3;
    private final JButton confirm;

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

        label1 = new JLabel("Say Hello");
        label2 = new JLabel("Hi Viacheslav");
        label3 = new JLabel("Print array");
        task1 = new JTextField(10);
        task2 = new JTextField(10);
        task3 = new JTextField(10);

        confirm = new JButton("OK");
        confirm.addActionListener(this);

        outputText1 = new JTextField(10);
        outputText2 = new JTextField(10);
        outputText3 = new JTextField(10);

        Font textfieldFont = task1.getFont().deriveFont(Font.PLAIN, 14f);

        task1.setFont(textfieldFont);
        task2.setFont(textfieldFont);
        task3.setFont(textfieldFont);

        outputText1.setFont(textfieldFont);
        outputText2.setFont(textfieldFont);
        outputText3.setFont(textfieldFont);
        outputText1.setEditable(false);
        outputText2.setEditable(false);
        outputText3.setEditable(false);

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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int number = Integer.parseInt(task1.getText());
        if(number > 7) outputText1.setText("Привет!");

        outputText2.setText(task2.getText().equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");

        int[] array = Task3.getArray(task3.getText().split(" "));
        StringBuilder sb = new StringBuilder();
        Arrays.stream(array).forEach(x-> {
            if (x % 3 == 0) {
                sb.append(x);
                sb.append(" ");
            }
        });
        outputText3.setText(sb.toString());
    }
}
