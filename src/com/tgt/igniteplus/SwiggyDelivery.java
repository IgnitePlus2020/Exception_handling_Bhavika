package com.tgt.igniteplus;
import java.util.*;
public class SwiggyDelivery {

    static   List <Integer> zip = new ArrayList<>();

    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter the zipcode");

        int zipcode = in.nextInt();


        zip.add(000000);
        zip.add(123);
        zip.add(456);
        zip.add(789);

        try {
            CheckZip(zipcode);
        }

        catch (Exception e) {
            System.out.println("Delivery unavailable in this area");
        }
    }

    public static void CheckZip(int zipcode) throws InvalidZipException {

        int flag = 0;

        for (int i = 0; i < zip.size(); i++) {

            if (zipcode != zip.get(i))
                flag = 1;

            else if(zip.size() < 6)
                throw new InvalidZipException("Invalid zipcode. Please enter 6 digit valid zipcode.");

            else
                throw new InvalidZipException("Invalid zipcode");
        }
        if (flag == 1)
            System.out.println("Delivery available in your area!");
    }
}
    class InvalidZipException extends Exception {

    InvalidZipException(String str) {

            super(str);
        }
    }

