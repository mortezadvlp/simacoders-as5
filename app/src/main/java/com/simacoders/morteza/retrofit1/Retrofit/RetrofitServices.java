package com.simacoders.morteza.retrofit1.Retrofit;

import com.simacoders.morteza.retrofit1.DataModels.ClassEmployee;
import com.simacoders.morteza.retrofit1.DataModels.ClassNewEmployee;
import com.simacoders.morteza.retrofit1.DataModels.ClassPost;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitServices {

    @GET("employees")
    Call<List<ClassEmployee>> getEmployees();

    @POST("create")
    Call<ClassNewEmployee> createEmployee(@Body ClassNewEmployee employee);

    @GET("posts")
    Call<List<ClassPost>> getPosts(@Query("userId") String userId);
}
