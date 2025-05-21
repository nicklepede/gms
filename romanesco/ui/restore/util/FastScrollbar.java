package com.google.android.gms.romanesco.ui.restore.util;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.R;
import defpackage.asoq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FastScrollbar extends RelativeLayout {
    View a;
    private final int b;
    private asoq c;
    private LinearLayoutManager d;
    private boolean e;

    public FastScrollbar(Context context) {
        super(context);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.fast_scroller_touch_target_width);
    }

    private final void c(float f) {
        int height = this.a.getHeight();
        this.a.setY(d(getHeight() - height, (((int) f) - height) / 2));
    }

    private static final int d(int i, int i2) {
        return Math.min(Math.max(0, i2), i);
    }

    public final void a(asoq asoqVar, LinearLayoutManager linearLayoutManager) {
        this.c = asoqVar;
        this.d = linearLayoutManager;
    }

    public final void b(RecyclerView recyclerView) {
        if (this.a.isSelected()) {
            return;
        }
        c(getHeight() * (recyclerView.computeVerticalScrollOffset() / (recyclerView.computeVerticalScrollRange() - getHeight())));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        if (configuration.orientation == 2) {
            setVisibility(4);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.fast_scrollbar_scroll_bar);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            if ((getWidth() - this.b) - motionEvent.getX() > 0.0f) {
                return super.onTouchEvent(motionEvent);
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            this.e = false;
            this.a.setSelected(false);
            return true;
        }
        this.e = true;
        this.a.setSelected(true);
        c(motionEvent.getY());
        float y = motionEvent.getY();
        asoq asoqVar = this.c;
        int intValue = asoqVar != null ? ((Integer) asoqVar.a(null)).intValue() : 0;
        this.d.Z(d(intValue - 1, (int) ((this.a.getY() != 0.0f ? this.a.getY() + ((float) this.a.getHeight()) >= ((float) getHeight()) ? 1.0f : y / getHeight() : 0.0f) * intValue)), 0);
        return true;
    }

    public FastScrollbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.fast_scroller_touch_target_width);
    }
}
