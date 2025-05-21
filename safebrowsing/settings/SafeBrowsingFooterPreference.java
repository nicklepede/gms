package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.settingslib.widget.FooterPreference;
import defpackage.cxxa;
import defpackage.fvbo;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SafeBrowsingFooterPreference extends FooterPreference {
    public SafeBrowsingFooterPreference(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.FooterPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        View view = kmpVar.a;
        view.setPadding(view.getPaddingLeft(), cxxa.a(this, 12), view.getPaddingRight(), view.getPaddingBottom());
    }

    public SafeBrowsingFooterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
