package com.google.android.gms.threadnetwork.settings;

import android.os.Bundle;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.R;
import com.google.android.gms.threadnetwork.settings.SettingsChimeraActivity;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bp;
import defpackage.dicu;
import defpackage.didh;
import defpackage.diel;
import defpackage.dieo;
import defpackage.edxt;
import defpackage.er;
import defpackage.flmn;
import defpackage.flmp;
import defpackage.flmr;
import defpackage.fvhs;
import defpackage.fxxm;
import defpackage.fxyr;
import defpackage.ryt;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SettingsChimeraActivity extends ryt implements flmr {
    public static final dicu j = new dicu();
    private final flmp k;
    private final diel l;
    private final dieo m;

    static {
        ausn.b("SettingsChimeraActivity", auid.THREADNETWORK);
    }

    public SettingsChimeraActivity(flmp flmpVar, diel dielVar, dieo dieoVar) {
        fxxm.f(flmpVar, "androidInjector");
        fxxm.f(dielVar, "settingsAnalyticsLogger");
        fxxm.f(dieoVar, "pageLoggingCallbacks");
        this.k = flmpVar;
        this.l = dielVar;
        this.m = dieoVar;
    }

    @UsedByReflection
    public static final SettingsChimeraActivity provideInstance() {
        return j.provideInstance();
    }

    @Override // defpackage.flmr
    public final /* synthetic */ flmn a() {
        return this.k;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getContainerActivity();
        int i = edxt.a;
        setContentView(R.layout.activity_settings);
        if (fvhs.c()) {
            this.l.e((bundle == null || !bundle.containsKey("session_id")) ? fxyr.a.b() : bundle.getLong("session_id"));
        }
        getSupportFragmentManager().W(this.m, true);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.child_fragment_container, new didh());
            bpVar.w(null);
            bpVar.a();
        }
        getSupportFragmentManager().q(new er() { // from class: dict
            @Override // defpackage.er
            public final void c() {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                List o = settingsChimeraActivity.getSupportFragmentManager().o();
                fxxm.e(o, "getFragments(...)");
                fxxm.f(o, "<this>");
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

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        fxxm.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (fvhs.c()) {
            bundle.putLong("session_id", this.l.a());
        }
    }
}
