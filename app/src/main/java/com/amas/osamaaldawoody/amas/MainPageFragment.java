package com.amas.osamaaldawoody.amas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MainPageFragment extends Fragment {
    ImageView myAppointment;

    ImageView searchAppointment;

    ImageView pharmacy;

    ImageView career;

    ImageView eye;

    ImageView feedback;

    ImageView h2o;

    ImageView healthWeather;

    ImageView tracker;

    ImageView healthConverter;

    ImageView news;

    ImageView virtualTour;

    ImageView virtualAccessibility;

    ImageView location;

    ImageView bloodDonation;

    ImageView medicalCalc;

    private static final String title = "مرحبا";

    private static final String welcomeMessage = "مرحبا بكم فى مجمع اماس فرع سكاكا والخيار قيد الانشاء";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.table_home_layout, container, false);

        myAppointment = rootView.findViewById(R.id.myAppointment_image);

        medicalCalc =(ImageView) rootView.findViewById(R.id.medicalCalc_image);

        searchAppointment = rootView.findViewById(R.id.searchAppointment_button);

        healthConverter = rootView.findViewById(R.id.healthConverter_image);

        pharmacy = rootView.findViewById(R.id.pharmacy_button);

        career = rootView.findViewById(R.id.career_image);

        bloodDonation = rootView.findViewById(R.id.bloodDonation_image);

        feedback = rootView.findViewById(R.id.feedback_image);

        healthWeather = rootView.findViewById(R.id.healthWeather_image);

        location = rootView.findViewById(R.id.location_image);

        news = rootView.findViewById(R.id.news_image);

        virtualTour = rootView.findViewById(R.id.virtualTour_image);

        virtualAccessibility = rootView.findViewById(R.id.h2o_image);

        h2o= rootView.findViewById(R.id.virtualAccessibility_image);

        h2o.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        bloodDonation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        healthWeather.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        location.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        virtualTour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        virtualAccessibility.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        myAppointment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        searchAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        medicalCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        healthConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        return rootView;
    }

    @Override
    public void onStart() {
        getActivity().setTitle("Home");
        super.onStart();
    }

    private void Welcome(){
        new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(welcomeMessage)
                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
