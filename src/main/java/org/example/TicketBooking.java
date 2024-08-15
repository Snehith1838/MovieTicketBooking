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
        System.out.println("Locations:-");
        String[] locations = {"Uppal","KPHB","Lingampally","RTCXRoad","Ameerpet"};
        int a = 1;
        for(String location:locations){
            System.out.println(a+"."+location);
            a = a+1;
        }
        System.out.println(" ");
        System.out.println("Select your Location ");
        int location = scn.nextInt();
        String locationName = locations[location-1];

        //showing movies
        System.out.println(" ");
        System.out.println("Movies at "+locationName + " :-");

        String[] uppalMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] kphbMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] lingampallyMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] rtcXRoadMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] ameerpetMovies = {"Double Ismart","Mr.Bhachan","Saripodha Shanivaram","Devara"};
        String[] moviesList = {};
        if(location == 1){
            int x = 1;
            moviesList = uppalMovies;
            for(String movie:uppalMovies){
                System.out.println(x+"."+movie);
                x = x +1;
            }
        } else if (location == 2) {
            int x = 1;
            moviesList = kphbMovies;
            for(String movie:kphbMovies){
                System.out.println(x+"."+movie);
                x = x +1;
            }
        } else if (location == 3) {
            int x = 1;
            moviesList = lingampallyMovies;
            for(String movie:lingampallyMovies){
                System.out.println(x+"."+movie);
                x = x +1;
            }
        } else if (location == 4) {
            int x = 1;
            moviesList = rtcXRoadMovies;
            for(String movie:rtcXRoadMovies){
                System.out.println(x+"."+movie);
                x = x +1;
            }
        } else if (location == 5) {
            int x = 1;
            moviesList = ameerpetMovies;
            for(String movie:ameerpetMovies){
                System.out.println(x+"."+movie);
                x = x +1;
            }
        }

        System.out.println(" ");
        System.out.println("select movie");
        int movie = scn.nextInt();
        String movieName = moviesList[movie-1];

        //showing theaters
        System.out.println(" ");
        System.out.println(movieName + " movie available Theaters:-");
        String[] doubleIsmart = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] mrBhachan = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] saripodhaShanivaram = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] devara = {"PVR","AAA","AMB","Asian Multiplex"};
        String[] theaterList = {};

        if(movie == 1){
            int x = 1;
            theaterList = doubleIsmart;
            for(String theater:doubleIsmart){
                System.out.println(x+"."+theater);
                x = x +1;
            }
        } else if (movie == 2) {
            int x = 1;
            theaterList = mrBhachan;
            for(String theater:mrBhachan){
                System.out.println(x+"."+theater);
                x = x +1;
            }
        } else if (movie == 3) {
            int x = 1;
            theaterList = saripodhaShanivaram;
            for(String theater:saripodhaShanivaram){
                System.out.println(x+"."+theater);
                x = x +1;
            }
        } else if (movie == 4) {
            int x = 1;
            theaterList = devara;
            for(String theater:devara){
                System.out.println(x+"."+theater);
                x = x +1;
            }
        }

        System.out.println(" ");
        System.out.println("select theater");
        int theater = scn.nextInt();
        String theateName = theaterList[theater-1];

        System.out.println(" ");
        System.out.println(theateName + " Show Timings:-");
        String[] pvr = {"11am - 01pm","02am - 05pm","06pm - 09pm","09pm - 12am"};
        String[] aaa = {"11am - 01pm","02am - 05pm","06pm - 09pm","09pm - 12am"};
        String[] amd = {"11am - 01pm","02am - 05pm","06pm - 09pm","09pm - 12am"};
        String[] asianMultiplex = {"11am - 01pm","02am - 05pm","06pm - 09pm","09pm - 12am"};
        String[] showTimeList = {};

        if(theater == 1){
            int x = 1;
            showTimeList = pvr;
            for(String showTime:pvr){
                System.out.println(x+"."+showTime);
                x = x +1;
            }
        } else if (theater == 2) {
            int x = 1;
            showTimeList = aaa;
            for(String showTime:aaa){
                System.out.println(x+"."+showTime);
                x = x +1;
            }
        } else if (theater == 3) {
            int x = 1;
            showTimeList = amd;
            for(String showTime:amd){
                System.out.println(x+"."+showTime);
                x = x +1;
            }
        } else if (theater == 4) {
            int x = 1;
            showTimeList = asianMultiplex;
            for(String showTime:asianMultiplex){
                System.out.println(x+"."+showTime);
                x = x +1;
            }
        }

        System.out.println(" ");
        System.out.println("select show time");
        int showTime = scn.nextInt();
        String showTimings = showTimeList[showTime-1];
        System.out.println(" ");
        System.out.println("Available Tickets for " + showTimings +" show are:-");

        String[] availableSeats = {"a1","a2","a4","b1","b2","b3","c3","c4","c5","d1","d5"};
        String[] bookedSeats = {"a3","a5","b4","b5","c1","c2","d2","d3","d4"};
        System.out.println(Arrays.toString(availableSeats));
        System.out.println("Booked seats :-");
        System.out.println(Arrays.toString(availableSeats));

        System.out.println(" ");
        System.out.println("select number of seats:");
        int x = scn.nextInt();
        scn.nextLine();
        int numberOfSeats = x;

        String[] myBookingSeats = new String[x];
        int j = 0;
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
        String phoneNumber = scn.nextLine();
        System.out.println(" ");
        System.out.println("Enter card details:");
        String cardNumber = scn.nextLine();
        System.out.println(" ");
        System.out.println("*** Your Booking Conformed ***");
        System.out.println(" ");
        System.out.println("Booking Details:-");
        System.out.println("-----------------");
        System.out.println("Movie Name: "+movieName);
        System.out.println("Show Time: "+showTimings);
        System.out.println("Seat Numbers: " + Arrays.toString(myBookingSeats));
        System.out.println("Theater Name: "+theateName);
        System.out.println("Location :"+locationName);

    }
}
