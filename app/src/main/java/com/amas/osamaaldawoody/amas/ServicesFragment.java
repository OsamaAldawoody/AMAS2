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


public class ServicesFragment extends Fragment {
    ImageView labResult;

    ImageView eServices;

    ImageView approvals;

    ImageView childVaccine;

    ImageView familyFiles;

    ImageView insuranceCard;

    ImageView liveChat;

    ImageView medicalPrescription;

    ImageView notification;

    ImageView radiology;

    ImageView requestMedicalReports;

    ImageView sickLeaves;

    ImageView vaccine;

    ImageView vitalSigns;

    ImageView monthlyReports;

    ImageView myDoctor;

    ImageView bookAppointment;

    ImageView tracker;

    ImageView eye;



    private static final String title = "مرحبا";

    private static final String welcomeMessage = "مرحبا بكم فى مجمع اماس فرع سكاكا والخيار قيد الانشاء";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.table_service_layout, container, false);


        labResult = rootView.findViewById(R.id.labResult_image);

        approvals = rootView.findViewById(R.id.approvals_image);

        childVaccine = rootView.findViewById(R.id.childVaccine_image);

        familyFiles = rootView.findViewById(R.id.family_image);

        insuranceCard = rootView.findViewById(R.id.insuranceCard_image);

        liveChat = rootView.findViewById(R.id.lifeChat_image);

        medicalPrescription = rootView.findViewById(R.id.prescription_image);

        myDoctor = rootView.findViewById(R.id.myDoctor_image);

        notification = rootView.findViewById(R.id.notification_image);

        radiology = rootView.findViewById(R.id.radiology_image);

        requestMedicalReports = rootView.findViewById(R.id.requestMedicalReport_image);

        monthlyReports = rootView.findViewById(R.id.monthlyReports_image);

        sickLeaves = rootView.findViewById(R.id.sickLeaves_image);

        vaccine = rootView.findViewById(R.id.vaccine_image);

        vitalSigns = rootView.findViewById(R.id.vitalSigns_image);

        bookAppointment = rootView.findViewById(R.id.bookAppointment_image);

        eServices = rootView.findViewById(R.id.eServices_image);

        tracker = rootView.findViewById(R.id.tracker_image);

        eye = rootView.findViewById(R.id.eye_image);


        labResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        tracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        eServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        bookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        vitalSigns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        vaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        sickLeaves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        monthlyReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        requestMedicalReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        radiology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        liveChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        myDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        labResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        medicalPrescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        insuranceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });


        familyFiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        childVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

        approvals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });



        return rootView;
    }

    @Override
    public void onStart() {
        getActivity().setTitle("Services");
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
