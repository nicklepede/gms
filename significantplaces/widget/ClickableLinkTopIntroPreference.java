package com.google.android.gms.significantplaces.widget;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.settingslib.widget.TopIntroPreference;
import defpackage.fvbo;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ClickableLinkTopIntroPreference extends TopIntroPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableLinkTopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        View D = kmpVar.D(R.id.title);
        fvbo.c(D);
        ((TextView) D).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
