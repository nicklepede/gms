package com.google.android.gms.mdm.settings;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.kmm;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProgressPreference extends Preference {
    public LinearProgressIndicator a;
    public boolean b;

    public ProgressPreference(Context context) {
        super(context);
        this.b = false;
    }

    @Override // androidx.preference.Preference
    public final void C(kmm kmmVar) {
        super.C(kmmVar);
        this.B = R.layout.progress_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) kmpVar.D(R.id.progress_horizontal);
        this.a = linearProgressIndicator;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setAccessibilityLiveRegion(1);
            this.a.setVisibility(true != this.b ? 8 : 0);
        }
    }
}
