package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("*           WELCOME TO          *");
        System.out.println("*         THEATER TICKET        *");
        System.out.println("*********************************");
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

        System.out.println(" ");
        System.out.println("Theater : "+theateName+"                 "+"Show Time : " + showTimings);
        for(int i=0;i<10;i++){
            System.out.println("|   " + "|_| ".repeat(5) + "     " + " |_|".repeat(5) + "   |");
        }
        System.out.println(" --------------------------------------------------- ");
        System.out.println("|                      SCREEN                       |");
        System.out.println(" --------------------------------------------------- ");

        System.out.println(" ");
        System.out.println("select number of seats:");
        int x = scn.nextInt();
        scn.nextLine();
        int numberOfSeats = x;

        System.out.println(" ");
        System.out.println("Available seats :-");
        String[] availableSeats = {"a1","a2","a4","b1","b2","b3","c3","c4","c5","d1","d5"};
        String[] bookedSeats = {"a3","a5","b4","b5","c1","c2","d2","d3","d4"};
        System.out.println(Arrays.toString(availableSeats));
        System.out.println("Booked seats :-");
        System.out.println(Arrays.toString(bookedSeats));


        String[] myBookingSeats = new String[x];
        int j = 0;
        System.out.println(" ");
        for(int i=0;i<numberOfSeats;i++){
           System.out.println("enter seat number:");
           String seat = scn.nextLine();
           for(String bookedSeat:bookedSeats){
               if(seat.equals(bookedSeat)){
                   System.out.println("this seat is already booked please select from available list");
                   j = i;
                   i--;
               }
           }
           if(j-i!=1) {
               myBookingSeats[i] = seat;
           }
        }

        System.out.println(" ");
        System.out.println("Enter Your Mobile Number:");
        String phoneError = "enter correct 10 digit mobile number";
        int mobileNumberLength = 10;
        inputValidation(mobileNumberLength,phoneError);

        System.out.println(" ");
        System.out.println("Enter card details(xxxx xxxx xxxx xxxx):");
        String cardError = "Enter Card numbers this format (xxxx xxxx xxxx xxxx)";
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
        System.out.println("Seat Numbers: " + Arrays.toString(myBookingSeats));
        System.out.println("Theater Name: "+theateName);
        System.out.println("Location :"+locationName);
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("         THANKYOU         ");
        System.out.println("--------------------------");

    }

    private static void inputValidation(int length, String message) {
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<1;i++) {
            String phoneNumber = scn.nextLine();
            if(phoneNumber.length()!=length){
                System.out.println(message);
                i--;
            }
        }
    }

    private static String[] findList(String[][] list,int number) {
        String[] location = list[number-1];
        int a = 1;
        for(String movies:location){
            System.out.println(a + "." + movies);
            a = a+1;
        }
        return location;
    }

}
