package myapplication.nomasp.com.addressbook;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nomasp on 2015/09/22.
 */

public class GetNumber
{
    public static List<PhoneInfo> lists = new ArrayList<PhoneInfo>();
    public static String getNumber(Context context){
        Cursor cursor = context.getContentResolver().query(Phone.CONTENT_URI, null, null, null, null);
        String phoneNumber;
        String phoneName;
        ContentResolver resolver = context.getContentResolver();
        while (cursor.moveToNext()) {
            phoneNumber = cursor.getString(cursor.getColumnIndex(Phone.NUMBER));
            phoneName = cursor.getString(cursor.getColumnIndex(Phone.DISPLAY_NAME));
            PhoneInfo phoneInfo = new PhoneInfo(phoneNumber,phoneName);
            lists.add(phoneInfo);
        }
        return null;
    }
}
