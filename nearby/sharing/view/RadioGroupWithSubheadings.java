package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RadioGroupWithSubheadings extends RadioGroup {
    private RadioGroup.OnCheckedChangeListener a;
    private int b;

    public RadioGroupWithSubheadings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
    }

    @Override // android.widget.RadioGroup
    public final void check(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt instanceof RadioButtonRowWithSubheading) {
                RadioButtonRowWithSubheading radioButtonRowWithSubheading = (RadioButtonRowWithSubheading) childAt;
                RadioButton radioButton = radioButtonRowWithSubheading.a;
                boolean z2 = (radioButton != null ? radioButton.getId() : -1) == i;
                radioButtonRowWithSubheading.a(z2);
                z |= z2;
            }
            i2++;
        }
        this.b = true == z ? i : -1;
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.a;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, i);
        }
    }

    @Override // android.widget.RadioGroup
    public final int getCheckedRadioButtonId() {
        return this.b;
    }

    @Override // android.widget.RadioGroup
    public final void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.a = onCheckedChangeListener;
    }
}
