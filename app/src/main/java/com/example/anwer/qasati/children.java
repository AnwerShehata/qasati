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

public class children extends AppCompatActivity {

    private RecyclerView recyclerView_children;
    private RecyclerView.Adapter adapter_children;
    private List<DataChildrenBook> dataChildrenBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);
        recyclerView_children = findViewById(R.id.recyclerView_children);

        recyclerView_children.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView_children.setLayoutManager(gridLayoutManager);

        dataChildrenBooks = new ArrayList<>();
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("شجرة الحياة",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("صِرَاعُ الأَخَويْنِ",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("عَجِيبَةُ وَعَجِيبَةُ",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("السَّعيدُ حَسَن",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("أَمِيرُ الْعَفَارِيتِ",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("جَبَّارَةُ الْغَابَةِ",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قَاهِرُ الْجَبَابِرَةِ",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("أُمُّ سِنْدٍ وَأُمُّ هِنْدٍ",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("ليلى والذئب",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));
        dataChildrenBooks.add(new DataChildrenBook("قصة السندباد العظيم",R.drawable.poster1));

        adapter_children = new myAdapter_children(dataChildrenBooks,this);
        recyclerView_children.setAdapter(adapter_children);
    }
}


//---------------------------------- Start Class  Data Recycler View --------------------------------------
class DataChildrenBook{
    private String text_NameBook_children;
    private int imagePosterBook_children;

    public DataChildrenBook(String text_NameBook_children, int imagePosterBook_children) {
        this.text_NameBook_children = text_NameBook_children;
        this.imagePosterBook_children = imagePosterBook_children;
    }

    public String getText_NameBook_children() {
        return text_NameBook_children;
    }

    public int getImagePosterBook_children() {
        return imagePosterBook_children;
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
class myAdapter_children extends RecyclerView.Adapter<myAdapter_children.ViewHolder>{

    private List<DataChildrenBook> dataChildrenBooks;
    private Context context_children;

    public myAdapter_children(List<DataChildrenBook> dataChildrenBooks, Context context_children) {
        this.dataChildrenBooks = dataChildrenBooks;
        this.context_children = context_children;
    }

    @NonNull
    @Override
    public myAdapter_children.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custem_children,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myAdapter_children.ViewHolder holder, int position) {
       holder.text_Book_children.setText(dataChildrenBooks.get(position).getText_NameBook_children());
        holder.imageBook_children.setImageResource(dataChildrenBooks.get(position).getImagePosterBook_children());

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Title = holder.text_Book_children.toString();
                switch (Title)
                {

                }
                //--- لتغير الون عند الضغط
                v.setSelected(true);
            }

        });

    }

    @Override
    public int getItemCount() {
        return dataChildrenBooks.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView text_Book_children;
        ImageView imageBook_children;
        ConstraintLayout constraintLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            text_Book_children = itemView.findViewById(R.id.text_NameBook);
            imageBook_children = itemView.findViewById(R.id.imagePosterBook);
            constraintLayout = itemView.findViewById(R.id.constraintLayout_children);

        }
    }
}
//---------------------------------- End Class  myAdapter --------------------------------------

