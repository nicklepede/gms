package com.google.android.gms.wallet.ui.component.alert;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.dlrl;
import defpackage.ehrh;
import defpackage.ehrk;
import defpackage.ehyt;
import defpackage.eihg;
import defpackage.eijr;
import defpackage.ekmu;
import defpackage.ekmx;
import defpackage.fdgh;
import defpackage.fdgi;
import defpackage.fdgu;
import defpackage.fdgx;
import defpackage.fdgy;
import defpackage.fdgz;
import defpackage.iwe;
import defpackage.msl;
import defpackage.mte;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AlertView extends CardView implements View.OnClickListener, ehrh {
    ViewGroup g;
    ViewGroup h;
    ViewGroup i;
    final ArrayList j;
    boolean k;
    boolean l;
    mte m;
    TransitionDrawable n;
    boolean o;
    ehyt p;
    public ehrk q;
    private fdgu r;
    private boolean s;
    private msl t;
    private Drawable u;
    private Drawable v;
    private Activity w;
    private eihg x;
    private int y;

    public AlertView(Context context) {
        super(context);
        this.j = new ArrayList();
        this.y = 1;
        this.o = false;
    }

    private final Drawable i() {
        if (this.u == null) {
            this.u = new CardView(getContext()).getBackground().mutate();
            this.u.setTintList(eijr.j(eijr.b(getContext(), R.attr.walletCardViewPageErrorColor)));
        }
        return this.u;
    }

    private final Drawable j() {
        if (this.v == null) {
            this.v = new CardView(getContext()).getBackground().mutate();
        }
        return this.v;
    }

    private final TransitionDrawable k() {
        if (this.n == null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{j(), i()});
            this.n = transitionDrawable;
            int[] iArr = iwe.a;
            setBackground(transitionDrawable);
        }
        return this.n;
    }

    private final mte l() {
        View findViewById;
        if (this.m == null && (findViewById = this.w.findViewById(android.R.id.content)) != null) {
            this.m = new mte();
            msl mslVar = new msl((ViewGroup) findViewById);
            this.t = mslVar;
            mslVar.b = new dlrl(this);
            this.m.d(mslVar, eijr.s());
        }
        return this.m;
    }

    private final void m(boolean z) {
        Drawable j;
        boolean z2 = true;
        boolean z3 = this.y != 2 && (this.s || !this.k);
        if (z3 != this.o) {
            if (p()) {
                int i = true != z ? 0 : 400;
                if (z3) {
                    k().startTransition(i);
                } else {
                    k().reverseTransition(i);
                    z2 = false;
                }
            } else {
                if (z3) {
                    j = i();
                } else {
                    j = j();
                    z2 = false;
                }
                int[] iArr = iwe.a;
                setBackground(j);
            }
            this.o = z2;
        }
    }

    private final void n() {
        ekmu ekmuVar;
        LayoutInflater from = LayoutInflater.from(getContext());
        setVisibility(0);
        removeAllViews();
        this.p.f();
        ArrayList arrayList = this.j;
        arrayList.clear();
        ekmx ekmxVar = null;
        this.g = null;
        this.h = null;
        this.i = null;
        int size = this.r.c.size();
        if (size == 1) {
            this.s = true;
            fdgu fdguVar = this.r;
            eihg eihgVar = this.x;
            AlertMessageView alertMessageView = (AlertMessageView) from.inflate(R.layout.wallet_view_alert_message, (ViewGroup) this, false);
            alertMessageView.h = this.q;
            alertMessageView.a((fdgz) fdguVar.c.get(0), this.p, eihgVar, true);
            alertMessageView.setId(this.p.a());
            arrayList.add(alertMessageView);
            this.g = alertMessageView;
            addView(alertMessageView);
            int a = fdgx.a(((fdgz) this.r.c.get(0)).h);
            this.y = a != 0 ? a : 1;
            return;
        }
        if (size <= 1) {
            setVisibility(8);
            return;
        }
        fdgu fdguVar2 = this.r;
        AlertHeaderView alertHeaderView = (AlertHeaderView) from.inflate(R.layout.wallet_view_alert_header, (ViewGroup) this, false);
        fdgy fdgyVar = fdguVar2.d;
        if (fdgyVar == null) {
            fdgyVar = fdgy.a;
        }
        ehyt ehytVar = this.p;
        ImageWithCaptionView imageWithCaptionView = alertHeaderView.a;
        if ((fdgyVar.b & 4) != 0) {
            ekmuVar = fdgyVar.e;
            if (ekmuVar == null) {
                ekmuVar = ekmu.a;
            }
        } else {
            ekmuVar = null;
        }
        imageWithCaptionView.m(ekmuVar);
        InfoMessageView infoMessageView = alertHeaderView.b;
        if ((fdgyVar.b & 1) != 0 && (ekmxVar = fdgyVar.c) == null) {
            ekmxVar = ekmx.a;
        }
        infoMessageView.p(ekmxVar);
        alertHeaderView.b.setId(ehytVar.a());
        alertHeaderView.c.setVisibility(0);
        alertHeaderView.d.setVisibility(8);
        int a2 = fdgx.a(fdgyVar.f);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 2 || i == 3) {
            ColorStateList m = eijr.m(alertHeaderView.getContext());
            alertHeaderView.a.g = m;
            alertHeaderView.b.v(alertHeaderView.getResources().getColor(android.R.color.white));
            eijr.M(alertHeaderView.c, m);
        } else {
            alertHeaderView.a.g = eijr.j(eijr.b(alertHeaderView.getContext(), R.attr.colorAccent));
            eijr.M(alertHeaderView.c, eijr.h(alertHeaderView.getContext(), android.R.attr.textColorSecondary));
        }
        alertHeaderView.setId(this.p.a());
        alertHeaderView.setOnClickListener(this);
        alertHeaderView.setTag(R.id.summary_expander_transition_name, "summaryField");
        this.h = alertHeaderView;
        fdgu fdguVar3 = this.r;
        eihg eihgVar2 = this.x;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setId(this.p.a());
        AlertHeaderView alertHeaderView2 = (AlertHeaderView) from.inflate(R.layout.wallet_view_alert_header, (ViewGroup) linearLayout, false);
        fdgy fdgyVar2 = fdguVar3.d;
        if (fdgyVar2 == null) {
            fdgyVar2 = fdgy.a;
        }
        ehyt ehytVar2 = this.p;
        if ((2 & fdgyVar2.b) != 0) {
            InfoMessageView infoMessageView2 = alertHeaderView2.b;
            ekmx ekmxVar2 = fdgyVar2.d;
            if (ekmxVar2 == null) {
                ekmxVar2 = ekmx.a;
            }
            infoMessageView2.p(ekmxVar2);
        } else {
            alertHeaderView2.b.setVisibility(8);
        }
        alertHeaderView2.b.setId(ehytVar2.a());
        alertHeaderView2.c.setVisibility(8);
        alertHeaderView2.d.setVisibility(0);
        alertHeaderView2.setId(this.p.a());
        alertHeaderView2.setOnClickListener(this);
        alertHeaderView2.setTag(R.id.summary_expander_transition_name, "expandedField");
        linearLayout.addView(alertHeaderView2);
        for (fdgz fdgzVar : fdguVar3.c) {
            AlertMessageView alertMessageView2 = (AlertMessageView) from.inflate(R.layout.wallet_view_alert_message, (ViewGroup) linearLayout, false);
            alertMessageView2.h = this.q;
            alertMessageView2.a(fdgzVar, this.p, eihgVar2, false);
            alertMessageView2.setId(this.p.a());
            alertMessageView2.setTag(R.id.summary_expander_transition_name, "expandedField");
            arrayList.add(alertMessageView2);
            linearLayout.addView(alertMessageView2);
        }
        this.i = linearLayout;
        addView(this.h);
        addView(this.i);
        if (!this.l) {
            this.k = this.r.e;
        }
        o();
        fdgy fdgyVar3 = this.r.d;
        if (fdgyVar3 == null) {
            fdgyVar3 = fdgy.a;
        }
        int a3 = fdgx.a(fdgyVar3.f);
        this.y = a3 != 0 ? a3 : 1;
    }

    private final void o() {
        if (this.k) {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            eijr.K(this.i, 0);
        } else {
            this.h.setVisibility(0);
            this.i.setVisibility(8);
            eijr.K(this.i, 8);
        }
    }

    private final boolean p() {
        return eijr.S(this.w) && l() != null;
    }

    public final void f() {
        this.k = !this.k;
        this.l = true;
        o();
    }

    public final void g(fdgu fdguVar, Activity activity, ehyt ehytVar, eihg eihgVar) {
        this.r = fdguVar;
        this.w = activity;
        this.p = ehytVar;
        this.x = eihgVar;
        n();
        m(false);
    }

    public final void h(fdgi fdgiVar, fdgu fdguVar) {
        int a = fdgh.a(fdgiVar.c);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            Locale locale = Locale.US;
            int a2 = fdgh.a(fdgiVar.c);
            if (a2 == 0) {
                a2 = 1;
            }
            throw new IllegalArgumentException(String.format(locale, "AlertView does not support partial page update type: %s", Integer.toString(a2 - 1)));
        }
        kH();
        this.r = fdguVar;
        n();
        m(true);
    }

    @Override // defpackage.ehrh
    public final void kH() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AlertMessageView) arrayList.get(i)).kH();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (p()) {
            l().e(this.t);
        } else {
            f();
        }
        m(true);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parentState"));
        if (this.s) {
            return;
        }
        this.k = bundle.getBoolean("viewIsExpanded");
        this.l = bundle.getBoolean("expandedStateSetByUser");
        if (this.k != this.r.e) {
            o();
            m(false);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putBoolean("viewIsExpanded", this.k);
        bundle.putBoolean("expandedStateSetByUser", this.l);
        return bundle;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.setEnabled(z);
        }
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 != null) {
            viewGroup2.setEnabled(z);
            this.i.setEnabled(z);
            eijr.J(this.i, z);
        }
    }

    public AlertView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new ArrayList();
        this.y = 1;
        this.o = false;
    }

    public AlertView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new ArrayList();
        this.y = 1;
        this.o = false;
    }
}
