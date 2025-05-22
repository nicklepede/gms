package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantAppAddRemoveStatusIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AppAddRemoveStatusOp", auid.INSTANT_APPS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            ((eluo) ((eluo) a.i()).ai((char) 5275)).x("Unexpected null intent action.");
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
        ((eluo) ((eluo) a.i()).ai((char) 5274)).B("Unexpected intent action=%s", intent.getAction());
    }
}
