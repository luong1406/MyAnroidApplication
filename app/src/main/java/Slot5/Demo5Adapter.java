package Slot5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

public class Demo5Adapter extends BaseAdapter {
    private List<Demo5Product> mList;
    private Context mContext;

    public Demo5Adapter(List<Demo5Product> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Demo51ViewHolder holder;
        if(convertView==null){
            //create a blank view
            convertView= LayoutInflater.from(mContext).inflate(R.layout.activity_demo5_main,parent,false);
            //refer ids of item_view
            holder=new Demo51ViewHolder();
            holder.img=convertView.findViewById(R.id.demo5_itemview_img);
            holder.tvId=convertView.findViewById(R.id.demo5_itemview_tvID);
            holder.tvName=convertView.findViewById(R.id.demo5_itemview_tvName);
            holder.tvPrice=convertView.findViewById(R.id.demo5_itemview_tvPrice);
            convertView.setTag(holder);//create a template for later
        }
        else {//if exists view -> get view
            holder=(Demo51ViewHolder) convertView.getTag();
        }
        //set data
        Demo5Product product=mList.get(position);
        if(product!=null){
            holder.img.setImageResource(R.drawable.android);
            holder.tvId.setText(product.getId());
            holder.tvName.setText(product.getName());
            holder.tvPrice.setText(String.valueOf(product.getPrice()));
        }

        return convertView;
    }

    static class Demo51ViewHolder{
        ImageView img;
        TextView tvId,tvName,tvPrice;
    }
}
