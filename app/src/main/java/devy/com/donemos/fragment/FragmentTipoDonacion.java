package devy.com.donemos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import devy.com.donemos.R;

/**
 * Created by ronald on 21/05/16.
 */
public class FragmentTipoDonacion extends Fragment {

    private TextView tvDinero;
    private TextView tvRopa;
    private TextView tvInsumo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tipo_donacion, container, false);

        tvDinero = (TextView) view.findViewById(R.id.tvDinero);
        tvRopa = (TextView) view.findViewById(R.id.tvRopa);
        tvInsumo = (TextView) view.findViewById(R.id.tvInsumo);

        tvDinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDinero fd = new FragmentDinero();
                callFragment(fd);
            }
        });

        tvRopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentRopa fd = new FragmentRopa();
                callFragment(fd);
            }
        });

        tvInsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentInsumo fd = new FragmentInsumo();
                callFragment(fd);
            }
        });
        return view;
    }

    private void callFragment(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.replace(R.id.fragment1, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
