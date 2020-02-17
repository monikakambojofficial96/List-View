package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterListView extends ArrayAdapter {
    private String[] fruitNames;
    private String[] description;
    private Integer[] imageId;
    private Activity context;

    public AdapterListView(Activity context, String[] fruitNames, String[] description, Integer[] imageId) {
        super ( context, R.layout.list_view_layout,fruitNames );

        this.context=context;
        this.fruitNames=fruitNames;
        this.description=description;
        this.imageId=imageId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view=convertView;
        ViewHolder viewHolder=null;
        if(view==null){
            LayoutInflater layoutInflater=context.getLayoutInflater ();
            view=layoutInflater.inflate ( R.layout.list_view_layout,null,false );
            viewHolder=new ViewHolder ( view );
            view.setTag ( viewHolder );
        }
        else
        {
            viewHolder= (ViewHolder) view.getTag();
        }

        viewHolder.imageView.setImageResource ( imageId[position] );
        viewHolder.textViewFirst.setText ( fruitNames[position] );
        viewHolder.textViewDesc.setText ( description[position] );

        return view;
    }

    class ViewHolder{

        TextView textViewFirst;
        TextView textViewDesc;
        ImageView imageView;
//        CheckBox checkBox;

        ViewHolder(View view){

            textViewFirst=view.findViewById ( R.id.activity_list_view_layout_tvfruits_name );
            textViewDesc=view.findViewById ( R.id.activity_list_view_layout_description );
            imageView=view.findViewById ( R.id.activity_list_view_layout_image_view );
//            checkBox=view.findViewById ( R.id.activity_list_view_layout_checkbox );
//            checkBox.setOnCheckedChangeListener ( MainActivity,context );


        }


    }
}
