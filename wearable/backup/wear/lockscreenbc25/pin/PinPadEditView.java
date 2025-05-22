package com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PinPadEditView extends LinearLayout {
    public final PinPadDot[] a;
    public final int[] b;

    public PinPadEditView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.keyguard_accessibility_pin_area));
        accessibilityNodeInfo.setContentDescription(sb);
    }

    public PinPadEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinPadEditView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinPadEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new PinPadDot[4];
        this.b = new int[4];
        setLayoutDirection(0);
        inflate(context, R.layout.pin_edit, this);
        setFocusable(true);
        int[] iArr = {R.id.pin_1, R.id.pin_2, R.id.pin_3, R.id.pin_4};
        for (int i3 = 3; i3 >= 0; i3--) {
            this.a[i3] = (PinPadDot) findViewById(iArr[i3]);
            this.b[i3] = (4 - i3) * 50;
        }
    }
}
