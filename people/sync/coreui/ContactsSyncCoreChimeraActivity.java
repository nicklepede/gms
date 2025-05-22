package com.google.android.gms.people.sync.coreui;

import android.accounts.Account;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.people.AppContextProvider;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;
import defpackage.auid;
import defpackage.aupz;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.cvso;
import defpackage.cvsp;
import defpackage.cwdy;
import defpackage.cwwm;
import defpackage.cwzz;
import defpackage.cxag;
import defpackage.cxaw;
import defpackage.cxbk;
import defpackage.cxco;
import defpackage.cxhe;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dvww;
import defpackage.dwix;
import defpackage.dwjl;
import defpackage.dwug;
import defpackage.edxt;
import defpackage.ekus;
import defpackage.eqgo;
import defpackage.fc;
import defpackage.fttk;
import defpackage.ftwe;
import defpackage.ftyy;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsSyncCoreChimeraActivity extends rxx implements cwwm, fc {
    public static final ausn j = ausn.b("SyncCoreActivity", auid.PEOPLE);
    public cwzz k;
    public boolean l;
    public final cxag m = new cxag();
    private dvww n;
    private cvsp o;
    private eqgo p;

    @Override // defpackage.fc
    public final void a(String str, Bundle bundle) {
        if (ekus.a(str, "SimImportContainerFragment")) {
            ausn ausnVar = cxaw.a;
            if (!cxbk.d(bundle)) {
                getSupportFragmentManager().as();
                return;
            }
            cwzz cwzzVar = this.k;
            Account account = (Account) cwzzVar.h.ii();
            if (account != null) {
                cwzzVar.n.b(account);
            }
        }
    }

    @Override // defpackage.cwwm
    public final dvww b() {
        return (dvww) Objects.requireNonNull(this.n);
    }

    @Override // defpackage.rxx
    public final boolean hK() {
        if (getSupportFragmentManager().b() == 0) {
            return super.hK();
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fttk.r()) {
            finish();
            return;
        }
        if (ftwe.a.lK().a() && auqx.w(auqx.h(this, getPackageName())).length <= 0) {
            Toast.makeText(this, R.string.people_contacts_sync_no_account_message, 1).show();
            finish();
            return;
        }
        setTheme(R.style.ContactsCoreUiThemeGm3);
        getContainerActivity();
        int i = edxt.a;
        setContentView(R.layout.contacts_sync_core_activity);
        this.k = (cwzz) new jxw(this, cxco.d(this)).a(cwzz.class);
        if (bundle == null && getIntent().hasExtra("authAccount")) {
            this.k.h.h = getIntent().getStringExtra("authAccount");
        }
        if (ftyy.f() && getIntent().hasExtra("unsync_notification")) {
            String stringExtra = getIntent().getStringExtra("authAccount");
            int intExtra = getIntent().getIntExtra("num_unsync_notification_sent", -1);
            if (intExtra > 0) {
                cxhe.a(stringExtra, intExtra, 3);
            }
        }
        this.k.i.g(this, new jvs() { // from class: cwyl
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = ContactsSyncCoreChimeraActivity.this;
                dwiw dwiwVar = (dwiw) contactsSyncCoreChimeraActivity.k.c.ii();
                bp bpVar = new bp(contactsSyncCoreChimeraActivity.getSupportFragmentManager());
                bpVar.A(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                if (intValue == 0) {
                    bpVar.z(R.id.root, new cwze(), "SyncCoreFragment");
                } else if (intValue == 1) {
                    bpVar.z(R.id.root, new cwxk(), "AccountSyncFragment");
                } else if (intValue == 2) {
                    bpVar.z(R.id.root, cwyb.x(false), "BackupSyncFragment");
                } else if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            return;
                        } else {
                            bpVar.z(R.id.root, cwyb.x(true), "BackupSyncFragment");
                        }
                    } else if (dwiwVar != null) {
                        Account account = new Account(dwiwVar.c, "com.google");
                        int i2 = cxbc.a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("account", account);
                        cxbc cxbcVar = new cxbc();
                        cxbcVar.setArguments(bundle2);
                        bpVar.z(R.id.root, cxbcVar, "SimImportContainerFragment");
                        bpVar.o(cxbcVar);
                    }
                } else if (dwiwVar != null) {
                    Account account2 = new Account(dwiwVar.c, "com.google");
                    ausn ausnVar = cxck.a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("account", account2);
                    cxck cxckVar = new cxck();
                    cxckVar.setArguments(bundle3);
                    bpVar.z(R.id.root, cxckVar, "TrashContactsFragment");
                }
                if (!contactsSyncCoreChimeraActivity.l) {
                    bpVar.w(null);
                }
                contactsSyncCoreChimeraActivity.l = false;
                bpVar.b();
            }
        });
        cvso cvsoVar = new cvso();
        cvsoVar.a = 80;
        cvsp a = cvsoVar.a();
        this.o = a;
        cwdy cwdyVar = new cwdy(this, a);
        this.p = new aupz(Integer.MAX_VALUE, 9);
        this.n = new dvww(this, this.p, new dwix(), new dwjl(AppContextProvider.a(), dwug.a()));
        getSupportFragmentManager().ac("SimImportContainerFragment", this, this);
        boolean isEmpty = getSupportFragmentManager().o().isEmpty();
        this.l = isEmpty;
        if (bundle == null || isEmpty) {
            fttk.a.lK().U();
            String action = getIntent().getAction();
            if ("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS".equals(action)) {
                this.k.c();
            } else {
                if (!"com.google.android.gms.people.sync.CONTACTS_BACKUP_SYNC_SETTINGS".equals(action)) {
                    this.k.g();
                    return;
                }
                dhlw a2 = cwdyVar.a();
                a2.z(new dhlq() { // from class: cwym
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) obj;
                        int c = cxag.c(backupAndSyncOptInState);
                        fgrc v = enly.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        enly enlyVar = (enly) fgriVar;
                        enlyVar.c = 3;
                        enlyVar.b |= 1;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        fgri fgriVar2 = v.b;
                        enly enlyVar2 = (enly) fgriVar2;
                        enlyVar2.d = 1;
                        enlyVar2.b |= 2;
                        if (!fgriVar2.L()) {
                            v.U();
                        }
                        enly enlyVar3 = (enly) v.b;
                        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = ContactsSyncCoreChimeraActivity.this;
                        enlyVar3.e = c - 1;
                        enlyVar3.b |= 4;
                        contactsSyncCoreChimeraActivity.m.d(2, (enly) v.Q(), null);
                        if (cxcn.n(backupAndSyncOptInState)) {
                            contactsSyncCoreChimeraActivity.k.c();
                        } else if (cxcn.o(backupAndSyncOptInState)) {
                            contactsSyncCoreChimeraActivity.k.f();
                        } else {
                            contactsSyncCoreChimeraActivity.k.e();
                        }
                    }
                });
                a2.y(new dhln() { // from class: cwyn
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        fgrc v = enly.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        enly enlyVar = (enly) fgriVar;
                        enlyVar.c = 3;
                        enlyVar.b |= 1;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = ContactsSyncCoreChimeraActivity.this;
                        enly enlyVar2 = (enly) v.b;
                        enlyVar2.d = 2;
                        enlyVar2.b |= 2;
                        contactsSyncCoreChimeraActivity.m.d(2, (enly) v.Q(), null);
                        ((eluo) ((eluo) ContactsSyncCoreChimeraActivity.j.i()).s(exc)).x("BackupClient failure");
                        contactsSyncCoreChimeraActivity.k.c();
                    }
                });
            }
        }
    }
}
