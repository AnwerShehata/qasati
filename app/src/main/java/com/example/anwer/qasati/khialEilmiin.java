package com.example.anwer.qasati;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class khialEilmiin extends AppCompatActivity {


    private RecyclerView recyclerView_khialEilmiin;
    private RecyclerView.Adapter adapter_khialEilmiin;
    private List<DatakhialEilmiinBook> datakhialEilmiin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khial_eilmiin);

        recyclerView_khialEilmiin = findViewById(R.id.recyclerView_khialEilmiin);
        recyclerView_khialEilmiin.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager_khialEilmiin  = new GridLayoutManager(this,3);
        recyclerView_khialEilmiin.setLayoutManager(gridLayoutManager_khialEilmiin);

        datakhialEilmiin = new ArrayList<>();
        datakhialEilmiin.add(new DatakhialEilmiinBook("شجرة الحياة",R.drawable.poster1));
        datakhialEilmiin.add(new DatakhialEilmiinBook("شجرة الحياة",R.drawable.poster1));
        datakhialEilmiin.add(new DatakhialEilmiinBook("شجرة الحياة",R.drawable.poster1));
        datakhialEilmiin.add(new DatakhialEilmiinBook("شجرة الحياة",R.drawable.poster1));
        datakhialEilmiin.add(new DatakhialEilmiinBook("شجرة الحياة",R.drawable.poster1));
        datakhialEilmiin.add(new DatakhialEilmiinBook("شجرة الحياة",R.drawable.poster1));

        adapter_khialEilmiin = new myAdapter_khialEilmiin(datakhialEilmiin,this);
        recyclerView_khialEilmiin.setAdapter(adapter_khialEilmiin);

    }
}

//---------------------------------- Start Class  Data Recycler View --------------------------------------
class DatakhialEilmiinBook{

    private String text_NameBook_khial;
    private int imagePosterBook_khial;

    public DatakhialEilmiinBook(String text_NameBook_khial, int imagePosterBook_khial) {
        this.text_NameBook_khial = text_NameBook_khial;
        this.imagePosterBook_khial = imagePosterBook_khial;
    }

    public String getText_NameBook_khial() {
        return text_NameBook_khial;
    }

    public int getImagePosterBook_khial() {
        return imagePosterBook_khial;
    }
}
//---------------------------------- End Class  Data Recycler View --------------------------------------
/*
 *
 *
 *
 *
 *
 */
//---------------------------------- Start Class  myAdapter --------------------------------------
class myAdapter_khialEilmiin extends RecyclerView.Adapter<myAdapter_khialEilmiin.ViewHolder>{

    private List<DatakhialEilmiinBook> datakhialEilmiin;
    private Context context_khialEilmiin;

    public myAdapter_khialEilmiin(List<DatakhialEilmiinBook> datakhialEilmiin, Context context_khialEilmiin) {
        this.datakhialEilmiin = datakhialEilmiin;
        this.context_khialEilmiin = context_khialEilmiin;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_children,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView_khialEilmiin.setText(datakhialEilmiin.get(position).getText_NameBook_khial());
        holder.imageView_khialEilmiin.setImageResource(datakhialEilmiin.get(position).getImagePosterBook_khial());



    }

    @Override
    public int getItemCount() {
        return datakhialEilmiin.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView_khialEilmiin;
        ImageView imageView_khialEilmiin;
        ConstraintLayout constraintLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            textView_khialEilmiin =itemView.findViewById(R.id.text_NameBook);
            imageView_khialEilmiin = itemView.findViewById(R.id.imagePosterBook);
            constraintLayout = itemView.findViewById(R.id.constraintLayout_children);
        }
    }




}

//---------------------------------- End Class  myAdapter --------------------------------------

