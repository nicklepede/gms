package com.google.android.gms.constellation.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.R;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupz;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.auzl;
import defpackage.avdl;
import defpackage.avdx;
import defpackage.avgk;
import defpackage.avgn;
import defpackage.avgp;
import defpackage.avgq;
import defpackage.avpz;
import defpackage.avqf;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.caqj;
import defpackage.ekww;
import defpackage.eqjw;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgsd;
import defpackage.fmfm;
import defpackage.iq;
import defpackage.rzk;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConstellationSettingsCollapsingActivity extends rzk {
    public static final auad j = avqj.a("collapsing_constellation_settings");
    public avqf A;
    public avgp B;
    public auwh F;
    private Bundle H;
    public ProgressDialog k;
    public Context u;
    public avdx v;
    public iq w;
    public UUID x;
    public avpz z;
    public final Handler l = new caqj();
    public final ExecutorService m = new aupz(1, 9);
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    private boolean G = false;
    public boolean q = false;
    public int r = 0;
    public int s = 0;
    public final List t = new ArrayList();
    public fmfm y = null;
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
        this.z.o(this.A, eqjw.CONSENT_SETTINGS_INIT_FAILURE);
        auwe J = this.F.J(getResources().getString(R.string.c11n_device_consent_activity_label), 0);
        auwj auwjVar = new auwj(this.u);
        auwjVar.i(false);
        auwjVar.p(R.string.c11n_connection_lost);
        auwjVar.o(0);
        J.k(auwjVar);
        auwj auwjVar2 = new auwj(this.u);
        auwjVar2.p(R.string.c11n_tap_to_retry);
        auwjVar2.n(new avgk(this));
        auwjVar2.o(1);
        J.k(auwjVar2);
    }

    public final void f() {
        synchronized (this.C) {
            this.J = true;
        }
        try {
            this.m.execute(new avgn(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start GetMessageOverridesTask", e, new Object[0]);
            synchronized (this.C) {
                this.I = true;
                this.J = false;
                g();
            }
        }
    }

    public final synchronized void g() {
        if (this.K || this.J || (this.D && !this.E)) {
            return;
        }
        this.K = true;
        if (this.I) {
            a();
            return;
        }
        try {
            this.m.execute(new avgq(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start ReadDataTask", e, new Object[0]);
        }
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.H = bundle;
        this.u = getApplicationContext();
        super.onCreate(bundle);
        setContentView(R.layout.common_settings_screen);
        auwh auwhVar = new auwh(this);
        this.F = auwhVar;
        auwhVar.D(getWindow());
        auwh auwhVar2 = this.F;
        this.u = getApplicationContext();
        this.v = avdl.b().a(this.u);
        this.k = ProgressDialog.show(this, null, getResources().getString(R.string.common_loading));
        this.F = auwhVar2;
        this.x = UUID.randomUUID();
        this.z = avpz.a(this.u);
        avqf avqfVar = new avqf(this.x.toString());
        this.A = avqfVar;
        avqfVar.c = 5;
        boolean z = false;
        if (this.H != null) {
            this.z.o(avqfVar, eqjw.CONSENT_SETTINGS_RECREATED);
            j.d("savedInstanceState not null", new Object[0]);
            this.q = this.H.getBoolean("changing_configurations", false);
            boolean z2 = this.H.getBoolean("init_failed", false);
            try {
                byte[] byteArray = this.H.getByteArray("message_overrides");
                if (byteArray != null && byteArray.length > 0) {
                    this.y = (fmfm) ((fgrc) fmfm.a.v().D(byteArray, fgqp.a())).Q();
                }
            } catch (fgsd | NullPointerException e) {
                j.g("Couldn't parse messageOverrides", e, new Object[0]);
                this.y = null;
            }
            z = z2;
        } else {
            this.z.o(avqfVar, eqjw.CONSENT_SETTINGS_OPENED);
        }
        this.B = new avgp(this, this.l, z);
        auzl.h();
        auzl.a(this, this.x, this.B);
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.CONSTELLATION_UI_COLLAPSING_SETTINGS);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        this.m.shutdown();
        super.onDestroy();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        auad auadVar = j;
        auadVar.d("Before Saving", new Object[0]);
        super.onSaveInstanceState(bundle);
        if (!this.G && isChangingConfigurations()) {
            auadVar.d("Saving instance state", new Object[0]);
            bundle.putBoolean("changing_configurations", true);
            synchronized (this.C) {
                bundle.putBoolean("init_failed", this.I);
            }
        }
        fmfm fmfmVar = this.y;
        if (fmfmVar != null) {
            bundle.putByteArray("message_overrides", fmfmVar.r());
        }
    }
}
