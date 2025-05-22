package com.google.android.gms.googlesettings.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlesettings.ui.GoogleSettingsChimeraActivity;
import defpackage.auid;
import defpackage.ausn;
import defpackage.blyz;
import defpackage.blza;
import defpackage.blzb;
import defpackage.bmbn;
import defpackage.bmcv;
import defpackage.bmcw;
import defpackage.bmda;
import defpackage.bmdc;
import defpackage.bmdh;
import defpackage.bmdk;
import defpackage.byxz;
import defpackage.caxo;
import defpackage.cblb;
import defpackage.cbnt;
import defpackage.dpvo;
import defpackage.dwjd;
import defpackage.eluo;
import defpackage.froa;
import defpackage.froh;
import defpackage.fvp;
import defpackage.fxqu;
import defpackage.fxqx;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxws;
import defpackage.fxxm;
import defpackage.fybs;
import defpackage.fybu;
import defpackage.fybv;
import defpackage.fycr;
import defpackage.gcn;
import defpackage.juq;
import defpackage.jvd;
import java.util.Set;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GoogleSettingsChimeraActivity extends bmdh {
    public static final ausn j = ausn.b("GoogleSettingsChimeraActivity", auid.GOOGLESETTINGS);
    public static final long k;
    public caxo l;
    public dwjd m;
    public cblb n;
    public dpvo o;
    public final fxqu p = new fxre(new fxwd() { // from class: bmcy
        @Override // defpackage.fxwd
        public final Object a() {
            jzi jziVar = new jzi((byte[]) null);
            if (froa.d()) {
                long j2 = bmbn.a;
                blzb blzbVar = bmbn.b;
                if (!(blzbVar instanceof blyz)) {
                    if (!(blzbVar instanceof blza)) {
                        throw new fxqx();
                    }
                    ((eluo) GoogleSettingsChimeraActivity.j.j()).x("session unavailable");
                    return jziVar;
                }
                blyz blyzVar = (blyz) blzbVar;
                jziVar.b(bmlu.a, blyzVar.a);
                cbjl cbjlVar = blyzVar.b;
                if (cbjlVar != null) {
                    jziVar.b(bmlu.b, cbjlVar);
                    return jziVar;
                }
            } else {
                GoogleSettingsChimeraActivity googleSettingsChimeraActivity = GoogleSettingsChimeraActivity.this;
                String stringExtra = googleSettingsChimeraActivity.getIntent().getStringExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID");
                if (stringExtra != null && stringExtra.length() > 0) {
                    jziVar.b(bmlu.a, stringExtra);
                }
                Set set = byxz.a;
                Intent intent = googleSettingsChimeraActivity.getIntent();
                fxxm.e(intent, "getIntent(...)");
                cbjl b = byxz.b(intent);
                if (b != null) {
                    jziVar.b(bmlu.b, b);
                }
            }
            return jziVar;
        }
    });
    public cbnt q;
    public bmdk r;
    public bmcv s;

    static {
        long j2 = fybs.a;
        k = fybu.g(1, fybv.d);
    }

    @Override // defpackage.cbbl
    public final caxo a() {
        caxo caxoVar = this.l;
        if (caxoVar != null) {
            return caxoVar;
        }
        fxxm.j("settingsEnvironmentFactory");
        return null;
    }

    public final dpvo k() {
        dpvo dpvoVar = this.o;
        if (dpvoVar != null) {
            return dpvoVar;
        }
        fxxm.j("clock");
        return null;
    }

    @Override // defpackage.cbbl, defpackage.deaf
    protected final void l(fxws fxwsVar) {
        super.l(new fvp(-1726624370, true, new bmdc(this, fxwsVar)));
    }

    @Override // defpackage.bmdh, defpackage.deaf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gcn.a = true;
        juq lifecycle = getLifecycle();
        dwjd dwjdVar = this.m;
        if (dwjdVar == null) {
            fxxm.j("accountsModelUpdater");
            dwjdVar = null;
        }
        lifecycle.b(dwjdVar);
        if (froh.a.lK().d()) {
            cbnt cbntVar = this.q;
            if (cbntVar == null) {
                fxxm.j("surveyLauncher");
                cbntVar = null;
            }
            Activity containerActivity = getContainerActivity();
            fxxm.e(containerActivity, "getContainerActivity(...)");
            cbntVar.a(containerActivity, null);
        }
        if (froa.d()) {
            fycr.b(jvd.a(this), null, null, new bmda(this, null), 3);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (froa.d()) {
            long j2 = bmbn.a;
            blzb blzbVar = bmbn.b;
            if (blzbVar instanceof blyz) {
                ((eluo) j.h()).x("observer already started");
                return;
            }
            if (!(blzbVar instanceof blza)) {
                throw new fxqx();
            }
            ausn ausnVar = j;
            ((eluo) ausnVar.h()).x("observer not started yet");
            if (this.s == null) {
                fxxm.j("featureStatusObserverLauncherProvider");
            }
            Intent startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation", "com.google.android.gms.googlesettings.service.attribution.FEATURE_STATUS_DIFF");
            bmcw bmcwVar = startIntent != null ? new bmcw(this, startIntent) : null;
            if (bmcwVar == null) {
                ((eluo) ausnVar.j()).x("unable to resolve observer");
                return;
            }
            if (this.r == null) {
                fxxm.j("sessionIdProvider");
            }
            String uuid = UUID.randomUUID().toString();
            fxxm.e(uuid, "toString(...)");
            Set set = byxz.a;
            Intent intent = getIntent();
            fxxm.e(intent, "getIntent(...)");
            bmbn.b = new blyz(uuid, byxz.b(intent));
            bmbn.a = k().a();
            ((eluo) ausnVar.h()).x("starting observer");
            bmcwVar.a.startService(bmcwVar.b);
        }
    }
}
