package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.R;
import defpackage.uc;
import defpackage.up;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PromptItemCarouselLayoutManager extends LinearLayoutManager {
    private final int a;
    private final int b;

    public PromptItemCarouselLayoutManager(Context context) {
        super(0, false);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.as_card_max_width);
        this.b = 6;
    }

    private final int c() {
        return (this.F - getPaddingRight()) - getPaddingLeft();
    }

    private final void r(uc ucVar) {
        if (as() <= 1) {
            ucVar.width = Math.min(c(), this.a);
            return;
        }
        ucVar.width = Math.min((int) (c() * 0.85d), this.a);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void U(up upVar, int[] iArr) {
        int i = this.a * this.b;
        iArr[0] = i;
        iArr[1] = i;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ub
    public final uc f() {
        uc ucVar = new uc(-2, -2);
        r(ucVar);
        return ucVar;
    }

    @Override // defpackage.ub
    public final uc fR(ViewGroup.LayoutParams layoutParams) {
        uc fR = super.fR(layoutParams);
        r(fR);
        return fR;
    }

    @Override // defpackage.ub
    public final uc h(Context context, AttributeSet attributeSet) {
        uc ucVar = new uc(context, attributeSet);
        r(ucVar);
        return ucVar;
    }
}
