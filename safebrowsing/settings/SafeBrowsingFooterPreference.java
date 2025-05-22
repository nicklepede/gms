package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.settingslib.widget.FooterPreference;
import defpackage.dagx;
import defpackage.fxxm;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingFooterPreference extends FooterPreference {
    public SafeBrowsingFooterPreference(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.FooterPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        View view = mfaVar.a;
        view.setPadding(view.getPaddingLeft(), dagx.a(this, 12), view.getPaddingRight(), view.getPaddingBottom());
    }

    public SafeBrowsingFooterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
