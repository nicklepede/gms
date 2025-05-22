package com.google.android.gms.lockbox;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdsc;
import defpackage.cdtg;
import defpackage.eluo;
import defpackage.wjw;
import defpackage.wjx;
import defpackage.wkg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LockboxAccountsChangedChimeraReceiver extends IntentOperation {
    static {
        ausn.b("LockboxAcctReceiver", auid.LOCKBOX);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List list;
        int i;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            ausn ausnVar = cdsc.a;
            cdtg a = cdtg.a(this);
            HashSet hashSet = new HashSet();
            SharedPreferences sharedPreferences = a.c;
            synchronized (sharedPreferences) {
                for (String str : sharedPreferences.getAll().keySet()) {
                    if (str.startsWith("opt-in-status-")) {
                        hashSet.add(str.substring(14, str.lastIndexOf(45)));
                    }
                }
                String c = a.c();
                if (!TextUtils.isEmpty(c)) {
                    hashSet.add(c);
                }
            }
            for (String str2 : new ArrayList(hashSet)) {
                try {
                    SharedPreferences sharedPreferences2 = a.c;
                    synchronized (sharedPreferences2) {
                        a.e();
                        i = sharedPreferences2.getInt(cdtg.b(str2), 0);
                    }
                    String str3 = wjx.a;
                    list = wkg.j(this, i, str2);
                } catch (IOException | wjw e) {
                    ((eluo) ((eluo) ((eluo) cdsc.a.i()).s(e)).ai((char) 6037)).x("Error getting account change events.");
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    AccountChangeEvent accountChangeEvent = (AccountChangeEvent) list.get(0);
                    int i2 = accountChangeEvent.e;
                    SharedPreferences sharedPreferences3 = a.c;
                    synchronized (sharedPreferences3) {
                        a.e();
                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                        edit.putInt(cdtg.b(str2), i2);
                        edit.apply();
                    }
                    if (accountChangeEvent.d == 4) {
                        String str4 = accountChangeEvent.f;
                        synchronized (sharedPreferences3) {
                            SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                            if (str2.equals(a.c())) {
                                edit2.putString("signed-in-account", str4);
                            }
                            edit2.apply();
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
