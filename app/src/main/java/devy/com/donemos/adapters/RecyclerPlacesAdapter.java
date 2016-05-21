package devy.com.donemos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import devy.com.donemos.R;
import devy.com.donemos.entidades.PlaceEntity;

/**
 * Created by Steve on 21/05/2016.
 */
public class RecyclerPlacesAdapter extends RecyclerView.Adapter<RecyclerPlacesAdapter.ViewHolder> {

    private List<PlaceEntity> listPlaces;
    private Context context;

    public RecyclerPlacesAdapter(List<PlaceEntity> listPlaces, Context context) {
        this.listPlaces = listPlaces;
        this.context = context;
    }

    @Override
    public RecyclerPlacesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_places, parent, false);
        // Return a new holder instance
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(RecyclerPlacesAdapter.ViewHolder holder, int position) {
        PlaceEntity placeEntity = listPlaces.get(position);


        TextView textViewName = holder.textViewPlaceName;
        TextView textViewDireccion = holder.textViewDireccion;
        LinearLayout layoutPlaces = holder.layoutPlaces;

        textViewName.setText(placeEntity.getNombre());
        textViewDireccion.setText(placeEntity.getDescripcion());

    }

    @Override
    public int getItemCount() {
        return listPlaces.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewPlaceName;
        public TextView textViewDireccion;
        public LinearLayout layoutPlaces;



        public ViewHolder(View itemView) {
            super(itemView);
            textViewPlaceName = (TextView) itemView.findViewById(R.id.textViewPlaceName);
            textViewDireccion = (TextView) itemView.findViewById(R.id.textViewDireccion);
            layoutPlaces = (LinearLayout) itemView.findViewById(R.id.layoutPlace);

        }
    }

}
