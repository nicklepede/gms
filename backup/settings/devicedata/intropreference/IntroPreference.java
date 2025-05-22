package com.google.android.gms.backup.settings.devicedata.intropreference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.android.settingslib.widget.CollapsableTextView;
import com.google.android.gms.R;
import defpackage.fxxm;
import defpackage.mfa;
import defpackage.oyy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class IntroPreference extends Preference implements oyy {
    public boolean a;
    public int b;
    public View.OnClickListener c;
    public CharSequence d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntroPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        mfaVar.w = false;
        mfaVar.v = false;
        View D = mfaVar.D(R.id.collapsable_summary);
        CollapsableTextView collapsableTextView = D instanceof CollapsableTextView ? (CollapsableTextView) D : null;
        if (collapsableTextView != null) {
            collapsableTextView.g(this.a);
            collapsableTextView.j(this.b);
            CharSequence m = m();
            collapsableTextView.setVisibility((m == null || m.length() == 0) ? 8 : 0);
            collapsableTextView.k(String.valueOf(m()));
            if (this.c != null) {
                collapsableTextView.i(this.d);
                collapsableTextView.h(this.c);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntroPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntroPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        this.a = true;
        this.b = 1;
        this.B = R.layout.backup_settings_devicedata_preference_intro;
        N(false);
    }

    public /* synthetic */ IntroPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
