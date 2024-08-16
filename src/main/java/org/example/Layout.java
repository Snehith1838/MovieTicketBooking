package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Layout {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] rows = {"a","b","c","d","e","f","g","h"};
        String[] layout = new String[rows.length];
        for(int i=0;i< rows.length;i++){
            String a= "|  " + rows[i] + "-|1| |2| |3| |4|       |5| |6| |7| |8|   |";
            layout[i] = a;
        }

        System.out.println(" ");
        System.out.println(" ");
        String[] bookedSeats = {"a3","a5","b4","b5","c1","c2","d2","d3","d4"};
        bookingSeats(bookedSeats,rows,layout);

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

        bookingSeats(inputSeats,rows,layout);

    }

    public static void bookingSeats(String[] bookings,String[] rows,String[] layout){
        for(int i=0;i< bookings.length;i++) {
            String seat = bookings[i];
            String seatRow = seat.substring(0, 1);
            String seatNumber = seat.substring(1);
            int rowIndex = 0;
            for (int j = 0; j < rows.length; j++) {
                if (rows[j].equals(seatRow)) {
                    rowIndex = j;
                }
            }
            String row = layout[rowIndex];
            char[] charArr = row.toCharArray();
            for(int j=0;j<row.length();j++){
                String x = String.valueOf(charArr[j]);
                if(x.equals(seatNumber)){
                    charArr[j] = '$';
                }
            }
            layout[rowIndex] = String.valueOf(charArr);
        }

        for(String row:layout){
            System.out.println(row);
        }
    }
}
