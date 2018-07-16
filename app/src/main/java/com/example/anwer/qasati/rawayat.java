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

public class rawayat extends AppCompatActivity {

    private RecyclerView recyclerView_rawayat;
    private RecyclerView.Adapter adapter_rawayat;
    private List<Data_rawayat> datarawayat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rawayat);
        recyclerView_rawayat = findViewById(R.id.recyclerView_rawayat);

        recyclerView_rawayat.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView_rawayat .setLayoutManager(gridLayoutManager);

        datarawayat = new ArrayList<>();
        datarawayat.add(new Data_rawayat("شجرة الحياة",R.drawable.poster1));
        datarawayat.add(new Data_rawayat("شجرة الحياة",R.drawable.poster1));
        datarawayat.add(new Data_rawayat("شجرة الحياة",R.drawable.poster1));
        datarawayat.add(new Data_rawayat("شجرة الحياة",R.drawable.poster1));
        adapter_rawayat = new myAdapter_rawayat(datarawayat,this);
        recyclerView_rawayat.setAdapter(adapter_rawayat);




    }




    //---------------------------------- Start Class  Data Recycler View ----------------------------
    class Data_rawayat{
        private String text_rawayat;
        private int image_rawayat;

        public Data_rawayat(String text_rawayat, int image_rawayat) {
            this.text_rawayat = text_rawayat;
            this.image_rawayat = image_rawayat;
        }

        public String getText_rawayat() {
            return text_rawayat;
        }

        public int getImage_rawayat() {
            return image_rawayat;
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
    class myAdapter_rawayat extends RecyclerView.Adapter<myAdapter_rawayat.ViewHolder>{

        private List<Data_rawayat> data_rawayats;
        private Context context_rawayat;

        public myAdapter_rawayat(List<Data_rawayat> data_rawayats, Context context_rawayat) {
            this.data_rawayats = data_rawayats;
            this.context_rawayat = context_rawayat;
        }


        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View vvv = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_children,parent,false);
            return new ViewHolder(vvv);
        }

        @Override
        public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
            holder.text_Book_rawayat.setText(data_rawayats.get(position).getText_rawayat());
            holder.imageBook_rawayat.setImageResource(data_rawayats.get(position).getImage_rawayat());

            holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Title = holder.text_Book_rawayat.getText().toString();
                    Toast.makeText(context_rawayat, Title, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getItemCount() {
            return data_rawayats.size();
        }


        //------------------ iner class --------------------------
        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView text_Book_rawayat;
            ImageView imageBook_rawayat;
            ConstraintLayout constraintLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                text_Book_rawayat = itemView.findViewById(R.id.text_NameBook);
                imageBook_rawayat = itemView.findViewById(R.id.imagePosterBook);
                constraintLayout = itemView.findViewById(R.id.constraintLayout_children);

            }
        }
    }

}
