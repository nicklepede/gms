package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TrustedDevicesFragment$DisabledViewPreference extends Preference {
    public boolean a;

    public TrustedDevicesFragment$DisabledViewPreference(Context context) {
        super(context);
        this.a = true;
        this.B = R.layout.preference_material;
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        boolean z = false;
        if (Z() && this.a) {
            z = true;
        }
        k(kmpVar.a, z);
    }

    final void k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                k(viewGroup.getChildAt(i), z);
            }
        }
    }
}
