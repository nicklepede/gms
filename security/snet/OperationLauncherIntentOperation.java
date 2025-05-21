package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxhd;
import defpackage.cyro;
import defpackage.cyuf;
import defpackage.czak;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OperationLauncherIntentOperation extends IntentOperation {
    private static final String a = "OperationLauncherIntentOperation";
    private static final asot b = asot.b(a, asej.SECURITY);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.google.android.gms.security.apis.verifyapps.CONSENT_RESULT".equals(intent.getAction())) {
                    new cyro(this, intent).f(this);
                    return;
                }
                if ("com.google.android.gms.security.apis.verifyapps.PACKAGE_WARNING_RESULT".equals(intent.getAction())) {
                    new czak(this, intent).f(this);
                } else if ("com.google.android.gms.security.snet.XLB_UPDATE".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("EXTRA_CLIENT_PACKAGE_NAME_INITIATING_SB_UPDATE");
                    if (stringExtra == null) {
                        stringExtra = "com.google.android.gms";
                    }
                    new cyuf(null, stringExtra).f(this);
                }
            } catch (RemoteException | bxhd e) {
                ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 9573)).x("Exception while starting operation");
            }
        }
    }
}
