package org.example.Modules;

import com.google.gson.Gson;
import org.example.payloads.Booking;
import org.example.payloads.Bookingdates;

public class PayloadManager {
    //JAVA->JSON
    public String CreatePayload()
    {
    Booking payload=new Booking();
        payload.setFirstname("Jakie");
        payload.setLastname("Brown");
        payload.setTotalprice(1234);
        payload.setDepositpaid(true);
    Bookingdates bookingdates=new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");
        payload.setBookingdates(bookingdates);
        payload.setAdditionalneeds("Breakfast");
        System.out.println(payload);
        Gson gson=new Gson();
        String Jsonpayload=gson.toJson(payload);
        System.out.println(Jsonpayload);
        return Jsonpayload;
}
}
