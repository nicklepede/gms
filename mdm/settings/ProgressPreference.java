package com.google.android.gms.mdm.settings;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.mex;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProgressPreference extends Preference {
    public LinearProgressIndicator a;
    public boolean b;

    public ProgressPreference(Context context) {
        super(context);
        this.b = false;
    }

    @Override // androidx.preference.Preference
    public final void C(mex mexVar) {
        super.C(mexVar);
        this.B = R.layout.progress_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) mfaVar.D(R.id.progress_horizontal);
        this.a = linearProgressIndicator;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setAccessibilityLiveRegion(1);
            this.a.setVisibility(true != this.b ? 8 : 0);
        }
    }
}
