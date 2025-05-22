package com.google.android.gms.accountsettings.mg.poc.ui.card.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CardHorizontalScrollView extends HorizontalScrollView {
    private boolean a;
    private float b;
    private boolean c;
    private float d;
    private boolean e;

    public CardHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final boolean a() {
        return canScrollHorizontally(-1);
    }

    private final boolean b() {
        return canScrollHorizontally(1);
    }

    private static final boolean c(MotionEvent motionEvent, float f) {
        return motionEvent.getX() - f > 0.0f;
    }

    private static final boolean d(MotionEvent motionEvent, float f) {
        return motionEvent.getX() - f < 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = false;
            this.a = true;
            this.b = motionEvent.getX();
        } else if (actionMasked == 1) {
            this.e = false;
        } else if (actionMasked == 2 && this.a) {
            if (c(motionEvent, this.b)) {
                this.a = false;
                if (!a()) {
                    this.e = true;
                }
            } else if (d(motionEvent, this.b)) {
                this.a = false;
                if (!b()) {
                    this.e = true;
                }
            }
        }
        if (this.e) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = true;
            this.d = motionEvent.getX();
        } else if (actionMasked == 1) {
            this.e = false;
        } else if (actionMasked == 2 && this.c) {
            if (c(motionEvent, this.d)) {
                this.c = false;
                if (!a()) {
                    this.e = true;
                }
            } else if (d(motionEvent, this.d)) {
                this.c = false;
                if (!b()) {
                    this.e = true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
