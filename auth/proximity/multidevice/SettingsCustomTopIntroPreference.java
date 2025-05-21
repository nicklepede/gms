package com.google.android.gms.auth.proximity.multidevice;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.settingslib.widget.TopIntroPreference;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
class SettingsCustomTopIntroPreference extends TopIntroPreference {
    public SettingsCustomTopIntroPreference(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View view = (View) kmpVar.D(R.id.title).getParent();
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
    }

    public SettingsCustomTopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
