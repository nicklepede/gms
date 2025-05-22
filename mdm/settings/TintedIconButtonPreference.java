package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.android.settingslib.widget.ButtonPreference;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class TintedIconButtonPreference extends ButtonPreference {
    private Drawable b;

    public TintedIconButtonPreference(Context context) {
        super(context);
    }

    @Override // com.android.settingslib.widget.ButtonPreference, androidx.preference.Preference
    public final void J(Drawable drawable) {
        super.J(drawable);
        this.b = drawable;
    }

    @Override // com.android.settingslib.widget.ButtonPreference, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        Drawable drawable = this.b;
        Button button = ((ButtonPreference) this).a;
        if (drawable == null || button == null) {
            return;
        }
        drawable.setTint(button.getCurrentTextColor());
    }

    public TintedIconButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TintedIconButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TintedIconButtonPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i);
    }
}
