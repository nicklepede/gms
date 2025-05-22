package com.google.android.gms.usagereporting.settings;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.settingslib.widget.FooterPreference;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class FooterPreferenceWithLink extends FooterPreference {
    public FooterPreferenceWithLink(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.FooterPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        ((TextView) mfaVar.a.findViewById(R.id.title)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public FooterPreferenceWithLink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
