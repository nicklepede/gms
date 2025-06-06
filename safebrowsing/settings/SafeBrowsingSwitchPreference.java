package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import defpackage.dagx;
import defpackage.fxxm;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingSwitchPreference extends SwitchPreferenceCompat {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingSwitchPreference(Context context) {
        super(context);
        fxxm.f(context, "context");
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        View view = mfaVar.a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dagx.a(this, 12));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
    }
}
