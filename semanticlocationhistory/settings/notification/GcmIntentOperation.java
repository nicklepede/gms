package com.google.android.gms.semanticlocationhistory.settings.notification;

import android.accounts.Account;
import android.content.Intent;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.semanticlocationhistory.settings.SettingsSyncOneOffService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcep;
import defpackage.dcer;
import defpackage.dcex;
import defpackage.ddvc;
import defpackage.ddvt;
import defpackage.ddxx;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqhb;
import defpackage.etry;
import defpackage.etrz;
import defpackage.ewdr;
import defpackage.ewdu;
import defpackage.eweo;
import defpackage.eweq;
import defpackage.ewer;
import defpackage.ewgh;
import defpackage.eydj;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgst;
import defpackage.fgub;
import defpackage.fgvp;
import defpackage.fgvq;
import defpackage.fush;
import defpackage.fusk;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GcmIntentOperation extends IntentOperation {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "Notification");
    private dbvg b;
    private dbtc c;
    private ddvc d;

    public static final etrz b(Throwable th) {
        return new etrz(etry.NO_USER_DATA, th.getMessage());
    }

    private final dbvg c() {
        if (this.b == null) {
            this.b = new dbvg(a());
        }
        return this.b;
    }

    private final ddvc d() {
        if (this.d == null) {
            this.d = new ddvc();
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(eydj eydjVar) {
        dcer dcerVar;
        eqgl eqglVar;
        Account account = new Account(eydjVar.b, "com.google");
        if (fusk.g()) {
            dcex g = c().g();
            String str = account.name;
            dcerVar = dcer.a;
            str.getClass();
            fgst fgstVar = g.c;
            if (fgstVar.containsKey(str)) {
                dcerVar = (dcer) fgstVar.get(str);
            }
        } else {
            dcerVar = (dcer) c().h().getOrDefault(account.name, dcer.a);
        }
        ewgh ewghVar = eydjVar.c;
        if (ewghVar == null) {
            ewghVar = ewgh.a;
        }
        fgub fgubVar = ewghVar.c;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        if (fgvp.a(fgubVar, fgvq.h(dcerVar.t)) >= 0) {
            try {
                if (!c().R(account) && c().O(account)) {
                    ewgh ewghVar2 = eydjVar.c;
                    if (ewghVar2 == null) {
                        ewghVar2 = ewgh.a;
                    }
                    ewdu ewduVar = ewghVar2.d;
                    if (ewduVar == null) {
                        ewduVar = ewdu.a;
                    }
                    ewdr ewdrVar = ewduVar.b;
                    if (ewdrVar == null) {
                        ewdrVar = ewdr.a;
                    }
                    if (ewdrVar.b) {
                        a().e("NotificationScheduleManualSync");
                        SettingsSyncOneOffService.g(AppContextProvider.a());
                    }
                }
                ddvc d = d();
                ewgh ewghVar3 = eydjVar.c;
                if (ewghVar3 == null) {
                    ewghVar3 = ewgh.a;
                }
                if (((Boolean) ((eqcy) d.a(account, ewghVar3)).v(fush.l(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    a().e("NotificationStoreSettingSuccess");
                } else {
                    a().e("NotificationStoreSettingFailure");
                    ((eluo) ((eluo) a.i()).ai(10829)).x("Failed to save settings from notification");
                }
                d().f();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                a().e("NotificationStoreSettingFailure");
                ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 10830)).B("Failed to save settings from notification %s", b(e));
            }
        } else {
            a().e("NotificationStaleSetting");
        }
        ewgh ewghVar4 = eydjVar.c;
        if (ewghVar4 == null) {
            ewghVar4 = ewgh.a;
        }
        fgub fgubVar2 = ewghVar4.f;
        if (fgubVar2 == null) {
            fgubVar2 = fgub.a;
        }
        if (fgvp.a(fgubVar2, fgvq.h(dcerVar.i)) > 0) {
            eqgc.t(d().b(account), new ddvt(this), eqex.a);
        }
        if (fusk.a.lK().J()) {
            ewgh ewghVar5 = eydjVar.c;
            if (ewghVar5 == null) {
                ewghVar5 = ewgh.a;
            }
            ewer ewerVar = ewghVar5.g;
            if (ewerVar == null) {
                ewerVar = ewer.a;
            }
            fgub fgubVar3 = ewerVar.e;
            if (fgubVar3 == null) {
                fgubVar3 = fgub.a;
            }
            dcep dcepVar = dcerVar.q;
            if (dcepVar == null) {
                dcepVar = dcep.a;
            }
            if (fgvp.a(fgubVar3, fgvq.h(dcepVar.h)) >= 0) {
                a().p("NotificationSyncMigrationInfoUpdateLatency", ddxx.a(-60L, 1440L, 60L, TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - fgvq.b(fgubVar3))));
                try {
                    ddvc d2 = d();
                    ewgh ewghVar6 = eydjVar.c;
                    if (ewghVar6 == null) {
                        ewghVar6 = ewgh.a;
                    }
                    eqhb eqhbVar = new eqhb(eqex.a);
                    if ((ewghVar6.b & 128) != 0) {
                        dbvg dbvgVar = d2.b;
                        ewer ewerVar2 = ewghVar6.g;
                        int a2 = eweq.a((ewerVar2 == null ? ewer.a : ewerVar2).c);
                        int i = a2 == 0 ? 1 : a2;
                        String str2 = (ewerVar2 == null ? ewer.a : ewerVar2).f;
                        int a3 = eweo.a((ewerVar2 == null ? ewer.a : ewerVar2).d);
                        int i2 = a3 == 0 ? 1 : a3;
                        boolean z = (ewerVar2 == null ? ewer.a : ewerVar2).g;
                        if (ewerVar2 == null) {
                            ewerVar2 = ewer.a;
                        }
                        fgub fgubVar4 = ewerVar2.e;
                        if (fgubVar4 == null) {
                            fgubVar4 = fgub.a;
                        }
                        eqglVar = dbvgVar.X(account, i, str2, i2, z, fgvq.b(fgubVar4));
                    } else {
                        eqglVar = eqgf.a;
                    }
                    if (((Boolean) ((eqcy) eqcq.f(eqdl.f(eqgb.h(eqglVar), new ekut() { // from class: ddum
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ausn ausnVar = ddvc.a;
                            return true;
                        }
                    }, eqhbVar), Exception.class, new ekut() { // from class: ddus
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ausn ausnVar = ddvc.a;
                            return false;
                        }
                    }, eqhbVar)).v(fush.l(), TimeUnit.MILLISECONDS)).booleanValue()) {
                        d().d();
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    ((eluo) ((eluo) ((eluo) a.i()).s(e2)).ai((char) 10828)).B("Failed to save migration info from notification %s", b(e2));
                }
            }
        }
    }

    public final dbtc a() {
        if (this.c == null) {
            this.c = new dbtc();
        }
        return this.c;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fusk.a.lK().I()) {
            a().e("NotificationReceiveNotification");
            if (intent == null) {
                ((eluo) ((eluo) a.i()).ai((char) 10826)).x("Received null intent.");
                a().e("NotificationNullIntent");
                return;
            }
            eydj eydjVar = eydj.a;
            String stringExtra = intent.getStringExtra("lhs_settings_notification");
            if (stringExtra == null) {
                ((eluo) ((eluo) a.i()).ai((char) 10823)).B("Received notification with incorrect keys: %s", intent.getExtras());
            } else {
                try {
                    byte[] decode = Base64.decode(stringExtra, 0);
                    fgri y = fgri.y(eydjVar, decode, 0, decode.length, fgqp.a());
                    fgri.M(y);
                    eydjVar = (eydj) y;
                } catch (fgsd e) {
                    ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 10822)).B("Failed to decode and parse the notification payload with error %s.", b(e));
                }
            }
            if (!eydjVar.equals(eydj.a)) {
                e(eydjVar);
            } else {
                ((eluo) ((eluo) a.i()).ai((char) 10825)).x("Received notification with invalid payload data.");
                a().e("NotificationInvalidPayload");
            }
        }
    }
}
