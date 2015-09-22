package myapplication.nomasp.com.addressbook;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * Created by nomasp on 2015/09/22.
 */

public class PhoneAdapter extends BaseAdapter
{
    private List<PhoneInfo> lists;
    private Context context;
    private LinearLayout layout;

    public PhoneAdapter(List<PhoneInfo> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.cell,null);
            holder = new ViewHolder();
            holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            holder.tvNumber = (TextView)convertView.findViewById(R.id.tvNumber);
            holder.ivPicture = (ImageView)convertView.findViewById(R.id.ivPicture);
            holder.tvName.setText(lists.get(position).getName());
            holder.tvNumber.setText(lists.get(position).getNumber());
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
            holder.tvName.setText(lists.get(position).getName());
            holder.tvNumber.setText(lists.get(position).getNumber());
        }
        return convertView;
    }

    private static class ViewHolder{
        TextView tvName;
        TextView tvNumber;
        ImageView ivPicture;
    }
}
