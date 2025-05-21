package com.google.android.gms.wearable.backup.wear.lskfui.pin;

import android.content.Context;
import android.icu.text.MessageFormat;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PinPadEditViewEndless extends FrameLayout {
    public final List a;

    public PinPadEditViewEndless(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String format;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.wearable_keyguard_accessibility_pin_area));
        List list = this.a;
        if (!list.isEmpty()) {
            MessageFormat messageFormat = new MessageFormat(getResources().getString(R.string.wearable_keyguard_accessibility_pin_dots_count), Locale.getDefault());
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(list.size()));
            format = messageFormat.format(hashMap);
            sb.append(format);
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    public PinPadEditViewEndless(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinPadEditViewEndless(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinPadEditViewEndless(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.wearable_pin_dot_size));
        inflate(context, R.layout.pin_edit_endless, this);
        setFocusable(true);
    }
}
