package com.google.android.gms.significantplaces.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.android.settingslib.widget.TwoTargetPreference;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.DeletablePlacePreference;
import defpackage.dcjp;
import defpackage.dcmm;
import defpackage.eike;
import defpackage.fvbo;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class DeletablePlacePreference extends TwoTargetPreference {
    public final dcmm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletablePlacePreference(Context context, dcmm dcmmVar) {
        super(context);
        String str;
        fvbo.f(dcmmVar, "place");
        this.a = dcmmVar;
        if ((dcmmVar.b & 64) != 0) {
            String str2 = dcmmVar.i;
            fvbo.e(str2, "getPlaceAlias(...)");
            str = dcjp.a(context, str2);
        } else {
            str = dcmmVar.f;
            fvbo.c(str);
        }
        S(str);
        n(dcmmVar.g);
        J(context.getDrawable(R.drawable.gs_location_on_vd_theme_24));
    }

    @Override // com.android.settingslib.widget.TwoTargetPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "view");
        super.a(kmpVar);
        View D = kmpVar.D(R.id.delete_button);
        eike.e(D);
        D.setOnClickListener(new View.OnClickListener() { // from class: dcjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent();
                DeletablePlacePreference deletablePlacePreference = DeletablePlacePreference.this;
                Context context = deletablePlacePreference.j;
                Intent addFlags = intent.setComponent(new ComponentName(context, "com.google.android.gms.significantplaces.settings.DeletePlaceActivity")).addFlags(JGCastService.FLAG_PRIVATE_DISPLAY).addFlags(8388608);
                dcmm dcmmVar = deletablePlacePreference.a;
                Intent putExtra = addFlags.putExtra("place", dcmmVar.c).putExtra("name", dcmmVar.f);
                fvbo.e(putExtra, "putExtra(...)");
                int i = dciy.a;
                dciy.a();
                context.startActivity(putExtra);
            }
        });
    }

    @Override // com.android.settingslib.widget.TwoTargetPreference
    protected final int k() {
        return R.layout.preference_widget_delete;
    }
}
