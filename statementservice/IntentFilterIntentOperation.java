package com.google.android.gms.statementservice;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.atwh;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhad;
import defpackage.eluo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class IntentFilterIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("IntentFilterIntentOp", auid.STATEMENT_SERVICE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((eluo) a.i()).x("Invoked with null extras bundle.");
            return;
        }
        int i = extras.getInt("android.content.pm.extra.INTENT_FILTER_VERIFICATION_ID");
        String string = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_URI_SCHEME");
        String string2 = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_HOSTS");
        String string3 = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_PACKAGE_NAME");
        ausn ausnVar = a;
        eluo eluoVar = (eluo) ausnVar.h();
        Integer valueOf = Integer.valueOf(i);
        eluoVar.U("Verifying IntentFilter. verificationId:%d scheme:\"%s\" hosts:\"%s\" package:\"%s\".", valueOf, string, string2, string3);
        if (string == null || string2 == null || string3 == null) {
            ((eluo) ausnVar.i()).x("Invoked with missing parameter.");
            return;
        }
        Context applicationContext = getApplicationContext();
        int myUid = Process.myUid();
        String packageName = applicationContext.getPackageName();
        new atwh(myUid, (Account) null, (Account) null, packageName, packageName);
        List a2 = new dhad(applicationContext).a(string, Arrays.asList(string2.split(" ")), string3);
        boolean isEmpty = a2.isEmpty();
        ((eluo) ausnVar.h()).T("Verification %d complete. Success:%b. Failed hosts:%s.", valueOf, Boolean.valueOf(isEmpty), TextUtils.join(",", a2));
        applicationContext.getPackageManager().verifyIntentFilter(i, true != isEmpty ? -1 : 1, a2);
    }
}
