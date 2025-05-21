package com.google.android.gms.significantplaces.settings;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.SuggestionPreference;
import defpackage.abv;
import defpackage.dcjp;
import defpackage.dcmm;
import defpackage.fvbo;
import defpackage.klp;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SuggestionPreference extends Preference {
    public final qfp a;
    public final abv b;
    public final dcmm c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionPreference(qfp qfpVar, abv abvVar, dcmm dcmmVar, boolean z, String str, String str2) {
        super(qfpVar);
        CharSequence charSequence;
        fvbo.f(abvVar, "confirmPlaceLauncher");
        fvbo.f(dcmmVar, "place");
        this.a = qfpVar;
        this.b = abvVar;
        this.c = dcmmVar;
        this.d = str;
        this.e = str2;
        String str3 = dcmmVar.i;
        fvbo.e(str3, "getPlaceAlias(...)");
        final String a = dcjp.a(qfpVar, str3);
        S(a);
        if (z) {
            charSequence = dcmmVar.g + "\n" + qfpVar.getString(R.string.significant_places_aliased_place_added);
        } else {
            charSequence = dcmmVar.g;
            fvbo.c(charSequence);
        }
        n(charSequence);
        J(qfpVar.getDrawable(R.drawable.gs_add_vd_24));
        TypedArray obtainStyledAttributes = qfpVar.obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        fvbo.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable q = q();
        if (q != null) {
            q.setTintList(obtainStyledAttributes.getColorStateList(0));
        }
        obtainStyledAttributes.recycle();
        if (z) {
            H(false);
        } else {
            this.o = new klp() { // from class: dclj
                @Override // defpackage.klp
                public final boolean b(Preference preference) {
                    int i = dciy.a;
                    dciy.a();
                    SuggestionPreference suggestionPreference = SuggestionPreference.this;
                    dcmm dcmmVar2 = suggestionPreference.c;
                    fhip fhipVar = dcmmVar2.d;
                    if (fhipVar == null) {
                        fhipVar = fhip.a;
                    }
                    double d = fhipVar.b;
                    fhip fhipVar2 = dcmmVar2.d;
                    if (fhipVar2 == null) {
                        fhipVar2 = fhip.a;
                    }
                    qfp qfpVar2 = suggestionPreference.a;
                    abv abvVar2 = suggestionPreference.b;
                    String str4 = a;
                    double d2 = fhipVar2.c;
                    String str5 = dcmmVar2.g;
                    fvbo.e(str5, "getDisplayAddress(...)");
                    String str6 = dcmmVar2.c;
                    fvbo.e(str6, "getPlaceId(...)");
                    abvVar2.b(dcje.a(qfpVar2, d, d2, str5, str6, str4, 3, suggestionPreference.d, suggestionPreference.e));
                    return true;
                }
            };
        }
    }
}
