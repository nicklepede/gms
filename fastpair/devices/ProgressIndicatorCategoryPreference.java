package com.google.android.gms.fastpair.devices;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceCategory;
import com.google.android.gms.R;
import defpackage.ekxj;
import defpackage.mex;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ProgressIndicatorCategoryPreference extends PreferenceCategory {
    private View d;

    public ProgressIndicatorCategoryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void C(mex mexVar) {
        super.C(mexVar);
        this.B = R.layout.progress_indicator_category_preference;
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        View D = mfaVar.D(R.id.progress_indicator);
        ekxj.e(D);
        this.d = D;
        if (D != null) {
            D.setVisibility(8);
        }
    }
}
