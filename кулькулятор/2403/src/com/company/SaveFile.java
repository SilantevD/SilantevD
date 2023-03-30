package com.company;

import java.io.File;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class SaveFile {

    public static void saveStringToFile(String str) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));


        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt") || f.isDirectory();
            }
            public String getDescription() {
                return "Текстовый документ (*.txt)";
            }
        });


        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();


            String fileName = selectedFile.getName();
            if (!fileName.endsWith(".txt")) {
                selectedFile = new File(selectedFile.getParentFile(), fileName + ".txt");
            }

            try {
                PrintWriter writer = new PrintWriter(selectedFile);

                writer.print(str);

                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
