package com.peace.file;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment {
        public static void main(String[] args) {
            String fileName = "Recipes.txt";
            List<String> recipes = readRecipesFromFile(fileName);

            for (String recipe : recipes) {
                System.out.println(recipe);
            }
        }

        private static List<String> readRecipesFromFile(String fileName) {
            List<String> recipes = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                StringBuilder recipeBuilder = new StringBuilder();

                while ((line = br.readLine()) != null) {
                    if (line.trim().isEmpty()) {
                        recipes.add(recipeBuilder.toString());
                        recipeBuilder.setLength(0);
                    } else {
                        recipeBuilder.append(line).append("\n");
                    }
                }

                // Add the last recipe if it's not empty
                if (recipeBuilder.length() > 0) {
                    recipes.add(recipeBuilder.toString());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return recipes;
        }
    }


