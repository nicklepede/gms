package com.google.android.gms.people.sync.coreui;

import android.accounts.Account;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.people.AppContextProvider;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asnd;
import defpackage.asot;
import defpackage.ctji;
import defpackage.ctjj;
import defpackage.ctus;
import defpackage.cunf;
import defpackage.cuqs;
import defpackage.cuqz;
import defpackage.curp;
import defpackage.cusd;
import defpackage.cuth;
import defpackage.cuxw;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dtmk;
import defpackage.dtyl;
import defpackage.dtyz;
import defpackage.duju;
import defpackage.eble;
import defpackage.eihn;
import defpackage.ensv;
import defpackage.fc;
import defpackage.fqzp;
import defpackage.frcj;
import defpackage.frfd;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsSyncCoreChimeraActivity extends qet implements cunf, fc {
    public static final asot j = asot.b("SyncCoreActivity", asej.PEOPLE);
    public cuqs k;
    public boolean l;
    public final cuqz m = new cuqz();
    private dtmk n;
    private ctjj o;
    private ensv p;

    @Override // defpackage.fc
    public final void a(String str, Bundle bundle) {
        if (eihn.a(str, "SimImportContainerFragment")) {
            asot asotVar = curp.a;
            if (!cusd.d(bundle)) {
                getSupportFragmentManager().as();
                return;
            }
            cuqs cuqsVar = this.k;
            Account account = (Account) cuqsVar.h.hT();
            if (account != null) {
                cuqsVar.n.b(account);
            }
        }
    }

    @Override // defpackage.cunf
    public final dtmk b() {
        return (dtmk) Objects.requireNonNull(this.n);
    }

    @Override // defpackage.qet
    public final boolean hu() {
        if (getSupportFragmentManager().b() == 0) {
            return super.hu();
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fqzp.r()) {
            finish();
            return;
        }
        if (frcj.a.a().a() && asnd.w(asnd.h(this, getPackageName())).length <= 0) {
            Toast.makeText(this, R.string.people_contacts_sync_no_account_message, 1).show();
            finish();
            return;
        }
        setTheme(R.style.ContactsCoreUiThemeGm3);
        getContainerActivity();
        int i = eble.a;
        setContentView(R.layout.contacts_sync_core_activity);
        this.k = (cuqs) new jrh(this, cuth.d(this)).a(cuqs.class);
        if (bundle == null && getIntent().hasExtra("authAccount")) {
            this.k.h.h = getIntent().getStringExtra("authAccount");
        }
        if (frfd.f() && getIntent().hasExtra("unsync_notification")) {
            String stringExtra = getIntent().getStringExtra("authAccount");
            int intExtra = getIntent().getIntExtra("num_unsync_notification_sent", -1);
            if (intExtra > 0) {
                cuxw.a(stringExtra, intExtra, 3);
            }
        }
        this.k.i.g(this, new jpd() { // from class: cupe
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = ContactsSyncCoreChimeraActivity.this;
                dtyk dtykVar = (dtyk) contactsSyncCoreChimeraActivity.k.c.hT();
                bp bpVar = new bp(contactsSyncCoreChimeraActivity.getSupportFragmentManager());
                bpVar.A(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                if (intValue == 0) {
                    bpVar.z(R.id.root, new cupx(), "SyncCoreFragment");
                } else if (intValue == 1) {
                    bpVar.z(R.id.root, new cuod(), "AccountSyncFragment");
                } else if (intValue == 2) {
                    bpVar.z(R.id.root, cuou.x(false), "BackupSyncFragment");
                } else if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            return;
                        } else {
                            bpVar.z(R.id.root, cuou.x(true), "BackupSyncFragment");
                        }
                    } else if (dtykVar != null) {
                        Account account = new Account(dtykVar.c, "com.google");
                        int i2 = curv.a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("account", account);
                        curv curvVar = new curv();
                        curvVar.setArguments(bundle2);
                        bpVar.z(R.id.root, curvVar, "SimImportContainerFragment");
                        bpVar.p(curvVar);
                    }
                } else if (dtykVar != null) {
                    Account account2 = new Account(dtykVar.c, "com.google");
                    asot asotVar = cutd.a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("account", account2);
                    cutd cutdVar = new cutd();
                    cutdVar.setArguments(bundle3);
                    bpVar.z(R.id.root, cutdVar, "TrashContactsFragment");
                }
                if (!contactsSyncCoreChimeraActivity.l) {
                    bpVar.w(null);
                }
                contactsSyncCoreChimeraActivity.l = false;
                bpVar.b();
            }
        });
        ctji ctjiVar = new ctji();
        ctjiVar.a = 80;
        ctjj a = ctjiVar.a();
        this.o = a;
        ctus ctusVar = new ctus(this, a);
        this.p = new asmf(Integer.MAX_VALUE, 9);
        this.n = new dtmk(this, this.p, new dtyl(), new dtyz(AppContextProvider.a(), duju.a()));
        getSupportFragmentManager().ac("SimImportContainerFragment", this, this);
        boolean isEmpty = getSupportFragmentManager().o().isEmpty();
        this.l = isEmpty;
        if (bundle == null || isEmpty) {
            fqzp.a.a().V();
            String action = getIntent().getAction();
            if ("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS".equals(action)) {
                this.k.c();
            } else {
                if (!"com.google.android.gms.people.sync.CONTACTS_BACKUP_SYNC_SETTINGS".equals(action)) {
                    this.k.g();
                    return;
                }
                dfaq a2 = ctusVar.a();
                a2.z(new dfak() { // from class: cupf
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) obj;
                        int c = cuqz.c(backupAndSyncOptInState);
                        fecj v = ekym.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        ekym ekymVar = (ekym) fecpVar;
                        ekymVar.c = 3;
                        ekymVar.b |= 1;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        fecp fecpVar2 = v.b;
                        ekym ekymVar2 = (ekym) fecpVar2;
                        ekymVar2.d = 1;
                        ekymVar2.b |= 2;
                        if (!fecpVar2.L()) {
                            v.U();
                        }
                        ekym ekymVar3 = (ekym) v.b;
                        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = ContactsSyncCoreChimeraActivity.this;
                        ekymVar3.e = c - 1;
                        ekymVar3.b |= 4;
                        contactsSyncCoreChimeraActivity.m.d(2, (ekym) v.Q(), null);
                        if (cutg.n(backupAndSyncOptInState)) {
                            contactsSyncCoreChimeraActivity.k.c();
                        } else if (cutg.o(backupAndSyncOptInState)) {
                            contactsSyncCoreChimeraActivity.k.f();
                        } else {
                            contactsSyncCoreChimeraActivity.k.e();
                        }
                    }
                });
                a2.y(new dfah() { // from class: cupg
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        fecj v = ekym.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        ekym ekymVar = (ekym) fecpVar;
                        ekymVar.c = 3;
                        ekymVar.b |= 1;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity = ContactsSyncCoreChimeraActivity.this;
                        ekym ekymVar2 = (ekym) v.b;
                        ekymVar2.d = 2;
                        ekymVar2.b |= 2;
                        contactsSyncCoreChimeraActivity.m.d(2, (ekym) v.Q(), null);
                        ((ejhf) ((ejhf) ContactsSyncCoreChimeraActivity.j.i()).s(exc)).x("BackupClient failure");
                        contactsSyncCoreChimeraActivity.k.c();
                    }
                });
            }
        }
    }
}
