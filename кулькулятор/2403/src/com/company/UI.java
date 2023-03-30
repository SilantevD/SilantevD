package com.company;

import javax.swing.*;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class UI implements ActionListener {
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0, delenie, plus, umnoj, minus, tochka, equal, delete, clear, historyButton, stepen, delenieost, log, save, skobop,skobcl;
    private final History.CalculationHistory history;
    ArrayList<String> cload = new ArrayList<>();

    Calculator calc = new Calculator();

    UI(){
        history = new History.CalculationHistory();
        f = new JFrame("Калькулятор");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        historyButton = new JButton("History");
        delenie = new JButton("/");
        umnoj = new JButton("*");
        minus = new JButton("-");
        plus = new JButton("+");
        tochka = new JButton(".");
        equal = new JButton("=");
        delete = new JButton("Стереть");
        clear = new JButton("Очистить");
        save = new JButton("Сохранить");
        stepen = new JButton("^");
        delenieost = new JButton("%");
        skobop = new JButton("(");
        skobcl = new JButton(")");
        log = new JButton("L");
        t.setBounds(30, 40, 350, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        delenie.setBounds(250, 100, 50, 40);
        stepen.setBounds(320,100,50,40);
        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        umnoj.setBounds(250, 170, 50, 40);
        log.setBounds(320, 170, 50, 40);
        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        minus.setBounds(250, 240, 50, 40);
        delenieost.setBounds(320,240,50,40);
        tochka.setBounds(40, 310, 50, 40);
        b0.setBounds(110, 310, 50, 40);
        equal.setBounds(180, 310, 50, 40);
        plus.setBounds(250, 310, 50, 40);
        delete.setBounds(60, 360, 100, 40);
        clear.setBounds(180, 360, 100, 40);
        historyButton.setBounds(60, 410, 100, 40);
        save.setBounds(180,410,50,40);
        skobcl.setBounds(370,310,50,40);
        skobop.setBounds(320,310,50,40);
        save.setSize(100, 40);
        f.add(t);
        f.add(stepen);
        f.add(log);
        f.add(skobcl);
        f.add(skobop);
        f.add(save);
        f.add(delenieost);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(delenie);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(umnoj);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(minus);
        f.add(tochka);
        f.add(b0);
        f.add(equal);
        f.add(plus);
        f.add(delete);
        f.add(clear);
        f.add(historyButton);
        f.add(log);
        f.setLayout(null);
        f.pack();
        f.setVisible(true);
        f.setSize(450, 520);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        historyButton.addActionListener(this);
        plus.addActionListener(this);
        delenie.addActionListener(this);
        umnoj.addActionListener(this);
        minus.addActionListener(this);
        tochka.addActionListener(this);
        equal.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        stepen.addActionListener(this);
        delenieost.addActionListener(this);
        log.addActionListener(this);
        skobop.addActionListener(this);
        skobcl.addActionListener(this);
        save.addActionListener(this);
        t.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
            cload.add("1");
        }

        if (e.getSource() == b2) {
            t.setText(t.getText().concat("2"));
            cload.add("2");
        }

        if (e.getSource() == b3) {
            t.setText(t.getText().concat("3"));
            cload.add("3");
        }

        if (e.getSource() == b4) {
            t.setText(t.getText().concat("4"));
            cload.add("4");
        }

        if (e.getSource() == b5) {
            t.setText(t.getText().concat("5"));
            cload.add("5");
        }

        if (e.getSource() == b6) {
            t.setText(t.getText().concat("6"));
            cload.add("6");
        }

        if (e.getSource() == b7) {
            t.setText(t.getText().concat("7"));
            cload.add("7");
        }

        if (e.getSource() == b8) {
            t.setText(t.getText().concat("8"));
            cload.add("8");
        }

        if (e.getSource() == b9) {
            t.setText(t.getText().concat("9"));
            cload.add("9");
        }
        if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));
            cload.add("0");
        }

        if (e.getSource() == tochka) {
            t.setText(t.getText().concat("."));
            cload.add(".");
        }

        if (e.getSource() == plus) {
            t.setText(t.getText().concat("+"));
            cload.add("+");
        }
        if (e.getSource() == minus) {
            t.setText(t.getText().concat("-"));
            cload.add("-");
        }
        if (e.getSource() == umnoj) {
            t.setText(t.getText().concat("*"));
            cload.add("*");
        }
        if(e.getSource()==stepen){
            t.setText(t.getText().concat("^"));
            cload.add("^");
        }
        if (e.getSource() == delenie) {
            t.setText(t.getText().concat("/"));
            cload.add("/");
        }
        if (e.getSource() == clear){
            t.setText("");
            cload.clear();
        }

        if(e.getSource()== delenieost){
            t.setText(t.getText().concat("%"));
            cload.add("%");
        }
        if(e.getSource()==log){
            t.setText(t.getText().concat("log"));
            cload.add("l");
        }
        if(e.getSource()==skobop){
            t.setText(t.getText().concat("("));
            cload.add("(");
        }
        if(e.getSource()==skobcl){
            t.setText(t.getText().concat(")"));
            cload.add(")");
        }
        if(e.getSource()==delete){
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++){
                t.setText(t.getText() + s.charAt(i));
            }
            int last = cload.size()-1;
            cload.remove(last);

        }

        if (e.getSource() == historyButton) {
            JOptionPane.showMessageDialog(f, history.getCalculationHistory(), "История", JOptionPane.PLAIN_MESSAGE);
        }

        if(e.getSource()==equal){

            StringBuilder sb = new StringBuilder();
            for (Object o : cload)
                sb.append(o);
            String res = sb.toString();

            t.setText(String.valueOf(calc.decide(res)));
            history.addCalculation(res+"="+calc.decide(res));




        }

        if(e.getSource()==save){
            String file;
            file = history.getCalculationHistory();
            SaveFile.saveStringToFile(file);
        }

    }
}




/*JFrame savewindow = new JFrame("Сохранить");
            JLabel namein = new JLabel("Введите название файла");
            JLabel pathin = new JLabel("Введите путь для сохранения");
            JButton ok = new JButton("ОК");
            savewindow.setSize(400, 600);
            JTextField filename = new JTextField();
            JTextField pathname = new JTextField();
            savewindow.add(filename);
            savewindow.add(ok);
            savewindow.add(pathname);
            savewindow.add(namein);
            savewindow.add(pathin);
            namein.setBounds(10, 10, 200, 30);
            filename.setBounds(30, 50, 350, 30);
            pathname.setBounds(30, 200, 350 ,30);
            pathin.setBounds(10,160,350,30);
            ok.setBounds(100,500,200,30);
            savewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            savewindow.setLayout(null);
            savewindow.setVisible(true);
            ok.addActionListener(this);
            if (e.getSource() == ok) {

            }*/