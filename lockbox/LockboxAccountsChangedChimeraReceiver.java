package com.google.android.gms.lockbox;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import defpackage.asej;
import defpackage.asot;
import defpackage.cbjk;
import defpackage.cbko;
import defpackage.ejhf;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LockboxAccountsChangedChimeraReceiver extends IntentOperation {
    static {
        asot.b("LockboxAcctReceiver", asej.LOCKBOX);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List list;
        int i;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            asot asotVar = cbjk.a;
            cbko a = cbko.a(this);
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
                        i = sharedPreferences2.getInt(cbko.b(str2), 0);
                    }
                    String str3 = uny.a;
                    list = uoh.j(this, i, str2);
                } catch (IOException | unx e) {
                    ((ejhf) ((ejhf) ((ejhf) cbjk.a.i()).s(e)).ah((char) 6018)).x("Error getting account change events.");
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    AccountChangeEvent accountChangeEvent = (AccountChangeEvent) list.get(0);
                    int i2 = accountChangeEvent.e;
                    SharedPreferences sharedPreferences3 = a.c;
                    synchronized (sharedPreferences3) {
                        a.e();
                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                        edit.putInt(cbko.b(str2), i2);
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
