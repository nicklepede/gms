package com.google.android.gms.personalsafety.scanners;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.cxze;
import defpackage.cycr;
import defpackage.eluo;
import defpackage.eyfe;
import defpackage.fpro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PreRingingScanIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cycr b;
        if (intent == null) {
            ((eluo) cxze.a.i()).x("Intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || (b = cycr.b(getApplicationContext())) == null) {
            return;
        }
        if (action.equals("com.google.android.personalsafety.scanners.PRE_RINGING_SCAN")) {
            b.e(eyfe.PRE_RINGING, fpro.w());
            return;
        }
        if (action.equals("com.google.android.personalsafety.scanners.STOP_PENDING_SCANS")) {
            Set set = b.o;
            if (set.isEmpty()) {
                return;
            }
            ausn ausnVar = cxze.a;
            set.size();
            Iterator it = new HashSet(set).iterator();
            while (it.hasNext()) {
                b.j((eyfe) it.next());
            }
        }
    }
}
