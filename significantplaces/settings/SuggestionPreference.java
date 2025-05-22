package com.google.android.gms.significantplaces.settings;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.significantplaces.settings.SuggestionPreference;
import defpackage.aca;
import defpackage.detv;
import defpackage.dexp;
import defpackage.fxxm;
import defpackage.mea;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SuggestionPreference extends Preference {
    public final ryt a;
    public final aca b;
    public final dexp c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionPreference(ryt rytVar, aca acaVar, dexp dexpVar, boolean z, String str, String str2) {
        super(rytVar);
        CharSequence charSequence;
        fxxm.f(acaVar, "confirmPlaceLauncher");
        fxxm.f(dexpVar, "place");
        this.a = rytVar;
        this.b = acaVar;
        this.c = dexpVar;
        this.d = str;
        this.e = str2;
        String str3 = dexpVar.i;
        fxxm.e(str3, "getPlaceAlias(...)");
        final String a = detv.a(rytVar, str3);
        S(a);
        if (z) {
            charSequence = dexpVar.g + "\n" + rytVar.getString(R.string.significant_places_aliased_place_added);
        } else {
            charSequence = dexpVar.g;
            fxxm.c(charSequence);
        }
        n(charSequence);
        J(rytVar.getDrawable(R.drawable.gs_add_vd_24));
        TypedArray obtainStyledAttributes = rytVar.obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        fxxm.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable q = q();
        if (q != null) {
            q.setTintList(obtainStyledAttributes.getColorStateList(0));
        }
        obtainStyledAttributes.recycle();
        if (z) {
            H(false);
        } else {
            this.o = new mea() { // from class: dewk
                @Override // defpackage.mea
                public final boolean b(Preference preference) {
                    int i = dete.a;
                    dete.a();
                    SuggestionPreference suggestionPreference = SuggestionPreference.this;
                    dexp dexpVar2 = suggestionPreference.c;
                    fjym fjymVar = dexpVar2.d;
                    if (fjymVar == null) {
                        fjymVar = fjym.a;
                    }
                    double d = fjymVar.b;
                    fjym fjymVar2 = dexpVar2.d;
                    if (fjymVar2 == null) {
                        fjymVar2 = fjym.a;
                    }
                    ryt rytVar2 = suggestionPreference.a;
                    aca acaVar2 = suggestionPreference.b;
                    String str4 = a;
                    double d2 = fjymVar2.c;
                    String str5 = dexpVar2.g;
                    fxxm.e(str5, "getDisplayAddress(...)");
                    String str6 = dexpVar2.c;
                    fxxm.e(str6, "getPlaceId(...)");
                    acaVar2.b(detk.a(rytVar2, d, d2, str5, str6, str4, 3, suggestionPreference.d, suggestionPreference.e));
                    return true;
                }
            };
        }
    }
}
