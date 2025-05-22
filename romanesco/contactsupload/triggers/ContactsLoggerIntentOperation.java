package com.google.android.gms.romanesco.contactsupload.triggers;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation;
import defpackage.ajif;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.cbgh;
import defpackage.cbgj;
import defpackage.cztc;
import defpackage.czuo;
import defpackage.czup;
import defpackage.czus;
import defpackage.czvj;
import defpackage.czwa;
import defpackage.czwb;
import defpackage.czyl;
import defpackage.czym;
import defpackage.dxvc;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.enou;
import defpackage.enpf;
import defpackage.enpg;
import defpackage.enph;
import defpackage.enpi;
import defpackage.enpp;
import defpackage.eqcq;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.fgrc;
import defpackage.fjag;
import defpackage.fjai;
import defpackage.fppd;
import defpackage.fuma;
import defpackage.fumd;
import defpackage.fume;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsLoggerIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("DCU_IntentOperation", auid.ROMANESCO);
    private final long b = System.currentTimeMillis();

    private final void b() {
        czuo a2 = czup.a(getApplicationContext());
        final Long valueOf = Long.valueOf(System.currentTimeMillis());
        a2.b.b(new ekut() { // from class: czud
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                czsm czsmVar = (czsm) obj;
                int i = czuo.c;
                fgrc fgrcVar = (fgrc) czsmVar.iQ(5, null);
                fgrcVar.X(czsmVar);
                long longValue = valueOf.longValue();
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                czsm czsmVar2 = (czsm) fgrcVar.b;
                czsm czsmVar3 = czsm.a;
                czsmVar2.b |= 32;
                czsmVar2.e = longValue;
                return (czsm) fgrcVar.Q();
            }
        }, eqex.a);
    }

    private final boolean c(Intent intent) {
        long j;
        try {
            j = ((Long) ((eqcy) eqdl.f(czup.a(getApplicationContext()).b.a(), new ekut() { // from class: cztf
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return Long.valueOf(((czsm) obj).e);
                }
            }, eqex.a)).u()).longValue();
        } catch (InterruptedException | ExecutionException unused) {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        String action = intent.getAction();
        long millis = "com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action) ? TimeUnit.MINUTES.toMillis(fumd.a.lK().c()) : e(action) ? TimeUnit.MINUTES.toMillis(fumd.a.lK().g()) : "android.intent.action.ACTION_POWER_CONNECTED".equals(action) ? TimeUnit.HOURS.toMillis(fumd.a.lK().f()) : d(action) ? TimeUnit.MINUTES.toMillis(fumd.a.lK().d()) : 0L;
        if (currentTimeMillis <= 0 || currentTimeMillis >= millis) {
            return false;
        }
        TimeUnit.MILLISECONDS.toMinutes(millis);
        return true;
    }

    private static boolean d(String str) {
        return "com.google.android.gms.romanesco.contactsupload.triggers.CONTACTS_PROVIDER_UPDATE".equals(str);
    }

    private static boolean e(String str) {
        return "com.google.android.gms.udc.action.SETTING_CHANGED".equals(str);
    }

    final void a(Context context, boolean z, final fjai fjaiVar, final czus czusVar) {
        fjai fjaiVar2 = fjai.SYNC_REASON_DC_OPT_IN;
        czwa czwaVar = new czwa();
        czwaVar.b = this.b;
        if (fjaiVar == fjaiVar2) {
            czwb.b(context, czwaVar, new czyl(context), z, true);
        } else {
            czwb.b(context, czwaVar, new czyl(context), z, false);
        }
        if (czwaVar.c) {
            final fjag fjagVar = fjaiVar == fjaiVar2 ? fjag.SYNC_ID_UPLOAD_CONTACTS_EXPEDITE : czwaVar.d ? fjag.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL : fjag.SYNC_ID_UPLOAD_CONTACTS_BATCH;
            cztc a2 = cztc.a();
            int i = fjagVar == fjag.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL ? 3 : 5;
            enpf enpfVar = (enpf) enpi.a.v();
            if (!enpfVar.b.L()) {
                enpfVar.U();
            }
            ((enpi) enpfVar.b).c = enpg.a(7);
            if (!enpfVar.b.L()) {
                enpfVar.U();
            }
            ((enpi) enpfVar.b).d = enph.a(i);
            enpi enpiVar = (enpi) enpfVar.Q();
            fgrc v = enpp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            enpp enppVar = (enpp) v.b;
            enpiVar.getClass();
            enppVar.s = enpiVar;
            enppVar.b |= 32768;
            a2.t(v);
            final cbgj cbgjVar = czvj.b(getApplicationContext()).a;
            eqgb h = eqgb.h(eqgc.i(cbgjVar.b(new cbgh(fjagVar, null, false, null))));
            eqdv eqdvVar = new eqdv() { // from class: czyt
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    ausn ausnVar = ContactsLoggerIntentOperation.a;
                    return ((dtqw) obj).b(fjai.this);
                }
            };
            eqex eqexVar = eqex.a;
            try {
                ((eqcy) eqdl.f(eqdl.g(eqcq.f(eqdl.g(h, eqdvVar, eqexVar), Exception.class, new ekut() { // from class: czyu
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ((eluo) ((eluo) ((eluo) ContactsLoggerIntentOperation.a.i()).s((Exception) obj)).ai(9230)).x("Could not record sync trigger.");
                        return null;
                    }
                }, eqexVar), new eqdv() { // from class: czyv
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        ausn ausnVar = ContactsLoggerIntentOperation.a;
                        final Bundle bundle = new Bundle();
                        czus czusVar2 = czusVar;
                        bundle.putInt("trigger_id", czusVar2.a);
                        bundle.putLong("trigger_timestamp", czusVar2.b);
                        final cbgj cbgjVar2 = cbgj.this;
                        final fjag fjagVar2 = fjagVar;
                        return eqgc.m(new Callable() { // from class: cbfs
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(cbgj.this.k(fjagVar2, bundle));
                            }
                        }, cbgjVar2.b);
                    }
                }, eqexVar), new ekut() { // from class: czyw
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ((eluo) ((eluo) ContactsLoggerIntentOperation.a.h()).ai(9231)).G("SPE one-time sync %d %s", fjag.this.e, true != ((Boolean) obj).booleanValue() ? "disabled" : "scheduled");
                        return null;
                    }
                }, eqexVar)).u();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 9238)).x("Thread interrupted unexpectedly!");
            } catch (ExecutionException e2) {
                ((eluo) ((eluo) ((eluo) a.i()).s(e2)).ai((char) 9237)).x("Scheduling sync failed.");
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean bool;
        fppd.a.lK();
        try {
            String action = intent.getAction();
            boolean z = false;
            if (!fume.c() && "com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                Context applicationContext = getApplicationContext();
                if (auub.f() && new ajif(applicationContext).a() != null) {
                    ((eluo) ((eluo) a.h()).ai((char) 9232)).x("Nofity BackupManager.dateChanged()");
                    BackupManager.dataChanged(applicationContext.getPackageName());
                }
                cztc.a().l(3);
                boolean z2 = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                if (c(intent)) {
                    try {
                        bool = (Boolean) ((eqcy) czup.a(applicationContext).d()).u();
                    } catch (InterruptedException | ExecutionException unused) {
                        bool = false;
                    }
                    boolean booleanValue = bool.booleanValue();
                    if (!z2 || booleanValue) {
                        return;
                    }
                    czup.a(applicationContext).f(true);
                    return;
                }
                b();
                czus a2 = czus.a();
                if (z2) {
                    cztc.a().m(4, a2);
                    z = true;
                } else {
                    cztc.a().m(3, a2);
                }
                a(applicationContext, z, z ? fjai.SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT : fjai.SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT, a2);
                return;
            }
            if ("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(action)) {
                Context applicationContext2 = getApplicationContext();
                cztc.a().l(4);
                try {
                    Thread.sleep(fuma.a.lK().a());
                } catch (InterruptedException unused2) {
                }
                String stringExtra = intent.getStringExtra("com.google.android.gms.udc.extra.facsCacheAccountName");
                if (TextUtils.isEmpty(stringExtra)) {
                    ((eluo) ((eluo) a.j()).ai((char) 9224)).x("handleFacsCacheUpdatedIntent: account name is null or empty. Ignore it.");
                    return;
                }
                b();
                try {
                    new dxvc(czym.a(applicationContext2)).a(intent).get();
                    try {
                        if (((Boolean) ((eqcy) new czyl(applicationContext2).c().a(new Account(stringExtra, "com.google")).i(11)).u()).booleanValue()) {
                            czus a3 = czus.a();
                            if (((Long) ((eqcy) czup.b(getApplicationContext(), stringExtra).a()).u()).longValue() > 0) {
                                cztc.a().m(8, a3);
                                czup.b(getApplicationContext(), stringExtra).b.b(new ekut() { // from class: czto
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj) {
                                        czsm czsmVar = (czsm) obj;
                                        int i = czuo.c;
                                        fgrc fgrcVar = (fgrc) czsmVar.iQ(5, null);
                                        fgrcVar.X(czsmVar);
                                        if (!fgrcVar.b.L()) {
                                            fgrcVar.U();
                                        }
                                        czsm czsmVar2 = (czsm) fgrcVar.b;
                                        czsm czsmVar3 = czsm.a;
                                        czsmVar2.b &= -9;
                                        czsmVar2.c = 0L;
                                        if (!fgrcVar.b.L()) {
                                            fgrcVar.U();
                                        }
                                        czsm czsmVar4 = (czsm) fgrcVar.b;
                                        czsmVar4.b &= -17;
                                        czsmVar4.d = 0L;
                                        return (czsm) fgrcVar.Q();
                                    }
                                }, eqex.a);
                                a(applicationContext2, true, fjai.SYNC_REASON_DC_OPT_IN, a3);
                                return;
                            }
                            cztc.a().m(7, a3);
                            a(applicationContext2, true, fjai.SYNC_REASON_DC_OPT_IN, a3);
                            return;
                        }
                        return;
                    } catch (InterruptedException e) {
                        e = e;
                        ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 9228)).x("Exception while checking isDcOptedIn for account.");
                        return;
                    } catch (ExecutionException e2) {
                        e = e2;
                        ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 9228)).x("Exception while checking isDcOptedIn for account.");
                        return;
                    }
                } catch (InterruptedException | ExecutionException e3) {
                    ((eluo) ((eluo) ((eluo) a.i()).s(e3)).ai((char) 9223)).x("Failed to handleFacsIntent.");
                    return;
                }
            }
            if (!e(action)) {
                if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                    if (!fume.c() || !d(action)) {
                        ((eluo) ((eluo) a.j()).ai(9234)).B("Received unexpected broadcast: %s", action);
                        return;
                    } else {
                        ((eluo) ((eluo) a.h()).ai((char) 9221)).x("Started to handle CP2 update.");
                        a(getApplicationContext(), true, fjai.SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT, czus.a());
                        return;
                    }
                }
                Context applicationContext3 = getApplicationContext();
                cztc.a().l(5);
                if (c(intent)) {
                    return;
                }
                b();
                czus a4 = czus.a();
                cztc.a().m(6, a4);
                a(applicationContext3, true, fjai.SYNC_REASON_POWER_CONNECTED, a4);
                return;
            }
            ((eluo) ((eluo) a.h()).ai((char) 9225)).x("handleUdcSettingChanged: Udc flag is enabled");
            Context applicationContext4 = getApplicationContext();
            cztc.a().l(4);
            if (c(intent)) {
                return;
            }
            b();
            String string = intent.getExtras().getString("com.google.android.gms.udc.extra.accountName");
            for (int i : intent.getIntArrayExtra("com.google.android.gms.udc.extra.settingIdList")) {
                if (i == 7) {
                    czyl czylVar = new czyl(applicationContext4);
                    if (TextUtils.isEmpty(string)) {
                        ((eluo) czyl.a.j()).x("Empty Udc Account Name");
                        return;
                    }
                    try {
                        if (((Boolean) ((eqcy) czylVar.c().a(new Account(string, "com.google")).i(11)).u()).booleanValue()) {
                            czus a5 = czus.a();
                            cztc.a().m(5, a5);
                            a(applicationContext4, true, fjai.SYNC_REASON_UDC_SETTING_CHANGED, a5);
                            return;
                        }
                        return;
                    } catch (InterruptedException e4) {
                        e = e4;
                        ((eluo) ((eluo) czyl.a.i()).s(e)).x("Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS");
                        return;
                    } catch (ExecutionException e5) {
                        e = e5;
                        ((eluo) ((eluo) czyl.a.i()).s(e)).x("Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS");
                        return;
                    }
                }
            }
        } catch (Exception e6) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e6)).ai((char) 9235)).x("Unable to start contactsLogger process");
            cztc a6 = cztc.a();
            fgrc v = enou.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((enou) v.b).c = true;
            enou enouVar = (enou) v.Q();
            fgrc v2 = enpp.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            enpp enppVar = (enpp) v2.b;
            enouVar.getClass();
            enppVar.i = enouVar;
            enppVar.b |= 32;
            a6.t(v2);
        }
    }
}
