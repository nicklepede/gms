package com.google.android.gms.common.ui;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.android.Activity;
import defpackage.artd;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ErrorDialogChimeraActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    private int a;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        setResult(0);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        setResult(this.a);
        finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        int i2 = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE", 0);
        String string = bundle.getString("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE_STR");
        int i3 = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE", 0);
        String string2 = bundle.getString("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR");
        this.a = bundle.getInt("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
        AlertDialog.Builder onCancelListener = new AlertDialog.Builder(this).setNeutralButton(R.string.ok, this).setOnCancelListener(this);
        if (i2 != 0) {
            artd.e(string == null);
            onCancelListener.setTitle(i2);
        } else if (string != null) {
            artd.e(true);
            onCancelListener.setTitle(string);
        }
        if (i3 != 0) {
            artd.e(string2 == null);
            onCancelListener.setMessage(i3);
        } else if (string2 != null) {
            artd.e(true);
            onCancelListener.setMessage(string2);
        }
        AlertDialog create = onCancelListener.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        removeDialog(1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        eike.e(extras);
        showDialog(1, extras);
    }
}
