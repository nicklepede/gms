package com.google.android.gms.wearable.consent;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.atad;
import defpackage.auad;
import defpackage.aupz;
import defpackage.dmnj;
import defpackage.dmon;
import defpackage.dmrw;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.ryt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearUsageAndDiagnosticsChimeraActivity extends ryt {
    public static final auad j = new auad("WearUsageAndDiagnostics", new String[0]);
    public dmnj k;
    public eqgo l;
    public atad m;
    private dmon n;
    private eqgo o;

    public final dmon a() {
        if (this.n == null) {
            j.f("getConsentRecordClient", new Object[0]);
            this.n = dmon.i(this);
        }
        return this.n;
    }

    public final eqgo b() {
        if (this.o == null) {
            this.o = new aupz(1, 9);
        }
        return this.o;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wear_usage_and_diagnostics_activity);
        ((SwitchBar) findViewById(R.id.usage_and_diagnostics_toggle)).setEnabled(false);
        eqgc.t(eqdl.g(eqgb.h(eqcq.g(b().submit(new Callable() { // from class: dmru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final dmon a = WearUsageAndDiagnosticsChimeraActivity.this.a();
                if (doov.m()) {
                    return (dokx) dhmr.n(a.c.bk().f(new dhlv() { // from class: dmoi
                        @Override // defpackage.dhlv
                        public final dhlw a(Object obj) {
                            NodeParcelable nodeParcelable = (NodeParcelable) obj;
                            atzb.s(nodeParcelable);
                            return dmon.this.b(nodeParcelable.a);
                        }
                    }));
                }
                throw new IllegalStateException("readOptinConsentOnWatch should be called from watch only");
            }
        }), Throwable.class, new eqdv() { // from class: dmrv
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity = WearUsageAndDiagnosticsChimeraActivity.this;
                final Throwable th = (Throwable) obj;
                if (wearUsageAndDiagnosticsChimeraActivity.m == null) {
                    wearUsageAndDiagnosticsChimeraActivity.m = dkbl.a(wearUsageAndDiagnosticsChimeraActivity);
                }
                dhlw aK = wearUsageAndDiagnosticsChimeraActivity.m.aK();
                aK.y(new dhln() { // from class: dmrs
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        WearUsageAndDiagnosticsChimeraActivity.j.g("failed to get both opt in from data item and from usage reporting client possibly because of the watch set up by iOS companion", exc, th);
                    }
                });
                return eqdl.f(dqmr.b(aK), new ekut() { // from class: dmrt
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        auad auadVar = WearUsageAndDiagnosticsChimeraActivity.j;
                        fgrc v = dokx.a.v();
                        boolean q = ((atat) obj2).q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        dokx dokxVar = (dokx) v.b;
                        dokxVar.b |= 1;
                        dokxVar.c = q;
                        return (dokx) v.Q();
                    }
                }, wearUsageAndDiagnosticsChimeraActivity.b());
            }
        }, b())), new eqdv() { // from class: dmrq
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity = WearUsageAndDiagnosticsChimeraActivity.this;
                final dokx dokxVar = (dokx) obj;
                return wearUsageAndDiagnosticsChimeraActivity.b().submit(new Callable() { // from class: dmrm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity2 = WearUsageAndDiagnosticsChimeraActivity.this;
                        List asList = Arrays.asList(wkg.n(wearUsageAndDiagnosticsChimeraActivity2));
                        if (asList.isEmpty()) {
                            throw new IllegalStateException("No accounts found on the watch");
                        }
                        return new ekvj(wkg.e(wearUsageAndDiagnosticsChimeraActivity2, ((Account) asList.get(0)).name), dokxVar);
                    }
                });
            }
        }, b()), new dmrw(this), new Executor() { // from class: dmrr
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                WearUsageAndDiagnosticsChimeraActivity.this.runOnUiThread(runnable);
            }
        });
    }
}
