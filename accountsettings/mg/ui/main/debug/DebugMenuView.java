package com.google.android.gms.accountsettings.mg.ui.main.debug;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.MenuItem;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.ui.main.debug.DebugMenuView;
import com.google.android.material.navigation.NavigationView;
import defpackage.asqh;
import defpackage.ebsq;
import defpackage.eiig;
import defpackage.etie;
import defpackage.fjue;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;
import defpackage.jpc;
import defpackage.qfp;
import defpackage.rqy;
import defpackage.rrk;
import defpackage.ruc;
import defpackage.rue;
import defpackage.ruy;
import defpackage.rwi;
import defpackage.rwx;
import defpackage.rxq;
import defpackage.sqq;
import defpackage.stq;
import defpackage.swx;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DebugMenuView extends NavigationView {
    public static final String a = "DEFAULT : " + fjue.j() + ":" + fjue.c();
    public rqy b;
    public sqq c;
    public ruy d;
    public final fuuw e;
    public stq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fvbo.f(context, "context");
        this.e = new fuvg(new fvaf() { // from class: swu
            @Override // defpackage.fvaf
            public final Object a() {
                return (DrawerLayout) DebugMenuView.this.a().findViewById(R.id.drawer_layout);
            }
        });
        ((swx) rrk.a(swx.class, context)).e(this);
        if (asqh.e()) {
            this.m.j = true;
        }
        this.m.c(0, 1, 0, "clear local cache");
        this.m.c(0, 2, 0, "clear dismissed onboarding flows");
        if (asqh.c()) {
            this.m.c(1, 3, 0, "force toggle dark mode");
            this.m.c(1, 4, 0, "clear dark mode override");
        }
        this.m.c(2, 5, 0, "select environment");
        this.o = new ebsq() { // from class: swv
            @Override // defpackage.ebsq
            public final void a(MenuItem menuItem) {
                int i = ((ni) menuItem).a;
                final DebugMenuView debugMenuView = DebugMenuView.this;
                if (i == 1) {
                    debugMenuView.d();
                } else if (i == 2) {
                    rxq rxqVar = debugMenuView.c().l;
                    rxqVar.a.b = ejck.a;
                    final rvm rvmVar = rxqVar.c;
                    Objects.requireNonNull(rvmVar);
                    rxqVar.b(new Runnable() { // from class: rxm
                        @Override // java.lang.Runnable
                        public final void run() {
                            rvm.this.b();
                        }
                    });
                } else if (i == 3) {
                    qfp a2 = debugMenuView.a();
                    bqnc.b = Boolean.valueOf(true ^ bqnc.d());
                    a2.recreate();
                } else if (i == 4) {
                    qfp a3 = debugMenuView.a();
                    Boolean bool = bqnc.b;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        bqnc.b = null;
                        if (booleanValue != bqnc.d()) {
                            a3.recreate();
                        }
                    }
                } else if (i == 5) {
                    fjus g = fjue.g();
                    fvbo.e(g, "debugEnvironmentConfig(...)");
                    final fedh fedhVar = g.b;
                    fvbo.e(fedhVar, "getEnvironmentsList(...)");
                    ArrayList arrayList = new ArrayList(fuwt.o(fedhVar, 10));
                    Iterator<E> it = fedhVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((fjur) it.next()).b);
                    }
                    List X = fuwt.X(fuwt.b(DebugMenuView.a), arrayList);
                    ebna ebnaVar = new ebna(debugMenuView.a());
                    ebnaVar.N("Select the environment:");
                    ebnaVar.A((CharSequence[]) X.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: sww
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            DebugMenuView debugMenuView2 = DebugMenuView.this;
                            if (i2 == 0) {
                                debugMenuView2.b().a = null;
                                debugMenuView2.d();
                            } else {
                                Object obj = fedhVar.get(i2 - 1);
                                fvbo.e(obj, "get(...)");
                                debugMenuView2.b().a = (fjur) obj;
                                debugMenuView2.d();
                            }
                        }
                    });
                    ebnaVar.create().show();
                }
                ((DrawerLayout) debugMenuView.e.a()).g();
            }
        };
    }

    public final qfp a() {
        Context context = getContext();
        while (!(context instanceof qfp)) {
            if (!(context instanceof ContextWrapper)) {
                throw new IllegalStateException("Could not find activity context.");
            }
            Context context2 = getContext();
            fvbo.d(context2, "null cannot be cast to non-null type android.content.ContextWrapper");
            context = ((ContextWrapper) context2).getBaseContext();
        }
        return (qfp) context;
    }

    public final ruy b() {
        ruy ruyVar = this.d;
        if (ruyVar != null) {
            return ruyVar;
        }
        fvbo.j("environmentManager");
        return null;
    }

    public final sqq c() {
        sqq sqqVar = this.c;
        if (sqqVar != null) {
            return sqqVar;
        }
        fvbo.j("accountModel");
        return null;
    }

    public final void d() {
        rqy rqyVar = this.b;
        stq stqVar = null;
        if (rqyVar == null) {
            fvbo.j("imageFetcher");
            rqyVar = null;
        }
        rqyVar.a();
        rxq rxqVar = c().l;
        rwi rwiVar = rxqVar.a;
        for (jpc jpcVar : rwiVar.c.values()) {
            ruc rucVar = (ruc) jpcVar.hT();
            eiig.y(rucVar, "ResourceInfo should never be null here.");
            etie etieVar = rucVar.a.e;
            if (etieVar == null) {
                etieVar = etie.a;
            }
            jpcVar.l(new ruc(etieVar));
        }
        Iterator it = rwiVar.a.values().iterator();
        while (it.hasNext()) {
            ((jpc) it.next()).l(new rue(false, false, null));
        }
        final rwx rwxVar = rxqVar.b;
        Objects.requireNonNull(rwxVar);
        rxqVar.b(new Runnable() { // from class: rxo
            @Override // java.lang.Runnable
            public final void run() {
                rwx.this.c();
            }
        });
        sqq c = c();
        stq stqVar2 = this.f;
        if (stqVar2 == null) {
            fvbo.j("navStackModel");
        } else {
            stqVar = stqVar2;
        }
        c.g(stqVar.b());
    }
}
