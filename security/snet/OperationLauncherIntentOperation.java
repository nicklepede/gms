package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzpt;
import defpackage.dbbm;
import defpackage.dbed;
import defpackage.dbki;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OperationLauncherIntentOperation extends IntentOperation {
    private static final String a = "OperationLauncherIntentOperation";
    private static final ausn b = ausn.b(a, auid.SECURITY);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.google.android.gms.security.apis.verifyapps.CONSENT_RESULT".equals(intent.getAction())) {
                    new dbbm(this, intent).f(this);
                    return;
                }
                if ("com.google.android.gms.security.apis.verifyapps.PACKAGE_WARNING_RESULT".equals(intent.getAction())) {
                    new dbki(this, intent).f(this);
                } else if ("com.google.android.gms.security.snet.XLB_UPDATE".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("EXTRA_CLIENT_PACKAGE_NAME_INITIATING_SB_UPDATE");
                    if (stringExtra == null) {
                        stringExtra = "com.google.android.gms";
                    }
                    new dbed(null, stringExtra).f(this);
                }
            } catch (RemoteException | bzpt e) {
                ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 9575)).x("Exception while starting operation");
            }
        }
    }
}
