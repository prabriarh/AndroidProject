package com.example.prab7450.contactmanager;

import android.net.Uri;

/**
 * Created by Prab7450 on 7/6/2016.
 */
public class Contact {

    private String _name, _phone, _email, _address;
    private Uri _imageURI;

    public Contact (String name, String phone, String email, String address, Uri imageURI){
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _imageURI = imageURI;

    }


    public String getName(){
        return _name;
    }

    public String getPhone(){
        return _phone;
    }

    public String getEmail(){
        return _email;
    }

    public String getAddress(){
        return _address;
    }

    public Uri getImageURI(){return _imageURI;}

}
