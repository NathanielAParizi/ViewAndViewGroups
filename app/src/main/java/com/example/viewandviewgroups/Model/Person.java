package com.example.viewandviewgroups.Model;

public class Person {

    //*********
    //  Person instance variables
    //
    //  First Name
    //	Last Name
    //	Street Address
    //	City
    //	State
    //	Zip
    //********

    private String mFirstName;
    private String mLastName;
    private String mStreetAddress;
    private String mCity;
    private String mState;
    private String mZip;

    public Person(String mFirstName, String mLastName, String mStreetAddress, String mCity, String mState, String mZip) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mStreetAddress = mStreetAddress;
        this.mCity = mCity;
        this.mState = mState;
        this.mZip = mZip;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getmStreetAddress() {
        return mStreetAddress;
    }

    public void setmStreetAddress(String mStreetAddress) {
        this.mStreetAddress = mStreetAddress;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState;
    }

    public String getmZip() {
        return mZip;
    }

    public void setmZip(String mZip) {
        this.mZip = mZip;
    }
}
