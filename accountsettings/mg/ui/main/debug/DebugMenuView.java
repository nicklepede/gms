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
import defpackage.auub;
import defpackage.eeff;
import defpackage.ekvl;
import defpackage.evxw;
import defpackage.fmkf;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;
import defpackage.jvr;
import defpackage.ryt;
import defpackage.tkh;
import defpackage.tkt;
import defpackage.tnl;
import defpackage.tnn;
import defpackage.toi;
import defpackage.tps;
import defpackage.tqh;
import defpackage.tra;
import defpackage.ulr;
import defpackage.upo;
import defpackage.usv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DebugMenuView extends NavigationView {
    public static final String a = "DEFAULT : " + fmkf.k() + ":" + fmkf.d();
    public tkh b;
    public ulr c;
    public toi d;
    public final fxqu e;
    public upo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fxxm.f(context, "context");
        this.e = new fxre(new fxwd() { // from class: uss
            @Override // defpackage.fxwd
            public final Object a() {
                return (DrawerLayout) DebugMenuView.this.a().findViewById(R.id.drawer_layout);
            }
        });
        ((usv) tkt.a(usv.class, context)).e(this);
        if (auub.e()) {
            this.m.j = true;
        }
        this.m.c(0, 1, 0, "clear local cache");
        this.m.c(0, 2, 0, "clear dismissed onboarding flows");
        if (auub.c()) {
            this.m.c(1, 3, 0, "force toggle dark mode");
            this.m.c(1, 4, 0, "clear dark mode override");
        }
        this.m.c(2, 5, 0, "select environment");
        this.o = new eeff() { // from class: ust
            @Override // defpackage.eeff
            public final void a(MenuItem menuItem) {
                int i = ((ni) menuItem).a;
                final DebugMenuView debugMenuView = DebugMenuView.this;
                if (i == 1) {
                    debugMenuView.d();
                } else if (i == 2) {
                    tra traVar = debugMenuView.c().l;
                    traVar.a.b = elpp.a;
                    final tow towVar = traVar.c;
                    Objects.requireNonNull(towVar);
                    traVar.b(new Runnable() { // from class: tqw
                        @Override // java.lang.Runnable
                        public final void run() {
                            tow.this.b();
                        }
                    });
                } else if (i == 3) {
                    ryt a2 = debugMenuView.a();
                    bsur.b = Boolean.valueOf(true ^ bsur.d());
                    a2.recreate();
                } else if (i == 4) {
                    ryt a3 = debugMenuView.a();
                    Boolean bool = bsur.b;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        bsur.b = null;
                        if (booleanValue != bsur.d()) {
                            a3.recreate();
                        }
                    }
                } else if (i == 5) {
                    final fgsa fgsaVar = fmkf.h().b;
                    fxxm.e(fgsaVar, "getEnvironmentsList(...)");
                    ArrayList arrayList = new ArrayList(fxsr.o(fgsaVar, 10));
                    Iterator<E> it = fgsaVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((fmks) it.next()).b);
                    }
                    List X = fxsr.X(fxsr.b(DebugMenuView.a), arrayList);
                    edzp edzpVar = new edzp(debugMenuView.a());
                    edzpVar.N("Select the environment:");
                    edzpVar.A((CharSequence[]) X.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: usu
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            DebugMenuView debugMenuView2 = DebugMenuView.this;
                            if (i2 == 0) {
                                debugMenuView2.b().a = null;
                                debugMenuView2.d();
                            } else {
                                Object obj = fgsaVar.get(i2 - 1);
                                fxxm.e(obj, "get(...)");
                                debugMenuView2.b().a = (fmks) obj;
                                debugMenuView2.d();
                            }
                        }
                    });
                    edzpVar.create().show();
                }
                ((DrawerLayout) debugMenuView.e.a()).g();
            }
        };
    }

    public final ryt a() {
        Context context = getContext();
        while (!(context instanceof ryt)) {
            if (!(context instanceof ContextWrapper)) {
                throw new IllegalStateException("Could not find activity context.");
            }
            Context context2 = getContext();
            fxxm.d(context2, "null cannot be cast to non-null type android.content.ContextWrapper");
            context = ((ContextWrapper) context2).getBaseContext();
        }
        return (ryt) context;
    }

    public final toi b() {
        toi toiVar = this.d;
        if (toiVar != null) {
            return toiVar;
        }
        fxxm.j("environmentManager");
        return null;
    }

    public final ulr c() {
        ulr ulrVar = this.c;
        if (ulrVar != null) {
            return ulrVar;
        }
        fxxm.j("accountModel");
        return null;
    }

    public final void d() {
        tkh tkhVar = this.b;
        upo upoVar = null;
        if (tkhVar == null) {
            fxxm.j("imageFetcher");
            tkhVar = null;
        }
        tkhVar.a();
        tra traVar = c().l;
        tps tpsVar = traVar.a;
        for (jvr jvrVar : tpsVar.c.values()) {
            tnl tnlVar = (tnl) jvrVar.ii();
            ekvl.z(tnlVar, "ResourceInfo should never be null here.");
            evxw evxwVar = tnlVar.a.e;
            if (evxwVar == null) {
                evxwVar = evxw.a;
            }
            jvrVar.l(new tnl(evxwVar));
        }
        Iterator it = tpsVar.a.values().iterator();
        while (it.hasNext()) {
            ((jvr) it.next()).l(new tnn(false, false, null));
        }
        final tqh tqhVar = traVar.b;
        Objects.requireNonNull(tqhVar);
        traVar.b(new Runnable() { // from class: tqy
            @Override // java.lang.Runnable
            public final void run() {
                tqh.this.c();
            }
        });
        ulr c = c();
        upo upoVar2 = this.f;
        if (upoVar2 == null) {
            fxxm.j("navStackModel");
        } else {
            upoVar = upoVar2;
        }
        c.g(upoVar.b());
    }
}
