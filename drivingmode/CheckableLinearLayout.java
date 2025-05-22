package com.google.android.gms.drivingmode;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CheckableLinearLayout extends LinearLayout implements Checkable {
    private boolean a;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.a = z;
        ((CheckedTextView) findViewById(R.id.title)).setChecked(this.a);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }
}
