package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.adxz;
import defpackage.adym;
import defpackage.adyt;
import defpackage.adyx;
import defpackage.adyy;
import defpackage.atmr;
import defpackage.aury;
import defpackage.dvtw;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fnrf;
import defpackage.fnrl;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.nvl;
import defpackage.nvx;
import defpackage.nwe;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GenericChimeraActivity extends adxz {
    public flml h;
    private adym j;
    private int k;

    public final void a(int i) {
        Log.i("Auth", a.j(i, "[AuthManaged, GenericChimeraActivity] Finish with resultCode: "));
        setResult(i);
        finish();
    }

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
        atmr.g(this);
        if (fnrl.d()) {
            int i = efwn.a;
            if (efrl.w(this)) {
                setTheme(efwn.a(this));
            }
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.k != 2) {
            super.onBackPressed();
            return;
        }
        adym adymVar = (adym) Objects.requireNonNull(this.j);
        adyx a = adymVar.a();
        if (adyx.SEPARATE_APP_SCREEN.equals(a) || adyx.LOADING_SCREEN.equals(a)) {
            return;
        }
        adymVar.a.a(adymVar.a(), 2);
    }

    @Override // defpackage.adxz, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        String g;
        super.onCreate(bundle);
        if (fnqv.e()) {
            ((dvtw) this.h.a()).a();
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
        final adym adymVar = new adym(this);
        this.j = adymVar;
        GenericChimeraActivity genericChimeraActivity = adymVar.b;
        adymVar.a = (adyy) new jxw(genericChimeraActivity).a(adyy.class);
        final adyy adyyVar = adymVar.a;
        Context applicationContext = genericChimeraActivity.getApplicationContext();
        Resources resources = genericChimeraActivity.getResources();
        for (final adyx adyxVar : adyy.a) {
            adyt adytVar = adyyVar.d;
            int i = resources.getConfiguration().uiMode & 48;
            boolean n = aury.n(resources);
            int ordinal = adyxVar.ordinal();
            if (ordinal == 1) {
                g = n ? i == 32 ? fnrf.a.lK().g() : fnrf.a.lK().h() : i == 32 ? fnrf.a.lK().c() : fnrf.a.lK().d();
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Cannot load screen animation for: ".concat(String.valueOf(String.valueOf(adyxVar))));
                }
                g = n ? i == 32 ? fnrf.a.lK().e() : fnrf.a.lK().f() : i == 32 ? fnrf.a.lK().a() : fnrf.a.lK().b();
            }
            nwe k = nvl.k(applicationContext, g);
            k.e(new nvx() { // from class: adyu
                @Override // defpackage.nvx
                public final void a(Object obj) {
                    jvr jvrVar = new jvr((nvd) obj);
                    adyy adyyVar2 = adyy.this;
                    ConcurrentHashMap concurrentHashMap = adyyVar2.b;
                    if (((jvm) concurrentHashMap.putIfAbsent(adyxVar, jvrVar)) == null && concurrentHashMap.size() == adyy.a.size()) {
                        adyyVar2.a(adyx.LOADING_SCREEN, 1);
                    }
                }
            });
            k.d(new nvx() { // from class: adyv
                @Override // defpackage.nvx
                public final void a(Object obj) {
                    Log.e("Auth", "Error while downloading animation for screen id: ".concat(String.valueOf(String.valueOf(adyxVar))), (Throwable) obj);
                    adyy.this.a(adyx.LOADING_SCREEN, 3);
                }
            });
        }
        adymVar.a.c.g(genericChimeraActivity, new jvs() { // from class: adyl
            @Override // defpackage.jvs
            public final void a(Object obj) {
                adyx adyxVar2 = (adyx) obj;
                String.valueOf(adyxVar2);
                int ordinal2 = adyxVar2.ordinal();
                adym adymVar2 = adym.this;
                if (ordinal2 == 0) {
                    adymVar2.b("UnmanagedWorkProfileLoadingScreen");
                    return;
                }
                if (ordinal2 == 1) {
                    adymVar2.b("UnmanagedWorkProfileSeparateAppsScreen");
                    return;
                }
                if (ordinal2 == 2) {
                    adymVar2.b("UnmanagedWorkProfileBriefcaseBadgeScreen");
                } else if (ordinal2 == 3) {
                    adymVar2.b.a(-1);
                } else {
                    if (ordinal2 != 4) {
                        return;
                    }
                    adymVar2.b.a(0);
                }
            }
        });
    }
}
