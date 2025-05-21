package com.google.android.gms.significantplaces.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.DeletePlaceChimeraActivity;
import defpackage.capr;
import defpackage.dciw;
import defpackage.fvbo;
import defpackage.ip;
import defpackage.iq;
import defpackage.iro;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class DeletePlaceChimeraActivity extends dciw {
    private final int j = R.style.DeleteMaterialDialogTheme;
    private final boolean k = true;

    @Override // defpackage.dciw
    public final int a() {
        return this.j;
    }

    @Override // defpackage.dciw
    public final iq b(ip ipVar) {
        Bundle extras = getIntent().getExtras();
        final String string = extras != null ? extras.getString("place") : null;
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("name") : null;
        if (string == null || string2 == null) {
            return null;
        }
        Spanned a = iro.a(getResources().getString(R.string.delete_dialog_body, string2, getString(R.string.trusted_places_settings_intent_uri)), 63);
        fvbo.e(a, "fromHtml(...)");
        SpannableString a2 = capr.a(this, a);
        ipVar.j(R.string.delete_dialog_title);
        ipVar.n(a2);
        ipVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: dcji
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                fvbo.f(dialogInterface, "dialog");
                int i2 = dciy.a;
                dciy.b(DeletePlaceChimeraActivity.this);
            }
        });
        ip positiveButton = ipVar.setPositiveButton(R.string.delete_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: dcjj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                fvbo.f(dialogInterface, "<unused var>");
                DeletePlaceChimeraActivity deletePlaceChimeraActivity = DeletePlaceChimeraActivity.this;
                fvgt.b(joo.a(deletePlaceChimeraActivity), null, null, new dcjl(string, deletePlaceChimeraActivity, null), 3);
            }
        });
        positiveButton.l(R.drawable.gs_android_security_privacy_vd_theme_24);
        return positiveButton.create();
    }

    @Override // defpackage.dciw
    public final boolean c() {
        return this.k;
    }
}
