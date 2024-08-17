package org.example;

public class layoutShape {
    public static void main(String[] args) {
        int rowSeats = 11;
        int space = 0;
        rowPrinting(rowSeats,space);
    }

    public static void rowPrinting(int rowSeats,int space){
        String row = "";
        for(int i=0;i<rowSeats+1;i++){
            if(i == 0) {
                row = row + "|  ";
            } else if (i == (rowSeats)) {
                row = row + "  |";
            }else {
                row = row + ("|a"+i+"| ");
            }
        }
        System.out.println(row);
    }


}
