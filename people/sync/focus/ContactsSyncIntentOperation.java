package com.google.android.gms.people.sync.focus;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.aek;
import defpackage.afk;
import defpackage.arwm;
import defpackage.asbo;
import defpackage.bqna;
import defpackage.ctkm;
import defpackage.ctpn;
import defpackage.ctww;
import defpackage.cuey;
import defpackage.cufp;
import defpackage.cuug;
import defpackage.cuui;
import defpackage.cuvb;
import defpackage.cuwo;
import defpackage.cuwu;
import defpackage.cuwx;
import defpackage.cuxc;
import defpackage.cuyy;
import defpackage.cuzh;
import defpackage.cuzn;
import defpackage.cuzp;
import defpackage.cuzr;
import defpackage.cvap;
import defpackage.cvfc;
import defpackage.dfee;
import defpackage.eigd;
import defpackage.eiid;
import defpackage.eiuu;
import defpackage.ekwu;
import defpackage.fecj;
import defpackage.fqzi;
import defpackage.fraf;
import defpackage.frap;
import defpackage.frbu;
import defpackage.frcs;
import defpackage.frek;
import defpackage.vks;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsSyncIntentOperation extends IntentOperation {
    private final cuzp a;

    public ContactsSyncIntentOperation() {
        cufp.O();
        this.a = cuzp.a();
    }

    private static boolean a(Intent intent) {
        return "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long j;
        int i;
        Context applicationContext = getApplicationContext();
        ctpn i2 = ctpn.i(applicationContext);
        if (frcs.a.a().W() && a(intent)) {
            cuui.d(applicationContext).j();
        }
        if (!a(intent)) {
            if (!cuzh.a(applicationContext)) {
                cuey.c("FSA2_ContactsSyncIntentOp", "Gms doesn't have contacts permission.");
                return;
            }
            if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
                try {
                    if (cvfc.a(applicationContext.getPackageManager(), new ComponentName("com.google.android.gms", "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService"), 2) == 2) {
                        cuwo.a.b(applicationContext);
                        return;
                    } else {
                        cuey.f("FSA2_ContactsSyncIntentOp", "Sync is disabled. Skip prepareToSync");
                        return;
                    }
                } catch (Exception e) {
                    cuey.d("FSA2_ContactsSyncIntentOp", "Failed to prepare for Contacts sync", e);
                    return;
                }
            }
            boolean aY = fraf.a.a().aY();
            Boolean.valueOf(aY).getClass();
            if (aY) {
                cuug a = cuug.a();
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                NetworkCapabilities networkCapabilities = connectivityManager == null ? null : connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                int b = cuug.b(networkCapabilities);
                if (frap.a.a().e() && (networkCapabilities == null || !networkCapabilities.hasTransport(1))) {
                    cuug.c(4, cuug.b(networkCapabilities), null);
                    return;
                }
                ctpn i3 = ctpn.i(applicationContext);
                eiuu<Account> d = a.b.d(applicationContext);
                fecj v = ekwu.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ekwu ekwuVar = (ekwu) v.b;
                ekwuVar.e = b - 1;
                ekwuVar.b = 4 | ekwuVar.b;
                for (Account account : d) {
                    if (frap.a.a().d()) {
                        try {
                            j = new cuwu(new cuwx(new cuxc(applicationContext.getContentResolver(), account, eiid.j(cuvb.ORDINARY)), account)).a();
                        } catch (cvap e2) {
                            cuey.d("FSA2_ContactsSyncOnChargingOp", "Exception thrown when getting last full sync timestamp", e2);
                            j = 0;
                        }
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        long a2 = frap.a.a().a();
                        if (currentTimeMillis < TimeUnit.SECONDS.toMillis(a2)) {
                            TimeUnit.SECONDS.toDays(a2);
                            cuug.c(3, b, account.name);
                        }
                    }
                    String str = account.name;
                    SharedPreferences sharedPreferences = i3.a;
                    long currentTimeMillis2 = System.currentTimeMillis() - sharedPreferences.getLong(ctpn.H("focus_sync_timestamp_on_charging_", str), 0L);
                    long b2 = frap.a.a().b();
                    if (currentTimeMillis2 < TimeUnit.SECONDS.toMillis(b2)) {
                        TimeUnit.SECONDS.toHours(b2);
                        cuug.c(2, b, account.name);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("expedited", true);
                        bundle.putBoolean("TRIGGERED_BY_CHARGING", true);
                        ContentResolver.requestSync(account, "com.android.contacts", bundle);
                        String str2 = account.name;
                        sharedPreferences.edit().putLong(ctpn.H("focus_sync_timestamp_on_charging_", account.name), System.currentTimeMillis()).apply();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekwu ekwuVar2 = (ekwu) v.b;
                        ekwuVar2.c = 2;
                        ekwuVar2.b |= 1;
                        ctkm.a().d((ekwu) v.Q(), account.name);
                    }
                }
                return;
            }
            return;
        }
        if (fqzi.n() && fqzi.a.a().m()) {
            try {
                afk afkVar = (afk) ctww.a(applicationContext).get();
                try {
                    aek aekVar = new aek();
                    aekVar.f("cpg:GroupContactOrder");
                    aekVar.e("group_contact_order");
                    Map e3 = ctww.e(afkVar.f("", aekVar.a()));
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(e3.keySet());
                    Cursor query = applicationContext.getContentResolver().query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id", "account_name", "account_type"}, "deleted = 0", null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(1);
                            String string2 = query.getString(2);
                            Account[] o = bqna.b(applicationContext).o();
                            int length = o.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length) {
                                    Account account2 = o[i4];
                                    if (Objects.equals(string, account2.name) && Objects.equals(string2, account2.type)) {
                                        hashSet.remove(query.getString(0));
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        } finally {
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    boolean g = ctww.g(afkVar, hashSet);
                    cuey.f("FSA2_ContactsSyncIntentOp", a.Z(g, "Removed group contact orders from AppSearch: "));
                    i = g ? hashSet.size() : 0;
                    if (afkVar != null) {
                        afkVar.close();
                    }
                } finally {
                }
            } catch (InterruptedException | ExecutionException unused) {
                i = -1;
            }
            cuey.g("FSA2_ContactsSyncIntentOp", "Removed %d group contact orders from AppSearch: ", i);
        }
        for (Account account3 : vks.c(intent)) {
            if (!frbu.a.a().b() || "com.google".equals(account3.type)) {
                cuey.f("FSA2_ContactsSyncIntentOp", "Cleared progress notification for non-existing account.");
                asbo f = asbo.f(applicationContext);
                String b3 = cuyy.b(account3.name, false);
                dfee dfeeVar = dfee.CONTACTS_SYNC_PROGRESS_NOTIFIER;
                f.o(b3, 2, dfeeVar);
                asbo.f(applicationContext).o(cuyy.b(account3.name, true), 2, dfeeVar);
                asbo.f(applicationContext).o(cuyy.b(account3.name, false), 3, dfeeVar);
                asbo.f(applicationContext).o(cuyy.b(account3.name, true), 3, dfeeVar);
                if (account3.name.equals(i2.j())) {
                    i2.t(null);
                    cuey.f("FSA2_ContactsSyncIntentOp", "Cleared Portal info saved in Prefs.");
                    if (frek.a.a().e() && cuzr.g(applicationContext)) {
                        this.a.e(applicationContext, account3.name);
                    } else {
                        cuzn.e(applicationContext, account3.name);
                    }
                    cuey.f("FSA2_ContactsSyncIntentOp", "Cleared progress item shown in Portal");
                }
                cuey.f("FSA2_ContactsSyncIntentOp", "Clearing FSA2 sync status preference for removed account");
                String str3 = account3.name;
                arwm.k(null);
                arwm.q(str3);
                String lowerCase = "_".concat(String.valueOf(str3)).toLowerCase(Locale.getDefault());
                SharedPreferences sharedPreferences2 = i2.a;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                for (String str4 : sharedPreferences2.getAll().keySet()) {
                    if (str4.toLowerCase(Locale.getDefault()).endsWith(lowerCase)) {
                        edit.remove(str4);
                    } else if (eigd.c(str4).endsWith(String.valueOf(lowerCase).concat(String.valueOf(eigd.c("_com.android.contacts"))))) {
                        edit.remove(str4);
                    }
                }
                edit.commit();
            }
        }
    }
}
