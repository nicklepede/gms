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
import defpackage.anxn;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.asvp;
import defpackage.aszi;
import defpackage.aszu;
import defpackage.atbt;
import defpackage.atbw;
import defpackage.atby;
import defpackage.atbz;
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
import defpackage.fmms;
import defpackage.ig;
import defpackage.iq;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConstellationSettingsChimeraActivity extends anxn {
    public static final arxo j = atmg.a("constellation_settings");
    public Menu A;
    public Uri B;
    public atlw C;
    public atmc D;
    public atby E;
    public assn I;
    private Bundle K;
    public ProgressDialog k;
    public Context v;
    public aszu w;
    public iq x;
    public UUID y;
    public final Handler l = new byhr();
    public final ExecutorService m = new asmf(1, 9);
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    private boolean J = false;
    public boolean r = false;
    public int s = 0;
    public int t = 0;
    public final List u = new ArrayList();
    public fjpp z = null;
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
        this.C.o(this.D, enwd.CONSENT_SETTINGS_INIT_FAILURE);
        assk J = this.I.J(getResources().getString(R.string.c11n_device_consent_activity_label), 0);
        assp asspVar = new assp(this.v);
        asspVar.i(false);
        asspVar.r(R.string.c11n_connection_lost);
        asspVar.o(0);
        J.k(asspVar);
        assp asspVar2 = new assp(this.v);
        asspVar2.r(R.string.c11n_tap_to_retry);
        asspVar2.n(new atbt(this));
        asspVar2.o(1);
        J.k(asspVar2);
    }

    public final void k() {
        synchronized (this.F) {
            this.M = true;
        }
        try {
            this.m.execute(new atbw(this));
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
            this.m.execute(new atbz(this));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start ReadDataTask", e, new Object[0]);
        }
    }

    @Override // defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.K = bundle;
        super.onCreate(null);
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.CONSTELLATION_UI_SETTINGS);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(fmms.d())) {
            return false;
        }
        this.B = Uri.parse(fmms.d());
        this.A = menu;
        getMenuInflater().inflate(R.menu.settings_menu, this.A);
        return true;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        this.m.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.J && isChangingConfigurations()) {
            j.d("Saving instance state", new Object[0]);
            bundle.putBoolean("changing_configurations", true);
            synchronized (this.F) {
                bundle.putBoolean("init_failed", this.L);
            }
        }
        fjpp fjppVar = this.z;
        if (fjppVar != null) {
            bundle.putByteArray("message_overrides", fjppVar.r());
        }
    }

    @Override // defpackage.anxn
    protected final void q(assn assnVar) {
        this.v = getApplicationContext();
        this.w = aszi.b().a(this.v);
        this.k = ProgressDialog.show(this, null, getResources().getString(R.string.common_loading));
        this.I = assnVar;
        this.y = UUID.randomUUID();
        this.C = atlw.a(this.v);
        atmc atmcVar = new atmc(this.y.toString());
        this.D = atmcVar;
        atmcVar.c = 5;
        ig hy = hy();
        if (hy != null) {
            hy.o(true);
        }
        boolean z = false;
        if (this.K != null) {
            this.C.o(this.D, enwd.CONSENT_SETTINGS_RECREATED);
            j.d("savedInstanceState not null", new Object[0]);
            this.r = this.K.getBoolean("changing_configurations", false);
            boolean z2 = this.K.getBoolean("init_failed", false);
            try {
                byte[] byteArray = this.K.getByteArray("message_overrides");
                if (byteArray != null && byteArray.length > 0) {
                    this.z = (fjpp) ((fecj) fjpp.a.v().D(byteArray, febw.a())).Q();
                }
            } catch (fedk | NullPointerException e) {
                j.g("Couldn't parse messageOverrides", e, new Object[0]);
                this.z = null;
            }
            z = z2;
        } else {
            this.C.o(this.D, enwd.CONSENT_SETTINGS_OPENED);
        }
        this.E = new atby(this, this.l, z);
        asvp.h();
        asvp.a(this, this.y, this.E);
    }

    @Override // defpackage.anxn
    public final void r() {
    }
}
