package com.google.android.gms.significantplaces.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.android.settingslib.widget.TwoTargetPreference;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.DeletablePlacePreference;
import defpackage.detv;
import defpackage.dexp;
import defpackage.ekxj;
import defpackage.fxxm;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DeletablePlacePreference extends TwoTargetPreference {
    public final dexp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletablePlacePreference(Context context, dexp dexpVar) {
        super(context);
        String str;
        fxxm.f(dexpVar, "place");
        this.a = dexpVar;
        if ((dexpVar.b & 64) != 0) {
            String str2 = dexpVar.i;
            fxxm.e(str2, "getPlaceAlias(...)");
            str = detv.a(context, str2);
        } else {
            str = dexpVar.f;
            fxxm.c(str);
        }
        S(str);
        n(dexpVar.g);
        J(context.getDrawable(R.drawable.gs_location_on_vd_theme_24));
    }

    @Override // com.android.settingslib.widget.TwoTargetPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "view");
        super.a(mfaVar);
        View D = mfaVar.D(R.id.delete_button);
        ekxj.e(D);
        D.setOnClickListener(new View.OnClickListener() { // from class: detn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent();
                DeletablePlacePreference deletablePlacePreference = DeletablePlacePreference.this;
                Context context = deletablePlacePreference.j;
                Intent addFlags = intent.setComponent(new ComponentName(context, "com.google.android.gms.significantplaces.settings.DeletePlaceActivity")).addFlags(JGCastService.FLAG_PRIVATE_DISPLAY).addFlags(8388608);
                dexp dexpVar = deletablePlacePreference.a;
                Intent putExtra = addFlags.putExtra("place", dexpVar.c).putExtra("name", dexpVar.f);
                fxxm.e(putExtra, "putExtra(...)");
                int i = dete.a;
                dete.a();
                context.startActivity(putExtra);
            }
        });
    }

    @Override // com.android.settingslib.widget.TwoTargetPreference
    protected final int k() {
        return R.layout.preference_widget_delete;
    }
}
