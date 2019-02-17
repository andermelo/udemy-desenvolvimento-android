package me.andersonmelo.aprendaingles.fragment;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import me.andersonmelo.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {

    private ImageButton button1, button2, button3, button4,
            button5, button6;
    private MediaPlayer mediaPlayer;


    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        button1 = view.findViewById(R.id.Button1);
        button2 = view.findViewById(R.id.Button2);
        button3 = view.findViewById(R.id.Button3);
        button4 = view.findViewById(R.id.Button4);
        button5 = view.findViewById(R.id.Button5);
        button6 = view.findViewById(R.id.Button6);

        //Aplica eventos de click
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        return view;
    }



    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.Button1 :
                mediaPlayer = mediaPlayer.create(getActivity(), R.raw.one);
                tocarSom();
                break;
            case R.id.Button2 :
                mediaPlayer = mediaPlayer.create(getActivity(), R.raw.two);
                tocarSom();
                break;
            case R.id.Button3 :
                mediaPlayer = mediaPlayer.create(getActivity(), R.raw.three);
                tocarSom();
                break;
            case R.id.Button4 :
                mediaPlayer = mediaPlayer.create(getActivity(), R.raw.four);
                tocarSom();
                break;
            case R.id.Button5 :
                mediaPlayer = mediaPlayer.create(getActivity(), R.raw.five);
                tocarSom();
                break;
            case R.id.Button6 :
                mediaPlayer = mediaPlayer.create(getActivity(), R.raw.six);
                tocarSom();
                break;
        }
    }

    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

