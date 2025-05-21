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
import defpackage.abt;
import defpackage.abv;
import defpackage.acc;
import defpackage.ace;
import defpackage.acl;
import defpackage.acm;
import defpackage.asej;
import defpackage.asot;
import defpackage.bdeu;
import defpackage.bdii;
import defpackage.bdik;
import defpackage.bdim;
import defpackage.bdka;
import defpackage.bdmb;
import defpackage.bdmd;
import defpackage.bdmg;
import defpackage.bdqt;
import defpackage.bdqx;
import defpackage.bdqy;
import defpackage.bdrb;
import defpackage.bdrk;
import defpackage.bdrl;
import defpackage.bdrr;
import defpackage.bdsc;
import defpackage.bdsm;
import defpackage.bdso;
import defpackage.bdtz;
import defpackage.bebh;
import defpackage.bebk;
import defpackage.bego;
import defpackage.bfbu;
import defpackage.bfch;
import defpackage.bfdq;
import defpackage.bp;
import defpackage.dg;
import defpackage.egmx;
import defpackage.egnc;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.ensw;
import defpackage.euhg;
import defpackage.fixl;
import defpackage.ips;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SyncOwnerKeyChimeraActivity extends qfp implements bdsc, bdrk, bdqt, bdrr, bdrb, bdqx {
    public static final asot j = asot.b("SyncOwnerKeyActivity", asej.FIND_MY_DEVICE_SPOT);
    public abv k;
    public abv l;
    public bdtz m;
    public bdmb n;
    public eiid o;
    public bfch p;
    public Account q;
    public boolean r;
    public boolean s;
    public int t;
    private abv u;
    private View v;

    public static void r(bdmg bdmgVar, abv abvVar) {
        eiid eiidVar = bdmgVar.a;
        eiig.p(eiidVar.h());
        PendingIntent pendingIntent = ((Status) eiidVar.c()).k;
        eiig.x(pendingIntent);
        abvVar.b(new ace(pendingIntent.getIntentSender()).a());
    }

    private final void w(boolean z) {
        Intent a = bfbu.a(this, this.q, this.n, 2, z);
        if (a == null) {
            ((ejhf) j.i()).x("Could not call the DismissNotificationIntentOperation service.");
        } else {
            getApplicationContext().startService(a);
        }
    }

    private final void x() {
        new bdqy().show(getSupportFragmentManager(), "DISMISS_UI_DIALOG_FRAGMENT");
    }

    @Override // defpackage.bdqt
    public final void a() {
        if (this.r) {
            x();
        } else {
            this.m.c(false);
        }
    }

    @Override // defpackage.bdqt
    public final void b() {
        this.m.c(true);
    }

    @Override // defpackage.bdqx
    public final void c() {
        w(false);
        p();
    }

    @Override // defpackage.bdqx
    public final void d() {
        w(true);
        p();
    }

    @Override // defpackage.bdrb
    public final void e() {
        p();
    }

    @Override // defpackage.bdrb
    public final void f() {
        startActivity(new Intent("com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS").setPackage("com.google.android.gms").addFlags(268435456));
    }

    @Override // defpackage.bdrk
    public final void g() {
        if (this.r) {
            x();
        } else {
            this.m.e(false);
        }
    }

    @Override // defpackage.bdrk
    public final void h() {
        this.u.b(new Intent("android.app.action.SET_NEW_PASSWORD"));
        t();
    }

    @Override // defpackage.bdrr
    public final void i() {
        if (this.r) {
            x();
        } else {
            this.m.f(0);
        }
    }

    @Override // defpackage.bdrr
    public final void j() {
        this.m.f(1);
    }

    @Override // defpackage.bdrr
    public final void k() {
        this.m.f(2);
    }

    @Override // defpackage.bdrr
    public final void l() {
        if (this.r) {
            x();
        } else {
            this.m.g(false);
        }
    }

    @Override // defpackage.bdrr
    public final void m() {
        this.m.g(true);
    }

    @Override // defpackage.bdsc
    public final void n() {
        this.m.j();
    }

    @Override // defpackage.bdsc
    public final void o() {
        if (this.r) {
            x();
        } else {
            p();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null || !data.getQueryParameterNames().containsAll(eiuu.M("required_input", "use_case", "account_name", "is_periodic"))) {
            ((ejhf) j.i()).x("Missing required intent parameters.");
            p();
            return;
        }
        eiig.x(intent.getData());
        String queryParameter = intent.getData().getQueryParameter("account_name");
        eiig.x(queryParameter);
        eiid e = bfdq.e(this, queryParameter);
        if (!e.h()) {
            ((ejhf) j.i()).x("Error finding the given account");
            p();
            return;
        }
        this.q = (Account) e.c();
        bdtz bdtzVar = (bdtz) new jrh(this).a(bdtz.class);
        this.m = bdtzVar;
        bdtzVar.b().g(this, new jpd() { // from class: bdsf
            @Override // defpackage.jpd
            public final void a(Object obj) {
                SyncOwnerKeyChimeraActivity.this.s((bdmg) obj);
            }
        });
        this.m.g.g(this, new jpd() { // from class: bdsg
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                    jnu h = syncOwnerKeyChimeraActivity.getSupportFragmentManager().h("syncownerkey_fragments");
                    if (h instanceof bdse) {
                        ((bdse) h).x(syncOwnerKeyChimeraActivity.getString(R.string.error_snackbar_message));
                    }
                    syncOwnerKeyChimeraActivity.m.g.l(false);
                }
            }
        });
        this.m.h.g(this, new jpd() { // from class: bdsh
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    SyncOwnerKeyChimeraActivity.this.p();
                }
            }
        });
        setContentView(R.layout.sync_owner_key);
        this.v = findViewById(R.id.background_progress_bar);
        eiig.x(intent.getData());
        String queryParameter2 = intent.getData().getQueryParameter("use_case");
        eiig.x(queryParameter2);
        this.n = bdmb.a(queryParameter2);
        eiig.x(intent.getData());
        String queryParameter3 = intent.getData().getQueryParameter("fmdn_state");
        this.o = queryParameter3 == null ? eigb.a : eiid.i(euhg.b(Integer.parseInt(queryParameter3)));
        Uri data2 = intent.getData();
        eiig.x(data2);
        String queryParameter4 = data2.getQueryParameter("required_input");
        eiig.x(queryParameter4);
        this.p = bfch.b(queryParameter4);
        eiig.x(intent.getData());
        String queryParameter5 = intent.getData().getQueryParameter("is_periodic");
        eiig.x(queryParameter5);
        this.r = Boolean.parseBoolean(queryParameter5);
        eiig.x(intent.getData());
        String queryParameter6 = intent.getData().getQueryParameter("other_devices_to_sync_with");
        boolean z = true;
        this.t = queryParameter6 == null ? 1 : bdso.c(queryParameter6);
        if (this.n.h && !this.o.h()) {
            z = false;
        }
        eiig.p(z);
        acc activityResultRegistry = getActivityResultRegistry();
        this.u = activityResultRegistry.c("SET_UP_LOCK_SCREEN", this, new acl(), new abt() { // from class: bdsi
            @Override // defpackage.abt
            public final void jq(Object obj) {
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                bdmg bdmgVar = (bdmg) syncOwnerKeyChimeraActivity.m.b().hT();
                eiig.x(bdmgVar);
                int i = bdmgVar.b;
                int i2 = i - 1;
                if (i2 == 0) {
                    syncOwnerKeyChimeraActivity.m.j();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("Lock screen setup wizard was launched from unexpected state ".concat(bdmf.a(i)));
                    }
                    syncOwnerKeyChimeraActivity.m.e(true);
                }
            }
        });
        this.l = activityResultRegistry.c("RETRIEVE_DOMAIN", this, new acm(), new abt() { // from class: bdsj
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i = ((ActivityResult) obj).a;
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                final bdtz bdtzVar2 = syncOwnerKeyChimeraActivity.m;
                final Account account = syncOwnerKeyChimeraActivity.q;
                final boolean z2 = syncOwnerKeyChimeraActivity.r;
                egmx f = egmx.f(bdtzVar2.b.h(i == -1));
                eiho eihoVar = new eiho() { // from class: bdtx
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        bdtz.this.i((bdmg) obj2);
                        return null;
                    }
                };
                ensv ensvVar = bdtzVar2.a;
                dxai.a(f.h(eihoVar, ensvVar).e(Exception.class, new enqc() { // from class: bdty
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        bdtz bdtzVar3 = bdtz.this;
                        Account account2 = account;
                        boolean z3 = z2;
                        synchronized (bdtzVar3.d) {
                            bdmb a = bdtzVar3.b.a();
                            int a2 = bdmd.a(bdtzVar3.b.a(), z3);
                            bfch bfchVar = bdtzVar3.c;
                            bdmg bdmgVar = bdtzVar3.f;
                            eiig.x(bdmgVar);
                            bdtzVar3.k(account2, a, a2, bfchVar, eiid.j(bdmgVar), bdtzVar3.b.b(), bdtzVar3.b.c());
                        }
                        return ensm.a;
                    }
                }, ensvVar), "onRetrieveDomainAttempted Failure.", new Object[0]);
            }
        });
        this.k = activityResultRegistry.c("CREATE_DOMAIN", this, new acm(), new abt() { // from class: bdsk
            @Override // defpackage.abt
            public final void jq(Object obj) {
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                final bdtz bdtzVar2 = syncOwnerKeyChimeraActivity.m;
                final Account account = syncOwnerKeyChimeraActivity.q;
                final boolean z2 = syncOwnerKeyChimeraActivity.r;
                egmx f = egmx.f(bdtzVar2.b.d());
                eiho eihoVar = new eiho() { // from class: bdtk
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        bdtz.this.i((bdmg) obj2);
                        return null;
                    }
                };
                ensv ensvVar = bdtzVar2.a;
                dxai.a(f.h(eihoVar, ensvVar).e(Exception.class, new enqc() { // from class: bdtq
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        bdtz bdtzVar3 = bdtz.this;
                        Account account2 = account;
                        boolean z3 = z2;
                        synchronized (bdtzVar3.d) {
                            bdmb a = bdtzVar3.b.a();
                            int a2 = bdmd.a(bdtzVar3.b.a(), z3);
                            bfch bfchVar = bdtzVar3.c;
                            bdmg bdmgVar = bdtzVar3.f;
                            eiig.x(bdmgVar);
                            bdtzVar3.k(account2, a, a2, bfchVar, eiid.j(bdmgVar), bdtzVar3.b.b(), bdtzVar3.b.c());
                        }
                        return ensm.a;
                    }
                }, ensvVar), "onCreateDomainAttempted Failure.", new Object[0]);
            }
        });
        int i = ips.a;
        if (!this.o.h() || !bego.h((euhg) this.o.c())) {
            u(false);
            return;
        }
        bdtz bdtzVar2 = this.m;
        Account account = this.q;
        bdsm bdsmVar = new bdsm(this);
        bebh bebhVar = bdtzVar2.i.a;
        fixl.b(account);
        egnc.l(egmx.f(bdim.c(new bdii(account, (ensw) bebhVar.f.a(), new bdik(bebk.b())), new bdeu(bebk.b())).a(bdka.LOCK_SCREEN).g()), bdsmVar, bdtzVar2.a);
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
        this.v.setVisibility(8);
    }

    public final void s(final bdmg bdmgVar) {
        runOnUiThread(new Runnable() { // from class: bdsl
            @Override // java.lang.Runnable
            public final void run() {
                bdmg bdmgVar2 = bdmgVar;
                SyncOwnerKeyChimeraActivity syncOwnerKeyChimeraActivity = SyncOwnerKeyChimeraActivity.this;
                if (bdmgVar2 == null) {
                    syncOwnerKeyChimeraActivity.t();
                    return;
                }
                switch (bdmgVar2.b - 1) {
                    case 0:
                        if (syncOwnerKeyChimeraActivity.p.equals(bfch.c)) {
                            syncOwnerKeyChimeraActivity.v();
                            return;
                        }
                        if (fobb.j() && syncOwnerKeyChimeraActivity.n.equals(bdmb.SELF_PROVISIONED_MAINTENANCE)) {
                            syncOwnerKeyChimeraActivity.m.j();
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("USE_CASE", syncOwnerKeyChimeraActivity.n.name());
                        bundle.putString("REQUIRED_INPUT", syncOwnerKeyChimeraActivity.p.name());
                        bundle.putBoolean("IS_PERIODIC", syncOwnerKeyChimeraActivity.r);
                        int i = syncOwnerKeyChimeraActivity.t;
                        String a = bdso.a(i);
                        if (i == 0) {
                            throw null;
                        }
                        bundle.putString("OTHER_DEVICES_TO_SYNC_WITH", a);
                        if (syncOwnerKeyChimeraActivity.o.h()) {
                            bundle.putInt("FMDN_STATE_NUMBER", ((euhg) syncOwnerKeyChimeraActivity.o.c()).a());
                        }
                        bundle.putBoolean("CAN_CREATE_LSKF_DOMAIN", syncOwnerKeyChimeraActivity.s);
                        syncOwnerKeyChimeraActivity.q(bdsd.class, bundle);
                        return;
                    case 1:
                        syncOwnerKeyChimeraActivity.v();
                        return;
                    case 2:
                        SyncOwnerKeyChimeraActivity.r(bdmgVar2, syncOwnerKeyChimeraActivity.k);
                        return;
                    case 3:
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("ACCOUNT_NAME", syncOwnerKeyChimeraActivity.q.name);
                        syncOwnerKeyChimeraActivity.q(bdqu.class, bundle2);
                        return;
                    case 4:
                        SyncOwnerKeyChimeraActivity.r(bdmgVar2, syncOwnerKeyChimeraActivity.l);
                        return;
                    case 5:
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("DOMAIN_IS_UNRETRIEVABLE", false);
                        syncOwnerKeyChimeraActivity.q(bdrs.class, bundle3);
                        return;
                    case 6:
                        Bundle bundle4 = new Bundle();
                        bundle4.putBoolean("DOMAIN_IS_UNRETRIEVABLE", true);
                        syncOwnerKeyChimeraActivity.q(bdrs.class, bundle4);
                        return;
                    case 7:
                        syncOwnerKeyChimeraActivity.p();
                        return;
                    case 8:
                        syncOwnerKeyChimeraActivity.setResult(-1);
                        syncOwnerKeyChimeraActivity.p();
                        return;
                    default:
                        if (fobb.n()) {
                            Intent a2 = bfdp.a(syncOwnerKeyChimeraActivity, "com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation", "com.google.android.gms.findmydevice.spot.sync.DISMISS_KEYCHAIN_MAINTENANCE_NOTIFICATION");
                            if (a2 == null) {
                                ((ejhf) SyncOwnerKeyChimeraActivity.j.i()).x("Could not call the DismissNotificationIntentOperation service.");
                            } else {
                                syncOwnerKeyChimeraActivity.getApplicationContext().startService(a2);
                            }
                        } else {
                            bebh bebhVar = syncOwnerKeyChimeraActivity.m.i;
                            new bfcf(bebk.b()).b();
                        }
                        syncOwnerKeyChimeraActivity.setResult(-1);
                        if (syncOwnerKeyChimeraActivity.n.h) {
                            bdtz bdtzVar = syncOwnerKeyChimeraActivity.m;
                            eiig.p(bdtzVar.b != null);
                            int i2 = bdtzVar.b.l() == 3 ? 2 : true != syncOwnerKeyChimeraActivity.p.equals(bfch.a) ? 6 : 4;
                            euhg euhgVar = (euhg) syncOwnerKeyChimeraActivity.o.c();
                            Intent a3 = bfdp.a(syncOwnerKeyChimeraActivity, "com.google.android.gms.findmydevice.spot.locationreporting.ProvisionThisDeviceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.PROVISION_THIS_DEVICE");
                            if (a3 != null) {
                                a3.putExtra("enrollment_method", i2 - 1);
                                a3.putExtra("fmdn_state", euhgVar.a());
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
                        bdtz bdtzVar2 = syncOwnerKeyChimeraActivity.m;
                        eiig.p(bdtzVar2.b != null);
                        bundle5.putString("DOMAIN_TYPE", ((bdka) bdtzVar2.b.c().c()).name());
                        if (syncOwnerKeyChimeraActivity.o.h()) {
                            bundle5.putInt("FMDN_STATE_NUMBER", ((euhg) syncOwnerKeyChimeraActivity.o.c()).a());
                        }
                        int i3 = syncOwnerKeyChimeraActivity.t;
                        String a4 = bdso.a(i3);
                        if (i3 == 0) {
                            throw null;
                        }
                        bundle5.putString("OTHER_DEVICES_TO_SYNC_WITH", a4);
                        bundle5.putBoolean("CAN_CREATE_LSKF_DOMAIN", syncOwnerKeyChimeraActivity.s);
                        syncOwnerKeyChimeraActivity.q(bdrc.class, bundle5);
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
            bpVar.n(h);
            bpVar.d();
        }
        this.v.setVisibility(0);
    }

    public final void u(boolean z) {
        this.s = z;
        bdtz bdtzVar = this.m;
        if (bdtzVar.b != null) {
            s((bdmg) bdtzVar.b().hT());
            return;
        }
        try {
            Account account = this.q;
            bdmb bdmbVar = this.n;
            int a = bdmd.a(bdmbVar, this.r);
            bfch bfchVar = this.p;
            eigb eigbVar = eigb.a;
            bdtzVar.k(account, bdmbVar, a, bfchVar, eigbVar, eigbVar, eigbVar);
        } catch (RemoteException e) {
            ((ejhf) ((ejhf) j.j()).s(e)).x("Error initializing state machine");
            p();
        }
    }

    public final void v() {
        q(bdrl.class, new Bundle());
    }
}
