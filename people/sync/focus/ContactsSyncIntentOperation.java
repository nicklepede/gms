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
import defpackage.aep;
import defpackage.afp;
import defpackage.atzb;
import defpackage.aued;
import defpackage.bsup;
import defpackage.cvts;
import defpackage.cvyt;
import defpackage.cwgc;
import defpackage.cwof;
import defpackage.cwow;
import defpackage.cxdn;
import defpackage.cxdp;
import defpackage.cxej;
import defpackage.cxfw;
import defpackage.cxgc;
import defpackage.cxgf;
import defpackage.cxgk;
import defpackage.cxig;
import defpackage.cxip;
import defpackage.cxiv;
import defpackage.cxix;
import defpackage.cxiz;
import defpackage.cxjx;
import defpackage.cxol;
import defpackage.dhpk;
import defpackage.ekti;
import defpackage.ekvi;
import defpackage.elhz;
import defpackage.enkg;
import defpackage.fgrc;
import defpackage.fttd;
import defpackage.ftua;
import defpackage.ftuk;
import defpackage.ftvp;
import defpackage.ftwn;
import defpackage.ftyf;
import defpackage.xgt;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsSyncIntentOperation extends IntentOperation {
    private final cxix a;

    public ContactsSyncIntentOperation() {
        cwow.N();
        this.a = cxix.a();
    }

    private static boolean a(Intent intent) {
        return "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long j;
        int i;
        Context applicationContext = getApplicationContext();
        cvyt i2 = cvyt.i(applicationContext);
        if (ftwn.a.lK().W() && a(intent)) {
            cxdp.d(applicationContext).j();
        }
        if (!a(intent)) {
            if (!cxip.a(applicationContext)) {
                cwof.c("FSA2_ContactsSyncIntentOp", "Gms doesn't have contacts permission.");
                return;
            }
            if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
                try {
                    if (cxol.a(applicationContext.getPackageManager(), new ComponentName("com.google.android.gms", "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService"), 2) == 2) {
                        cxfw.a.b(applicationContext);
                        return;
                    } else {
                        cwof.f("FSA2_ContactsSyncIntentOp", "Sync is disabled. Skip prepareToSync");
                        return;
                    }
                } catch (Exception e) {
                    cwof.d("FSA2_ContactsSyncIntentOp", "Failed to prepare for Contacts sync", e);
                    return;
                }
            }
            boolean aY = ftua.a.lK().aY();
            Boolean.valueOf(aY).getClass();
            if (aY) {
                cxdn a = cxdn.a();
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                NetworkCapabilities networkCapabilities = connectivityManager == null ? null : connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                int b = cxdn.b(networkCapabilities);
                ftuk ftukVar = ftuk.a;
                if (ftukVar.lK().e() && (networkCapabilities == null || !networkCapabilities.hasTransport(1))) {
                    cxdn.c(4, cxdn.b(networkCapabilities), null);
                    return;
                }
                cvyt i3 = cvyt.i(applicationContext);
                elhz<Account> d = a.b.d(applicationContext);
                fgrc v = enkg.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                enkg enkgVar = (enkg) v.b;
                enkgVar.e = b - 1;
                enkgVar.b = 4 | enkgVar.b;
                for (Account account : d) {
                    if (ftukVar.lK().d()) {
                        try {
                            j = new cxgc(new cxgf(new cxgk(applicationContext.getContentResolver(), account, ekvi.j(cxej.ORDINARY)), account)).a();
                        } catch (cxjx e2) {
                            cwof.d("FSA2_ContactsSyncOnChargingOp", "Exception thrown when getting last full sync timestamp", e2);
                            j = 0;
                        }
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        long a2 = ftuk.a.lK().a();
                        if (currentTimeMillis < TimeUnit.SECONDS.toMillis(a2)) {
                            TimeUnit.SECONDS.toDays(a2);
                            cxdn.c(3, b, account.name);
                        }
                    }
                    String str = account.name;
                    SharedPreferences sharedPreferences = i3.a;
                    long currentTimeMillis2 = System.currentTimeMillis() - sharedPreferences.getLong(cvyt.H("focus_sync_timestamp_on_charging_", str), 0L);
                    long b2 = ftuk.a.lK().b();
                    if (currentTimeMillis2 < TimeUnit.SECONDS.toMillis(b2)) {
                        TimeUnit.SECONDS.toHours(b2);
                        cxdn.c(2, b, account.name);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("expedited", true);
                        bundle.putBoolean("TRIGGERED_BY_CHARGING", true);
                        ContentResolver.requestSync(account, "com.android.contacts", bundle);
                        String str2 = account.name;
                        sharedPreferences.edit().putLong(cvyt.H("focus_sync_timestamp_on_charging_", account.name), System.currentTimeMillis()).apply();
                        if (!v.b.L()) {
                            v.U();
                        }
                        enkg enkgVar2 = (enkg) v.b;
                        enkgVar2.c = 2;
                        enkgVar2.b |= 1;
                        cvts.a().d((enkg) v.Q(), account.name);
                    }
                }
                return;
            }
            return;
        }
        if (fttd.n() && fttd.a.lK().m()) {
            try {
                afp afpVar = (afp) cwgc.a(applicationContext).get();
                try {
                    aep aepVar = new aep();
                    aepVar.f("cpg:GroupContactOrder");
                    aepVar.e("group_contact_order");
                    Map e3 = cwgc.e(afpVar.f("", aepVar.a()));
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(e3.keySet());
                    Cursor query = applicationContext.getContentResolver().query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id", "account_name", "account_type"}, "deleted = 0", null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(1);
                            String string2 = query.getString(2);
                            Account[] o = bsup.b(applicationContext).o();
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
                    boolean g = cwgc.g(afpVar, hashSet);
                    cwof.f("FSA2_ContactsSyncIntentOp", a.aa(g, "Removed group contact orders from AppSearch: "));
                    i = g ? hashSet.size() : 0;
                    if (afpVar != null) {
                        afpVar.close();
                    }
                } finally {
                }
            } catch (InterruptedException | ExecutionException unused) {
                i = -1;
            }
            cwof.g("FSA2_ContactsSyncIntentOp", "Removed %d group contact orders from AppSearch: ", i);
        }
        for (Account account3 : xgt.c(intent)) {
            if (!ftvp.a.lK().b() || "com.google".equals(account3.type)) {
                cwof.f("FSA2_ContactsSyncIntentOp", "Cleared progress notification for non-existing account.");
                aued f = aued.f(applicationContext);
                String b3 = cxig.b(account3.name, false);
                dhpk dhpkVar = dhpk.CONTACTS_SYNC_PROGRESS_NOTIFIER;
                f.o(b3, 2, dhpkVar);
                aued.f(applicationContext).o(cxig.b(account3.name, true), 2, dhpkVar);
                aued.f(applicationContext).o(cxig.b(account3.name, false), 3, dhpkVar);
                aued.f(applicationContext).o(cxig.b(account3.name, true), 3, dhpkVar);
                if (account3.name.equals(i2.j())) {
                    i2.t(null);
                    cwof.f("FSA2_ContactsSyncIntentOp", "Cleared Portal info saved in Prefs.");
                    if (ftyf.a.lK().e() && cxiz.g(applicationContext)) {
                        this.a.e(applicationContext, account3.name);
                    } else {
                        cxiv.e(applicationContext, account3.name);
                    }
                    cwof.f("FSA2_ContactsSyncIntentOp", "Cleared progress item shown in Portal");
                }
                cwof.f("FSA2_ContactsSyncIntentOp", "Clearing FSA2 sync status preference for removed account");
                String str3 = account3.name;
                atzb.k(null);
                atzb.q(str3);
                String lowerCase = "_".concat(String.valueOf(str3)).toLowerCase(Locale.getDefault());
                SharedPreferences sharedPreferences2 = i2.a;
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                for (String str4 : sharedPreferences2.getAll().keySet()) {
                    if (str4.toLowerCase(Locale.getDefault()).endsWith(lowerCase)) {
                        edit.remove(str4);
                    } else if (ekti.c(str4).endsWith(String.valueOf(lowerCase).concat(String.valueOf(ekti.c("_com.android.contacts"))))) {
                        edit.remove(str4);
                    }
                }
                edit.commit();
            }
        }
    }
}
