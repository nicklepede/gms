package com.google.android.gms.personalsafety.scanners;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asot;
import defpackage.cvpo;
import defpackage.cvsy;
import defpackage.ejhf;
import defpackage.evpi;
import defpackage.fmzp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PreRingingScanIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cvsy b;
        if (intent == null) {
            ((ejhf) cvpo.a.i()).x("Intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || (b = cvsy.b(getApplicationContext())) == null) {
            return;
        }
        if (action.equals("com.google.android.personalsafety.scanners.PRE_RINGING_SCAN")) {
            b.f(evpi.PRE_RINGING, fmzp.u());
            return;
        }
        if (action.equals("com.google.android.personalsafety.scanners.STOP_PENDING_SCANS")) {
            Set set = b.m;
            if (set.isEmpty()) {
                return;
            }
            asot asotVar = cvpo.a;
            set.size();
            Iterator it = new HashSet(set).iterator();
            while (it.hasNext()) {
                b.k((evpi) it.next());
            }
        }
    }
}
