package com.google.android.gms.wearable.consent;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.aqxo;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.dkbq;
import defpackage.dkcu;
import defpackage.dkgd;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.qfp;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearUsageAndDiagnosticsChimeraActivity extends qfp {
    public static final arxo j = new arxo("WearUsageAndDiagnostics", new String[0]);
    public dkbq k;
    public ensv l;
    public aqxo m;
    private dkcu n;
    private ensv o;

    public final dkcu a() {
        if (this.n == null) {
            j.f("getConsentRecordClient", new Object[0]);
            this.n = dkcu.i(this);
        }
        return this.n;
    }

    public final ensv b() {
        if (this.o == null) {
            this.o = new asmf(1, 9);
        }
        return this.o;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wear_usage_and_diagnostics_activity);
        ((SwitchBar) findViewById(R.id.usage_and_diagnostics_toggle)).setEnabled(false);
        ensj.t(enps.g(ensi.h(enox.g(b().submit(new Callable() { // from class: dkgb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final dkcu a = WearUsageAndDiagnosticsChimeraActivity.this.a();
                if (dmdj.m()) {
                    return (dlzl) dfbl.n(a.c.bl().f(new dfap() { // from class: dkcp
                        @Override // defpackage.dfap
                        public final dfaq a(Object obj) {
                            NodeParcelable nodeParcelable = (NodeParcelable) obj;
                            arwm.s(nodeParcelable);
                            return dkcu.this.b(nodeParcelable.a);
                        }
                    }));
                }
                throw new IllegalStateException("readOptinConsentOnWatch should be called from watch only");
            }
        }), Throwable.class, new enqc() { // from class: dkgc
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity = WearUsageAndDiagnosticsChimeraActivity.this;
                final Throwable th = (Throwable) obj;
                if (wearUsageAndDiagnosticsChimeraActivity.m == null) {
                    wearUsageAndDiagnosticsChimeraActivity.m = dhqf.a(wearUsageAndDiagnosticsChimeraActivity);
                }
                dfaq aL = wearUsageAndDiagnosticsChimeraActivity.m.aL();
                aL.y(new dfah() { // from class: dkfz
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        WearUsageAndDiagnosticsChimeraActivity.j.g("failed to get both opt in from data item and from usage reporting client possibly because of the watch set up by iOS companion", exc, th);
                    }
                });
                return enps.f(doci.b(aL), new eiho() { // from class: dkga
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        arxo arxoVar = WearUsageAndDiagnosticsChimeraActivity.j;
                        fecj v = dlzl.a.v();
                        boolean r = ((aqye) obj2).r();
                        if (!v.b.L()) {
                            v.U();
                        }
                        dlzl dlzlVar = (dlzl) v.b;
                        dlzlVar.b |= 1;
                        dlzlVar.c = r;
                        return (dlzl) v.Q();
                    }
                }, wearUsageAndDiagnosticsChimeraActivity.b());
            }
        }, b())), new enqc() { // from class: dkfx
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                final WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity = WearUsageAndDiagnosticsChimeraActivity.this;
                final dlzl dlzlVar = (dlzl) obj;
                return wearUsageAndDiagnosticsChimeraActivity.b().submit(new Callable() { // from class: dkft
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity2 = WearUsageAndDiagnosticsChimeraActivity.this;
                        List asList = Arrays.asList(uoh.p(wearUsageAndDiagnosticsChimeraActivity2));
                        if (asList.isEmpty()) {
                            throw new IllegalStateException("No accounts found on the watch");
                        }
                        return new eiie(uoh.e(wearUsageAndDiagnosticsChimeraActivity2, ((Account) asList.get(0)).name), dlzlVar);
                    }
                });
            }
        }, b()), new dkgd(this), new Executor() { // from class: dkfy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                WearUsageAndDiagnosticsChimeraActivity.this.runOnUiThread(runnable);
            }
        });
    }
}
