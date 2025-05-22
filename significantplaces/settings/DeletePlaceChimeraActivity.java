package com.google.android.gms.significantplaces.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.DeletePlaceChimeraActivity;
import defpackage.ccyh;
import defpackage.detc;
import defpackage.fxxm;
import defpackage.ip;
import defpackage.iq;
import defpackage.ite;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DeletePlaceChimeraActivity extends detc {
    private final int j = R.style.DeleteMaterialDialogTheme;
    private final boolean k = true;

    @Override // defpackage.detc
    public final int a() {
        return this.j;
    }

    @Override // defpackage.detc
    public final iq b(ip ipVar) {
        Bundle extras = getIntent().getExtras();
        final String string = extras != null ? extras.getString("place") : null;
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("name") : null;
        if (string == null || string2 == null) {
            return null;
        }
        Spanned a = ite.a(getResources().getString(R.string.delete_dialog_body, string2, getString(R.string.trusted_places_settings_intent_uri)), 63);
        fxxm.e(a, "fromHtml(...)");
        SpannableString a2 = ccyh.a(this, a);
        ipVar.l(R.string.delete_dialog_title);
        ipVar.p(a2);
        ipVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: deto
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                fxxm.f(dialogInterface, "dialog");
                int i2 = dete.a;
                dete.b(DeletePlaceChimeraActivity.this);
            }
        });
        ipVar.setPositiveButton(R.string.delete_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: detp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                fxxm.f(dialogInterface, "<unused var>");
                DeletePlaceChimeraActivity deletePlaceChimeraActivity = DeletePlaceChimeraActivity.this;
                fycr.b(jvd.a(deletePlaceChimeraActivity), null, null, new detr(string, deletePlaceChimeraActivity, null), 3);
            }
        });
        ipVar.n(R.drawable.gs_android_security_privacy_vd_theme_24);
        return ipVar.create();
    }

    @Override // defpackage.detc
    public final boolean c() {
        return this.k;
    }
}
