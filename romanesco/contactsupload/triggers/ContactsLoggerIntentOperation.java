package com.google.android.gms.romanesco.contactsupload.triggers;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation;
import defpackage.ahhp;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.byxq;
import defpackage.byxs;
import defpackage.cxjg;
import defpackage.cxks;
import defpackage.cxkt;
import defpackage.cxkw;
import defpackage.cxln;
import defpackage.cxme;
import defpackage.cxmf;
import defpackage.cxoo;
import defpackage.cxop;
import defpackage.dvkb;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.elbh;
import defpackage.elbs;
import defpackage.elbt;
import defpackage.elbu;
import defpackage.elbv;
import defpackage.elcc;
import defpackage.enox;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.fecj;
import defpackage.fgli;
import defpackage.fglk;
import defpackage.fmxe;
import defpackage.frrn;
import defpackage.frrq;
import defpackage.frrr;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsLoggerIntentOperation extends IntentOperation {
    public static final asot a = asot.b("DCU_IntentOperation", asej.ROMANESCO);
    private final long b = System.currentTimeMillis();

    private final void b() {
        cxks a2 = cxkt.a(getApplicationContext());
        final Long valueOf = Long.valueOf(System.currentTimeMillis());
        a2.b.b(new eiho() { // from class: cxkh
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                cxiq cxiqVar = (cxiq) obj;
                int i = cxks.c;
                fecj fecjVar = (fecj) cxiqVar.iB(5, null);
                fecjVar.X(cxiqVar);
                long longValue = valueOf.longValue();
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                cxiq cxiqVar2 = (cxiq) fecjVar.b;
                cxiq cxiqVar3 = cxiq.a;
                cxiqVar2.b |= 32;
                cxiqVar2.e = longValue;
                return (cxiq) fecjVar.Q();
            }
        }, enre.a);
    }

    private final boolean c(Intent intent) {
        long j;
        try {
            j = ((Long) ((enpf) enps.f(cxkt.a(getApplicationContext()).b.a(), new eiho() { // from class: cxjj
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return Long.valueOf(((cxiq) obj).e);
                }
            }, enre.a)).u()).longValue();
        } catch (InterruptedException | ExecutionException unused) {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        String action = intent.getAction();
        long millis = "com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action) ? TimeUnit.MINUTES.toMillis(frrq.a.a().c()) : e(action) ? TimeUnit.MINUTES.toMillis(frrq.a.a().g()) : "android.intent.action.ACTION_POWER_CONNECTED".equals(action) ? TimeUnit.HOURS.toMillis(frrq.a.a().f()) : d(action) ? TimeUnit.MINUTES.toMillis(frrq.a.a().d()) : 0L;
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

    final void a(Context context, boolean z, final fglk fglkVar, final cxkw cxkwVar) {
        fglk fglkVar2 = fglk.SYNC_REASON_DC_OPT_IN;
        cxme cxmeVar = new cxme();
        cxmeVar.b = this.b;
        if (fglkVar == fglkVar2) {
            cxmf.b(context, cxmeVar, new cxoo(context), z, true);
        } else {
            cxmf.b(context, cxmeVar, new cxoo(context), z, false);
        }
        if (cxmeVar.c) {
            final fgli fgliVar = fglkVar == fglkVar2 ? fgli.SYNC_ID_UPLOAD_CONTACTS_EXPEDITE : cxmeVar.d ? fgli.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL : fgli.SYNC_ID_UPLOAD_CONTACTS_BATCH;
            cxjg a2 = cxjg.a();
            int i = fgliVar == fgli.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL ? 3 : 5;
            elbs elbsVar = (elbs) elbv.a.v();
            if (!elbsVar.b.L()) {
                elbsVar.U();
            }
            ((elbv) elbsVar.b).c = elbt.a(7);
            if (!elbsVar.b.L()) {
                elbsVar.U();
            }
            ((elbv) elbsVar.b).d = elbu.a(i);
            elbv elbvVar = (elbv) elbsVar.Q();
            fecj v = elcc.a.v();
            if (!v.b.L()) {
                v.U();
            }
            elcc elccVar = (elcc) v.b;
            elbvVar.getClass();
            elccVar.s = elbvVar;
            elccVar.b |= 32768;
            a2.t(v);
            final byxs byxsVar = cxln.b(getApplicationContext()).a;
            ensi h = ensi.h(ensj.i(byxsVar.b(new byxq(fgliVar, null, false, null))));
            enqc enqcVar = new enqc() { // from class: cxow
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    asot asotVar = ContactsLoggerIntentOperation.a;
                    return ((drgo) obj).b(fglk.this);
                }
            };
            enre enreVar = enre.a;
            try {
                ((enpf) enps.f(enps.g(enox.f(enps.g(h, enqcVar, enreVar), Exception.class, new eiho() { // from class: cxox
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        ((ejhf) ((ejhf) ((ejhf) ContactsLoggerIntentOperation.a.i()).s((Exception) obj)).ah(9228)).x("Could not record sync trigger.");
                        return null;
                    }
                }, enreVar), new enqc() { // from class: cxoy
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        asot asotVar = ContactsLoggerIntentOperation.a;
                        final Bundle bundle = new Bundle();
                        cxkw cxkwVar2 = cxkwVar;
                        bundle.putInt("trigger_id", cxkwVar2.a);
                        bundle.putLong("trigger_timestamp", cxkwVar2.b);
                        final byxs byxsVar2 = byxs.this;
                        final fgli fgliVar2 = fgliVar;
                        return ensj.m(new Callable() { // from class: byxb
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(byxs.this.k(fgliVar2, bundle));
                            }
                        }, byxsVar2.b);
                    }
                }, enreVar), new eiho() { // from class: cxoz
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        ((ejhf) ((ejhf) ContactsLoggerIntentOperation.a.h()).ah(9229)).G("SPE one-time sync %d %s", fgli.this.e, true != ((Boolean) obj).booleanValue() ? "disabled" : "scheduled");
                        return null;
                    }
                }, enreVar)).u();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 9236)).x("Thread interrupted unexpectedly!");
            } catch (ExecutionException e2) {
                ((ejhf) ((ejhf) ((ejhf) a.i()).s(e2)).ah((char) 9235)).x("Scheduling sync failed.");
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Boolean bool;
        fmxe.a.a();
        try {
            String action = intent.getAction();
            boolean z = false;
            if (!frrr.c() && "com.google.android.gms.icing.action.CONTACT_CHANGED".equals(action)) {
                Context applicationContext = getApplicationContext();
                if (asqh.f() && new ahhp(applicationContext).a() != null) {
                    ((ejhf) ((ejhf) a.h()).ah((char) 9230)).x("Nofity BackupManager.dateChanged()");
                    BackupManager.dataChanged(applicationContext.getPackageName());
                }
                cxjg.a().l(3);
                boolean z2 = intent.getExtras().getBoolean("com.google.android.gms.icing.extra.isSignificant", false);
                if (c(intent)) {
                    try {
                        bool = (Boolean) ((enpf) cxkt.a(applicationContext).d()).u();
                    } catch (InterruptedException | ExecutionException unused) {
                        bool = false;
                    }
                    boolean booleanValue = bool.booleanValue();
                    if (!z2 || booleanValue) {
                        return;
                    }
                    cxkt.a(applicationContext).f(true);
                    return;
                }
                b();
                cxkw a2 = cxkw.a();
                if (z2) {
                    cxjg.a().m(4, a2);
                    z = true;
                } else {
                    cxjg.a().m(3, a2);
                }
                a(applicationContext, z, z ? fglk.SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT : fglk.SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT, a2);
                return;
            }
            if ("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(action)) {
                Context applicationContext2 = getApplicationContext();
                cxjg.a().l(4);
                try {
                    Thread.sleep(frrn.a.a().a());
                } catch (InterruptedException unused2) {
                }
                String stringExtra = intent.getStringExtra("com.google.android.gms.udc.extra.facsCacheAccountName");
                if (TextUtils.isEmpty(stringExtra)) {
                    ((ejhf) ((ejhf) a.j()).ah((char) 9222)).x("handleFacsCacheUpdatedIntent: account name is null or empty. Ignore it.");
                    return;
                }
                b();
                try {
                    new dvkb(cxop.a(applicationContext2)).a(intent).get();
                    try {
                        if (((Boolean) ((enpf) new cxoo(applicationContext2).c().a(new Account(stringExtra, "com.google")).i(11)).u()).booleanValue()) {
                            cxkw a3 = cxkw.a();
                            if (((Long) ((enpf) cxkt.b(getApplicationContext(), stringExtra).a()).u()).longValue() > 0) {
                                cxjg.a().m(8, a3);
                                cxkt.b(getApplicationContext(), stringExtra).b.b(new eiho() { // from class: cxjs
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj) {
                                        cxiq cxiqVar = (cxiq) obj;
                                        int i = cxks.c;
                                        fecj fecjVar = (fecj) cxiqVar.iB(5, null);
                                        fecjVar.X(cxiqVar);
                                        if (!fecjVar.b.L()) {
                                            fecjVar.U();
                                        }
                                        cxiq cxiqVar2 = (cxiq) fecjVar.b;
                                        cxiq cxiqVar3 = cxiq.a;
                                        cxiqVar2.b &= -9;
                                        cxiqVar2.c = 0L;
                                        if (!fecjVar.b.L()) {
                                            fecjVar.U();
                                        }
                                        cxiq cxiqVar4 = (cxiq) fecjVar.b;
                                        cxiqVar4.b &= -17;
                                        cxiqVar4.d = 0L;
                                        return (cxiq) fecjVar.Q();
                                    }
                                }, enre.a);
                                a(applicationContext2, true, fglk.SYNC_REASON_DC_OPT_IN, a3);
                                return;
                            }
                            cxjg.a().m(7, a3);
                            a(applicationContext2, true, fglk.SYNC_REASON_DC_OPT_IN, a3);
                            return;
                        }
                        return;
                    } catch (InterruptedException e) {
                        e = e;
                        ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 9226)).x("Exception while checking isDcOptedIn for account.");
                        return;
                    } catch (ExecutionException e2) {
                        e = e2;
                        ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 9226)).x("Exception while checking isDcOptedIn for account.");
                        return;
                    }
                } catch (InterruptedException | ExecutionException e3) {
                    ((ejhf) ((ejhf) ((ejhf) a.i()).s(e3)).ah((char) 9221)).x("Failed to handleFacsIntent.");
                    return;
                }
            }
            if (!e(action)) {
                if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                    if (!frrr.c() || !d(action)) {
                        ((ejhf) ((ejhf) a.j()).ah(9232)).B("Received unexpected broadcast: %s", action);
                        return;
                    } else {
                        ((ejhf) ((ejhf) a.h()).ah((char) 9219)).x("Started to handle CP2 update.");
                        a(getApplicationContext(), true, fglk.SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT, cxkw.a());
                        return;
                    }
                }
                Context applicationContext3 = getApplicationContext();
                cxjg.a().l(5);
                if (c(intent)) {
                    return;
                }
                b();
                cxkw a4 = cxkw.a();
                cxjg.a().m(6, a4);
                a(applicationContext3, true, fglk.SYNC_REASON_POWER_CONNECTED, a4);
                return;
            }
            ((ejhf) ((ejhf) a.h()).ah((char) 9223)).x("handleUdcSettingChanged: Udc flag is enabled");
            Context applicationContext4 = getApplicationContext();
            cxjg.a().l(4);
            if (c(intent)) {
                return;
            }
            b();
            String string = intent.getExtras().getString("com.google.android.gms.udc.extra.accountName");
            for (int i : intent.getIntArrayExtra("com.google.android.gms.udc.extra.settingIdList")) {
                if (i == 7) {
                    cxoo cxooVar = new cxoo(applicationContext4);
                    if (TextUtils.isEmpty(string)) {
                        ((ejhf) cxoo.a.j()).x("Empty Udc Account Name");
                        return;
                    }
                    try {
                        if (((Boolean) ((enpf) cxooVar.c().a(new Account(string, "com.google")).i(11)).u()).booleanValue()) {
                            cxkw a5 = cxkw.a();
                            cxjg.a().m(5, a5);
                            a(applicationContext4, true, fglk.SYNC_REASON_UDC_SETTING_CHANGED, a5);
                            return;
                        }
                        return;
                    } catch (InterruptedException e4) {
                        e = e4;
                        ((ejhf) ((ejhf) cxoo.a.i()).s(e)).x("Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS");
                        return;
                    } catch (ExecutionException e5) {
                        e = e5;
                        ((ejhf) ((ejhf) cxoo.a.i()).s(e)).x("Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS");
                        return;
                    }
                }
            }
        } catch (Exception e6) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e6)).ah((char) 9233)).x("Unable to start contactsLogger process");
            cxjg a6 = cxjg.a();
            fecj v = elbh.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((elbh) v.b).c = true;
            elbh elbhVar = (elbh) v.Q();
            fecj v2 = elcc.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            elcc elccVar = (elcc) v2.b;
            elbhVar.getClass();
            elccVar.i = elbhVar;
            elccVar.b |= 32;
            a6.t(v2);
        }
    }
}
