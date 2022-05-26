package com.simacoders.morteza.retrofit1.DataModels;

import com.google.gson.annotations.SerializedName;

public class ClassEmployee {
    @SerializedName("id")
    private String uId;
    @SerializedName("employee_name")
    private String uName;
    @SerializedName("employee_salary")
    private String salary;
    @SerializedName("employee_age")
    private String age;
    @SerializedName("profile_image")
    private String pic;

    public ClassEmployee(String uId, String uName, String salary, String age, String pic) {
        this.uId = uId;
        this.uName = uName;
        this.salary = salary;
        this.age = age;
        this.pic = pic;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
