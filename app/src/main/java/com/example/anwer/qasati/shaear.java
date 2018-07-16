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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class shaear extends AppCompatActivity {

    private RecyclerView recyclerView_shaear;
    private RecyclerView.Adapter adapter_shaear;
    private List<Data_shaear> data_shaear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaear);

        recyclerView_shaear = findViewById(R.id.recyclerView_shaear);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,3);
        recyclerView_shaear.setLayoutManager(gridLayoutManager);

        data_shaear  = new ArrayList<>();

        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));
        data_shaear.add(new Data_shaear("شجرة الحياة",R.drawable.poster1));

        adapter_shaear = new myAdapter_shaear(data_shaear,this);
        recyclerView_shaear.setAdapter(adapter_shaear);

    }
}


//---------------------------------- Start Class  Data Recycler View ----------------------------
class Data_shaear{
    private String text_shaear;
    private int image_shaear;

    public Data_shaear(String text_shaear, int image_shaear) {

        this.text_shaear = text_shaear;
        this.image_shaear = image_shaear;
    }

    public String getText_shaear() {
        return text_shaear;
    }

    public int getImage_shaear() {
        return image_shaear;
    }


}
//---------------------------------- End Class  Data Recycler View ------------------------------
/*
 *
 *
 *
 *
 *
 */
//---------------------------------- Start Class  myAdapter --------------------------------------
class myAdapter_shaear extends RecyclerView.Adapter<myAdapter_shaear.ViewHolder>{
    private List<Data_shaear> data_shaear;
    private Context context_shaear;

    public myAdapter_shaear(List<Data_shaear> data_shaear, Context context_shaear) {
        this.data_shaear = data_shaear;
        this.context_shaear = context_shaear;
    }

    @NonNull
    @Override
    public myAdapter_shaear.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vq = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_children,parent,false);
        return new ViewHolder(vq);
    }

    @Override
    public void onBindViewHolder(@NonNull final myAdapter_shaear.ViewHolder holder, int position) {
        holder.text_Book_shaear.setText(data_shaear.get(position).getText_shaear());
        holder.imageBook_shaear.setImageResource(data_shaear.get(position).getImage_shaear());

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Title = holder.text_Book_shaear.getText().toString();
                Toast.makeText(context_shaear,  Title, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return data_shaear.size();
    }



    //------------------ iner class --------------------------
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView text_Book_shaear;
        ImageView imageBook_shaear;
        ConstraintLayout constraintLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            text_Book_shaear = itemView.findViewById(R.id.text_NameBook);
            imageBook_shaear = itemView.findViewById(R.id.imagePosterBook);
            constraintLayout = itemView.findViewById(R.id.constraintLayout_children);

        }
    }


}



