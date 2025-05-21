package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.R;
import defpackage.tx;
import defpackage.uk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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

    private final void r(tx txVar) {
        if (as() <= 1) {
            txVar.width = Math.min(c(), this.a);
            return;
        }
        txVar.width = Math.min((int) (c() * 0.85d), this.a);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void U(uk ukVar, int[] iArr) {
        int i = this.a * this.b;
        iArr[0] = i;
        iArr[1] = i;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.tw
    public final tx f() {
        tx txVar = new tx(-2, -2);
        r(txVar);
        return txVar;
    }

    @Override // defpackage.tw
    public final tx fE(ViewGroup.LayoutParams layoutParams) {
        tx fE = super.fE(layoutParams);
        r(fE);
        return fE;
    }

    @Override // defpackage.tw
    public final tx h(Context context, AttributeSet attributeSet) {
        tx txVar = new tx(context, attributeSet);
        r(txVar);
        return txVar;
    }
}
