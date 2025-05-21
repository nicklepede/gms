package com.google.android.gms.drivingmode;

import android.R;
import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.drivingmode.MasterSwitchPreference;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class MasterSwitchPreference extends TwoTargetPreference {
    public SwitchCompat a;
    public boolean b;
    public CompoundButton.OnCheckedChangeListener c;
    private final boolean d;

    public MasterSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View D = kmpVar.D(R.id.widget_frame);
        if (D != null) {
            D.setOnClickListener(new View.OnClickListener() { // from class: axqn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MasterSwitchPreference masterSwitchPreference = MasterSwitchPreference.this;
                    if (masterSwitchPreference.a.isEnabled()) {
                        masterSwitchPreference.l(!masterSwitchPreference.b);
                        if (masterSwitchPreference.W(Boolean.valueOf(masterSwitchPreference.b))) {
                            masterSwitchPreference.ad(masterSwitchPreference.b);
                        } else {
                            masterSwitchPreference.l(!masterSwitchPreference.b);
                        }
                    }
                }
            });
        }
        SwitchCompat switchCompat = (SwitchCompat) kmpVar.D(com.google.android.gms.R.id.switch_widget);
        this.a = switchCompat;
        switchCompat.setContentDescription(t());
        this.a.setChecked(this.b);
        this.a.setEnabled(this.d);
        this.a.setOnCheckedChangeListener(this.c);
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference
    protected final int k() {
        return com.google.android.gms.R.layout.car_preference_widget_master_switch;
    }

    public final void l(boolean z) {
        this.b = z;
        SwitchCompat switchCompat = this.a;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }
}
