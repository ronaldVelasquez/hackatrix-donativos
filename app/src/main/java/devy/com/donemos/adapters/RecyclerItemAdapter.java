package devy.com.donemos.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tismart.tsmviews.views.CustomButton;
import com.tismart.tsmviews.views.CustomTextView;

import java.util.ArrayList;
import java.util.List;

import devy.com.donemos.R;
import devy.com.donemos.entidades.ItemEntity;

public class RecyclerItemAdapter extends RecyclerView.Adapter<RecyclerItemAdapter.PlaceHolder> {

    private List<ItemEntity> list;
    private List<ItemEntity> newList;

    public RecyclerItemAdapter(List<ItemEntity> list) {
        this.list = list;
        this.newList = list;
    }

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PlaceHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_donate, parent, false));
    }

    @Override
    public void onBindViewHolder(final PlaceHolder holder, final int position) {
        final ItemEntity itemEntity = list.get(position);
        holder.tvName.setText(itemEntity.getName());
        holder.tvNumber.setText("00");

        holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItems(position, holder.tvNumber);
            }
        });
        holder.btnLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractionItem(position, holder.tvNumber);
            }
        });

    }
    private void addItems(int position, CustomTextView tvNumber){
        int number = Integer.valueOf(tvNumber.getText().toString());
        number = number + 1;
        tvNumber.setText(number < 10 ? "0" + number : String.valueOf(number));
        newList.get(position).setNumber(number);
    }

    private void subtractionItem(int position, CustomTextView tvNumber) {
        int number = Integer.valueOf(tvNumber.getText().toString());
        if (number != 0) {
            number = number - 1;
        }
        tvNumber.setText(number < 10 ? "0" + number : String.valueOf(number));
        newList.get(position).setNumber(number);
    }

    public void addList(ArrayList<ItemEntity> itemEntities){
        this.list = itemEntities;
        this.newList = itemEntities;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class PlaceHolder extends RecyclerView.ViewHolder {
        CustomTextView tvName;
        CustomTextView tvNumber;
        CustomButton btnMore;
        CustomButton btnLess;

        public PlaceHolder(View itemView) {
            super(itemView);
            tvName = (CustomTextView) itemView.findViewById(R.id.tv_name_type);
            tvNumber = (CustomTextView) itemView.findViewById(R.id.tv_number);
            btnMore = (CustomButton) itemView.findViewById(R.id.btn_more);
            btnLess = (CustomButton) itemView.findViewById(R.id.btn_less);
        }
    }

}
