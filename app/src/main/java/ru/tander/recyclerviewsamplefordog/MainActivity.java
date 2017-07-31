package ru.tander.recyclerviewsamplefordog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Dog> dogList = generateRandomDogList();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerDogAdapter(dogList));
    }

    private List<Dog> generateRandomDogList() {
        List<Dog> dogList = new ArrayList<>();
        for(int i=0; i< 100; i++) {
            Dog dog = new Dog();
            dog.setName("Alexey id: "+i);
            dog.setAge(21);
            dog.setSpecies("Motilek");
            dogList.add(dog);
        }
        return dogList;
    }
}
