package com.example.mapanimation;

import retrofit2.Retrofit;

public class Common {

    public static String baseUrl = "https://googleapis.com";
    public static IGoogleApi getGoogleApi()
    {
        return RetrofitClient.getClient(baseUrl).create(IGoogleApi.class);
    }
}
