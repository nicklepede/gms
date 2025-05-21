package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import defpackage.axpx;
import defpackage.axqb;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GearPreference extends TwoTargetPreference implements View.OnClickListener {
    public axpx a;
    private boolean b;

    public GearPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View D = kmpVar.D(R.id.settings_button);
        if (this.a != null) {
            D.setOnClickListener(this);
        } else {
            D.setOnClickListener(null);
        }
    }

    public final void af(axpx axpxVar) {
        this.a = axpxVar;
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
        axpx axpxVar;
        if (view.getId() != R.id.settings_button || (axpxVar = this.a) == null) {
            return;
        }
        axqb axqbVar = axpxVar.a;
        axqbVar.ag.b(elxw.DRIVING_MODE, elxv.hE);
        axqbVar.startActivityForResult(axpxVar.b, 0);
    }
}
