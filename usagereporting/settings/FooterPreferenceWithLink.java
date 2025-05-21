package com.google.android.gms.usagereporting.settings;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.settingslib.widget.FooterPreference;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class FooterPreferenceWithLink extends FooterPreference {
    public FooterPreferenceWithLink(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.FooterPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        ((TextView) kmpVar.a.findViewById(R.id.title)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public FooterPreferenceWithLink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
