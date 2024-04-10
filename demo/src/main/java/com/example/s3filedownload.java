package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * Hello world!
 *
 */
public class s3filedownload 
{
    public static void main( String[] args ) throws IOException
    {
        AmazonS3 s3=AmazonS3Client.builder().withCredentials(new ProfileCredentialsProvider()).build();

        // s3.createBucket("kubercabs-nivi");

        // s3.putObject("kubercabs-nivi","driver1-id","hi");
        // s3.putObject("kubercabs-nivi","driver2-id", "hello");

        String s=s3.getObjectAsString("kubercabs-nivi","cabdriver1.jpg");
        String s1=s3.getObjectAsString("kubercabs-nivi","cabdriver2.jpg");
        System.out.println("enter the path to which the objects to be downloaded");
        Scanner sc =new Scanner(System.in);
        String path=sc.nextLine();
        FileWriter fo=new FileWriter(new File(path));
        fo.write(s);
        fo.write(s1);
        System.out.println("Downloaded");

    }
}
