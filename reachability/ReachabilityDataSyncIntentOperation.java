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
import defpackage.asxd;
import defpackage.athr;
import defpackage.atwh;
import defpackage.auid;
import defpackage.auio;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.czjf;
import defpackage.czjg;
import defpackage.ekvk;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.ewnl;
import defpackage.ewnm;
import defpackage.ewnn;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fula;
import defpackage.fwuc;
import defpackage.wjw;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ReachabilityDataSyncIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("ReachabilitySyncOp", auid.REACHABILITY);
    private Context b;
    private PackageManager c;
    private czjf d;
    private czjg e;
    private bsxr f;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.b = applicationContext;
        this.c = applicationContext.getPackageManager();
        this.d = czjf.b(this.b);
        this.e = new czjg(this.b);
        ekww ekwwVar = bsxv.a;
        this.f = new bsxr();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Account[] accountArr;
        ewnn ewnnVar;
        fula fulaVar = fula.a;
        if (fulaVar.lK().e()) {
            long a2 = this.d.a();
            long b = bzlw.b(this.d.a, "scheduled_sync_timestamp", 0L);
            long currentTimeMillis = b - System.currentTimeMillis();
            if (b == 0 || currentTimeMillis >= TimeUnit.DAYS.toMillis(30L)) {
                long currentTimeMillis2 = System.currentTimeMillis() - a2;
                long millis = TimeUnit.HOURS.toMillis(fulaVar.lK().a());
                if (currentTimeMillis2 > 0 && currentTimeMillis2 < millis) {
                    TimeUnit.MILLISECONDS.toMinutes(millis);
                    return;
                }
            } else if (currentTimeMillis > 0) {
                TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int b2 = (int) fulaVar.lK().b();
            for (int i = 1; i <= b2; i++) {
                String c = bzlw.c(this.d.a, a.j(i, "service_to_package_name_map"), "");
                if (!c.isEmpty()) {
                    try {
                        this.c.getPackageInfo(c, 1);
                        fgrc v = ewnl.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        c.getClass();
                        ((ewnl) fgriVar).b = c;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        ((ewnl) v.b).c = i;
                        arrayList.add((ewnl) v.Q());
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            arrayList.isEmpty();
            bsxr.a(auio.REACHABILITY_PACKAGE_STATUS_SYNC);
            Context context = this.b;
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            int i2 = auqx.a;
            if (asxd.g(context)) {
                accountArr = new Account[0];
            } else {
                Account[] p = bsup.b(context).p("com.google");
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
                atwh atwhVar = new atwh(myUid, str, str, packageName, packageName);
                atwhVar.m("https://www.googleapis.com/auth/myphonenumbers");
                try {
                    fgrc v2 = ewnm.a.v();
                    if (fula.a.lK().g()) {
                        AppContextProvider appContextProvider = AppContextProvider.c;
                        String b3 = ekvk.b(Settings.Secure.getString((appContextProvider == null ? athr.a() : appContextProvider.a).getContentResolver(), "android_id"));
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        ((ewnm) v2.b).c = b3;
                    }
                    if (this.d.a() == 0) {
                        ewnnVar = this.e.a(atwhVar, (ewnm) v2.Q());
                    } else {
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        ewnm ewnmVar = (ewnm) v2.b;
                        fgsa fgsaVar = ewnmVar.b;
                        if (!fgsaVar.c()) {
                            ewnmVar.b = fgri.E(fgsaVar);
                        }
                        fgou.E(arrayList, ewnmVar.b);
                        ewnnVar = this.e.a(atwhVar, (ewnm) v2.Q());
                    }
                } catch (fwuc | wjw e) {
                    ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai(9003)).B("Grpc sent to WPS failed with error: %s", e);
                    ewnnVar = null;
                }
                if (ewnnVar != null) {
                    for (ewnl ewnlVar : ewnnVar.b) {
                        czjf czjfVar = this.d;
                        int i3 = ewnlVar.c;
                        String str2 = ewnlVar.b;
                        bzlt c2 = czjfVar.a.c();
                        c2.h("service_to_package_name_map" + i3, str2);
                        bzlw.g(c2);
                    }
                    for (ewnl ewnlVar2 : ewnnVar.c) {
                        czjf czjfVar2 = this.d;
                        int i4 = ewnlVar2.c;
                        bzlt c3 = czjfVar2.a.c();
                        c3.j("service_to_package_name_map" + i4);
                        bzlw.g(c3);
                    }
                    czjf czjfVar3 = this.d;
                    long millis2 = TimeUnit.MICROSECONDS.toMillis(ewnnVar.d);
                    bzlt c4 = czjfVar3.a.c();
                    c4.g("scheduled_sync_timestamp", millis2);
                    bzlw.g(c4);
                }
            }
            bzlv bzlvVar = this.d.a;
            long currentTimeMillis3 = System.currentTimeMillis();
            bzlt c5 = bzlvVar.c();
            c5.g("last_sync_timestamp", currentTimeMillis3);
            bzlw.g(c5);
        }
    }
}
