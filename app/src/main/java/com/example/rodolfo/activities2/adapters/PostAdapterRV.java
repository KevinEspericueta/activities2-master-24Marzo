package com.example.rodolfo.activities2.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rodolfo.activities2.R;
import com.example.rodolfo.activities2.models.Post;

import java.util.ArrayList;

/**
 * Created by rodolfo on 17/03/18.
 */

public class PostAdapterRV extends RecyclerView.Adapter<PostAdapterRV.PostViewHolder> {
    private ArrayList<Post> posts;  // Informacion que se cargara en las Cards
    private int resource;           // Layout de nuestra Card
    private Activity activity;      // Actividad donde estara nuestro RV

    /*
    *  Constructor
    * */
    public PostAdapterRV(ArrayList<Post> posts, int resource, Activity activity) {
        this.posts = posts;
        this.resource = resource;
        this.activity = activity;
    }


    /*
    *  Crea las cards que usaremos en nuestro Recycler View
    *  a partir e nuestro card_layout (resource) y el parent
    *  y la asigna a un PostHolder para modificar sus elementos
    * */
    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);

        return new PostViewHolder(card);
    }

    /*
    *  Utiliza un objeto postHolder para hacer un update de los
    *  datos de un post y mostrarlos en la Card
    * */
    @Override
    public void onBindViewHolder(PostViewHolder postHolder, int position) {
        Post post = posts.get(position);

        postHolder.titleCard.setText(post.getTitle());
        postHolder.authorCard.setText(post.getAuthor());
    }

    /*
    *  Regresa la cantidad de post en nuestro Recycler View
    * */
    @Override
    public int getItemCount() {
        return posts.size();
    }

    /*
    *  Clase: PostViewHolder
    *   Nos ayuda a manipular los elementos de nuestras Cards
    *   de una forma mas sencilla. Cada objeto PostViewHolder
    *   se liga a un View creado a partir de card_view.xml
    * */
    public class PostViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageCard;
        private TextView titleCard;
        private TextView authorCard;

        public PostViewHolder(View cardView) {
            super(cardView);

            imageCard = cardView.findViewById(R.id.imageCard);
            titleCard = cardView.findViewById(R.id.titleCard);
            authorCard = cardView.findViewById(R.id.authorCard);
        }
    }
}
