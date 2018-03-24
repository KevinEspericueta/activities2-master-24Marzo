package com.example.rodolfo.activities2.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.rodolfo.activities2.R;
import com.example.rodolfo.activities2.adapters.PostAdapterRV;
import com.example.rodolfo.activities2.models.Post;
import com.example.rodolfo.activities2.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        User user = bundle.getParcelable("user");

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_LONG).show();

        RecyclerView postList = findViewById(R.id.post_recycler_view);

        LinearLayoutManager manager = new LinearLayoutManager(getBaseContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        postList.setLayoutManager(manager);

        PostAdapterRV postAdapter = new PostAdapterRV(getPosts(),R.layout.cardview_post, this);

        postList.setAdapter(postAdapter);
    }

    public ArrayList<Post> getPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("","No creeras", "Pancho"));
        posts.add(new Post("","No creeras", "Pancho"));
        posts.add(new Post("","No creeras", "Pancho"));
        posts.add(new Post("","No creeras", "Pancho"));

        return posts;
    }
}
