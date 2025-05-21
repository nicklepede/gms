package com.google.android.gms.constellation.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.R;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.asvp;
import defpackage.aszi;
import defpackage.aszu;
import defpackage.atch;
import defpackage.atck;
import defpackage.atcm;
import defpackage.atcn;
import defpackage.atlw;
import defpackage.atmc;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byhr;
import defpackage.eijr;
import defpackage.enwd;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fedk;
import defpackage.fjpp;
import defpackage.iq;
import defpackage.qgg;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConstellationSettingsCollapsingActivity extends qgg {
    public static final arxo j = atmg.a("collapsing_constellation_settings");
    public atmc A;
    public atcm B;
    public assn F;
    private Bundle H;
    public ProgressDialog k;
    public Context u;
    public aszu v;
    public iq w;
    public UUID x;
    public atlw z;
    public final Handler l = new byhr();
    public final ExecutorService m = new asmf(1, 9);
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    private boolean G = false;
    public boolean q = false;
    public int r = 0;
    public int s = 0;
    public final List t = new ArrayList();
    public fjpp y = null;
    public final Object C = new Object();
    private boolean I = false;
    public boolean D = false;
    private boolean J = false;
    private boolean K = false;
    public boolean E = false;

    public final void a() {
        synchronized (this.C) {
            this.K = true;
        }
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k.dismiss();
        }
        this.z.o(this.A, enwd.CONSENT_SETTINGS_INIT_FAILURE);
        assk J = this.F.J(getResources().getString(R.string.c11n_device_consent_activity_label), 0);
        assp asspVar = new assp(this.u);
        asspVar.i(false);
        asspVar.p(R.string.c11n_connection_lost);
        asspVar.o(0);
        J.k(asspVar);
        assp asspVar2 = new assp(this.u);
        asspVar2.p(R.string.c11n_tap_to_retry);
        asspVar2.n(new atch(this));
        asspVar2.o(1);
        J.k(asspVar2);
    }

    public final void c() {
        synchronized (this.C) {
            this.J = true;
        }
        try {
            this.m.execute(new atck(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start GetMessageOverridesTask", e, new Object[0]);
            synchronized (this.C) {
                this.I = true;
                this.J = false;
                f();
            }
        }
    }

    public final synchronized void f() {
        if (this.K || this.J || (this.D && !this.E)) {
            return;
        }
        this.K = true;
        if (this.I) {
            a();
            return;
        }
        try {
            this.m.execute(new atcn(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start ReadDataTask", e, new Object[0]);
        }
    }

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.H = bundle;
        this.u = getApplicationContext();
        super.onCreate(bundle);
        setContentView(R.layout.common_settings_screen);
        assn assnVar = new assn(this);
        this.F = assnVar;
        assnVar.D(getWindow());
        assn assnVar2 = this.F;
        this.u = getApplicationContext();
        this.v = aszi.b().a(this.u);
        this.k = ProgressDialog.show(this, null, getResources().getString(R.string.common_loading));
        this.F = assnVar2;
        this.x = UUID.randomUUID();
        this.z = atlw.a(this.u);
        atmc atmcVar = new atmc(this.x.toString());
        this.A = atmcVar;
        atmcVar.c = 5;
        boolean z = false;
        if (this.H != null) {
            this.z.o(atmcVar, enwd.CONSENT_SETTINGS_RECREATED);
            j.d("savedInstanceState not null", new Object[0]);
            this.q = this.H.getBoolean("changing_configurations", false);
            boolean z2 = this.H.getBoolean("init_failed", false);
            try {
                byte[] byteArray = this.H.getByteArray("message_overrides");
                if (byteArray != null && byteArray.length > 0) {
                    this.y = (fjpp) ((fecj) fjpp.a.v().D(byteArray, febw.a())).Q();
                }
            } catch (fedk | NullPointerException e) {
                j.g("Couldn't parse messageOverrides", e, new Object[0]);
                this.y = null;
            }
            z = z2;
        } else {
            this.z.o(atmcVar, enwd.CONSENT_SETTINGS_OPENED);
        }
        this.B = new atcm(this, this.l, z);
        asvp.h();
        asvp.a(this, this.x, this.B);
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.CONSTELLATION_UI_COLLAPSING_SETTINGS);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        this.m.shutdown();
        super.onDestroy();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        arxo arxoVar = j;
        arxoVar.d("Before Saving", new Object[0]);
        super.onSaveInstanceState(bundle);
        if (!this.G && isChangingConfigurations()) {
            arxoVar.d("Saving instance state", new Object[0]);
            bundle.putBoolean("changing_configurations", true);
            synchronized (this.C) {
                bundle.putBoolean("init_failed", this.I);
            }
        }
        fjpp fjppVar = this.y;
        if (fjppVar != null) {
            bundle.putByteArray("message_overrides", fjppVar.r());
        }
    }
}
