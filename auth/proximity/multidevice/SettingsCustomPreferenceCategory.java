package com.google.android.gms.auth.proximity.multidevice;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
class SettingsCustomPreferenceCategory extends PreferenceCategory {
    public SettingsCustomPreferenceCategory(Context context) {
        super(context);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        TextView textView = (TextView) kmpVar.D(R.id.title);
        TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(new int[]{R.attr.textColorPrimary});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            textView.setTextColor(color);
            View view = (View) textView.getParent();
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public SettingsCustomPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingsCustomPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SettingsCustomPreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
