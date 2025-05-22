package com.google.android.gms.drivingmode;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class TwoTargetPreference extends Preference {
    public TwoTargetPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = k();
    }

    @Override // androidx.preference.Preference
    public void a(mfa mfaVar) {
        super.a(mfaVar);
        View D = mfaVar.D(R.id.widget_frame);
        boolean o = o();
        if (D != null) {
            D.setVisibility(true != o ? 0 : 8);
        }
    }

    protected int k() {
        return 0;
    }

    protected boolean o() {
        return k() == 0;
    }
}
