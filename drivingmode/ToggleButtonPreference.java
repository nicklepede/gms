package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.ToggleButtonPreference;
import defpackage.aztz;
import defpackage.fsly;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ToggleButtonPreference extends TwoTargetPreference {
    public Button a;
    public Button b;
    public aztz c;
    private final View.OnClickListener d;

    public ToggleButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new View.OnClickListener() { // from class: azup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int id = view.getId();
                boolean z = id != R.id.on_button;
                ToggleButtonPreference toggleButtonPreference = ToggleButtonPreference.this;
                toggleButtonPreference.l(z);
                aztz aztzVar = toggleButtonPreference.c;
                if (aztzVar != null) {
                    azub azubVar = aztzVar.a;
                    if (id != R.id.on_button) {
                        azubVar.ag.b(eolk.DRIVING_MODE, eolj.hC);
                        azubVar.ah.A(azuq.MANUAL);
                    } else {
                        azubVar.ag.b(eolk.DRIVING_MODE, eolj.hD);
                        azubVar.ah.x(azuq.MANUAL);
                    }
                }
            }
        };
    }

    @Override // com.google.android.gms.drivingmode.TwoTargetPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        LinearLayout linearLayout = (LinearLayout) mfaVar.D(android.R.id.widget_frame);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setPadding(0, 0, 0, 0);
        this.a = (Button) mfaVar.D(R.id.on_button);
        this.b = (Button) mfaVar.D(R.id.off_button);
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
            if (fsly.h()) {
                this.a.sendAccessibilityEvent(8);
            }
            this.b.setVisibility(8);
            return;
        }
        button.setVisibility(8);
        this.b.setVisibility(0);
        if (fsly.h()) {
            this.b.sendAccessibilityEvent(8);
        }
    }
}
