package com.google.android.gms.threadnetwork.settings;

import android.os.Bundle;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.R;
import com.google.android.gms.threadnetwork.settings.SettingsChimeraActivity;
import defpackage.asej;
import defpackage.asot;
import defpackage.bp;
import defpackage.dfrp;
import defpackage.dfsc;
import defpackage.dftg;
import defpackage.dftj;
import defpackage.eble;
import defpackage.er;
import defpackage.fiwq;
import defpackage.fiws;
import defpackage.fiwu;
import defpackage.fsmk;
import defpackage.fvbo;
import defpackage.fvct;
import defpackage.qfp;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SettingsChimeraActivity extends qfp implements fiwu {
    public static final dfrp j = new dfrp();
    private final fiws k;
    private final dftg l;
    private final dftj m;

    static {
        asot.b("SettingsChimeraActivity", asej.THREADNETWORK);
    }

    public SettingsChimeraActivity(fiws fiwsVar, dftg dftgVar, dftj dftjVar) {
        fvbo.f(fiwsVar, "androidInjector");
        fvbo.f(dftgVar, "settingsAnalyticsLogger");
        fvbo.f(dftjVar, "pageLoggingCallbacks");
        this.k = fiwsVar;
        this.l = dftgVar;
        this.m = dftjVar;
    }

    @UsedByReflection
    public static final SettingsChimeraActivity provideInstance() {
        return j.provideInstance();
    }

    @Override // defpackage.fiwu
    public final /* synthetic */ fiwq a() {
        return this.k;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getContainerActivity();
        int i = eble.a;
        setContentView(R.layout.activity_settings);
        if (fsmk.c()) {
            this.l.e((bundle == null || !bundle.containsKey("session_id")) ? fvct.a.b() : bundle.getLong("session_id"));
        }
        getSupportFragmentManager().W(this.m, true);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.child_fragment_container, new dfsc());
            bpVar.w(null);
            bpVar.a();
        }
        getSupportFragmentManager().q(new er() { // from class: dfro
            @Override // defpackage.er
            public final void c() {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                List o = settingsChimeraActivity.getSupportFragmentManager().o();
                fvbo.e(o, "getFragments(...)");
                fvbo.f(o, "<this>");
                if (o instanceof Collection) {
                    if (!o.isEmpty()) {
                        return;
                    }
                } else if (o.iterator().hasNext()) {
                    return;
                }
                settingsChimeraActivity.finish();
            }

            @Override // defpackage.er
            public final /* synthetic */ void a(dg dgVar, boolean z) {
            }

            @Override // defpackage.er
            public final /* synthetic */ void b(dg dgVar, boolean z) {
            }
        });
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        fvbo.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (fsmk.c()) {
            bundle.putLong("session_id", this.l.a());
        }
    }
}
