package com.google.android.gms.location.provider.network;

import android.content.DialogInterface;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.location.provider.network.NetworkConsentChimeraActivity;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.bzby;
import defpackage.ccvv;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.euyj;
import defpackage.evlx;
import defpackage.evmg;
import defpackage.evmj;
import defpackage.evmk;
import defpackage.evoe;
import defpackage.evoi;
import defpackage.fgrc;
import defpackage.fsmk;
import defpackage.iq;
import defpackage.ryt;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NetworkConsentChimeraActivity extends ryt implements DialogInterface.OnClickListener {
    public static final ausn j = ausn.b("NlpConsent", auid.LOCATION);
    private iq k;
    private int l;
    private int m;
    private eqgl n = null;

    private final void a(boolean z) {
        final int intExtra;
        if (this.n != null) {
            return;
        }
        ausn ausnVar = j;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5652)).B("consent dialog choice was %b", Boolean.valueOf(z));
        if (!isFinishing()) {
            finish();
        }
        if (!z) {
            if (Build.VERSION.SDK_INT < 28) {
                this.n = eqgf.a;
                return;
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 5653)).x("setting location off");
            eqgl e = ccvv.c().e(System.currentTimeMillis() + fsmk.b());
            ekut ekutVar = new ekut() { // from class: ccsr
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ((eluo) ((eluo) ((eluo) NetworkConsentChimeraActivity.j.i()).s((Throwable) obj)).ai((char) 5651)).x("Error suppressing next LOWD invocation from NLP consent dialog");
                    return null;
                }
            };
            eqex eqexVar = eqex.a;
            this.n = eqdl.g(eqcq.f(e, Throwable.class, ekutVar, eqexVar), new eqdv() { // from class: ccss
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return bzbx.c(NetworkConsentChimeraActivity.this, false, bzby.a);
                }
            }, eqexVar);
            return;
        }
        bzby bzbyVar = bzby.a;
        evmg evmgVar = evmg.SOURCE_QUICK_SETTINGS;
        fgrc v = evoi.a.v();
        euyj euyjVar = euyj.Y;
        if (!v.b.L()) {
            v.U();
        }
        evoi evoiVar = (evoi) v.b;
        evoiVar.c = euyjVar.a();
        evoiVar.b |= 1;
        fgrc v2 = evoe.a.v();
        fgrc v3 = evlx.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        evlx evlxVar = (evlx) v3.b;
        evlxVar.b |= 1;
        evlxVar.c = true;
        evmk evmkVar = evmk.a;
        evmj evmjVar = (evmj) evmkVar.v();
        evmjVar.k(this.l);
        if (!v3.b.L()) {
            v3.U();
        }
        evlx evlxVar2 = (evlx) v3.b;
        evmk evmkVar2 = (evmk) evmjVar.Q();
        evmkVar2.getClass();
        evlxVar2.d = evmkVar2;
        evlxVar2.b |= 2;
        evmj evmjVar2 = (evmj) evmkVar.v();
        evmjVar2.k(R.string.common_agree);
        if (!v3.b.L()) {
            v3.U();
        }
        evlx evlxVar3 = (evlx) v3.b;
        evmk evmkVar3 = (evmk) evmjVar2.Q();
        evmkVar3.getClass();
        evlxVar3.f = evmkVar3;
        evlxVar3.b |= 8;
        evmj evmjVar3 = (evmj) evmkVar.v();
        evmjVar3.k(R.string.common_disagree);
        if (!v3.b.L()) {
            v3.U();
        }
        evlx evlxVar4 = (evlx) v3.b;
        evmk evmkVar4 = (evmk) evmjVar3.Q();
        evmkVar4.getClass();
        evlxVar4.g = evmkVar4;
        evlxVar4.b |= 16;
        evmj evmjVar4 = (evmj) evmkVar.v();
        evmjVar4.k(this.m);
        if (!v3.b.L()) {
            v3.U();
        }
        evlx evlxVar5 = (evlx) v3.b;
        evmk evmkVar5 = (evmk) evmjVar4.Q();
        evmkVar5.getClass();
        evlxVar5.e = evmkVar5;
        evlxVar5.b |= 4;
        if (!v2.b.L()) {
            v2.U();
        }
        evoe evoeVar = (evoe) v2.b;
        evlx evlxVar6 = (evlx) v3.Q();
        evlxVar6.getClass();
        evoeVar.e = evlxVar6;
        evoeVar.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        evoi evoiVar2 = (evoi) v.b;
        evoe evoeVar2 = (evoe) v2.Q();
        evoeVar2.getClass();
        evoiVar2.d = evoeVar2;
        evoiVar2.b |= 8;
        this.n = bzbx.e(this, true, bzbyVar, evmgVar, (evoi) v.Q());
        if (Build.VERSION.SDK_INT > 28 || (intExtra = getIntent().getIntExtra("newMode", 0)) == 0) {
            return;
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5654)).z("setting location mode to %d", intExtra);
        this.n = eqdl.g((eqgl) Objects.requireNonNull(this.n), new eqdv() { // from class: ccsq
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return bzbx.d(NetworkConsentChimeraActivity.this, intExtra, bzby.a);
            }
        }, eqex.a);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.provider.network.NetworkConsentChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        eqgl eqglVar;
        if (!isChangingConfigurations() && (eqglVar = this.n) != null) {
            try {
                eqglVar.get();
            } catch (InterruptedException | ExecutionException e) {
                boolean z = e instanceof ExecutionException;
                Throwable th = e;
                if (z) {
                    th = e.getCause();
                }
                ((eluo) ((eluo) ((eluo) j.i()).s(th)).ai((char) 5659)).x("failed to set NLP consent from NLP consent dialog");
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        if (!isChangingConfigurations()) {
            a(false);
        }
        super.onPause();
    }
}
