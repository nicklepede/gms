package com.google.android.gms.auth.uiflows.minutemaid;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;
import com.google.android.setupdesign.GlifLayout;
import defpackage.acnf;
import defpackage.aury;
import defpackage.auus;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efsn;
import defpackage.efuy;
import defpackage.fnaz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GlifMinuteMaidLayout extends GlifLayout {
    public static final /* synthetic */ int f = 0;
    public Context a;
    public efuy b;
    public efsl c;
    public efsn d;
    public efsn e;

    public GlifMinuteMaidLayout(Context context) {
        this(context, null);
    }

    private static final void d(View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void a(boolean z) {
        efsn efsnVar = this.d;
        if (efsnVar != null) {
            efsnVar.c(z);
        }
    }

    public final void c(String str, int i, final acnf acnfVar) {
        if (TextUtils.isEmpty(str)) {
            efsn efsnVar = this.d;
            if (efsnVar != null) {
                efsnVar.f(8);
                return;
            }
            return;
        }
        efsm efsmVar = new efsm(this.a);
        efsmVar.c = i;
        efsmVar.d = R.style.SudGlifButton_Primary;
        efsmVar.a = str;
        efsn a = efsmVar.a();
        this.d = a;
        a.f(0);
        this.c.b(this.d);
        this.d.f = new View.OnClickListener() { // from class: afmu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = GlifMinuteMaidLayout.f;
                acnf.this.d();
            }
        };
    }

    public GlifMinuteMaidLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlifMinuteMaidLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View o;
        this.a = context;
        this.b = (efuy) q(efuy.class);
        this.c = (efsl) q(efsl.class);
        if (fnaz.a.lK().a() && auus.a(context)) {
            this.c.n(false);
        } else {
            this.c.n(true);
        }
        J(false);
        if (ha() && (aury.m(this.a) || aury.j(this.a))) {
            d(o(R.id.sud_layout_content));
        }
        d(o(R.id.sud_landscape_content_area));
        if (ha() && (o = o(R.id.sud_layout_content)) != null && (o.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o.getLayoutParams();
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
        }
    }
}
