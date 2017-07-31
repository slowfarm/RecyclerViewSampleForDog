package ru.tander.recyclerviewsamplefordog;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


class RecyclerDogAdapter extends RecyclerView.Adapter<RecyclerDogAdapter.ViewHolder> {

    private List<Dog> mDogList;

    RecyclerDogAdapter(List<Dog> dogList) {
        mDogList = dogList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog = mDogList.get(position);
        holder.name.setText(dog.getName());
        holder.age.setText(String.valueOf(dog.getAge()));
        holder.species.setText(dog.getSpecies());
    }

    @Override
    public int getItemCount() {
        return mDogList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView age;
        private final TextView species;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            species = itemView.findViewById(R.id.species);
        }
    }
}
