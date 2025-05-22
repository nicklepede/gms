package com.google.android.gms.constellation.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.apzf;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupz;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.auzl;
import defpackage.avdl;
import defpackage.avdx;
import defpackage.avfw;
import defpackage.avfz;
import defpackage.avgb;
import defpackage.avgc;
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
import defpackage.fpen;
import defpackage.ig;
import defpackage.iq;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConstellationSettingsChimeraActivity extends apzf {
    public static final auad j = avqj.a("constellation_settings");
    public Menu A;
    public Uri B;
    public avpz C;
    public avqf D;
    public avgb E;
    public auwh I;
    private Bundle K;
    public ProgressDialog k;
    public Context v;
    public avdx w;
    public iq x;
    public UUID y;
    public final Handler l = new caqj();
    public final ExecutorService m = new aupz(1, 9);
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    private boolean J = false;
    public boolean r = false;
    public int s = 0;
    public int t = 0;
    public final List u = new ArrayList();
    public fmfm z = null;
    public final Object F = new Object();
    private boolean L = false;
    public boolean G = false;
    private boolean M = false;
    private boolean N = false;
    public boolean H = false;

    public final void a() {
        synchronized (this.F) {
            this.N = true;
        }
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k.dismiss();
        }
        this.C.o(this.D, eqjw.CONSENT_SETTINGS_INIT_FAILURE);
        auwe J = this.I.J(getResources().getString(R.string.c11n_device_consent_activity_label), 0);
        auwj auwjVar = new auwj(this.v);
        auwjVar.i(false);
        auwjVar.r(R.string.c11n_connection_lost);
        auwjVar.o(0);
        J.k(auwjVar);
        auwj auwjVar2 = new auwj(this.v);
        auwjVar2.r(R.string.c11n_tap_to_retry);
        auwjVar2.n(new avfw(this));
        auwjVar2.o(1);
        J.k(auwjVar2);
    }

    public final void k() {
        synchronized (this.F) {
            this.M = true;
        }
        try {
            this.m.execute(new avfz(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start GetMessageOverridesTask", e, new Object[0]);
            synchronized (this.F) {
                this.L = true;
                this.M = false;
                l();
            }
        }
    }

    public final synchronized void l() {
        if (this.N || this.M || (this.G && !this.H)) {
            return;
        }
        this.N = true;
        if (this.L) {
            a();
            return;
        }
        try {
            this.m.execute(new avgc(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start ReadDataTask", e, new Object[0]);
        }
    }

    @Override // defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.K = bundle;
        super.onCreate(null);
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.CONSTELLATION_UI_SETTINGS);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(fpen.d())) {
            return false;
        }
        this.B = Uri.parse(fpen.d());
        this.A = menu;
        getMenuInflater().inflate(R.menu.settings_menu, this.A);
        return true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        this.m.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.c11n_learn_more) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent("android.intent.action.VIEW", this.B);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        return true;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.J && isChangingConfigurations()) {
            j.d("Saving instance state", new Object[0]);
            bundle.putBoolean("changing_configurations", true);
            synchronized (this.F) {
                bundle.putBoolean("init_failed", this.L);
            }
        }
        fmfm fmfmVar = this.z;
        if (fmfmVar != null) {
            bundle.putByteArray("message_overrides", fmfmVar.r());
        }
    }

    @Override // defpackage.apzf
    protected final void q(auwh auwhVar) {
        this.v = getApplicationContext();
        this.w = avdl.b().a(this.v);
        this.k = ProgressDialog.show(this, null, getResources().getString(R.string.common_loading));
        this.I = auwhVar;
        this.y = UUID.randomUUID();
        this.C = avpz.a(this.v);
        avqf avqfVar = new avqf(this.y.toString());
        this.D = avqfVar;
        avqfVar.c = 5;
        ig hO = hO();
        if (hO != null) {
            hO.o(true);
        }
        boolean z = false;
        if (this.K != null) {
            this.C.o(this.D, eqjw.CONSENT_SETTINGS_RECREATED);
            j.d("savedInstanceState not null", new Object[0]);
            this.r = this.K.getBoolean("changing_configurations", false);
            boolean z2 = this.K.getBoolean("init_failed", false);
            try {
                byte[] byteArray = this.K.getByteArray("message_overrides");
                if (byteArray != null && byteArray.length > 0) {
                    this.z = (fmfm) ((fgrc) fmfm.a.v().D(byteArray, fgqp.a())).Q();
                }
            } catch (fgsd | NullPointerException e) {
                j.g("Couldn't parse messageOverrides", e, new Object[0]);
                this.z = null;
            }
            z = z2;
        } else {
            this.C.o(this.D, eqjw.CONSENT_SETTINGS_OPENED);
        }
        this.E = new avgb(this, this.l, z);
        auzl.h();
        auzl.a(this, this.y, this.E);
    }

    @Override // defpackage.apzf
    public final void r() {
    }
}
