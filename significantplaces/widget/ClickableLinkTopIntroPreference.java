package com.google.android.gms.significantplaces.widget;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.settingslib.widget.TopIntroPreference;
import defpackage.fxxm;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ClickableLinkTopIntroPreference extends TopIntroPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableLinkTopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        View D = mfaVar.D(R.id.title);
        fxxm.c(D);
        ((TextView) D).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
