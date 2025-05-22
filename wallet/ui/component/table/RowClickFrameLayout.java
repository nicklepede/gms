package com.google.android.gms.wallet.ui.component.table;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dlto;
import defpackage.dltp;
import defpackage.ehrf;
import defpackage.fdhp;
import defpackage.ue;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RowClickFrameLayout extends FrameLayout implements ue {
    boolean a;
    int b;
    public dlto c;
    public dltp d;

    public RowClickFrameLayout(Context context) {
        super(context);
        this.b = -1;
    }

    @Override // defpackage.ue
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ue
    public final boolean i(RecyclerView recyclerView, MotionEvent motionEvent) {
        View view;
        this.b = -1;
        if (this.a) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                this.a = false;
            }
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int a = recyclerView.h.a() - 1;
        while (true) {
            if (a < 0) {
                view = null;
                break;
            }
            view = recyclerView.h.d(a);
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            if (x >= view.getLeft() + translationX && x <= view.getRight() + translationX && y >= view.getTop() + translationY && y <= view.getBottom() + translationY) {
                break;
            }
            a--;
        }
        if (view != null) {
            int i = this.c.a(recyclerView.c(view)).a;
            int a2 = fdhp.a(this.c.d(i).d);
            if (a2 != 0 && a2 == 3) {
                this.b = i;
                Drawable background = getBackground();
                if (background != null) {
                    background.setBounds(getLeft(), view.getTop(), getRight(), view.getBottom());
                }
                onTouchEvent(motionEvent);
            }
        }
        return this.b != -1;
    }

    @Override // defpackage.ue
    public final void k(MotionEvent motionEvent) {
        if (this.b != -1) {
            onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                dltp dltpVar = this.d;
                ehrf ehrfVar = (ehrf) dltpVar.f.e(dltpVar.a.d(this.b).b);
                if (ehrfVar != null) {
                    ehrfVar.a();
                }
            }
        }
    }

    public RowClickFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
    }

    public RowClickFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1;
    }

    public RowClickFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = -1;
    }
}
