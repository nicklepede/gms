package com.google.android.gms.auth.proximity.multidevice;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.settingslib.widget.TopIntroPreference;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
class SettingsCustomTopIntroPreference extends TopIntroPreference {
    public SettingsCustomTopIntroPreference(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.TopIntroPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        View view = (View) mfaVar.D(R.id.title).getParent();
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
    }

    public SettingsCustomTopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
