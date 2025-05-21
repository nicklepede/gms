package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.asrs;
import defpackage.assd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SwitchBar extends LinearLayout implements Checkable, View.OnClickListener {
    public assd a;
    public TextView b;
    public CharSequence c;
    private CompoundButton d;
    private Drawable e;
    private int f;
    private int g;
    private CharSequence h;
    private CharSequence i;
    private int j;
    private int k;
    private int l;

    public SwitchBar(Context context) {
        super(g(context));
        b(null, R.attr.switchBarStyle, R.style.common_Widget_SwitchBar);
    }

    private final void b(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, asrs.b, i, i2);
        obtainStyledAttributes.getColor(1, -16777216);
        this.h = obtainStyledAttributes.getText(7);
        this.i = obtainStyledAttributes.getText(6);
        this.f = obtainStyledAttributes.getColor(5, f(context));
        this.g = obtainStyledAttributes.getColor(4, f(context));
        this.j = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.l = true != obtainStyledAttributes.getBoolean(0, false) ? 2 : 1;
        } else {
            this.l = 0;
        }
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setBackgroundResource(R.drawable.common_switch_bar_background);
        this.e = getBackground();
        if (this.l != 0) {
            c();
        }
    }

    private final void c() {
        Context context = getContext();
        boolean isChecked = isChecked();
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(isChecked ? this.h : this.i);
        this.b.setFocusable(false);
        this.b.setClickable(false);
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            this.b.setContentDescription(charSequence);
        }
        addView(this.b, e(0, 1.0f, this.j, 0));
        CompoundButton compoundButton = (CompoundButton) inflate(context, R.layout.common_switch_bar_toggle_widget, null);
        this.d = compoundButton;
        compoundButton.setChecked(isChecked);
        this.d.setClickable(false);
        this.d.setFocusable(false);
        d(isChecked);
        setEnabled(isEnabled());
        addView(this.d, e(-2, 0.0f, 0, this.k));
        setOnClickListener(this);
    }

    private final void d(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            int[] drawableState = getDrawableState();
            int length = drawableState.length;
            int i = length + 1;
            int i2 = true != z ? -16842913 : 16842913;
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < drawableState.length; i3++) {
                int i4 = drawableState[i3];
                if (i4 == 16842913 || i4 == -16842913) {
                    drawableState[i3] = i2;
                    break;
                }
                iArr[i3] = i4;
            }
            iArr[length] = i2;
            drawableState = iArr;
            drawable.setState(drawableState);
            setBackground(this.e.getCurrent());
        }
    }

    private static LinearLayout.LayoutParams e(int i, float f, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2, f);
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(i3);
        return layoutParams;
    }

    private static int f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.textColorPrimary});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static Context g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.switchBarStyle});
        int resourceId = obtainStyledAttributes.getResourceId(0, R.style.common_Widget_SwitchBar);
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public final TextView a() {
        if (this.b == null) {
            c();
        }
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        d(this.l == 1);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.l == 1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        toggle();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        a().setText(z ? this.h : this.i);
        a().setTextColor(z ? this.f : this.g);
        if (this.d == null) {
            c();
        }
        this.d.setChecked(z);
        d(z);
        assd assdVar = this.a;
        if (assdVar != null) {
            assdVar.a(z);
        }
        this.l = true != z ? 2 : 1;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        CompoundButton compoundButton = this.d;
        if (compoundButton != null) {
            compoundButton.setEnabled(!isEnabled());
            this.d.setEnabled(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public SwitchBar(Context context, AttributeSet attributeSet) {
        super(g(context), attributeSet);
        b(attributeSet, R.attr.switchBarStyle, R.style.common_Widget_SwitchBar);
    }

    public SwitchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i, R.style.common_Widget_SwitchBar);
    }

    public SwitchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(attributeSet, i, i2);
    }
}
