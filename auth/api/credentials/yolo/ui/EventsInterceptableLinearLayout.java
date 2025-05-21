package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EventsInterceptableLinearLayout extends LinearLayout {
    public boolean a;

    public EventsInterceptableLinearLayout(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public EventsInterceptableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }
}
