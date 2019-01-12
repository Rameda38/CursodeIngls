package com.example.ademar.cursodeingls.fragments;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ademar.cursodeingls.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BichosFragment extends Fragment implements View.OnClickListener {

    ImageView iv_dog,iv_cat,iv_monk,iv_sheep,iv_lion,iv_cow;
    MediaPlayer mediaPlayer ;
    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);
        iv_dog = view.findViewById(R.id.iv_dog);
        iv_cat = view.findViewById(R.id.iv_cat);
        iv_cow = view.findViewById(R.id.iv_cow);
        iv_lion = view.findViewById(R.id.iv_lion);
        iv_monk = view.findViewById(R.id.iv_monk);
        iv_sheep = view.findViewById(R.id.iv_sheep);


        iv_dog.setOnClickListener(this);
        iv_cat.setOnClickListener(this);
        iv_cow.setOnClickListener(this);
        iv_lion.setOnClickListener(this);
        iv_monk.setOnClickListener(this);
        iv_sheep.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_dog:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.dog);
                tocarSom();
                break;
            case R.id.iv_cat:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cat);
                tocarSom();
                break;
            case R.id.iv_lion:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.lion);
                tocarSom();
                break;
            case R.id.iv_monk:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.monkey);
                tocarSom();
                break;
            case R.id.iv_sheep:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sheep);
                tocarSom();
                break;
            case R.id.iv_cow:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cow);
                tocarSom();
                break;
        }



    }

    private void tocarSom(){
        if (mediaPlayer!=null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }

    }
}
