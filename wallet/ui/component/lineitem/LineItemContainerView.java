package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.djeo;
import defpackage.djep;
import defpackage.djhj;
import defpackage.ehvl;
import defpackage.ehvm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LineItemContainerView extends FrameLayout implements djeo {
    public ArrayList a;
    public boolean b;
    public ehvm c;
    public djhj d;
    private LinearLayout e;

    public LineItemContainerView(Context context) {
        super(context);
        c(context);
    }

    @Override // defpackage.djeo
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ehvm) obj) != null;
    }

    protected final void c(Context context) {
        this.e = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.wallet_view_line_item_container, (ViewGroup) this, true).findViewById(R.id.line_item_container_bundles);
    }

    @Override // defpackage.djeo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ehvm ehvmVar) {
        this.c = ehvmVar;
        f(ehvmVar, this.b);
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

    public final void f(ehvm ehvmVar, boolean z) {
        ArrayList a = djep.a(getContext(), this.e, ehvmVar.c, LineItemBundleView.class);
        this.a = a;
        if (a != null) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                LineItemBundleView lineItemBundleView = (LineItemBundleView) this.a.get(i);
                lineItemBundleView.h = z;
                ehvl ehvlVar = lineItemBundleView.g;
                if (ehvlVar != null) {
                    lineItemBundleView.g(ehvlVar, z);
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
