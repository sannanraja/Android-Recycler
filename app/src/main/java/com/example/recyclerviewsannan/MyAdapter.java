package com.example.recyclerviewsannan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Movie>movieList;

    public MyAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row,parent,false
        );
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
Movie movie= movieList.get(position);
holder.teamname.setText(movie.getTeamname());
        holder.teamlocation.setText(movie.getTeamlocation());
        holder.teamdate.setText(movie.getTeamdate());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


    public class MyViewHolder  extends RecyclerView.ViewHolder{
       public TextView teamname,teamlocation,teamdate;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            teamname= itemView.findViewById(R.id.teamnamess);
            teamlocation= itemView.findViewById(R.id.teamlocationss);

            teamdate= itemView.findViewById(R.id.teamdatess);


        }
    }
}
