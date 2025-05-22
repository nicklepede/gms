package com.google.android.gms.auth.cryptauth.devicesync;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.acqy;
import defpackage.acra;
import defpackage.acrb;
import defpackage.acre;
import defpackage.acrf;
import defpackage.actu;
import defpackage.auad;
import defpackage.auqx;
import defpackage.cauf;
import defpackage.ekvk;
import defpackage.elkk;
import defpackage.elpp;
import defpackage.fnog;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceSyncChimeraService extends GmsTaskChimeraService {
    private static final auad a = new auad(new String[]{"DeviceSyncChimeraService"}, (byte[]) null);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i = 2;
        if (!fnog.c()) {
            return 2;
        }
        Bundle bundle = caufVar.b;
        int i2 = 0;
        if (bundle == null) {
            a.m("Missing task parameters", new Object[0]);
            return 2;
        }
        String string = bundle.getString("account_name");
        Context applicationContext = getApplicationContext();
        if (ekvk.c(string) || !auqx.m(applicationContext, new Account(string, "com.google"))) {
            a.m("Account doesn't exist on device", new Object[0]);
            return 2;
        }
        Account account = new Account(string, "com.google");
        Context applicationContext2 = getApplicationContext();
        Object obj = new Object();
        SharedPreferences sharedPreferences = applicationContext2.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0);
        int hashCode = string.hashCode();
        String b = acqy.b("ALL_KEYS", "ALL_KEY_NAMES", hashCode);
        elpp elppVar = elpp.a;
        Set<String> stringSet = sharedPreferences.getStringSet(b, elppVar);
        ArrayList b2 = stringSet.isEmpty() ? null : elkk.b(stringSet);
        if (b2 == null) {
            a.m("Missing keys", new Object[0]);
            return 2;
        }
        int d = acqy.d(sharedPreferences, hashCode);
        acrb a2 = acra.a(this, account, new actu(this, d, 3));
        ArrayList<String> arrayList = b2;
        acrf a3 = acre.a(this, a2);
        int i3 = 1;
        boolean z = true;
        for (String str : arrayList) {
            Set<String> stringSet2 = sharedPreferences.getStringSet(acqy.b("FEATURE", str, hashCode), elppVar);
            ArrayList b3 = stringSet2.isEmpty() ? null : elkk.b(stringSet2);
            if (b3 == null) {
                a.m("Missing feature names", new Object[i2]);
                return i;
            }
            auad auadVar = a;
            int i4 = i2;
            Object[] objArr = new Object[i3];
            objArr[i4] = caufVar.a;
            auadVar.d("Performing device sync with tag=%s", objArr);
            z &= a3.a(account, str, 6, acqy.c(str, sharedPreferences, hashCode), b3, d, null);
            a2 = a2;
            i3 = i3;
            i = i;
            i2 = i4;
        }
        int i5 = i2;
        int i6 = i3;
        a2.a();
        if (z) {
            synchronized (obj) {
                sharedPreferences.edit().putLong(acqy.b("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES", hashCode), 1L).commit();
            }
            return i5;
        }
        long d2 = acqy.d(sharedPreferences, hashCode);
        synchronized (obj) {
            sharedPreferences.edit().putLong(acqy.b("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES", hashCode), d2 + 1).commit();
        }
        return i6;
    }
}
