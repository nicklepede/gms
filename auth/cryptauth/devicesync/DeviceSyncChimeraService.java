package com.google.android.gms.auth.cryptauth.devicesync;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.aaqy;
import defpackage.aara;
import defpackage.aarb;
import defpackage.aare;
import defpackage.aarf;
import defpackage.aatu;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.byln;
import defpackage.eiif;
import defpackage.eixf;
import defpackage.ejck;
import defpackage.fkxb;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceSyncChimeraService extends GmsTaskChimeraService {
    private static final arxo a = new arxo(new String[]{"DeviceSyncChimeraService"}, (byte[]) null);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i = 2;
        if (!fkxb.c()) {
            return 2;
        }
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            a.m("Missing task parameters", new Object[0]);
            return 2;
        }
        String string = bundle.getString("account_name");
        Context applicationContext = getApplicationContext();
        if (eiif.c(string) || !asnd.m(applicationContext, new Account(string, "com.google"))) {
            a.m("Account doesn't exist on device", new Object[0]);
            return 2;
        }
        Account account = new Account(string, "com.google");
        Context applicationContext2 = getApplicationContext();
        Object obj = new Object();
        SharedPreferences sharedPreferences = applicationContext2.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0);
        int hashCode = string.hashCode();
        Set<String> stringSet = sharedPreferences.getStringSet(aaqy.b("ALL_KEYS", "ALL_KEY_NAMES", hashCode), ejck.a);
        ArrayList b = stringSet.isEmpty() ? null : eixf.b(stringSet);
        if (b == null) {
            a.m("Missing keys", new Object[0]);
            return 2;
        }
        int d = aaqy.d(sharedPreferences, hashCode);
        aarb a2 = aara.a(this, account, new aatu(this, d, 3));
        ArrayList<String> arrayList = b;
        aarf a3 = aare.a(this, a2);
        int i2 = 1;
        boolean z = true;
        for (String str : arrayList) {
            Set<String> stringSet2 = sharedPreferences.getStringSet(aaqy.b("FEATURE", str, hashCode), ejck.a);
            ArrayList b2 = stringSet2.isEmpty() ? null : eixf.b(stringSet2);
            if (b2 == null) {
                a.m("Missing feature names", new Object[0]);
                return i;
            }
            arxo arxoVar = a;
            Object[] objArr = new Object[i2];
            objArr[0] = bylnVar.a;
            arxoVar.d("Performing device sync with tag=%s", objArr);
            z &= a3.a(account, str, 6, aaqy.c(str, sharedPreferences, hashCode), b2, d, null);
            a2 = a2;
            i2 = i2;
            i = i;
        }
        int i3 = i2;
        a2.a();
        if (z) {
            synchronized (obj) {
                sharedPreferences.edit().putLong(aaqy.b("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES", hashCode), 1L).commit();
            }
            return 0;
        }
        long d2 = aaqy.d(sharedPreferences, hashCode);
        synchronized (obj) {
            sharedPreferences.edit().putLong(aaqy.b("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES", hashCode), d2 + 1).commit();
        }
        return i3;
    }
}
