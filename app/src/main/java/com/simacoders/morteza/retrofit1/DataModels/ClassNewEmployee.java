package com.simacoders.morteza.retrofit1.DataModels;

import com.google.gson.annotations.SerializedName;

public class ClassNewEmployee {
    @SerializedName("id")
    private String uId;
    @SerializedName("name")
    private String uName;
    @SerializedName("salary")
    private String salary;
    @SerializedName("age")
    private String age;

    public ClassNewEmployee(String uId, String uName, String salary, String age) {
        this.uId = uId;
        this.uName = uName;
        this.salary = salary;
        this.age = age;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
