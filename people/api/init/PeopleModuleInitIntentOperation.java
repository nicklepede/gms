package com.google.android.gms.people.api.init;

import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.people.api.init.PeopleModuleInitIntentOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;
import com.google.android.gms.people.service.BackupAndSyncOptInValidationChimeraService;
import com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService;
import com.google.android.gms.people.service.cpg.ActionPreferenceCleanupTask;
import com.google.android.gms.people.service.cpg.callingcard.CallingCardCleanupTask;
import com.google.android.gms.people.service.wipeout.PeopleAndroidUriWipeoutTask;
import com.google.android.gms.people.sync.focus.ContactsSyncIntentOperation;
import defpackage.afk;
import defpackage.anya;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asnf;
import defpackage.asng;
import defpackage.asnh;
import defpackage.asot;
import defpackage.bqna;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.byko;
import defpackage.ctkm;
import defpackage.ctpn;
import defpackage.ctww;
import defpackage.ctxd;
import defpackage.ctzp;
import defpackage.ctzs;
import defpackage.ctzu;
import defpackage.ctzw;
import defpackage.ctzx;
import defpackage.cuae;
import defpackage.cuaf;
import defpackage.cuey;
import defpackage.cufp;
import defpackage.cuhg;
import defpackage.cuxf;
import defpackage.cuxv;
import defpackage.cuyj;
import defpackage.cuyq;
import defpackage.cvex;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.ekww;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fnck;
import defpackage.fqzi;
import defpackage.fqzp;
import defpackage.frac;
import defpackage.fraf;
import defpackage.fram;
import defpackage.frdc;
import defpackage.frfh;
import defpackage.frfn;
import defpackage.frhu;
import defpackage.frib;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleModuleInitIntentOperation extends anya {
    public static final asot a = asot.b("PeopleInitIntentOp", asej.PEOPLE);
    private static final String[] b = {"com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity"};

    private final boolean e() {
        return Settings.Global.getInt(getApplicationContext().getContentResolver(), "device_provisioned", 0) == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        afk afkVar;
        Boolean valueOf;
        boolean r;
        Boolean valueOf2;
        if ((i & 2) != 0) {
            ctpn.i(this).B(false);
            Intent startIntent = IntentOperation.getStartIntent(this, ContactsSyncIntentOperation.class, "com.google.android.gms.people.sync.focus.contacts_sync_action");
            if (startIntent != null) {
                startService(startIntent);
            } else {
                cuey.c("PeopleInitIntentOp", "Intent was not found: ContactsSyncIntentOperation");
            }
        }
        int i2 = i & 4;
        int i3 = 8;
        int i4 = i & 8;
        byte b2 = i2 != 0;
        if (i4 != 0 || b2 != false) {
            asnf asnfVar = asng.a;
            asnh.a(this);
            ctzp.b(this);
            if (fraf.g()) {
                cuxf.a(this);
            }
            if (frfn.g()) {
                cuhg.a(this);
            }
            if (fqzi.n()) {
                try {
                    afkVar = (afk) ctww.a(this).get();
                } catch (InterruptedException | ExecutionException e) {
                    cuey.d("CpgSchemaBuilder", "Failed to get AppSearchSession", e);
                    afkVar = null;
                }
                ctxd.b(this, afkVar);
            }
        }
        if (frib.k()) {
            if (frib.e()) {
                if ((System.currentTimeMillis() - ctpn.i(this).a.getLong("deleted_null_contacts_cleanup_last_run_timestamp", 0L)) / 1000 >= frib.a.a().c()) {
                    bykj bykjVar = new bykj();
                    bykjVar.j = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
                    bykjVar.t("DeletedNullContactsCleanupOneoffTask");
                    bykjVar.y(2, 2);
                    bykjVar.v(1);
                    bykjVar.p = false;
                    frib fribVar = frib.a;
                    bykjVar.e(0L, fribVar.a().b());
                    bykjVar.x(fribVar.a().h() ? 1 : 0, 1);
                    bykjVar.i(fribVar.a().i());
                    try {
                        byjl.a(this).f(bykjVar.b());
                        i3 = 2;
                    } catch (IllegalArgumentException e2) {
                        cuey.d("DeletedNullContactsCleanup", "Error when scheduling the oneoff task.", e2);
                    }
                    ctkm a2 = ctkm.a();
                    fecj v = ekww.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    ekww ekwwVar = (ekww) fecpVar;
                    ekwwVar.c = i3 - 1;
                    ekwwVar.b |= 1;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    ekww ekwwVar2 = (ekww) v.b;
                    ekwwVar2.f = 4;
                    ekwwVar2.b |= 32;
                    a2.e((ekww) v.Q());
                }
            }
            if (frib.f()) {
                DeletedNullContactsCleanupChimeraService.g(this);
            } else {
                DeletedNullContactsCleanupChimeraService.d(this);
            }
        }
        if (fram.j()) {
            if (fram.e()) {
                BackupAndSyncOptInValidationChimeraService.f(this);
            } else {
                BackupAndSyncOptInValidationChimeraService.d(this);
            }
        }
        byjl a3 = byjl.a(this);
        int i5 = PeopleAndroidUriWipeoutTask.a;
        if (fnck.k()) {
            byko bykoVar = new byko();
            bykoVar.w(".people.service.wipeout.PeopleAndroidUriWipeoutTask");
            bykoVar.t("PeopleAndroidUriWipeoutTask.Periodic");
            bykoVar.v(2);
            bykoVar.l(false);
            bykoVar.m((int) frhu.a.a().k());
            a3.f(bykoVar.b());
        } else {
            bykm bykmVar = new bykm();
            bykmVar.w(".people.service.wipeout.PeopleAndroidUriWipeoutTask");
            bykmVar.t("PeopleAndroidUriWipeoutTask.Periodic");
            bykmVar.v(2);
            bykmVar.j(byki.a(TimeUnit.HOURS.toSeconds(frhu.a.a().l())));
            bykmVar.y(2, 2);
            bykmVar.x(0, 1);
            bykmVar.f(0, 1);
            a3.f(bykmVar.b());
        }
        if (fqzi.i()) {
            ActionPreferenceCleanupTask.d(byjl.a(this));
        }
        if (fqzi.k()) {
            CallingCardCleanupTask.d(byjl.a(this));
        }
        if (b2 != false) {
            String[] strArr = b;
            int length = strArr.length;
            asng.H(this, strArr[0], true);
        }
        Intent startIntent2 = IntentOperation.getStartIntent(this, RegisterPhenotypeOperation.class, "com.google.android.gms.people.phenotype.PHENOTYPE_REGISTER_ACTION");
        if (startIntent2 != null) {
            startIntent2.putExtra("mendel_package_name", "com.google.android.gms.people");
            startService(startIntent2);
        }
        cufp.O();
        valueOf = Boolean.valueOf(frhu.a.a().as());
        if (valueOf.booleanValue()) {
            cufp.O();
            r = frhu.a.a().aw();
            Boolean.valueOf(r).getClass();
        } else {
            r = asnd.r(getApplicationContext());
        }
        if (r) {
            cufp.O();
            valueOf2 = Boolean.valueOf(frhu.a.a().as());
            valueOf2.booleanValue();
            boolean c = frac.c();
            Boolean.valueOf(c).getClass();
            if (c) {
                ctzu a4 = ctzw.a();
                a4.a = "Android People Data Layer";
                a4.b = getString(R.string.people_settings_feedback_confirmation);
                a4.c();
                frac.c();
                a4.a(getApplicationContext());
            }
            boolean h = fraf.h();
            Boolean.valueOf(h).getClass();
            if (h) {
                ctzu a5 = ctzw.a();
                a5.a = "Focus Sync Adapter 2";
                a5.b = getString(R.string.people_settings_feedback_confirmation);
                a5.c();
                fraf.h();
                a5.b(new cuae());
                a5.b(ctzs.a);
                a5.b(ctzs.b);
                a5.b(ctzs.c);
                a5.b(ctzs.d);
                a5.b(new ctzx());
                a5.a(getApplicationContext());
            }
            boolean p = frhu.p();
            Boolean.valueOf(p).getClass();
            if (p) {
                ctzu a6 = ctzw.a();
                a6.a = "Menagerie";
                a6.b = getString(R.string.people_settings_feedback_confirmation);
                a6.c();
                frhu.p();
                a6.b(new cuaf(eitj.p("owners", "ac_people", "ac_container", "ac_item", "ac_index")));
                a6.a(getApplicationContext());
            }
        } else {
            ((ejhf) a.h()).x("Not initializing debuggability");
        }
        if (fqzp.j()) {
            ((ejhf) a.h()).x("Register contacts changed observer.");
            cuxv.a(getApplicationContext()).e();
        }
        frdc.k();
        if (frdc.g() && !e()) {
            cuyq a7 = cuyq.a(getApplicationContext());
            ((ejhf) a.h()).x("Add the account adding listener.");
            try {
                bqna.b(getApplicationContext()).t(a7, new String[]{"com.google"});
            } catch (IllegalStateException e3) {
                ((ejhf) ((ejhf) a.j()).s(e3)).x("Failed to add the account listener for Preliminary sync.");
            }
        }
        cuyj.a(getApplicationContext()).c();
        if (frdc.h() && !e()) {
            cvex.b(getApplicationContext(), new Runnable() { // from class: ctkv
                @Override // java.lang.Runnable
                public final void run() {
                    ((ejhf) PeopleModuleInitIntentOperation.a.h()).x("Set Provisioned timestamp");
                    cuyj.a(PeopleModuleInitIntentOperation.this.getApplicationContext()).b(System.currentTimeMillis());
                }
            });
        }
        if (frfh.d()) {
            frfh.a.a().g();
        }
    }
}
