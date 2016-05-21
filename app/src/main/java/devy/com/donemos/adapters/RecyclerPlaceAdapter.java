package devy.com.donemos.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerPlaceAdapter extends RecyclerView.Adapter<RecyclerPlaceAdapter.PlaceHolder> {

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PlaceHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class PlaceHolder extends RecyclerView.ViewHolder {

        public PlaceHolder(View itemView) {
            super(itemView);
        }
    }

}
