package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.google.android.gms.nearby.sharing.view.RadioButtonRowWithSubheading;
import com.google.android.gms.nearby.sharing.view.RadioGroupWithSubheadings;
import defpackage.ctxo;
import defpackage.ctxp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RadioButtonRowWithSubheading extends LinearLayout {
    public RadioButton a;

    public RadioButtonRowWithSubheading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(boolean z) {
        RadioButton radioButton = this.a;
        if (radioButton == null || !radioButton.isEnabled()) {
            return;
        }
        this.a.setChecked(z);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new ctxp(this));
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                this.a = radioButton;
                radioButton.setImportantForAccessibility(2);
                this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ctxn
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        RadioButtonRowWithSubheading radioButtonRowWithSubheading = RadioButtonRowWithSubheading.this;
                        ViewParent parent = radioButtonRowWithSubheading.getParent();
                        if (z && (parent instanceof RadioGroupWithSubheadings)) {
                            ((RadioGroupWithSubheadings) parent).check(radioButtonRowWithSubheading.a.getId());
                        }
                    }
                });
                break;
            }
            i++;
        }
        setAccessibilityDelegate(new ctxo(this));
    }
}
