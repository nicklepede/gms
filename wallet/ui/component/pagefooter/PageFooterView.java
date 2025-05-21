package com.google.android.gms.wallet.ui.component.pagefooter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.djfk;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PageFooterView extends LinearLayout {
    public final ArrayList a;

    public PageFooterView(Context context) {
        super(context);
        this.a = new ArrayList(2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((djfk) arrayList.get(i)).kR(z);
        }
    }

    public PageFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList(2);
    }

    public PageFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList(2);
    }
}
