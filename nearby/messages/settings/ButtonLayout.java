package com.google.android.gms.nearby.messages.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.cast.JGCastService;
import defpackage.cmqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ButtonLayout extends ViewGroup {
    private final cmqe a;
    private final cmqe b;
    private Button c;
    private Button d;
    private boolean e;

    public ButtonLayout(Context context) {
        this(context, null);
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 2) {
            this.c = (Button) getChildAt(0);
            this.d = (Button) getChildAt(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        if (this.e) {
            Button button = this.d;
            button.layout(paddingLeft, paddingBottom - button.getMeasuredHeight(), this.d.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.c.layout(paddingLeft, this.d.getTop() - this.c.getMeasuredHeight(), this.c.getMeasuredWidth() + paddingLeft, this.d.getTop());
        } else if (a(getContext())) {
            Button button2 = this.c;
            button2.layout(paddingLeft, paddingBottom - button2.getMeasuredHeight(), this.c.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.d.layout(this.c.getRight(), paddingBottom - this.d.getMeasuredHeight(), this.c.getRight() + this.d.getMeasuredWidth(), paddingBottom);
        } else {
            Button button3 = this.c;
            button3.layout(paddingRight - button3.getMeasuredWidth(), paddingBottom - this.c.getMeasuredHeight(), paddingRight, paddingBottom);
            this.d.layout(this.c.getLeft() - this.d.getMeasuredWidth(), paddingBottom - this.d.getMeasuredHeight(), this.c.getLeft(), paddingBottom);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        cmqe cmqeVar = this.b;
        setPadding(cmqeVar.c(), cmqeVar.e(), cmqeVar.d(), cmqeVar.b());
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(cmqeVar.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(cmqeVar.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        boolean z = this.c.getMeasuredWidth() + this.d.getMeasuredWidth() > paddingLeft;
        this.e = z;
        if (z) {
            cmqeVar = this.a;
        }
        setPadding(cmqeVar.c(), cmqeVar.e(), cmqeVar.d(), cmqeVar.b());
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        Button button = this.c;
        int i3 = cmqeVar.a;
        button.setGravity(i3);
        this.d.setGravity(i3);
        Button button2 = this.c;
        int i4 = cmqeVar.b;
        button2.setTextAlignment(i4);
        this.d.setTextAlignment(i4);
        if (this.e) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(cmqeVar.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
            this.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(cmqeVar.a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        }
        if (this.e) {
            setMeasuredDimension(size, this.c.getMeasuredHeight() + this.d.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(size, this.c.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        }
    }

    public ButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.a = new cmqe(context, 48, 21, 6, 24, 8, 0, 0);
        this.b = new cmqe(context, 52, 17, 0, 0, 0, 16, 16);
    }
}
