package myapplication.nomasp.com.addressbook;

import android.graphics.Bitmap;

/**
 * Created by nomasp on 2015/09/22.
 */
public class PhoneInfo
{
    private String name;
    private String number;

    public PhoneInfo(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
