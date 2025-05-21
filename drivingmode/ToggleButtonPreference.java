package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.ToggleButtonPreference;
import defpackage.axpz;
import defpackage.fpsg;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ToggleButtonPreference extends TwoTargetPreference {
    public Button a;
    public Button b;
    public axpz c;
    private final View.OnClickListener d;

    public ToggleButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new View.OnClickListener() { // from class: axqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int id = view.getId();
                boolean z = id != R.id.on_button;
                ToggleButtonPreference toggleButtonPreference = ToggleButtonPreference.this;
                toggleButtonPreference.l(z);
                axpz axpzVar = toggleButtonPreference.c;
                if (axpzVar != null) {
                    axqb axqbVar = axpzVar.a;
                    if (id != R.id.on_button) {
                        axqbVar.ag.b(elxw.DRIVING_MODE, elxv.hC);
                        axqbVar.ah.A(axqq.MANUAL);
                    } else {
                        axqbVar.ag.b(elxw.DRIVING_MODE, elxv.hD);
                        axqbVar.ah.x(axqq.MANUAL);
                    }
                }
            }
        };
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        LinearLayout linearLayout = (LinearLayout) kmpVar.D(android.R.id.widget_frame);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setPadding(0, 0, 0, 0);
        this.a = (Button) kmpVar.D(R.id.on_button);
        this.b = (Button) kmpVar.D(R.id.off_button);
        Button button = this.a;
        View.OnClickListener onClickListener = this.d;
        button.setOnClickListener(onClickListener);
        this.b.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference
    protected final int k() {
        return R.layout.car_preference_widget_toggle_button;
    }

    public final void l(boolean z) {
        Button button = this.a;
        if (button == null || this.b == null) {
            return;
        }
        if (z) {
            button.setVisibility(0);
            if (fpsg.h()) {
                this.a.sendAccessibilityEvent(8);
            }
            this.b.setVisibility(8);
            return;
        }
        button.setVisibility(8);
        this.b.setVisibility(0);
        if (fpsg.h()) {
            this.b.sendAccessibilityEvent(8);
        }
    }
}
