package com.google.android.gms.wearable.backup.wear.lskfui.pin;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PinPadImageButton extends ImageView {
    public PinPadImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
}
