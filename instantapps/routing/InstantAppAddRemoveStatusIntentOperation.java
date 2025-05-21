package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InstantAppAddRemoveStatusIntentOperation extends IntentOperation {
    private static final asot a = asot.b("AppAddRemoveStatusOp", asej.INSTANT_APPS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) a.i()).ah((char) 5262)).x("Unexpected null intent action.");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1551420805) {
            if (hashCode == 1686683586 && action.equals("com.google.android.gms.instantapps.INSTANT_APP_UNINSTALLED")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.instantapps.INSTANT_APP_INSTALLED")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return;
        }
        ((ejhf) ((ejhf) a.i()).ah((char) 5261)).B("Unexpected intent action=%s", intent.getAction());
    }
}
