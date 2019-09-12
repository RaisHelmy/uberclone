package com.iramml.uberclone.driverapp.Interfaces;

import com.iramml.uberclone.driverapp.Model.FCMResponse;
import com.iramml.uberclone.driverapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAHmczU60:APA91bHFi_io2ar5rCel2jPvVsT0CxaRoi1goLkgQzsZEYicqkYsL0xMJbG5eiGXLt-ls_GZN0tEhXDmZJRp9dSGCSO_r1fG24TBNCp-NqLuHFT3WpgQQ1pn8XEwWBqrZw2lSw-w_ls2"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
