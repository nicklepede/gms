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
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.djfs;
import defpackage.efee;
import defpackage.efeh;
import defpackage.eflq;
import defpackage.efud;
import defpackage.efwo;
import defpackage.ehzo;
import defpackage.ehzr;
import defpackage.fars;
import defpackage.fart;
import defpackage.fasf;
import defpackage.fasi;
import defpackage.fasj;
import defpackage.fask;
import defpackage.iuo;
import defpackage.kzq;
import defpackage.laj;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AlertView extends CardView implements View.OnClickListener, efee {
    ViewGroup g;
    ViewGroup h;
    ViewGroup i;
    final ArrayList j;
    boolean k;
    boolean l;
    laj m;
    TransitionDrawable n;
    boolean o;
    eflq p;
    public efeh q;
    private fasf r;
    private boolean s;
    private kzq t;
    private Drawable u;
    private Drawable v;
    private Activity w;
    private efud x;
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
            this.u.setTintList(efwo.j(efwo.b(getContext(), R.attr.walletCardViewPageErrorColor)));
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
            int[] iArr = iuo.a;
            setBackground(transitionDrawable);
        }
        return this.n;
    }

    private final laj l() {
        View findViewById;
        if (this.m == null && (findViewById = this.w.findViewById(android.R.id.content)) != null) {
            this.m = new laj();
            kzq kzqVar = new kzq((ViewGroup) findViewById);
            this.t = kzqVar;
            kzqVar.b = new djfs(this);
            this.m.d(kzqVar, efwo.s());
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
                int[] iArr = iuo.a;
                setBackground(j);
            }
            this.o = z2;
        }
    }

    private final void n() {
        ehzo ehzoVar;
        LayoutInflater from = LayoutInflater.from(getContext());
        setVisibility(0);
        removeAllViews();
        this.p.f();
        ArrayList arrayList = this.j;
        arrayList.clear();
        ehzr ehzrVar = null;
        this.g = null;
        this.h = null;
        this.i = null;
        int size = this.r.c.size();
        if (size == 1) {
            this.s = true;
            fasf fasfVar = this.r;
            efud efudVar = this.x;
            AlertMessageView alertMessageView = (AlertMessageView) from.inflate(R.layout.wallet_view_alert_message, (ViewGroup) this, false);
            alertMessageView.h = this.q;
            alertMessageView.a((fask) fasfVar.c.get(0), this.p, efudVar, true);
            alertMessageView.setId(this.p.a());
            arrayList.add(alertMessageView);
            this.g = alertMessageView;
            addView(alertMessageView);
            int a = fasi.a(((fask) this.r.c.get(0)).h);
            this.y = a != 0 ? a : 1;
            return;
        }
        if (size <= 1) {
            setVisibility(8);
            return;
        }
        fasf fasfVar2 = this.r;
        AlertHeaderView alertHeaderView = (AlertHeaderView) from.inflate(R.layout.wallet_view_alert_header, (ViewGroup) this, false);
        fasj fasjVar = fasfVar2.d;
        if (fasjVar == null) {
            fasjVar = fasj.a;
        }
        eflq eflqVar = this.p;
        ImageWithCaptionView imageWithCaptionView = alertHeaderView.a;
        if ((fasjVar.b & 4) != 0) {
            ehzoVar = fasjVar.e;
            if (ehzoVar == null) {
                ehzoVar = ehzo.a;
            }
        } else {
            ehzoVar = null;
        }
        imageWithCaptionView.m(ehzoVar);
        InfoMessageView infoMessageView = alertHeaderView.b;
        if ((fasjVar.b & 1) != 0 && (ehzrVar = fasjVar.c) == null) {
            ehzrVar = ehzr.a;
        }
        infoMessageView.p(ehzrVar);
        alertHeaderView.b.setId(eflqVar.a());
        alertHeaderView.c.setVisibility(0);
        alertHeaderView.d.setVisibility(8);
        int a2 = fasi.a(fasjVar.f);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 2 || i == 3) {
            ColorStateList m = efwo.m(alertHeaderView.getContext());
            alertHeaderView.a.g = m;
            alertHeaderView.b.v(alertHeaderView.getResources().getColor(android.R.color.white));
            efwo.M(alertHeaderView.c, m);
        } else {
            alertHeaderView.a.g = efwo.j(efwo.b(alertHeaderView.getContext(), R.attr.colorAccent));
            efwo.M(alertHeaderView.c, efwo.h(alertHeaderView.getContext(), android.R.attr.textColorSecondary));
        }
        alertHeaderView.setId(this.p.a());
        alertHeaderView.setOnClickListener(this);
        alertHeaderView.setTag(R.id.summary_expander_transition_name, "summaryField");
        this.h = alertHeaderView;
        fasf fasfVar3 = this.r;
        efud efudVar2 = this.x;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setId(this.p.a());
        AlertHeaderView alertHeaderView2 = (AlertHeaderView) from.inflate(R.layout.wallet_view_alert_header, (ViewGroup) linearLayout, false);
        fasj fasjVar2 = fasfVar3.d;
        if (fasjVar2 == null) {
            fasjVar2 = fasj.a;
        }
        eflq eflqVar2 = this.p;
        if ((2 & fasjVar2.b) != 0) {
            InfoMessageView infoMessageView2 = alertHeaderView2.b;
            ehzr ehzrVar2 = fasjVar2.d;
            if (ehzrVar2 == null) {
                ehzrVar2 = ehzr.a;
            }
            infoMessageView2.p(ehzrVar2);
        } else {
            alertHeaderView2.b.setVisibility(8);
        }
        alertHeaderView2.b.setId(eflqVar2.a());
        alertHeaderView2.c.setVisibility(8);
        alertHeaderView2.d.setVisibility(0);
        alertHeaderView2.setId(this.p.a());
        alertHeaderView2.setOnClickListener(this);
        alertHeaderView2.setTag(R.id.summary_expander_transition_name, "expandedField");
        linearLayout.addView(alertHeaderView2);
        for (fask faskVar : fasfVar3.c) {
            AlertMessageView alertMessageView2 = (AlertMessageView) from.inflate(R.layout.wallet_view_alert_message, (ViewGroup) linearLayout, false);
            alertMessageView2.h = this.q;
            alertMessageView2.a(faskVar, this.p, efudVar2, false);
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
        fasj fasjVar3 = this.r.d;
        if (fasjVar3 == null) {
            fasjVar3 = fasj.a;
        }
        int a3 = fasi.a(fasjVar3.f);
        this.y = a3 != 0 ? a3 : 1;
    }

    private final void o() {
        if (this.k) {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            efwo.K(this.i, 0);
        } else {
            this.h.setVisibility(0);
            this.i.setVisibility(8);
            efwo.K(this.i, 8);
        }
    }

    private final boolean p() {
        return efwo.S(this.w) && l() != null;
    }

    public final void f() {
        this.k = !this.k;
        this.l = true;
        o();
    }

    public final void g(fasf fasfVar, Activity activity, eflq eflqVar, efud efudVar) {
        this.r = fasfVar;
        this.w = activity;
        this.p = eflqVar;
        this.x = efudVar;
        n();
        m(false);
    }

    public final void h(fart fartVar, fasf fasfVar) {
        int a = fars.a(fartVar.c);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            Locale locale = Locale.US;
            int a2 = fars.a(fartVar.c);
            if (a2 == 0) {
                a2 = 1;
            }
            throw new IllegalArgumentException(String.format(locale, "AlertView does not support partial page update type: %s", Integer.toString(a2 - 1)));
        }
        ks();
        this.r = fasfVar;
        n();
        m(true);
    }

    @Override // defpackage.efee
    public final void ks() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AlertMessageView) arrayList.get(i)).ks();
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
            efwo.J(this.i, z);
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
