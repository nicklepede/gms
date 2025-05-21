package com.google.android.gms.reachability;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.reachability.AppContextProvider;
import defpackage.a;
import defpackage.aquo;
import defpackage.arfc;
import defpackage.arts;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asnd;
import defpackage.asot;
import defpackage.bqna;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.cwzh;
import defpackage.cwzi;
import defpackage.eiif;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.etxt;
import defpackage.etxu;
import defpackage.etxv;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.frqr;
import defpackage.ftye;
import defpackage.unx;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReachabilityDataSyncIntentOperation extends IntentOperation {
    private static final asot a = asot.b("ReachabilitySyncOp", asej.REACHABILITY);
    private Context b;
    private PackageManager c;
    private cwzh d;
    private cwzi e;
    private bqqa f;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.b = applicationContext;
        this.c = applicationContext.getPackageManager();
        this.d = cwzh.b(this.b);
        this.e = new cwzi(this.b);
        eijr eijrVar = bqqe.a;
        this.f = new bqqa();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Account[] accountArr;
        etxv etxvVar;
        frqr frqrVar = frqr.a;
        if (frqrVar.a().e()) {
            long a2 = this.d.a();
            long b = bxdg.b(this.d.a, "scheduled_sync_timestamp", 0L);
            long currentTimeMillis = b - System.currentTimeMillis();
            if (b == 0 || currentTimeMillis >= TimeUnit.DAYS.toMillis(30L)) {
                long currentTimeMillis2 = System.currentTimeMillis() - a2;
                long millis = TimeUnit.HOURS.toMillis(frqrVar.a().a());
                if (currentTimeMillis2 > 0 && currentTimeMillis2 < millis) {
                    TimeUnit.MILLISECONDS.toMinutes(millis);
                    return;
                }
            } else if (currentTimeMillis > 0) {
                TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int b2 = (int) frqrVar.a().b();
            for (int i = 1; i <= b2; i++) {
                String c = bxdg.c(this.d.a, a.j(i, "service_to_package_name_map"), "");
                if (!c.isEmpty()) {
                    try {
                        this.c.getPackageInfo(c, 1);
                        fecj v = etxt.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        c.getClass();
                        ((etxt) fecpVar).b = c;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        ((etxt) v.b).c = i;
                        arrayList.add((etxt) v.Q());
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            arrayList.isEmpty();
            bqqa.a(aseu.REACHABILITY_PACKAGE_STATUS_SYNC);
            Context context = this.b;
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            int i2 = asnd.a;
            if (aquo.g(context)) {
                accountArr = new Account[0];
            } else {
                Account[] p = bqna.b(context).p("com.google");
                ArrayList arrayList2 = new ArrayList(p.length);
                for (Account account : p) {
                    if (!"".equals(account.name)) {
                        arrayList2.add(account);
                    }
                }
                accountArr = (Account[]) arrayList2.toArray(new Account[arrayList2.size()]);
            }
            for (Account account2 : accountArr) {
                linkedHashSet.add(account2.name);
            }
            for (String str : linkedHashSet) {
                Context context2 = this.b;
                int myUid = Process.myUid();
                String packageName = context2.getPackageName();
                arts artsVar = new arts(myUid, str, str, packageName, packageName);
                artsVar.m("https://www.googleapis.com/auth/myphonenumbers");
                try {
                    fecj v2 = etxu.a.v();
                    if (frqr.a.a().g()) {
                        AppContextProvider appContextProvider = AppContextProvider.c;
                        String b3 = eiif.b(Settings.Secure.getString((appContextProvider == null ? arfc.a() : appContextProvider.a).getContentResolver(), "android_id"));
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        ((etxu) v2.b).c = b3;
                    }
                    if (this.d.a() == 0) {
                        etxvVar = this.e.a(artsVar, (etxu) v2.Q());
                    } else {
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        etxu etxuVar = (etxu) v2.b;
                        fedh fedhVar = etxuVar.b;
                        if (!fedhVar.c()) {
                            etxuVar.b = fecp.E(fedhVar);
                        }
                        feab.E(arrayList, etxuVar.b);
                        etxvVar = this.e.a(artsVar, (etxu) v2.Q());
                    }
                } catch (ftye | unx e) {
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah(9005)).B("Grpc sent to WPS failed with error: %s", e);
                    etxvVar = null;
                }
                if (etxvVar != null) {
                    for (etxt etxtVar : etxvVar.b) {
                        cwzh cwzhVar = this.d;
                        int i3 = etxtVar.c;
                        String str2 = etxtVar.b;
                        bxdd c2 = cwzhVar.a.c();
                        c2.h("service_to_package_name_map" + i3, str2);
                        bxdg.g(c2);
                    }
                    for (etxt etxtVar2 : etxvVar.c) {
                        cwzh cwzhVar2 = this.d;
                        int i4 = etxtVar2.c;
                        bxdd c3 = cwzhVar2.a.c();
                        c3.j("service_to_package_name_map" + i4);
                        bxdg.g(c3);
                    }
                    cwzh cwzhVar3 = this.d;
                    long millis2 = TimeUnit.MICROSECONDS.toMillis(etxvVar.d);
                    bxdd c4 = cwzhVar3.a.c();
                    c4.g("scheduled_sync_timestamp", millis2);
                    bxdg.g(c4);
                }
            }
            bxdf bxdfVar = this.d.a;
            long currentTimeMillis3 = System.currentTimeMillis();
            bxdd c5 = bxdfVar.c();
            c5.g("last_sync_timestamp", currentTimeMillis3);
            bxdg.g(c5);
        }
    }
}
