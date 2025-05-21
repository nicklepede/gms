package com.google.android.gms.auth.uiflows.minutemaid;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;
import com.google.android.setupdesign.GlifLayout;
import defpackage.aanf;
import defpackage.asoe;
import defpackage.asqy;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edfs;
import defpackage.edid;
import defpackage.fkkk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GlifMinuteMaidLayout extends GlifLayout {
    public static final /* synthetic */ int f = 0;
    public Context a;
    public edid b;
    public edfq c;
    public edfs d;
    public edfs e;

    public GlifMinuteMaidLayout(Context context) {
        this(context, null);
    }

    private static final void d(View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void a(boolean z) {
        edfs edfsVar = this.d;
        if (edfsVar != null) {
            edfsVar.c(z);
        }
    }

    public final void c(String str, int i, final aanf aanfVar) {
        if (TextUtils.isEmpty(str)) {
            edfs edfsVar = this.d;
            if (edfsVar != null) {
                edfsVar.f(8);
                return;
            }
            return;
        }
        edfr edfrVar = new edfr(this.a);
        edfrVar.c = i;
        edfrVar.d = R.style.SudGlifButton_Primary;
        edfrVar.a = str;
        edfs a = edfrVar.a();
        this.d = a;
        a.f(0);
        this.c.b(this.d);
        this.d.f = new View.OnClickListener() { // from class: admn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = GlifMinuteMaidLayout.f;
                aanf.this.d();
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
        this.b = (edid) q(edid.class);
        this.c = (edfq) q(edfq.class);
        if (fkkk.a.a().a() && asqy.a(context)) {
            this.c.n(false);
        } else {
            this.c.n(true);
        }
        J(false);
        if (gK() && (asoe.m(this.a) || asoe.j(this.a))) {
            d(o(R.id.sud_layout_content));
        }
        d(o(R.id.sud_landscape_content_area));
        if (gK() && (o = o(R.id.sud_layout_content)) != null && (o.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o.getLayoutParams();
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
        }
    }
}
