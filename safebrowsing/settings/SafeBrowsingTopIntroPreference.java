package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.settingslib.widget.TopIntroPreference;
import defpackage.dagx;
import defpackage.fxxm;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingTopIntroPreference extends TopIntroPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingTopIntroPreference(Context context) {
        super(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        View view = mfaVar.a;
        view.setPadding(view.getPaddingLeft(), dagx.a(this, 32), view.getPaddingRight(), dagx.a(this, 16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingTopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }
}
