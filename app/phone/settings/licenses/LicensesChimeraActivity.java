package com.google.android.gms.app.phone.settings.licenses;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.google.android.chimerax.navigation.fragment.NavHostFragment;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.cq;
import defpackage.dg;
import defpackage.eike;
import defpackage.fvbo;
import defpackage.ig;
import defpackage.ips;
import defpackage.iy;
import defpackage.kcg;
import defpackage.kdp;
import defpackage.kdr;
import defpackage.keq;
import defpackage.kes;
import defpackage.kev;
import defpackage.kew;
import defpackage.kfc;
import defpackage.kfr;
import defpackage.kjv;
import defpackage.kkr;
import defpackage.qet;
import defpackage.qge;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class LicensesChimeraActivity extends qet {
    private final kdr a() {
        Dialog dialog;
        Window window;
        dg g = getSupportFragmentManager().g(R.id.license_nav_host);
        eike.e(g);
        for (dg dgVar = g; dgVar != null; dgVar = dgVar.getParentFragment()) {
            if (dgVar instanceof NavHostFragment) {
                return ((NavHostFragment) dgVar).y();
            }
            dg dgVar2 = dgVar.getParentFragmentManager().r;
            if (dgVar2 instanceof NavHostFragment) {
                return ((NavHostFragment) dgVar2).y();
            }
        }
        View view = g.getView();
        if (view != null) {
            return kfr.a(view);
        }
        View view2 = null;
        cq cqVar = g instanceof cq ? (cq) g : null;
        if (cqVar != null && (dialog = cqVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return kfr.a(view2);
        }
        throw new IllegalStateException(a.f(g, "Fragment ", " does not have a NavController set"));
    }

    @Override // defpackage.qet
    public final boolean hu() {
        return a().q() || super.hu();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.licenses_activity);
        int i = ips.a;
        final ig hy = hy();
        eike.e(hy);
        hy.r(true);
        hy.o(true);
        iy hC = hC();
        kdr a = a();
        fvbo.f(hC, "activity");
        fvbo.f(a, "navController");
        kew f = a.f();
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(kev.b(f).c()));
        kkr kkrVar = new kkr(hashSet);
        fvbo.f(hC, "activity");
        fvbo.f(a, "navController");
        a.i(new qge(hC, kkrVar));
        a().i(new kdp() { // from class: tqc
            @Override // defpackage.kdp
            public final void a(kes kesVar, Bundle bundle2) {
                ig.this.y("");
            }
        });
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        kdr a = a();
        fvbo.f(menuItem, "item");
        fvbo.f(a, "navController");
        kfc kfcVar = new kfc();
        kfcVar.a = true;
        kfcVar.b = true;
        kes e = a.e();
        fvbo.c(e);
        kew kewVar = e.e;
        fvbo.c(kewVar);
        if (kewVar.r(menuItem.getItemId()) instanceof kcg) {
            kfcVar.g = R.anim.nav_default_enter_anim;
            kfcVar.h = R.anim.nav_default_exit_anim;
            kfcVar.i = R.anim.nav_default_pop_enter_anim;
            kfcVar.j = R.anim.nav_default_pop_exit_anim;
        } else {
            kfcVar.g = R.animator.nav_default_enter_anim;
            kfcVar.h = R.animator.nav_default_exit_anim;
            kfcVar.i = R.animator.nav_default_pop_enter_anim;
            kfcVar.j = R.animator.nav_default_pop_exit_anim;
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            kfcVar.b(kev.b(a.f()).c(), false, true);
        }
        try {
            a.m(menuItem.getItemId(), null, kfcVar.a());
            kes e2 = a.e();
            if (e2 != null) {
                int itemId = menuItem.getItemId();
                Iterator a2 = keq.c(e2).a();
                while (a2.hasNext()) {
                    if (((kes) a2.next()).c() == itemId) {
                        break;
                    }
                }
            }
        } catch (IllegalArgumentException e3) {
            Log.i("NavigationUI", "Ignoring onNavDestinationSelected for MenuItem " + keq.b(new kjv(a.a), menuItem.getItemId()) + " as it cannot be found from the current destination " + a.e(), e3);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
