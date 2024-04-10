
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class rdsques2 {




    public static void main( String[] args ) throws ClassNotFoundException
    {
           String url="jdbc:mysql://kubercabss-nivi.c78w2esc0r81.eu-west-2.rds.amazonaws.com:3306/kubercabs";
           String user="admin";
           String password="nivedita";

           try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Get the driver");

            Connection con=DriverManager.getConnection(url, user, password);
            System.out.println("Connected");

            for(int i=0;i<=3;i++){

            
            PreparedStatement pes=con.prepareStatement("insert into ride_details values(?,?,?,?)");
            Scanner s=new Scanner(System.in);

            System.out.println("Enter the ride number");
            int rideNumber=s.nextInt();
            pes.setInt(1, rideNumber);

            System.out.println("Enter the driver name");
            String driverName=s.nextLine();
            pes.setString(2,driverName);

            System.out.println("Enter the customer name");
            String customerName=s.nextLine();
            pes.setString(3, customerName);

            System.out.println("Enter the no of passengers");
            int noOfPassengers=s.nextInt();
            pes.setInt(4, noOfPassengers);

            pes.executeUpdate();


            }


           }

           catch(SQLException ex){
            System.out.println(ex);
           }
}
}


    

