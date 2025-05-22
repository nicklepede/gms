package com.google.android.gms.findmydevice.spot.e2ee.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.e2ee.ui.SyncOwnerKeyChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.ach;
import defpackage.acj;
import defpackage.acq;
import defpackage.acr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfgg;
import defpackage.bfju;
import defpackage.bfjw;
import defpackage.bfjy;
import defpackage.bflm;
import defpackage.bfnn;
import defpackage.bfnp;
import defpackage.bfns;
import defpackage.bfsf;
import defpackage.bfsj;
import defpackage.bfsk;
import defpackage.bfsn;
import defpackage.bfsw;
import defpackage.bfsx;
import defpackage.bftd;
import defpackage.bfto;
import defpackage.bfty;
import defpackage.bfua;
import defpackage.bfvl;
import defpackage.bgct;
import defpackage.bgcw;
import defpackage.bgia;
import defpackage.bhdk;
import defpackage.bhdx;
import defpackage.bhfg;
import defpackage.bp;
import defpackage.dg;
import defpackage.ejaa;
import defpackage.ejaf;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.eqgp;
import defpackage.ewwz;
import defpackage.flni;
import defpackage.iri;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SyncOwnerKeyChimeraActivity extends ryt implements bfto, bfsw, bfsf, bftd, bfsn, bfsj {
    public static final ausn j = ausn.b("SyncOwnerKeyActivity", auid.FIND_MY_DEVICE_SPOT);
    public aca k;
    public aca l;
    public bfvl m;
    public bfnn n;
    public ekvi o;
    public bhdx p;
    public Account q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    private aca v;
    private View w;

    public static void r(bfns bfnsVar, aca acaVar) {
        ekvi ekviVar = bfnsVar.a;
        ekvl.q(ekviVar.h());
        PendingIntent pendingIntent = ((Status) ekviVar.c()).k;
        ekvl.y(pendingIntent);
        acaVar.b(new acj(pendingIntent.getIntentSender()).a());
    }

    private final void w(boolean z) {
        Intent a = bhdk.a(this, this.q, this.n, 2, z);
        if (a == null) {
            ((eluo) j.i()).x("Could not call the DismissNotificationIntentOperation service.");
        } else {
            getApplicationContext().startService(a);
        }
    }

    private final void x() {
        new bfsk().show(getSupportFragmentManager(), "DISMISS_UI_DIALOG_FRAGMENT");
    }

    @Override // defpackage.bfsf
    public final void a() {
        if (this.r) {
            x();
        } else {
            this.m.c(false);
        }
    }

    @Override // defpackage.bfsf
    public final void b() {
        this.m.c(true);
    }

    @Override // defpackage.bfsj
    public final void c() {
        w(false);
        p();
    }

    @Override // defpackage.bfsj
    public final void d() {
        w(true);
        p();
    }

    @Override // defpackage.bfsn
    public final void e() {
        p();
    }

    @Override // defpackage.bfsn
    public final void f() {
        startActivity(new Intent("com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS").setPackage("com.google.android.gms").addFlags(268435456));
    }

    @Override // defpackage.bfsw
    public final void g() {
        if (this.r) {
            x();
        } else {
            this.m.e(false);
        }
    }

    @Override // defpackage.bfsw
    public final void h() {
        this.v.b(new Intent("android.app.action.SET_NEW_PASSWORD"));
        t();
    }

    @Override // defpackage.bftd
    public final void i() {
        if (this.r) {
            x();
        } else {
            this.m.f(0);
        }
    }

    @Override // defpackage.bftd
    public final void j() {
        this.m.f(1);
    }

    @Override // defpackage.bftd
    public final void k() {
        this.m.f(2);
    }

    @Override // defpackage.bftd
    public final void l() {
        if (this.r) {
            x();
        } else {
            this.m.g(false);
        }
    }

    @Override // defpackage.bftd
    public final void m() {
        this.m.g(true);
    }

    @Override // defpackage.bfto
    public final void n() {
        this.m.j();
    }

    @Override // defpackage.bfto
    public final void o() {
        if (this.r) {
            x();
        } else {
            p();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null || !data.getQueryParameterNames().containsAll(elhz.M("required_input", "use_case", "account_name", "is_periodic"))) {
            ((eluo) j.i()).x("Missing required intent parameters.");
            p();
            return;
        }
        ekvl.y(intent.getData());
        String queryParameter = intent.getData().getQueryParameter("account_name");
        ekvl.y(queryParameter);
        ekvi e = bhfg.e(this, queryParameter);
        if (!e.h()) {
            ((eluo) j.i()).x("Error finding the given account");
            p();
            return;
        }
        this.q = (Account) e.c();
        this.t = intent.getBooleanExtra("caller_to_complete_self_provisioning_on_success", false);
        bfvl bfvlVar = (bfvl) new jxw(this).a(bfvl.class);
        this.m = bfvlVar;
        bfvlVar.b().g(this, new jvs() { // from class: bftr
            @Override // defpackage.jvs
            public final void a(Object obj) {
                SyncOwnerKeyChimeraActivity.this.s((bfns) obj);
            }
        });
        this.m.g.g(this, new jvs() { // from class: bfts
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                    jvc h = syncOwnerKeyChimeraActivity.getSupportFragmentManager().h("syncownerkey_fragments");
                    if (h instanceof bftq) {
                        ((bftq) h).x(syncOwnerKeyChimeraActivity.getString(R.string.error_snackbar_message));
                    }
                    syncOwnerKeyChimeraActivity.m.g.l(false);
                }
            }
        });
        this.m.h.g(this, new jvs() { // from class: bftt
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    SyncOwnerKeyChimeraActivity.this.p();
                }
            }
        });
        setContentView(R.layout.sync_owner_key);
        this.w = findViewById(R.id.background_progress_bar);
        ekvl.y(intent.getData());
        String queryParameter2 = intent.getData().getQueryParameter("use_case");
        ekvl.y(queryParameter2);
        this.n = bfnn.a(queryParameter2);
        ekvl.y(intent.getData());
        String queryParameter3 = intent.getData().getQueryParameter("fmdn_state");
        this.o = queryParameter3 == null ? ektg.a : ekvi.i(ewwz.b(Integer.parseInt(queryParameter3)));
        Uri data2 = intent.getData();
        ekvl.y(data2);
        String queryParameter4 = data2.getQueryParameter("required_input");
        ekvl.y(queryParameter4);
        this.p = bhdx.b(queryParameter4);
        ekvl.y(intent.getData());
        String queryParameter5 = intent.getData().getQueryParameter("is_periodic");
        ekvl.y(queryParameter5);
        this.r = Boolean.parseBoolean(queryParameter5);
        ekvl.y(intent.getData());
        String queryParameter6 = intent.getData().getQueryParameter("other_devices_to_sync_with");
        boolean z = true;
        this.u = queryParameter6 == null ? 1 : bfua.c(queryParameter6);
        if (this.n.h && !this.o.h()) {
            z = false;
        }
        ekvl.q(z);
        ach activityResultRegistry = getActivityResultRegistry();
        this.v = activityResultRegistry.c("SET_UP_LOCK_SCREEN", this, new acq(), new aby() { // from class: bftu
            @Override // defpackage.aby
            public final void jF(Object obj) {
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                bfns bfnsVar = (bfns) syncOwnerKeyChimeraActivity.m.b().ii();
                ekvl.y(bfnsVar);
                int i = bfnsVar.b;
                int i2 = i - 1;
                if (i2 == 0) {
                    syncOwnerKeyChimeraActivity.m.j();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("Lock screen setup wizard was launched from unexpected state ".concat(bfnr.a(i)));
                    }
                    syncOwnerKeyChimeraActivity.m.e(true);
                }
            }
        });
        this.l = activityResultRegistry.c("RETRIEVE_DOMAIN", this, new acr(), new aby() { // from class: bftv
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i = ((ActivityResult) obj).a;
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                final bfvl bfvlVar2 = syncOwnerKeyChimeraActivity.m;
                final Account account = syncOwnerKeyChimeraActivity.q;
                final boolean z2 = syncOwnerKeyChimeraActivity.r;
                ejaa g = ejaa.g(bfvlVar2.b.h(i == -1));
                ekut ekutVar = new ekut() { // from class: bfvj
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        bfvl.this.i((bfns) obj2);
                        return null;
                    }
                };
                eqgo eqgoVar = bfvlVar2.a;
                dzmi.a(g.h(ekutVar, eqgoVar).f(Exception.class, new eqdv() { // from class: bfvk
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        bfvl bfvlVar3 = bfvl.this;
                        Account account2 = account;
                        boolean z3 = z2;
                        synchronized (bfvlVar3.d) {
                            bfnn a = bfvlVar3.b.a();
                            int a2 = bfnp.a(bfvlVar3.b.a(), z3);
                            bhdx bhdxVar = bfvlVar3.c;
                            bfns bfnsVar = bfvlVar3.f;
                            ekvl.y(bfnsVar);
                            bfvlVar3.k(account2, a, a2, bhdxVar, ekvi.j(bfnsVar), bfvlVar3.b.b(), bfvlVar3.b.c());
                        }
                        return eqgf.a;
                    }
                }, eqgoVar), "onRetrieveDomainAttempted Failure.", new Object[0]);
            }
        });
        this.k = activityResultRegistry.c("CREATE_DOMAIN", this, new acr(), new aby() { // from class: bftw
            @Override // defpackage.aby
            public final void jF(Object obj) {
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                final bfvl bfvlVar2 = syncOwnerKeyChimeraActivity.m;
                final Account account = syncOwnerKeyChimeraActivity.q;
                final boolean z2 = syncOwnerKeyChimeraActivity.r;
                ejaa g = ejaa.g(bfvlVar2.b.d());
                ekut ekutVar = new ekut() { // from class: bfuw
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        bfvl.this.i((bfns) obj2);
                        return null;
                    }
                };
                eqgo eqgoVar = bfvlVar2.a;
                dzmi.a(g.h(ekutVar, eqgoVar).f(Exception.class, new eqdv() { // from class: bfvc
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        bfvl bfvlVar3 = bfvl.this;
                        Account account2 = account;
                        boolean z3 = z2;
                        synchronized (bfvlVar3.d) {
                            bfnn a = bfvlVar3.b.a();
                            int a2 = bfnp.a(bfvlVar3.b.a(), z3);
                            bhdx bhdxVar = bfvlVar3.c;
                            bfns bfnsVar = bfvlVar3.f;
                            ekvl.y(bfnsVar);
                            bfvlVar3.k(account2, a, a2, bhdxVar, ekvi.j(bfnsVar), bfvlVar3.b.b(), bfvlVar3.b.c());
                        }
                        return eqgf.a;
                    }
                }, eqgoVar), "onCreateDomainAttempted Failure.", new Object[0]);
            }
        });
        int i = iri.a;
        if (!this.o.h() || !bgia.h((ewwz) this.o.c())) {
            u(false);
            return;
        }
        bfvl bfvlVar2 = this.m;
        Account account = this.q;
        bfty bftyVar = new bfty(this);
        bgct bgctVar = bfvlVar2.i.a;
        flni.b(account);
        ejaf.l(ejaa.g(bfjy.c(new bfju(account, (eqgp) bgctVar.f.a(), new bfjw(bgcw.b())), new bfgg(bgcw.b())).a(bflm.LOCK_SCREEN).g()), bftyVar, bfvlVar2.a);
    }

    public final void p() {
        if (this.r) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    public final void q(Class cls, Bundle bundle) {
        if (cls.isInstance(getSupportFragmentManager().h("syncownerkey_fragments"))) {
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.B();
        bpVar.z(R.id.fragment_container_view, bpVar.r(cls, bundle), "syncownerkey_fragments");
        bpVar.d();
        this.w.setVisibility(8);
    }

    public final void s(final bfns bfnsVar) {
        runOnUiThread(new Runnable() { // from class: bftx
            @Override // java.lang.Runnable
            public final void run() {
                bfns bfnsVar2 = bfnsVar;
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                if (bfnsVar2 == null) {
                    syncOwnerKeyChimeraActivity.t();
                    return;
                }
                switch (bfnsVar2.b - 1) {
                    case 0:
                        if (syncOwnerKeyChimeraActivity.p.equals(bhdx.c)) {
                            syncOwnerKeyChimeraActivity.v();
                            return;
                        }
                        if (fqsv.j() && syncOwnerKeyChimeraActivity.n.equals(bfnn.SELF_PROVISIONED_MAINTENANCE)) {
                            syncOwnerKeyChimeraActivity.m.j();
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("USE_CASE", syncOwnerKeyChimeraActivity.n.name());
                        bundle.putString("REQUIRED_INPUT", syncOwnerKeyChimeraActivity.p.name());
                        bundle.putBoolean("IS_PERIODIC", syncOwnerKeyChimeraActivity.r);
                        int i = syncOwnerKeyChimeraActivity.u;
                        String a = bfua.a(i);
                        if (i == 0) {
                            throw null;
                        }
                        bundle.putString("OTHER_DEVICES_TO_SYNC_WITH", a);
                        if (syncOwnerKeyChimeraActivity.o.h()) {
                            bundle.putInt("FMDN_STATE_NUMBER", ((ewwz) syncOwnerKeyChimeraActivity.o.c()).a());
                        }
                        bundle.putBoolean("CAN_CREATE_LSKF_DOMAIN", syncOwnerKeyChimeraActivity.s);
                        syncOwnerKeyChimeraActivity.q(bftp.class, bundle);
                        return;
                    case 1:
                        syncOwnerKeyChimeraActivity.v();
                        return;
                    case 2:
                        SyncOwnerKeyChimeraActivity.r(bfnsVar2, syncOwnerKeyChimeraActivity.k);
                        return;
                    case 3:
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("ACCOUNT_NAME", syncOwnerKeyChimeraActivity.q.name);
                        syncOwnerKeyChimeraActivity.q(bfsg.class, bundle2);
                        return;
                    case 4:
                        SyncOwnerKeyChimeraActivity.r(bfnsVar2, syncOwnerKeyChimeraActivity.l);
                        return;
                    case 5:
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("DOMAIN_IS_UNRETRIEVABLE", false);
                        syncOwnerKeyChimeraActivity.q(bfte.class, bundle3);
                        return;
                    case 6:
                        Bundle bundle4 = new Bundle();
                        bundle4.putBoolean("DOMAIN_IS_UNRETRIEVABLE", true);
                        syncOwnerKeyChimeraActivity.q(bfte.class, bundle4);
                        return;
                    case 7:
                        syncOwnerKeyChimeraActivity.p();
                        return;
                    case 8:
                        syncOwnerKeyChimeraActivity.setResult(-1);
                        syncOwnerKeyChimeraActivity.p();
                        return;
                    default:
                        if (fqsv.n()) {
                            Intent a2 = bhff.a(syncOwnerKeyChimeraActivity, "com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation", "com.google.android.gms.findmydevice.spot.sync.DISMISS_KEYCHAIN_MAINTENANCE_NOTIFICATION");
                            if (a2 == null) {
                                ((eluo) SyncOwnerKeyChimeraActivity.j.i()).x("Could not call the DismissNotificationIntentOperation service.");
                            } else {
                                syncOwnerKeyChimeraActivity.getApplicationContext().startService(a2);
                            }
                        } else {
                            bgct bgctVar = syncOwnerKeyChimeraActivity.m.i;
                            new bhdv(bgcw.b()).b();
                        }
                        syncOwnerKeyChimeraActivity.setResult(-1);
                        if (syncOwnerKeyChimeraActivity.n.h && !syncOwnerKeyChimeraActivity.t) {
                            bfvl bfvlVar = syncOwnerKeyChimeraActivity.m;
                            ekvl.q(bfvlVar.b != null);
                            int i2 = bfvlVar.b.l() == 3 ? 2 : true != syncOwnerKeyChimeraActivity.p.equals(bhdx.a) ? 6 : 4;
                            ewwz ewwzVar = (ewwz) syncOwnerKeyChimeraActivity.o.c();
                            Intent a3 = bhff.a(syncOwnerKeyChimeraActivity, "com.google.android.gms.findmydevice.spot.locationreporting.ProvisionThisDeviceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.PROVISION_THIS_DEVICE");
                            if (a3 != null) {
                                a3.putExtra("enrollment_method", i2 - 1);
                                a3.putExtra("fmdn_state", ewwzVar.a());
                            }
                            if (a3 != null) {
                                syncOwnerKeyChimeraActivity.getApplicationContext().startService(a3);
                            }
                        }
                        if (!syncOwnerKeyChimeraActivity.r) {
                            syncOwnerKeyChimeraActivity.p();
                            return;
                        }
                        Bundle bundle5 = new Bundle();
                        bundle5.putBoolean("ADD_LINK_TO_SETTINGS", syncOwnerKeyChimeraActivity.r);
                        bundle5.putString("USE_CASE", syncOwnerKeyChimeraActivity.n.name());
                        bfvl bfvlVar2 = syncOwnerKeyChimeraActivity.m;
                        ekvl.q(bfvlVar2.b != null);
                        bundle5.putString("DOMAIN_TYPE", ((bflm) bfvlVar2.b.c().c()).name());
                        if (syncOwnerKeyChimeraActivity.o.h()) {
                            bundle5.putInt("FMDN_STATE_NUMBER", ((ewwz) syncOwnerKeyChimeraActivity.o.c()).a());
                        }
                        int i3 = syncOwnerKeyChimeraActivity.u;
                        String a4 = bfua.a(i3);
                        if (i3 == 0) {
                            throw null;
                        }
                        bundle5.putString("OTHER_DEVICES_TO_SYNC_WITH", a4);
                        bundle5.putBoolean("CAN_CREATE_LSKF_DOMAIN", syncOwnerKeyChimeraActivity.s);
                        syncOwnerKeyChimeraActivity.q(bfso.class, bundle5);
                        return;
                }
            }
        });
    }

    public final void t() {
        dg h = getSupportFragmentManager().h("syncownerkey_fragments");
        if (h != null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.B();
            bpVar.m(h);
            bpVar.d();
        }
        this.w.setVisibility(0);
    }

    public final void u(boolean z) {
        this.s = z;
        bfvl bfvlVar = this.m;
        if (bfvlVar.b != null) {
            s((bfns) bfvlVar.b().ii());
            return;
        }
        try {
            Account account = this.q;
            bfnn bfnnVar = this.n;
            int a = bfnp.a(bfnnVar, this.r);
            bhdx bhdxVar = this.p;
            ektg ektgVar = ektg.a;
            bfvlVar.k(account, bfnnVar, a, bhdxVar, ektgVar, ektgVar, ektgVar);
        } catch (RemoteException e) {
            ((eluo) ((eluo) j.j()).s(e)).x("Error initializing state machine");
            p();
        }
    }

    public final void v() {
        q(bfsx.class, new Bundle());
    }
}
