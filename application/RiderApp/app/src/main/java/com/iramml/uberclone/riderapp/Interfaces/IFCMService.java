package com.iramml.uberclone.riderapp.Interfaces;

import com.iramml.uberclone.riderapp.Model.FCMResponse;
import com.iramml.uberclone.riderapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAej6vnlI:APA91bGtTswhxaI-aF84H2rx7Dy3VQlu14aqg8XR5CZYjICAgS8ZcDWo6NUXmJv6bMYz1wvAKbj5SwFs0ko2JoRC9dtuJ_SyANc70KAK0I0xiIOWIht3EuWlOYxFkmnRDwWeKaDmpzRX"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
