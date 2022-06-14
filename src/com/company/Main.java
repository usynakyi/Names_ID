package com.company;
import java.util.*;
import java.io.*;

public class Main {

        public static void main(String[] args) throws IOException {

            System.out.print("Input administrator password: ");
            Scanner sc= new Scanner(System.in);
            String str = sc.nextLine();

            if(!(str.equals("123"))) {
                System.out.println("You entered an incorrect password! Bb");
                return;
            }

            File file = new File("D:\\temp.txt");

            Scanner scanner = new Scanner(file);

            String ArrayNamesAll[][] = new String[3][6];

            int i = 0;
            while(scanner.hasNextLine()){
                str = scanner.nextLine();
                //System.out.println(str);
                String ArrayNames[] = str.split(";");

                int j = 0;
                for (String word : ArrayNames) {
                    ArrayNamesAll[i][j] = word;
                    //System.out.println(word);
                    j++;
                }
                i++;

            }

            scanner.close();

            System.out.print("Input ID of landowner: ");
            sc = new Scanner(System.in);
            str = sc.nextLine();

            for (i = 0; i < ArrayNamesAll.length; i++) {
                if (str.equals(ArrayNamesAll[i][0])) {
                    System.out.println("landowners: " + ArrayNamesAll[i][1] + " Age: " + ArrayNamesAll[i][2] + " Adress: " + ArrayNamesAll[i][3] + " Land arrea: " + ArrayNamesAll[i][4] + " Other: " + ArrayNamesAll[i][5]);
                }
            }
        }
    }
