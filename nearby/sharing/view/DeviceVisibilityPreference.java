package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.view.DeviceVisibilityPreference;
import defpackage.chke;
import defpackage.ctxa;
import defpackage.elgo;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DeviceVisibilityPreference extends Preference {
    public Switch a;
    private final Context b;
    private ImageView c;
    private TextView d;

    public DeviceVisibilityPreference(Context context) {
        super(context);
        this.b = context;
        this.B = R.layout.sharing_device_visibility_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        LinearLayout linearLayout = (LinearLayout) mfaVar.D(R.id.visibility_text_view);
        this.c = (ImageView) mfaVar.D(R.id.visibility_icon);
        this.d = (TextView) mfaVar.D(R.id.visibility_summary);
        Switch r1 = (Switch) mfaVar.D(R.id.visibility_switch);
        this.a = r1;
        r1.setVisibility(0);
        mfaVar.D(R.id.divider).setVisibility(0);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: ctxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceVisibilityPreference deviceVisibilityPreference = DeviceVisibilityPreference.this;
                deviceVisibilityPreference.n.a(deviceVisibilityPreference, Boolean.valueOf(deviceVisibilityPreference.a.isChecked()));
            }
        });
        this.c.setImageDrawable(this.j.getDrawable(R.drawable.sharing_placeholder));
        this.c.setVisibility(0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ctxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceVisibilityPreference deviceVisibilityPreference = DeviceVisibilityPreference.this;
                deviceVisibilityPreference.o.b(deviceVisibilityPreference);
            }
        });
        CharSequence text = this.d.getText();
        elgo elgoVar = ctxa.a;
        if (TextUtils.isEmpty(text)) {
            chke.d(this.b, new Intent("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        }
    }

    public DeviceVisibilityPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        this.B = R.layout.sharing_device_visibility_preference;
    }
}
