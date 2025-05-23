package com.google.android.gms.credential.manager.enhancedprotection;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import com.google.android.material.button.MaterialButton;
import defpackage.ekvk;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class EnhancedProtectionSettingAlert extends CardView {
    public EnhancedProtectionSettingAlert(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context, attributeSet);
    }

    private final void g(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.pwm_ep_setting_alert, this);
        d(0.0f);
        e(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tiy.d);
        TextView textView = (TextView) findViewById(R.id.pwm_ep_alert_title);
        TextView textView2 = (TextView) findViewById(R.id.pwm_ep_alert_description);
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.pwm_ep_alert_button);
        textView.setText(ekvk.b(obtainStyledAttributes.getString(2)));
        textView2.setText(ekvk.b(obtainStyledAttributes.getString(1)));
        materialButton.setText(ekvk.b(obtainStyledAttributes.getString(0)));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.pwmYellowVariant1, typedValue, true);
        lB(typedValue.data);
        obtainStyledAttributes.recycle();
    }

    public final void f(View.OnClickListener onClickListener) {
        ((MaterialButton) findViewById(R.id.pwm_ep_alert_button)).setOnClickListener(onClickListener);
    }

    public EnhancedProtectionSettingAlert(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context, attributeSet);
    }
}
