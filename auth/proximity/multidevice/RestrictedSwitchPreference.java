package com.google.android.gms.auth.proximity.multidevice;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.SwitchPreference;
import defpackage.arxo;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RestrictedSwitchPreference extends SwitchPreference {
    static {
        new arxo("ProximityAuth", "RestrictedSwitchPreference");
    }

    public RestrictedSwitchPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View D = kmpVar.D(R.id.switch_widget);
        if (D != null) {
            View rootView = D.getRootView();
            rootView.setFilterTouchesWhenObscured(true);
            rootView.setAllowClickWhenDisabled(true);
        }
        TextView textView = (TextView) kmpVar.D(com.google.android.gms.R.id.additional_summary);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(boolean z) {
        super.k(z);
    }

    public RestrictedSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceStyle);
    }

    public RestrictedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RestrictedSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.B = com.google.android.gms.R.layout.restricted_switch_preference;
    }
}
