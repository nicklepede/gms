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
import defpackage.afp;
import defpackage.apzs;
import defpackage.auid;
import defpackage.auqx;
import defpackage.auqz;
import defpackage.aura;
import defpackage.aurb;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.catg;
import defpackage.cvts;
import defpackage.cvyt;
import defpackage.cwgc;
import defpackage.cwgj;
import defpackage.cwiw;
import defpackage.cwiz;
import defpackage.cwjb;
import defpackage.cwjd;
import defpackage.cwje;
import defpackage.cwjl;
import defpackage.cwjm;
import defpackage.cwof;
import defpackage.cwow;
import defpackage.cwqn;
import defpackage.cxgn;
import defpackage.cxhd;
import defpackage.cxhr;
import defpackage.cxhy;
import defpackage.cxog;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.enki;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fpuj;
import defpackage.fttd;
import defpackage.fttk;
import defpackage.fttx;
import defpackage.ftua;
import defpackage.ftuh;
import defpackage.ftwx;
import defpackage.ftzc;
import defpackage.ftzi;
import defpackage.fubp;
import defpackage.fubw;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeopleModuleInitIntentOperation extends apzs {
    public static final ausn a = ausn.b("PeopleInitIntentOp", auid.PEOPLE);
    private static final String[] b = {"com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity"};

    private final boolean e() {
        return Settings.Global.getInt(getApplicationContext().getContentResolver(), "device_provisioned", 0) == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        afp afpVar;
        Boolean valueOf;
        boolean r;
        Boolean valueOf2;
        if ((i & 2) != 0) {
            cvyt.i(this).B(false);
            Intent startIntent = IntentOperation.getStartIntent(this, ContactsSyncIntentOperation.class, "com.google.android.gms.people.sync.focus.contacts_sync_action");
            if (startIntent != null) {
                startService(startIntent);
            } else {
                cwof.c("PeopleInitIntentOp", "Intent was not found: ContactsSyncIntentOperation");
            }
        }
        int i2 = i & 4;
        int i3 = 8;
        int i4 = i & 8;
        byte b2 = i2 != 0;
        if (i4 != 0 || b2 != false) {
            auqz auqzVar = aura.a;
            aurb.a(this);
            cwiw.b(this);
            if (ftua.g()) {
                cxgn.a(this);
            }
            if (ftzi.g()) {
                cwqn.a(this);
            }
            if (fttd.n()) {
                try {
                    afpVar = (afp) cwgc.a(this).get();
                } catch (InterruptedException | ExecutionException e) {
                    cwof.d("CpgSchemaBuilder", "Failed to get AppSearchSession", e);
                    afpVar = null;
                }
                cwgj.b(this, afpVar);
            }
        }
        if (fubw.k()) {
            if (fubw.e()) {
                long currentTimeMillis = System.currentTimeMillis() - cvyt.i(this).a.getLong("deleted_null_contacts_cleanup_last_run_timestamp", 0L);
                fubw fubwVar = fubw.a;
                if (currentTimeMillis / 1000 >= fubwVar.lK().c()) {
                    catb catbVar = new catb();
                    catbVar.j = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
                    catbVar.t("DeletedNullContactsCleanupOneoffTask");
                    catbVar.y(2, 2);
                    catbVar.v(1);
                    catbVar.p = false;
                    catbVar.e(0L, fubwVar.lK().b());
                    catbVar.x(fubwVar.lK().h() ? 1 : 0, 1);
                    catbVar.i(fubwVar.lK().i());
                    try {
                        casd.a(this).f(catbVar.b());
                        i3 = 2;
                    } catch (IllegalArgumentException e2) {
                        cwof.d("DeletedNullContactsCleanup", "Error when scheduling the oneoff task.", e2);
                    }
                    cvts a2 = cvts.a();
                    fgrc v = enki.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    enki enkiVar = (enki) fgriVar;
                    enkiVar.c = i3 - 1;
                    enkiVar.b |= 1;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    enki enkiVar2 = (enki) v.b;
                    enkiVar2.f = 4;
                    enkiVar2.b |= 32;
                    a2.e((enki) v.Q());
                }
            }
            if (fubw.f()) {
                DeletedNullContactsCleanupChimeraService.g(this);
            } else {
                DeletedNullContactsCleanupChimeraService.d(this);
            }
        }
        if (ftuh.j()) {
            if (ftuh.e()) {
                BackupAndSyncOptInValidationChimeraService.f(this);
            } else {
                BackupAndSyncOptInValidationChimeraService.d(this);
            }
        }
        casd a3 = casd.a(this);
        int i5 = PeopleAndroidUriWipeoutTask.a;
        if (fpuj.k()) {
            catg catgVar = new catg();
            catgVar.w(".people.service.wipeout.PeopleAndroidUriWipeoutTask");
            catgVar.t("PeopleAndroidUriWipeoutTask.Periodic");
            catgVar.v(2);
            catgVar.l(false);
            catgVar.m((int) fubp.a.lK().k());
            a3.f(catgVar.b());
        } else {
            cate cateVar = new cate();
            cateVar.w(".people.service.wipeout.PeopleAndroidUriWipeoutTask");
            cateVar.t("PeopleAndroidUriWipeoutTask.Periodic");
            cateVar.v(2);
            cateVar.j(cata.a(TimeUnit.HOURS.toSeconds(fubp.a.lK().l())));
            cateVar.y(2, 2);
            cateVar.x(0, 1);
            cateVar.f(0, 1);
            a3.f(cateVar.b());
        }
        if (fttd.i()) {
            ActionPreferenceCleanupTask.d(casd.a(this));
        }
        if (fttd.k()) {
            CallingCardCleanupTask.d(casd.a(this));
        }
        if (b2 != false) {
            String[] strArr = b;
            int length = strArr.length;
            aura.H(this, strArr[0], true);
        }
        Intent startIntent2 = IntentOperation.getStartIntent(this, RegisterPhenotypeOperation.class, "com.google.android.gms.people.phenotype.PHENOTYPE_REGISTER_ACTION");
        if (startIntent2 != null) {
            startIntent2.putExtra("mendel_package_name", "com.google.android.gms.people");
            startService(startIntent2);
        }
        cwow.N();
        valueOf = Boolean.valueOf(fubp.a.lK().ar());
        if (valueOf.booleanValue()) {
            cwow.N();
            r = fubp.a.lK().av();
            Boolean.valueOf(r).getClass();
        } else {
            r = auqx.r(getApplicationContext());
        }
        if (r) {
            cwow.N();
            valueOf2 = Boolean.valueOf(fubp.a.lK().ar());
            valueOf2.booleanValue();
            boolean c = fttx.c();
            Boolean.valueOf(c).getClass();
            if (c) {
                cwjb a4 = cwjd.a();
                a4.a = "Android People Data Layer";
                a4.b = getString(R.string.people_settings_feedback_confirmation);
                a4.c();
                fttx.c();
                a4.a(getApplicationContext());
            }
            boolean h = ftua.h();
            Boolean.valueOf(h).getClass();
            if (h) {
                cwjb a5 = cwjd.a();
                a5.a = "Focus Sync Adapter 2";
                a5.b = getString(R.string.people_settings_feedback_confirmation);
                a5.c();
                ftua.h();
                a5.b(new cwjl());
                a5.b(cwiz.a);
                a5.b(cwiz.b);
                a5.b(cwiz.c);
                a5.b(cwiz.d);
                a5.b(new cwje());
                a5.a(getApplicationContext());
            }
            boolean o = fubp.o();
            Boolean.valueOf(o).getClass();
            if (o) {
                cwjb a6 = cwjd.a();
                a6.a = "Menagerie";
                a6.b = getString(R.string.people_settings_feedback_confirmation);
                a6.c();
                fubp.o();
                a6.b(new cwjm(elgo.p("owners", "ac_people", "ac_container", "ac_item", "ac_index")));
                a6.a(getApplicationContext());
            }
        } else {
            ((eluo) a.h()).x("Not initializing debuggability");
        }
        if (fttk.j()) {
            ((eluo) a.h()).x("Register contacts changed observer.");
            cxhd.a(getApplicationContext()).e();
        }
        ftwx.k();
        if (ftwx.g() && !e()) {
            cxhy a7 = cxhy.a(getApplicationContext());
            ((eluo) a.h()).x("Add the account adding listener.");
            try {
                bsup.b(getApplicationContext()).t(a7, new String[]{"com.google"});
            } catch (IllegalStateException e3) {
                ((eluo) ((eluo) a.j()).s(e3)).x("Failed to add the account listener for Preliminary sync.");
            }
        }
        cxhr.a(getApplicationContext()).c();
        if (ftwx.h() && !e()) {
            cxog.b(getApplicationContext(), new Runnable() { // from class: cvub
                @Override // java.lang.Runnable
                public final void run() {
                    ((eluo) PeopleModuleInitIntentOperation.a.h()).x("Set Provisioned timestamp");
                    cxhr.a(PeopleModuleInitIntentOperation.this.getApplicationContext()).b(System.currentTimeMillis());
                }
            });
        }
        if (ftzc.d()) {
            ftzc.a.lK().g();
        }
    }
}
