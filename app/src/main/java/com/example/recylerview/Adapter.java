package com.example.recylerview;

import android.media.Image;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList){ this.userList=userList; }



    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);

    }

    // Set data ke dalam UserList
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource= userList.get(position).getImageview1();
        String name= userList.get(position).getTextview1();
        String msg= userList.get(position).getTextview2();
        String time= userList.get(position).getTextview3();
        String line= userList.get(position).getDivider();

        holder.setData(resource,name,msg,time,line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView picis1;
        private TextView txt_picisan;
        private TextView txtpicisan_msg;
        private TextView txtpicisan_time;
        private TextView txtpicisan_divider;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            picis1=itemView.findViewById(R.id.picis1);
            txt_picisan=itemView.findViewById(R.id.txt_picisan);
            txtpicisan_msg=itemView.findViewById(R.id.txtpicisan_msg);
            txtpicisan_time=itemView.findViewById(R.id.txtpicisan_time);
            txtpicisan_divider=itemView.findViewById(R.id.txtpicisan_divider);

        }

        public void setData(int resource, String name, String msg, String time, String line) {

            picis1.setImageResource(resource);
            txt_picisan.setText(name);
            txtpicisan_time.setText(time);
            txtpicisan_msg.setText(msg);
            txtpicisan_divider.setText(line);
        }
    }
}
