package com.example.uta.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public class MyDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // ダイアログ生成
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("DialogFragment Title");
        dialog.setMessage("Message");
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // do nothing.
                Log.d("MyDialogFragment", "onClick");
            }
        });
        this.setCancelable(false); // DialogFragment#setCancelableを使用すること
        return dialog.create();
    }
}
