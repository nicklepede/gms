package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TrustedDevicesFragment$DisabledViewPreference extends Preference {
    public boolean a;

    public TrustedDevicesFragment$DisabledViewPreference(Context context) {
        super(context);
        this.a = true;
        this.B = R.layout.preference_material;
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        boolean z = false;
        if (Z() && this.a) {
            z = true;
        }
        k(mfaVar.a, z);
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
