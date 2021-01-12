package UI;

import Message.Flight;

import java.util.Scanner;

public class mainUI {
    public static void main(String[] args) {
        System.out.println("请根据提示信息进行操作！");
        System.out.println("按1录入航班信息");
        System.out.println("按2");
        System.out.println("按3");
        System.out.println("按4");
        int choice;
        Scanner scanner=new Scanner(System.in);
        choice =scanner.nextInt();
        if (choice==1){

            System.out.print("请输入航班编号:");
            String flightId=scanner.next();
            System.out.print("请输入机型:");
            String flightType=scanner.next();
            System.out.print("请输入座位数:");
            int currentSeats=scanner.nextInt();
            System.out.print("请输入起飞机场:");
            String departureAirport=scanner.next();
            System.out.print("请输入目的地机场:");
            String destinationAirport=scanner.next();
            System.out.print("请输入起飞时间:");
            String departureTime=scanner.next();
            Flight flight=new Flight(flightId,flightType,currentSeats,departureAirport,destinationAirport,departureTime);
        }

    }
}