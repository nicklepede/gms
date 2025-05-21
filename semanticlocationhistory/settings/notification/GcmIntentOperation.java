package com.google.android.gms.semanticlocationhistory.settings.notification;

import android.accounts.Account;
import android.content.Intent;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.semanticlocationhistory.settings.SettingsSyncOneOffService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czuo;
import defpackage.czuq;
import defpackage.czuw;
import defpackage.dbkw;
import defpackage.dbln;
import defpackage.dbnr;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.enti;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.etnz;
import defpackage.etoc;
import defpackage.etow;
import defpackage.etoy;
import defpackage.etoz;
import defpackage.etqp;
import defpackage.evnn;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feea;
import defpackage.fefi;
import defpackage.fegw;
import defpackage.fegx;
import defpackage.frxn;
import defpackage.frxq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GcmIntentOperation extends IntentOperation {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "Notification");
    private czlk b;
    private czje c;
    private dbkw d;

    public static final erdd b(Throwable th) {
        return new erdd(erdc.NO_USER_DATA, th.getMessage());
    }

    private final czlk c() {
        if (this.b == null) {
            this.b = new czlk(a());
        }
        return this.b;
    }

    private final dbkw d() {
        if (this.d == null) {
            this.d = new dbkw();
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(evnn evnnVar) {
        czuq czuqVar;
        enss enssVar;
        Account account = new Account(evnnVar.b, "com.google");
        if (frxq.h()) {
            czuw g = c().g();
            String str = account.name;
            czuqVar = czuq.a;
            str.getClass();
            feea feeaVar = g.c;
            if (feeaVar.containsKey(str)) {
                czuqVar = (czuq) feeaVar.get(str);
            }
        } else {
            czuqVar = (czuq) c().h().getOrDefault(account.name, czuq.a);
        }
        etqp etqpVar = evnnVar.c;
        if (etqpVar == null) {
            etqpVar = etqp.a;
        }
        fefi fefiVar = etqpVar.c;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        if (fegw.a(fefiVar, fegx.h(czuqVar.t)) >= 0) {
            try {
                if (!c().R(account) && c().O(account)) {
                    etqp etqpVar2 = evnnVar.c;
                    if (etqpVar2 == null) {
                        etqpVar2 = etqp.a;
                    }
                    etoc etocVar = etqpVar2.d;
                    if (etocVar == null) {
                        etocVar = etoc.a;
                    }
                    etnz etnzVar = etocVar.b;
                    if (etnzVar == null) {
                        etnzVar = etnz.a;
                    }
                    if (etnzVar.b) {
                        a().e("NotificationScheduleManualSync");
                        SettingsSyncOneOffService.g(AppContextProvider.a());
                    }
                }
                dbkw d = d();
                etqp etqpVar3 = evnnVar.c;
                if (etqpVar3 == null) {
                    etqpVar3 = etqp.a;
                }
                if (((Boolean) ((enpf) d.a(account, etqpVar3)).v(frxn.l(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    a().e("NotificationStoreSettingSuccess");
                } else {
                    a().e("NotificationStoreSettingFailure");
                    ((ejhf) ((ejhf) a.i()).ah(10826)).x("Failed to save settings from notification");
                }
                d().f();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                a().e("NotificationStoreSettingFailure");
                ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 10827)).B("Failed to save settings from notification %s", b(e));
            }
        } else {
            a().e("NotificationStaleSetting");
        }
        etqp etqpVar4 = evnnVar.c;
        if (etqpVar4 == null) {
            etqpVar4 = etqp.a;
        }
        fefi fefiVar2 = etqpVar4.f;
        if (fefiVar2 == null) {
            fefiVar2 = fefi.a;
        }
        if (fegw.a(fefiVar2, fegx.h(czuqVar.i)) > 0) {
            ensj.t(d().b(account), new dbln(this), enre.a);
        }
        if (frxq.a.a().J()) {
            etqp etqpVar5 = evnnVar.c;
            if (etqpVar5 == null) {
                etqpVar5 = etqp.a;
            }
            etoz etozVar = etqpVar5.g;
            if (etozVar == null) {
                etozVar = etoz.a;
            }
            fefi fefiVar3 = etozVar.e;
            if (fefiVar3 == null) {
                fefiVar3 = fefi.a;
            }
            czuo czuoVar = czuqVar.q;
            if (czuoVar == null) {
                czuoVar = czuo.a;
            }
            if (fegw.a(fefiVar3, fegx.h(czuoVar.h)) >= 0) {
                a().p("NotificationSyncMigrationInfoUpdateLatency", dbnr.a(-60L, 1440L, 60L, TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - fegx.b(fefiVar3))));
                try {
                    dbkw d2 = d();
                    etqp etqpVar6 = evnnVar.c;
                    if (etqpVar6 == null) {
                        etqpVar6 = etqp.a;
                    }
                    enti entiVar = new enti(enre.a);
                    if ((etqpVar6.b & 128) != 0) {
                        czlk czlkVar = d2.b;
                        etoz etozVar2 = etqpVar6.g;
                        int a2 = etoy.a((etozVar2 == null ? etoz.a : etozVar2).c);
                        int i = a2 == 0 ? 1 : a2;
                        String str2 = (etozVar2 == null ? etoz.a : etozVar2).f;
                        int a3 = etow.a((etozVar2 == null ? etoz.a : etozVar2).d);
                        int i2 = a3 == 0 ? 1 : a3;
                        boolean z = (etozVar2 == null ? etoz.a : etozVar2).g;
                        if (etozVar2 == null) {
                            etozVar2 = etoz.a;
                        }
                        fefi fefiVar4 = etozVar2.e;
                        if (fefiVar4 == null) {
                            fefiVar4 = fefi.a;
                        }
                        enssVar = czlkVar.X(account, i, str2, i2, z, fegx.b(fefiVar4));
                    } else {
                        enssVar = ensm.a;
                    }
                    if (((Boolean) ((enpf) enox.f(enps.f(ensi.h(enssVar), new eiho() { // from class: dbkg
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            asot asotVar = dbkw.a;
                            return true;
                        }
                    }, entiVar), Exception.class, new eiho() { // from class: dbkm
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            asot asotVar = dbkw.a;
                            return false;
                        }
                    }, entiVar)).v(frxn.l(), TimeUnit.MILLISECONDS)).booleanValue()) {
                        d().d();
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    ((ejhf) ((ejhf) ((ejhf) a.i()).s(e2)).ah((char) 10825)).B("Failed to save migration info from notification %s", b(e2));
                }
            }
        }
    }

    public final czje a() {
        if (this.c == null) {
            this.c = new czje();
        }
        return this.c;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (frxq.a.a().I()) {
            a().e("NotificationReceiveNotification");
            if (intent == null) {
                ((ejhf) ((ejhf) a.i()).ah((char) 10823)).x("Received null intent.");
                a().e("NotificationNullIntent");
                return;
            }
            evnn evnnVar = evnn.a;
            String stringExtra = intent.getStringExtra("lhs_settings_notification");
            if (stringExtra == null) {
                ((ejhf) ((ejhf) a.i()).ah((char) 10820)).B("Received notification with incorrect keys: %s", intent.getExtras());
            } else {
                try {
                    byte[] decode = Base64.decode(stringExtra, 0);
                    fecp y = fecp.y(evnn.a, decode, 0, decode.length, febw.a());
                    fecp.M(y);
                    evnnVar = (evnn) y;
                } catch (fedk e) {
                    ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 10819)).B("Failed to decode and parse the notification payload with error %s.", b(e));
                }
            }
            if (!evnnVar.equals(evnn.a)) {
                e(evnnVar);
            } else {
                ((ejhf) ((ejhf) a.i()).ah((char) 10822)).x("Received notification with invalid payload data.");
                a().e("NotificationInvalidPayload");
            }
        }
    }
}
