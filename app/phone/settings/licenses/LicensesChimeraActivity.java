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
import defpackage.ekxj;
import defpackage.fxxm;
import defpackage.ig;
import defpackage.iri;
import defpackage.iy;
import defpackage.luq;
import defpackage.lvz;
import defpackage.lwb;
import defpackage.lxa;
import defpackage.lxc;
import defpackage.lxf;
import defpackage.lxg;
import defpackage.lxm;
import defpackage.lyb;
import defpackage.mcg;
import defpackage.mdc;
import defpackage.rxx;
import defpackage.rzi;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class LicensesChimeraActivity extends rxx {
    private final lwb a() {
        Dialog dialog;
        Window window;
        dg g = getSupportFragmentManager().g(R.id.license_nav_host);
        ekxj.e(g);
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
            return lyb.a(view);
        }
        View view2 = null;
        cq cqVar = g instanceof cq ? (cq) g : null;
        if (cqVar != null && (dialog = cqVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return lyb.a(view2);
        }
        throw new IllegalStateException(a.f(g, "Fragment ", " does not have a NavController set"));
    }

    @Override // defpackage.rxx
    public final boolean hK() {
        return a().q() || super.hK();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.licenses_activity);
        int i = iri.a;
        final ig hO = hO();
        ekxj.e(hO);
        hO.r(true);
        hO.o(true);
        iy hS = hS();
        lwb a = a();
        fxxm.f(hS, "activity");
        fxxm.f(a, "navController");
        lxg f = a.f();
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(lxf.b(f).c()));
        mdc mdcVar = new mdc(hashSet);
        fxxm.f(hS, "activity");
        fxxm.f(a, "navController");
        a.i(new rzi(hS, mdcVar));
        a().i(new lvz() { // from class: vmc
            @Override // defpackage.lvz
            public final void a(lxc lxcVar, Bundle bundle2) {
                ig.this.y("");
            }
        });
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        lwb a = a();
        fxxm.f(menuItem, "item");
        fxxm.f(a, "navController");
        lxm lxmVar = new lxm();
        lxmVar.a = true;
        lxmVar.b = true;
        lxc e = a.e();
        fxxm.c(e);
        lxg lxgVar = e.e;
        fxxm.c(lxgVar);
        if (lxgVar.r(menuItem.getItemId()) instanceof luq) {
            lxmVar.g = R.anim.nav_default_enter_anim;
            lxmVar.h = R.anim.nav_default_exit_anim;
            lxmVar.i = R.anim.nav_default_pop_enter_anim;
            lxmVar.j = R.anim.nav_default_pop_exit_anim;
        } else {
            lxmVar.g = R.animator.nav_default_enter_anim;
            lxmVar.h = R.animator.nav_default_exit_anim;
            lxmVar.i = R.animator.nav_default_pop_enter_anim;
            lxmVar.j = R.animator.nav_default_pop_exit_anim;
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            lxmVar.b(lxf.b(a.f()).c(), false, true);
        }
        try {
            a.m(menuItem.getItemId(), null, lxmVar.a());
            lxc e2 = a.e();
            if (e2 != null) {
                int itemId = menuItem.getItemId();
                Iterator a2 = lxa.c(e2).a();
                while (a2.hasNext()) {
                    if (((lxc) a2.next()).c() == itemId) {
                        break;
                    }
                }
            }
        } catch (IllegalArgumentException e3) {
            Log.i("NavigationUI", "Ignoring onNavDestinationSelected for MenuItem " + lxa.b(new mcg(a.a), menuItem.getItemId()) + " as it cannot be found from the current destination " + a.e(), e3);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
