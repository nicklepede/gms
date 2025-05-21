package com.google.android.gms.cast.settings;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastLinkSettingPreference extends Preference {
    private final int a;

    public CastLinkSettingPreference(Context context) {
        super(context);
        this.a = R.string.common_learn_more;
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        TextView textView = (TextView) kmpVar.a.findViewById(R.id.text);
        if (textView == null) {
            return;
        }
        textView.setText(this.a);
    }
}
