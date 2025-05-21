package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.abxz;
import defpackage.abym;
import defpackage.abyt;
import defpackage.abyx;
import defpackage.abyy;
import defpackage.arkc;
import defpackage.asoe;
import defpackage.dtjk;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.fkzx;
import defpackage.flad;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.mdd;
import defpackage.mdp;
import defpackage.mdw;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GenericChimeraActivity extends abxz {
    public fiwo h;
    private abym j;
    private int k;

    public final void a(int i) {
        Log.i("Auth", a.j(i, "[AuthManaged, GenericChimeraActivity] Finish with resultCode: "));
        setResult(i);
        finish();
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
        if (flad.c()) {
            arkc.g(this);
        } else {
            arkc.f(this, str);
        }
        if (flad.e()) {
            int i = edjs.a;
            if (edeq.w(this)) {
                setTheme(edjs.a(this));
            }
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (this.k != 2) {
            super.onBackPressed();
            return;
        }
        abym abymVar = (abym) Objects.requireNonNull(this.j);
        abyx a = abymVar.a();
        if (abyx.SEPARATE_APP_SCREEN.equals(a) || abyx.LOADING_SCREEN.equals(a)) {
            return;
        }
        abymVar.a.a(abymVar.a(), 2);
    }

    @Override // defpackage.abxz, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        String g;
        super.onCreate(bundle);
        if (fkzn.e()) {
            ((dtjk) this.h.a()).a();
        }
        String action = getIntent().getAction();
        if (action == null) {
            Log.w("Auth", "[AuthManaged, GenericChimeraActivity] intent action can't be null for  GenericChimeraActivity: null");
            a(-1);
            return;
        }
        if (action.hashCode() != -1502347985 || !action.equals("com.google.android.gms.auth.managed.UNMANAGED_WORK_PROFILE_OPT_IN")) {
            this.k = 1;
            Log.w("Auth", "[AuthManaged, GenericChimeraActivity] Undefined use case for GenericChimeraActivity: ".concat(action));
            a(-1);
            return;
        }
        Log.i("Auth", "[AuthManaged, GenericChimeraActivity] Triggering unmanaged work profile opt-in use case");
        this.k = 2;
        final abym abymVar = new abym(this);
        this.j = abymVar;
        GenericChimeraActivity genericChimeraActivity = abymVar.b;
        abymVar.a = (abyy) new jrh(genericChimeraActivity).a(abyy.class);
        final abyy abyyVar = abymVar.a;
        Context applicationContext = genericChimeraActivity.getApplicationContext();
        Resources resources = genericChimeraActivity.getResources();
        for (final abyx abyxVar : abyy.a) {
            abyt abytVar = abyyVar.d;
            int i = resources.getConfiguration().uiMode & 48;
            boolean n = asoe.n(resources);
            int ordinal = abyxVar.ordinal();
            if (ordinal == 1) {
                g = n ? i == 32 ? fkzx.a.a().g() : fkzx.a.a().h() : i == 32 ? fkzx.a.a().c() : fkzx.a.a().d();
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Cannot load screen animation for: ".concat(String.valueOf(String.valueOf(abyxVar))));
                }
                g = n ? i == 32 ? fkzx.a.a().e() : fkzx.a.a().f() : i == 32 ? fkzx.a.a().a() : fkzx.a.a().b();
            }
            mdw k = mdd.k(applicationContext, g);
            k.e(new mdp() { // from class: abyu
                @Override // defpackage.mdp
                public final void a(Object obj) {
                    jpc jpcVar = new jpc((mcv) obj);
                    abyy abyyVar2 = abyy.this;
                    ConcurrentHashMap concurrentHashMap = abyyVar2.b;
                    if (((jox) concurrentHashMap.putIfAbsent(abyxVar, jpcVar)) == null && concurrentHashMap.size() == abyy.a.size()) {
                        abyyVar2.a(abyx.LOADING_SCREEN, 1);
                    }
                }
            });
            k.d(new mdp() { // from class: abyv
                @Override // defpackage.mdp
                public final void a(Object obj) {
                    Log.e("Auth", "Error while downloading animation for screen id: ".concat(String.valueOf(String.valueOf(abyxVar))), (Throwable) obj);
                    abyy.this.a(abyx.LOADING_SCREEN, 3);
                }
            });
        }
        abymVar.a.c.g(genericChimeraActivity, new jpd() { // from class: abyl
            @Override // defpackage.jpd
            public final void a(Object obj) {
                abyx abyxVar2 = (abyx) obj;
                String.valueOf(abyxVar2);
                int ordinal2 = abyxVar2.ordinal();
                abym abymVar2 = abym.this;
                if (ordinal2 == 0) {
                    abymVar2.b("UnmanagedWorkProfileLoadingScreen");
                    return;
                }
                if (ordinal2 == 1) {
                    abymVar2.b("UnmanagedWorkProfileSeparateAppsScreen");
                    return;
                }
                if (ordinal2 == 2) {
                    abymVar2.b("UnmanagedWorkProfileBriefcaseBadgeScreen");
                } else if (ordinal2 == 3) {
                    abymVar2.b.a(-1);
                } else {
                    if (ordinal2 != 4) {
                        return;
                    }
                    abymVar2.b.a(0);
                }
            }
        });
    }
}
