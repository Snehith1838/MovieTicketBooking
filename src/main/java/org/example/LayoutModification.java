package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LayoutModification {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] rows = {"a","b","c","d","e","f","g","h"};
        String[] layout = new String[rows.length];
        for(int i=0;i< rows.length;i++){
            String a= "|   |"+rows[i] +"1| |"+rows[i] +"2| |"+rows[i] +"3| |"+rows[i] +"4|         |"+rows[i] +"5| |"+rows[i] +"6| |"+rows[i] +"7| |"+rows[i] +"8|   |";
            layout[i] = a;
            System.out.println(a);
        }

        System.out.println(" ");
        System.out.println("enter no. of seats");
        int totalSeats = scn.nextInt();
        scn.nextLine();
        String[] inputSeats = new String[totalSeats];
        for(int i=0;i<totalSeats;i++){
            System.out.println("enter seat no. "+(i+1));
            String seat = scn.nextLine();
            inputSeats[i] = seat;
        }

        for(int i=0;i< inputSeats.length;i++){
            String seat = inputSeats[i];
            String seatRow = seat.substring(0, 1);
            int rowIndex = 0;
            for (int j = 0; j < rows.length; j++) {
                if (rows[j].equals(seatRow)) {
                    rowIndex = j;
                }
            }
            layout[rowIndex] = layout[rowIndex].replace(seat,"##");
        }
        for(String updatedRow:layout){
            System.out.println(updatedRow);
        }

    }
}
