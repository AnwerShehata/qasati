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

public class rihlat extends AppCompatActivity {

    private RecyclerView recyclerView_rihlat;
    private RecyclerView.Adapter adapter_rihlat;
    private List<Data_rihlat> data_rihlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rihlat);
        recyclerView_rihlat = findViewById(R.id.recyclerView_rihlat);


        recyclerView_rihlat.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,3);
        recyclerView_rihlat.setLayoutManager(gridLayoutManager);

        data_rihlat = new ArrayList<>();
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        data_rihlat.add(new Data_rihlat("شجرة الحياة",R.drawable.poster1));
        adapter_rihlat = new myAdapter_rihlat(data_rihlat,this);
        recyclerView_rihlat.setAdapter(adapter_rihlat);

    }


    //---------------------------------- Start Class  Data Recycler View ----------------------------
    class Data_rihlat{
        private String text_rihlat;
        private int image_rihlat;

        public Data_rihlat(String text_rihlat, int image_rihlat) {
            this.text_rihlat = text_rihlat;
            this.image_rihlat = image_rihlat;
        }

        public String getText_rihlat() {
            return text_rihlat;
        }

        public int getImage_rihlat() {
            return image_rihlat;
        }
    }
    //---------------------------------- End Class  Data Recycler View ------------------------------
    /*
    *
    *
    *
    *
    *
    *
    */
    //---------------------------------- Start Class  myAdapter --------------------------------------
    class myAdapter_rihlat extends RecyclerView.Adapter<myAdapter_rihlat.ViewHolder>{

        private List<Data_rihlat> data_rihlat;
        private Context context_rihlat;

        public myAdapter_rihlat(List<Data_rihlat> data_rihlat, Context context_rihlat) {
            this.data_rihlat = data_rihlat;
            this.context_rihlat = context_rihlat;
        }

        @NonNull
        @Override
        public myAdapter_rihlat.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View vvd = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_children,parent,false);
            return new ViewHolder(vvd);
        }

        @Override
        public void onBindViewHolder(@NonNull final myAdapter_rihlat.ViewHolder holder, int position) {
            holder.text_Book_rihlat.setText(data_rihlat.get(position).getText_rihlat());
            holder.imageBook_rihlat.setImageResource(data_rihlat.get(position).getImage_rihlat());

            holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String title = holder.text_Book_rihlat.getText().toString();
                    Toast.makeText(context_rihlat, title, Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return data_rihlat.size();
        }


        //----------------- iner class-------------------
        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView text_Book_rihlat;
            ImageView imageBook_rihlat;
            ConstraintLayout constraintLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                text_Book_rihlat = itemView.findViewById(R.id.text_NameBook);
                imageBook_rihlat = itemView.findViewById(R.id.imagePosterBook);
                constraintLayout = itemView.findViewById(R.id.constraintLayout_children);

            }
        }


    }


}
