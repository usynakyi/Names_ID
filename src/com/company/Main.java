package com.company;
import java.util.*;

public class Main {

        public static void main(String[] args) {

            String ArrayNames[][] = new String[3][6];

            //ID
            ArrayNames[0][0] = "0";
            ArrayNames[1][0] = "1";
            ArrayNames[2][0] = "2";

            //Names
            ArrayNames[0][1] = "Vo";
            ArrayNames[1][1] = "Vi";
            ArrayNames[2][1] = "Va";

            //Age
            ArrayNames[0][2] = "35";
            ArrayNames[1][2] = "36";
            ArrayNames[2][2] = "37";

            //Adress
            ArrayNames[0][3] = "Dan 30";
            ArrayNames[1][3] = "Bykiv 3";
            ArrayNames[2][3] = "Obolon 31";

            //Land arrea
            ArrayNames[0][4] = "100";
            ArrayNames[1][4] = "99";
            ArrayNames[2][4] = "98";

            //Other
            ArrayNames[0][5] = "Test1";
            ArrayNames[1][5] = "Test2";
            ArrayNames[2][5] = "Test3";

            System.out.print("Input ID of landowner: ");
            Scanner sc= new Scanner(System.in);
            String str = sc.nextLine();

            for (int i = 0; i < ArrayNames.length; i++) {
                if (str.equals(ArrayNames[i][0])) {
                    System.out.println("landowners: " + ArrayNames[i][1] + " Age: " + ArrayNames[i][2] + " Adress: " + ArrayNames[i][3] + " Land arrea: " + ArrayNames[i][4] + " Other: " + ArrayNames[i][5]);
                }
            }
        }

    }
