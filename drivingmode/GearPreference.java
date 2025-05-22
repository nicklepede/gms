package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import defpackage.aztx;
import defpackage.azub;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GearPreference extends TwoTargetPreference implements View.OnClickListener {
    public aztx a;
    private boolean b;

    public GearPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        View D = mfaVar.D(R.id.settings_button);
        if (this.a != null) {
            D.setOnClickListener(this);
        } else {
            D.setOnClickListener(null);
        }
    }

    public final void af(aztx aztxVar) {
        this.a = aztxVar;
        d();
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference
    protected final int k() {
        return R.layout.car_preference_widget_gear;
    }

    public final void l(boolean z) {
        this.b = z;
        d();
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference
    protected final boolean o() {
        return !this.b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        aztx aztxVar;
        if (view.getId() != R.id.settings_button || (aztxVar = this.a) == null) {
            return;
        }
        azub azubVar = aztxVar.a;
        azubVar.ag.b(eolk.DRIVING_MODE, eolj.hE);
        azubVar.startActivityForResult(aztxVar.b, 0);
    }
}
