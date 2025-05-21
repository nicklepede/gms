package com.google.android.gms.drive.deprecation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.drive.deprecation.UpgradeDialogChimeraActivity;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UpgradeDialogChimeraActivity extends qet implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
        } else {
            if (extras.getBoolean("showDialog")) {
                return;
            }
            finish();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        final String string = bundle.getString("callingPackage");
        String string2 = bundle.getString("dialogTitle");
        String string3 = bundle.getString("dialogMessage");
        return new AlertDialog.Builder(this).setTitle(string2).setMessage(string3).setPositiveButton(getString(R.string.drive_deprecation_update_1p_dialog_positive_button_text), new DialogInterface.OnClickListener() { // from class: axlt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UpgradeDialogChimeraActivity upgradeDialogChimeraActivity = UpgradeDialogChimeraActivity.this;
                upgradeDialogChimeraActivity.startActivity(arut.b(string));
                upgradeDialogChimeraActivity.setResult(0);
                upgradeDialogChimeraActivity.finish();
            }
        }).setNegativeButton(getString(R.string.common_dismiss), new DialogInterface.OnClickListener() { // from class: axlu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UpgradeDialogChimeraActivity upgradeDialogChimeraActivity = UpgradeDialogChimeraActivity.this;
                upgradeDialogChimeraActivity.setResult(0);
                upgradeDialogChimeraActivity.finish();
            }
        }).create();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        removeDialog(1);
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        showDialog(1, getIntent().getExtras());
    }
}
