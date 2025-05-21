package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.settingslib.widget.TopIntroPreference;
import defpackage.cxxa;
import defpackage.fvbo;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SafeBrowsingTopIntroPreference extends TopIntroPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingTopIntroPreference(Context context) {
        super(context, null, 0, 0, 14, null);
        fvbo.f(context, "context");
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        View view = kmpVar.a;
        view.setPadding(view.getPaddingLeft(), cxxa.a(this, 32), view.getPaddingRight(), cxxa.a(this, 16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingTopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }
}
