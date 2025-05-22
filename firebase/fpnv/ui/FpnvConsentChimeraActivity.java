package com.google.android.gms.firebase.fpnv.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.google.android.gms.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.ausn;
import defpackage.bhks;
import defpackage.bhlc;
import defpackage.bhlh;
import defpackage.bhlk;
import defpackage.bhmj;
import defpackage.bhmm;
import defpackage.bhne;
import defpackage.bhnk;
import defpackage.bhno;
import defpackage.eluo;
import defpackage.fgpr;
import defpackage.fqui;
import defpackage.fxsr;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.jvd;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FpnvConsentChimeraActivity extends bhno {
    public static final ausn j;
    public bhlk k;
    public bhlc l;
    public bhlh m;
    public bhne n;
    public bhmj o;
    public String p;
    public String q;
    public String r;
    public List s;
    public CircularProgressIndicator t;
    public fgpr u;
    public bhmm v;

    static {
        int i = bhks.a;
        j = bhks.a("FpnvConsentChimeraActivity");
    }

    public final bhne a() {
        bhne bhneVar = this.n;
        if (bhneVar != null) {
            return bhneVar;
        }
        fxxm.j("consentFragment");
        return null;
    }

    @Override // defpackage.bhno, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        String str;
        bhlk bhlkVar;
        bhlc bhlcVar;
        bhlh bhlhVar;
        Activity containerActivity;
        if (Build.VERSION.SDK_INT >= 30 && (containerActivity = getContainerActivity()) != null) {
            containerActivity.setTranslucent(true);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        super.onCreate(bundle);
        setContentView(R.layout.fpnv_consent_activity_layout);
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) findViewById(R.id.progress_indicator);
        this.t = circularProgressIndicator;
        if (circularProgressIndicator == null) {
            fxxm.j("progressIndicator");
            circularProgressIndicator = null;
        }
        circularProgressIndicator.setVisibility(0);
        if (!fqui.a.lK().a()) {
            ((eluo) j.h()).x("FpnvConsentActivity is disabled");
            setResult(0, new Intent().putExtra("fpnv_exception", "FpnvConsentActivity is disabled"));
            finish();
            return;
        }
        ausn ausnVar = j;
        ((eluo) ausnVar.h()).x("Fpnv consent activity started.");
        String stringExtra = getIntent().getStringExtra("firebase_app_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.p = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("firebase_api_key");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.q = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("calling_package");
        this.r = stringExtra3 != null ? stringExtra3 : "";
        String str2 = this.p;
        if (str2 == null) {
            fxxm.j("appId");
            str2 = null;
        }
        if (str2.length() != 0) {
            String str3 = this.q;
            if (str3 == null) {
                fxxm.j("apiKey");
                str3 = null;
            }
            if (str3.length() != 0) {
                String str4 = this.r;
                if (str4 == null) {
                    fxxm.j("callingPackageName");
                    str4 = null;
                }
                if (str4.length() != 0) {
                    int intExtra = getIntent().getIntExtra("sim_slot", -1);
                    this.s = intExtra == -1 ? fxsr.f(0, 1) : fxsr.b(Integer.valueOf(intExtra));
                    if (this.v == null) {
                        fxxm.j("fpnvImplFactory");
                    }
                    String str5 = this.r;
                    if (str5 == null) {
                        fxxm.j("callingPackageName");
                        str = null;
                    } else {
                        str = str5;
                    }
                    bhlk bhlkVar2 = this.k;
                    if (bhlkVar2 == null) {
                        fxxm.j("fpnvGrpcClient");
                        bhlkVar = null;
                    } else {
                        bhlkVar = bhlkVar2;
                    }
                    bhlc bhlcVar2 = this.l;
                    if (bhlcVar2 == null) {
                        fxxm.j("timeClient");
                        bhlcVar = null;
                    } else {
                        bhlcVar = bhlcVar2;
                    }
                    bhlh bhlhVar2 = this.m;
                    if (bhlhVar2 == null) {
                        fxxm.j("tokenManager");
                        bhlhVar = null;
                    } else {
                        bhlhVar = bhlhVar2;
                    }
                    this.o = new bhmj(str, this, bhlkVar, bhlcVar, bhlhVar);
                    fycr.b(jvd.a(this), null, null, new bhnk(this, null), 3);
                    return;
                }
            }
        }
        ((eluo) ausnVar.j()).x("Invalid appId or apiKey or callingPackageName, dismissing activity");
        setResult(0, new Intent().putExtra("fpnv_exception", "Invalid appId or apiKey or callingPackageName"));
        finish();
    }

    @Override // defpackage.bhno, defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        ((eluo) j.h()).x("Fpnv consent activity destroyed.");
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
