package myapplication.nomasp.com.addressbook;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;

/**
 * Created by nomasp on 2015/09/22.
 */
public class GetNumber
{
    public static String getNumber(Context context){
        Cursor cursor = context.getContentResolver().query(Phone.CONTENT_URI, null, null, null, null);
        String phoneNumber;
        String phoneName;
        while (cursor.moveToNext()) {
            phoneNumber = cursor.getString(cursor.getColumnIndex(Phone.NUMBER));
            phoneName = cursor.getString(cursor.getColumnIndex(Phone.DISPLAY_NAME));
            System.out.println(phoneName+phoneNumber);
        }
        return null;
    }
}
