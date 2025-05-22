package com.google.android.gms.cast.settings;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastLinkSettingPreference extends Preference {
    private final int a;

    public CastLinkSettingPreference(Context context) {
        super(context);
        this.a = R.string.common_learn_more;
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        TextView textView = (TextView) mfaVar.a.findViewById(R.id.text);
        if (textView == null) {
            return;
        }
        textView.setText(this.a);
    }
}
