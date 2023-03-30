package com.company;

import java.io.File;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class SaveFile {

    public static void saveStringToFile(String str) {
        // Создаем диалоговое окно выбора файла
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(".")); // устанавливаем текущий каталог

        // Устанавливаем фильтр на выбор только txt-файлов
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt") || f.isDirectory();
            }
            public String getDescription() {
                return "Текстовый документ (*.txt)";
            }
        });

        // Отображаем диалоговое окно выбора файла
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) { // Если пользователь выбрал файл
            File selectedFile = fileChooser.getSelectedFile(); // Получаем путь к файлу

            // Добавляем расширение .txt, если оно не указано
            String fileName = selectedFile.getName();
            if (!fileName.endsWith(".txt")) {
                selectedFile = new File(selectedFile.getParentFile(), fileName + ".txt");
            }

            try {
                PrintWriter writer = new PrintWriter(selectedFile);

                writer.print(str); // записываем строку в файл

                writer.close(); // закрываем PrintWriter
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
