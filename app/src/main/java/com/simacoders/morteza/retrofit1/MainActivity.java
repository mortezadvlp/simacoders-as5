package com.simacoders.morteza.retrofit1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.simacoders.morteza.retrofit1.DataModels.ClassEmployee;
import com.simacoders.morteza.retrofit1.DataModels.ClassNewEmployee;
import com.simacoders.morteza.retrofit1.DataModels.ClassPost;
import com.simacoders.morteza.retrofit1.Retrofit.RetrofitClient;
import com.simacoders.morteza.retrofit1.Retrofit.RetrofitClient2;
import com.simacoders.morteza.retrofit1.Retrofit.RetrofitServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void GetEmployees(View view){
        Retrofit retrofitClient = RetrofitClient.Initialize();
        RetrofitServices services = retrofitClient.create(RetrofitServices.class);
        Call<List<ClassEmployee>> getEmp = services.getEmployees();
        getEmp.enqueue(new Callback<List<ClassEmployee>>() {
            @Override
            public void onResponse(Call<List<ClassEmployee>> call, Response<List<ClassEmployee>> response) {
                if(response==null){
                    Toast.makeText(MainActivity.this, "Response is null!",
                            Toast.LENGTH_SHORT).show();
                }else {
                    List<ClassEmployee> list = response.body();
                }
            }

            @Override
            public void onFailure(Call<List<ClassEmployee>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void CreateEmployees(View view){
        Retrofit retrofitClient = RetrofitClient.Initialize();
        RetrofitServices services = retrofitClient.create(RetrofitServices.class);
        ClassNewEmployee employee = new ClassNewEmployee(null, "Morteza",
                "5000", "33");
        Call<ClassNewEmployee> newEmp = services.createEmployee(employee);
        newEmp.enqueue(new Callback<ClassNewEmployee>() {
            @Override
            public void onResponse(Call<ClassNewEmployee> call, Response<ClassNewEmployee> response) {
                if(response==null){
                    Toast.makeText(MainActivity.this, "Response is null!",
                            Toast.LENGTH_SHORT).show();
                }else {
                    ClassNewEmployee employee1 = response.body();
                }
            }

            @Override
            public void onFailure(Call<ClassNewEmployee> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void GetPosts(View view){
        Retrofit retrofitClient = RetrofitClient2.Initialize();
        RetrofitServices services = retrofitClient.create(RetrofitServices.class);
        Call<List<ClassPost>> getPosts = services.getPosts("1");
        getPosts.enqueue(new Callback<List<ClassPost>>() {
            @Override
            public void onResponse(Call<List<ClassPost>> call, Response<List<ClassPost>> response) {
                if(response==null){
                    Toast.makeText(MainActivity.this, "Response is null!",
                            Toast.LENGTH_SHORT).show();
                }else {
                    List<ClassPost> list = response.body();
                }
            }

            @Override
            public void onFailure(Call<List<ClassPost>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
