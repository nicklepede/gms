package com.google.android.gms.statementservice;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.arts;
import defpackage.asej;
import defpackage.asot;
import defpackage.depa;
import defpackage.ejhf;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class IntentFilterIntentOperation extends IntentOperation {
    private static final asot a = asot.b("IntentFilterIntentOp", asej.STATEMENT_SERVICE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((ejhf) a.i()).x("Invoked with null extras bundle.");
            return;
        }
        int i = extras.getInt("android.content.pm.extra.INTENT_FILTER_VERIFICATION_ID");
        String string = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_URI_SCHEME");
        String string2 = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_HOSTS");
        String string3 = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_PACKAGE_NAME");
        asot asotVar = a;
        ejhf ejhfVar = (ejhf) asotVar.h();
        Integer valueOf = Integer.valueOf(i);
        ejhfVar.U("Verifying IntentFilter. verificationId:%d scheme:\"%s\" hosts:\"%s\" package:\"%s\".", valueOf, string, string2, string3);
        if (string == null || string2 == null || string3 == null) {
            ((ejhf) asotVar.i()).x("Invoked with missing parameter.");
            return;
        }
        Context applicationContext = getApplicationContext();
        int myUid = Process.myUid();
        String packageName = applicationContext.getPackageName();
        new arts(myUid, (Account) null, (Account) null, packageName, packageName);
        List a2 = new depa(applicationContext).a(string, Arrays.asList(string2.split(" ")), string3);
        boolean isEmpty = a2.isEmpty();
        ((ejhf) asotVar.h()).T("Verification %d complete. Success:%b. Failed hosts:%s.", valueOf, Boolean.valueOf(isEmpty), TextUtils.join(",", a2));
        applicationContext.getPackageManager().verifyIntentFilter(i, true != isEmpty ? -1 : 1, a2);
    }
}
