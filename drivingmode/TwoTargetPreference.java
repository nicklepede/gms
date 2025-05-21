package com.google.android.gms.drivingmode;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TwoTargetPreference extends Preference {
    public TwoTargetPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = k();
    }

    @Override // androidx.preference.Preference
    public void a(kmp kmpVar) {
        super.a(kmpVar);
        View D = kmpVar.D(R.id.widget_frame);
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
