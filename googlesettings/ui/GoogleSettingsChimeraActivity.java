package com.google.android.gms.googlesettings.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlesettings.ui.GoogleSettingsChimeraActivity;
import defpackage.asej;
import defpackage.asot;
import defpackage.bjsj;
import defpackage.bjsk;
import defpackage.bjsl;
import defpackage.bjux;
import defpackage.bjwf;
import defpackage.bjwg;
import defpackage.bjwk;
import defpackage.bjwm;
import defpackage.bjwr;
import defpackage.bjwu;
import defpackage.bwpm;
import defpackage.byow;
import defpackage.bzck;
import defpackage.bzfc;
import defpackage.dnlf;
import defpackage.dtyr;
import defpackage.ejhf;
import defpackage.fouy;
import defpackage.fovf;
import defpackage.fuuw;
import defpackage.fuuz;
import defpackage.fuvg;
import defpackage.fuy;
import defpackage.fvaf;
import defpackage.fvau;
import defpackage.fvbo;
import defpackage.fvfu;
import defpackage.fvfw;
import defpackage.fvfx;
import defpackage.fvgt;
import defpackage.gbw;
import defpackage.job;
import defpackage.joo;
import java.util.Set;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GoogleSettingsChimeraActivity extends bjwr {
    public static final asot j = asot.b("GoogleSettingsChimeraActivity", asej.GOOGLESETTINGS);
    public static final long k;
    public byow l;
    public dtyr m;
    public bzck n;
    public dnlf o;
    public final fuuw p = new fuvg(new fvaf() { // from class: bjwi
        @Override // defpackage.fvaf
        public final Object a() {
            jst jstVar = new jst((byte[]) null);
            if (fouy.d()) {
                long j2 = bjux.a;
                bjsl bjslVar = bjux.b;
                if (!(bjslVar instanceof bjsj)) {
                    if (!(bjslVar instanceof bjsk)) {
                        throw new fuuz();
                    }
                    ((ejhf) GoogleSettingsChimeraActivity.j.j()).x("session unavailable");
                    return jstVar;
                }
                bjsj bjsjVar = (bjsj) bjslVar;
                jstVar.b(bkfe.a, bjsjVar.a);
                bzau bzauVar = bjsjVar.b;
                if (bzauVar != null) {
                    jstVar.b(bkfe.b, bzauVar);
                    return jstVar;
                }
            } else {
                GoogleSettingsChimeraActivity googleSettingsChimeraActivity = GoogleSettingsChimeraActivity.this;
                String stringExtra = googleSettingsChimeraActivity.getIntent().getStringExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID");
                if (stringExtra != null && stringExtra.length() > 0) {
                    jstVar.b(bkfe.a, stringExtra);
                }
                Set set = bwpm.a;
                Intent intent = googleSettingsChimeraActivity.getIntent();
                fvbo.e(intent, "getIntent(...)");
                bzau b = bwpm.b(intent);
                if (b != null) {
                    jstVar.b(bkfe.b, b);
                }
            }
            return jstVar;
        }
    });
    public bzfc q;
    public bjwu r;
    public bjwf s;

    static {
        long j2 = fvfu.a;
        k = fvfw.g(1, fvfx.d);
    }

    @Override // defpackage.byst
    public final byow a() {
        byow byowVar = this.l;
        if (byowVar != null) {
            return byowVar;
        }
        fvbo.j("settingsEnvironmentFactory");
        return null;
    }

    public final dnlf k() {
        dnlf dnlfVar = this.o;
        if (dnlfVar != null) {
            return dnlfVar;
        }
        fvbo.j("clock");
        return null;
    }

    @Override // defpackage.byst, defpackage.dbpz
    protected final void l(fvau fvauVar) {
        super.l(new fuy(-1726624370, true, new bjwm(this, fvauVar)));
    }

    @Override // defpackage.bjwr, defpackage.dbpz, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gbw.a = true;
        job lifecycle = getLifecycle();
        dtyr dtyrVar = this.m;
        if (dtyrVar == null) {
            fvbo.j("accountsModelUpdater");
            dtyrVar = null;
        }
        lifecycle.b(dtyrVar);
        if (fovf.a.a().d()) {
            bzfc bzfcVar = this.q;
            if (bzfcVar == null) {
                fvbo.j("surveyLauncher");
                bzfcVar = null;
            }
            Activity containerActivity = getContainerActivity();
            fvbo.e(containerActivity, "getContainerActivity(...)");
            bzfcVar.a(containerActivity, null);
        }
        if (fouy.d()) {
            fvgt.b(joo.a(this), null, null, new bjwk(this, null), 3);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (fouy.d()) {
            long j2 = bjux.a;
            bjsl bjslVar = bjux.b;
            if (bjslVar instanceof bjsj) {
                ((ejhf) j.h()).x("observer already started");
                return;
            }
            if (!(bjslVar instanceof bjsk)) {
                throw new fuuz();
            }
            asot asotVar = j;
            ((ejhf) asotVar.h()).x("observer not started yet");
            if (this.s == null) {
                fvbo.j("featureStatusObserverLauncherProvider");
            }
            Intent startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation", "com.google.android.gms.googlesettings.service.attribution.FEATURE_STATUS_DIFF");
            bjwg bjwgVar = startIntent != null ? new bjwg(this, startIntent) : null;
            if (bjwgVar == null) {
                ((ejhf) asotVar.j()).x("unable to resolve observer");
                return;
            }
            if (this.r == null) {
                fvbo.j("sessionIdProvider");
            }
            String uuid = UUID.randomUUID().toString();
            fvbo.e(uuid, "toString(...)");
            Set set = bwpm.a;
            Intent intent = getIntent();
            fvbo.e(intent, "getIntent(...)");
            bjux.b = new bjsj(uuid, bwpm.b(intent));
            bjux.a = k().a();
            ((ejhf) asotVar.h()).x("starting observer");
            bjwgVar.a.startService(bjwgVar.b);
        }
    }
}
