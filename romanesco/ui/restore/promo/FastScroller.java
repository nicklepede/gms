package com.google.android.gms.romanesco.ui.restore.promo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FastScroller extends RelativeLayout {
    View a;
    private final int b;
    private boolean c;

    public FastScroller(Context context) {
        super(context);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.fast_scroller_touch_target_width);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.fast_scroller_scroll_bar);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.c) {
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
            this.c = false;
            this.a.setSelected(false);
            return true;
        }
        this.c = true;
        this.a.setSelected(true);
        float y = motionEvent.getY();
        int height = this.a.getHeight();
        this.a.setY(Math.min(Math.max(0, (int) (y - (height / 2))), getHeight() - height));
        motionEvent.getY();
        throw null;
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.fast_scroller_touch_target_width);
    }
}
