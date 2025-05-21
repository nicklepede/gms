package com.google.android.gms.auth.uiflows.removeaccount;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity;
import defpackage.adlg;
import defpackage.arxo;
import defpackage.fkio;
import defpackage.ips;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ConfirmAccountDeletionChimeraActivity extends adlg {
    public static final arxo h = new arxo("Auth", "RemoveAccount", "ConfirmAccountDeletionActivity");

    private final void j() {
        h.d("Showing legacy device credential prompt", new Object[0]);
        try {
            startActivityForResult(new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL"), 0);
        } catch (ActivityNotFoundException unused) {
            h.f("Cannot find the Activity for the challenge.", new Object[0]);
            gD(0, null);
        }
    }

    public final void b() {
        if (fkio.d()) {
            int i = ips.a;
        }
        j();
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "ConfirmAccountDeletionActivity";
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        gD(i2, null);
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle == null || !Objects.equals(bundle.getString("caller"), "com.android.managedprovisioning")) {
            r0 = bundle != null && bundle.getBoolean("isLastAccount", true);
            i = R.string.auth_factory_reset_protection_remove_account_confirmation_content;
            i2 = R.string.auth_factory_reset_protection_remove_account_confirmation_title;
        } else {
            i = R.string.auth_factory_reset_protection_remove_account_confirmation_content_by_mp;
            i2 = R.string.auth_factory_reset_protection_remove_account_confirmation_title_by_mp;
        }
        if (r0) {
            new AlertDialog.Builder(this).setCancelable(false).setTitle(i2).setMessage(i).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: adoz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                    ConfirmAccountDeletionChimeraActivity.this.b();
                }
            }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: adpa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.cancel();
                    ConfirmAccountDeletionChimeraActivity.this.gD(0, null);
                }
            }).create().show();
        } else {
            b();
        }
    }
}
