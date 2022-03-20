package com.example.Practica5Spring;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Registro {

    @NotNull
    @Size(min=2, max=30)
    private String fname;

    @NotNull
    @Size(min=2, max=30)
    private String lname;

    @NotNull
    @Size(min=2, max=30)
    private String ident;

    @NotNull
    @Size(min=2, max=30)
    private String pass;

    @NotNull
    @Min(18)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


}