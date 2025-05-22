package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.dlqh;
import defpackage.dlqi;
import defpackage.dltc;
import defpackage.ekir;
import defpackage.ekis;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LineItemContainerView extends FrameLayout implements dlqh {
    public ArrayList a;
    public boolean b;
    public ekis c;
    public dltc d;
    private LinearLayout e;

    public LineItemContainerView(Context context) {
        super(context);
        c(context);
    }

    @Override // defpackage.dlqh
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ekis) obj) != null;
    }

    protected final void c(Context context) {
        this.e = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.wallet_view_line_item_container, (ViewGroup) this, true).findViewById(R.id.line_item_container_bundles);
    }

    @Override // defpackage.dlqh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ekis ekisVar) {
        this.c = ekisVar;
        f(ekisVar, this.b);
    }

    public final void e() {
        if (this.a != null) {
            for (int i = 0; i < this.a.size(); i++) {
                LineItemBundleView lineItemBundleView = (LineItemBundleView) this.a.get(i);
                lineItemBundleView.l = this.d;
                lineItemBundleView.j();
            }
        }
    }

    public final void f(ekis ekisVar, boolean z) {
        ArrayList a = dlqi.a(getContext(), this.e, ekisVar.c, LineItemBundleView.class);
        this.a = a;
        if (a != null) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                LineItemBundleView lineItemBundleView = (LineItemBundleView) this.a.get(i);
                lineItemBundleView.h = z;
                ekir ekirVar = lineItemBundleView.g;
                if (ekirVar != null) {
                    lineItemBundleView.g(ekirVar, z);
                }
            }
        }
        e();
    }

    public LineItemContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public LineItemContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    public LineItemContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context);
    }
}
