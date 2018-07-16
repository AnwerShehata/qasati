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

public class masrahiat extends AppCompatActivity {

    private RecyclerView recyclerView_masrahiat;
    private RecyclerView.Adapter adapter_masrahiat;
    private List<DataMasrahiat> dataMasrahiats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masrahiat);

        recyclerView_masrahiat = findViewById(R.id.recyclerView_masrahiat);
        recyclerView_masrahiat.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager_masrahiat =new GridLayoutManager(this,3);
        recyclerView_masrahiat.setLayoutManager(gridLayoutManager_masrahiat);


        dataMasrahiats = new ArrayList<>();

        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));
        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));
        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));
        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));
        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));
        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));
        dataMasrahiats.add(new DataMasrahiat("قصص السندباد",R.drawable.poster1));

        adapter_masrahiat = new myAdapter_masrahiat(dataMasrahiats,this);
        recyclerView_masrahiat.setAdapter(adapter_masrahiat);


    }
    /*
    *
    *
    *
    *
    *
    */
    //---------------------------------- Start Class  Data Recycler View --------------------------------------
    class DataMasrahiat{
        private String text_masrahiat;
        private int imagePoster_masrahiat;

       public DataMasrahiat(String text_masrahiat, int imagePoster_masrahiat) {
           this.text_masrahiat = text_masrahiat;
           this.imagePoster_masrahiat = imagePoster_masrahiat;
       }

       public String getText_masrahiat() {
           return text_masrahiat;
       }

       public int getImagePoster_masrahiat() {
           return imagePoster_masrahiat;
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

    class myAdapter_masrahiat extends RecyclerView.Adapter<myAdapter_masrahiat.ViewHolder>{

        private List<DataMasrahiat> dataMasrahiatList;
        private Context context;

        public myAdapter_masrahiat(List<DataMasrahiat> dataMasrahiatList, Context context) {
            this.dataMasrahiatList = dataMasrahiatList;
            this.context = context;
        }

        @NonNull
        @Override
        public myAdapter_masrahiat.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View vv = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_children,parent,false);
            return new ViewHolder(vv);
        }

        @Override
        public void onBindViewHolder(@NonNull final myAdapter_masrahiat.ViewHolder holder, int position) {
            holder.text_masrahiat.setText(dataMasrahiatList.get(position).getText_masrahiat());
            holder.image_masrahiat.setImageResource(dataMasrahiatList.get(position).getImagePoster_masrahiat());

            holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Title = holder.text_masrahiat.getText().toString();
                    Toast.makeText(context, Title, Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return dataMasrahiatList.size();
        }


        //--------------- inner Class-----
        public  class ViewHolder extends RecyclerView.ViewHolder{

            TextView text_masrahiat;
            ImageView image_masrahiat;
            ConstraintLayout constraintLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                text_masrahiat = itemView.findViewById(R.id.text_NameBook);
                image_masrahiat = itemView.findViewById(R.id.imagePosterBook);
                constraintLayout = itemView.findViewById(R.id.constraintLayout_children);
            }


        }
    }

    //---------------------------------- End Class  myAdapter --------------------------------------






}
