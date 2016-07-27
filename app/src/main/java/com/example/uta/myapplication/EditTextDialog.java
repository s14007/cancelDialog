package com.example.uta.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class EditTextDialog extends DialogFragment {

    private DialogInterface.OnClickListener okClickListener = null;
    private DialogInterface.OnClickListener cancelClickListener = null;
    private EditText editText;

    @Override
    public Dialog onCreateDialog(Bundle safedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.login, null);

        return new AlertDialog.Builder(getActivity())
                .setView(view)
                .show();
    }
}
