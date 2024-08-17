package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("*         WELCOME TO          *");
        System.out.println("*         MOVIE BOOKING        *");
        System.out.println("********************************");
        Scanner scn = new Scanner(System.in);

        //showing locations
        System.out.println(" ");
        System.out.println("Locations:-");
        String[] locations = {"Uppal","KPHB","Lingampally","RTCXRoad","Ameerpet"};
        int a = 1;
        for(String location:locations){
            System.out.println(a+"."+location);
            a = a+1;
        }
        System.out.println(" ");
        System.out.println("Select your Location ");
        int locationNumber = scn.nextInt();
        String locationName = locations[locationNumber-1];

        //showing movies
        System.out.println(" ");
        System.out.println("Movies at "+locationName + " :-");

        String[] uppalMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] kphbMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] lingampallyMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] rtcXRoadMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] ameerpetMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[][] locationsList = {uppalMovies,kphbMovies,lingampallyMovies,rtcXRoadMovies,ameerpetMovies};
        String[] movieList = findList(locationsList,locationNumber);

        System.out.println(" ");
        System.out.println("select movie");
        int movieNumber = scn.nextInt();
        String movieName = movieList[movieNumber-1];

        //showing theaters
        System.out.println(" ");
        System.out.println(movieName + " movie available Theaters:-");
        String[] doubleIsmart = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] mrBhachan = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] saripodhaShanivaram = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] devara = {"PVR","AAA","AMB","Asian Multiplex"};
        String[][]  moviesList= {doubleIsmart,mrBhachan,saripodhaShanivaram,devara};
        String[] theaterList = findList(moviesList,movieNumber);

        System.out.println(" ");
        System.out.println("select theater");
        int theaterNumber = scn.nextInt();
        String theateName = theaterList[theaterNumber-1];

        System.out.println(" ");
        System.out.println(theateName + " Show Timings:-");
        String[] pvr = {"11am - 01pm","02pm - 05pm","06pm - 09pm","09pm - 12am"};
        String[] aaa = {"11am - 01pm","02pm - 05pm","06pm - 09pm","09pm - 12am"};
        String[] amb = {"11am - 01pm","02pm - 05pm","06pm - 09pm","09pm - 12am"};
        String[] asianMultiplex = {"11am - 01pm","02pm - 05pm","06pm - 09pm","09pm - 12am"};
        String[][] theatersList = {pvr,aaa,amb,asianMultiplex};
        String[] showTimeList = findList(theatersList,theaterNumber);

        System.out.println(" ");
        System.out.println("select show time");
        int showTime = scn.nextInt();
        String showTimings = showTimeList[showTime-1];

        String[] rows = {"a","b","c","d","e","f","g","h"};
        String[][] availableSeats = {{"a1","a2","a4","a6","a7","a8"},{"b1","b2","b3","b6","b8"},{"c3","c4","c6","c8"},{"d1","d5","d6"},{"e1","e2","e3","e4","e6","e7"},{"f1","f2","f3","f6","f7","f8"},{"g1","g2","g3","g4"},{"h1","h2","h3","h4","h5","h6","h7","h8"}};
        String[] bookedSeats = {"a3","a5","b4","b5","c1","c2","d2","d3","d4","b7","c5","c7","d7","d8","e5","e8","f4","f5","g5","g6","g7","g8"};
        String[] layout = new String[rows.length];
        for(int i=0;i< rows.length;i++){
            String eachRow= "|   |"+rows[i] +"1| |"+rows[i] +"2| |"+rows[i] +"3| |"+rows[i] +"4|         |"+rows[i] +"5| |"+rows[i] +"6| |"+rows[i] +"7| |"+rows[i] +"8|   |";
            layout[i] = eachRow;
        }

        //already booked seats
        System.out.println(" ");
        System.out.println("booked seats : '--'");
        System.out.println(" ");
        bookingSeats(bookedSeats,rows,layout);

//        System.out.println(" ");
//        System.out.println("Available seats :-");
//        for(String[] availableRowSeats:availableSeats){
//            System.out.println(Arrays.toString(availableRowSeats));
//        }
//        System.out.println(" ");
//        System.out.println("Booked seats :-");
//        System.out.println(Arrays.toString(bookedSeats));


        System.out.println(" ");
        System.out.println("enter no. of seats");
        int totalSeats = scn.nextInt();
        scn.nextLine();
        String[] inputSeats = new String[totalSeats];
        int j = 0;
        for(int i=0;i<totalSeats;i++){
            System.out.println("enter seat no."+(i+1));
            int seatConformation = 0;
            String seat = scn.nextLine();
            for(String bookedSeat:bookedSeats){
                if(seat.equalsIgnoreCase(bookedSeat)){
                    System.out.println("this seat is already booked please select from available seats");
                    j = i;
                    seatConformation =1;
                    i--;
                }
            }
            if(j-i!=1) {
                inputSeats[i] = seat;
            }
            for(String[] availableSeatRow:availableSeats){
                for(String availableSeat:availableSeatRow){
                    if(availableSeat.equalsIgnoreCase(seat)){
                        seatConformation = 1;
                    }
                }
            }
            if(seatConformation == 0){
                System.out.println("enter valid seat number (e.g., a1)");
                i--;
            }

        }

        System.out.println(" ");
        System.out.println("selected seats : "+Arrays.toString(inputSeats));
        System.out.println(" ");
        bookingSeats(inputSeats,rows,layout);
        System.out.println("your seats are conformed.");

        System.out.println(" ");
        System.out.println("Enter Your 10 digit Mobile Number:");
        String phoneError = "enter correct 10 digit mobile number";
        int mobileNumberLength = 10;
        inputValidation(mobileNumberLength,phoneError);

        System.out.println(" ");
        System.out.println("Enter card details(format : xxxx xxxx xxxx xxxx):");
        String cardError = "Enter Card details in this format (xxxx xxxx xxxx xxxx)";
        int cardNumberLength = 19;
        inputValidation(cardNumberLength,cardError);

        System.out.println(" ");
        System.out.println("*** Your Booking Conformed ***");
        System.out.println("    ----------------------    ");
        System.out.println(" ");
        System.out.println("Booking Details:-");
        System.out.println("-----------------");
        System.out.println("Movie Name: "+movieName);
        System.out.println("Show Time: "+showTimings);
        System.out.println("Seat Numbers: " + Arrays.toString(inputSeats));
        System.out.println("Theater Name: "+theateName);
        System.out.println("Location :"+locationName);
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("         THANKYOU         ");
        System.out.println("--------------------------");

    }



    //validation
    public static void inputValidation(int length, String message) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<1;i++) {
            String number = scn.nextLine();
            if(number.length()!=length){
                System.out.println(message);
                i--;
            }
        }
    }

    //list of elements
    public static String[] findList(String[][] list,int number) {
        String[] location = list[number-1];
        int a = 1;
        for(String movies:location){
            System.out.println(a + "." + movies);
            a = a+1;
        }
        return location;
    }

    //layout
    public static void bookingSeats(String[] bookings,String[] rows,String[] layout){
        for(int i=0;i< bookings.length;i++) {
            String seat = bookings[i];
            String seatRow = seat.substring(0, 1);
            int rowIndex = 0;
            for (int j = 0; j < rows.length; j++) {
                if (rows[j].equalsIgnoreCase(seatRow)) {
                    rowIndex = j;
                }
            }
            layout[rowIndex] = layout[rowIndex].replace(seat,"--");
        }

        for(String updatedRow:layout){
            System.out.println(updatedRow);
        }
        System.out.println(" ----------------------------------------------------- ");
        System.out.println("|                     MOVIE SCREEN                    |");
        System.out.println(" ----------------------------------------------------- ");
    }

}
