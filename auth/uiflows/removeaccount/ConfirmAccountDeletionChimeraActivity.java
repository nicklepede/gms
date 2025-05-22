package com.google.android.gms.auth.uiflows.removeaccount;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity;
import defpackage.afln;
import defpackage.auad;
import defpackage.fmzd;
import defpackage.iri;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConfirmAccountDeletionChimeraActivity extends afln {
    public static final auad h = new auad("Auth", "RemoveAccount", "ConfirmAccountDeletionActivity");

    private final void j() {
        h.d("Showing legacy device credential prompt", new Object[0]);
        try {
            startActivityForResult(new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL"), 0);
        } catch (ActivityNotFoundException unused) {
            h.f("Cannot find the Activity for the challenge.", new Object[0]);
            gT(0, null);
        }
    }

    public final void b() {
        if (fmzd.d()) {
            int i = iri.a;
        }
        j();
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "ConfirmAccountDeletionActivity";
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        gT(i2, null);
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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
            new AlertDialog.Builder(this).setCancelable(false).setTitle(i2).setMessage(i).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: afpg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                    ConfirmAccountDeletionChimeraActivity.this.b();
                }
            }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: afph
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.cancel();
                    ConfirmAccountDeletionChimeraActivity.this.gT(0, null);
                }
            }).create().show();
        } else {
            b();
        }
    }
}
