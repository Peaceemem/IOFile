package com.peace.file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ToDoList {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in);
                 BufferedWriter writer = new BufferedWriter(new FileWriter("todo.txt"))) {

                System.out.println("Enter your to-do items (enter 'done' to finish):");
                String item;
                while (!(item = scanner.nextLine()).equalsIgnoreCase("done")) {
                    writer.write(item);
                    writer.newLine();
                }

                System.out.println("To-do items saved to todo.txt");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


