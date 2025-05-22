package com.google.android.gms.personalsafety.spotbackend;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.personalsafety.spotbackend.FinderIdentificationIntentOperation;
import com.google.android.gms.personalsafety.utils.LocalBroadcastReceiver;
import defpackage.ausn;
import defpackage.cxze;
import defpackage.cyei;
import defpackage.cyej;
import defpackage.cyeo;
import defpackage.dyrl;
import defpackage.dyte;
import defpackage.dytf;
import defpackage.dyun;
import defpackage.eizy;
import defpackage.ekut;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqeb;
import defpackage.eqeq;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgk;
import defpackage.flnj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FinderIdentificationIntentOperation extends IntentOperation {
    cyei a;
    public dyun b;
    public dyrl c;

    public final void a(int i) {
        LocalBroadcastReceiver.c(getApplicationContext(), new Intent("com.google.android.gms.personalsafety.FINDER_IDENTIFICATION_CONNECTION").putExtra("FinderIdentificationStatusCodeKey", i));
    }

    public final void b() {
        LocalBroadcastReceiver.c(getApplicationContext(), new Intent("com.google.android.gms.personalsafety.FINDER_GET_IDENTIFIER_ACTION").putExtra("FinderIdentificationStatusCodeKey", -1));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((eluo) cxze.a.i()).x("Intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.gms.personalsafety.FINDER_IDENTIFICATION_START")) {
            ((eluo) cxze.a.j()).B("Unknown action received: %s", action);
            return;
        }
        ausn ausnVar = cxze.a;
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("MacAddressKey")) {
            return;
        }
        String string = extras.getString("MacAddressKey");
        if (ekvk.c(string)) {
            ((eluo) cxze.a.i()).x("invalid mac address");
            return;
        }
        if (this.a == null) {
            flnj flnjVar = cyej.a;
            this.a = new cyei();
        }
        this.a.a(this);
        dyte a = dytf.a();
        a.b(30000);
        a.d(3);
        dytf a2 = a.a();
        eqex eqexVar = eqex.a;
        eizy b = this.b.b(string, a2);
        eqdv eqdvVar = new eqdv() { // from class: cyem
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                FinderIdentificationIntentOperation finderIdentificationIntentOperation = FinderIdentificationIntentOperation.this;
                finderIdentificationIntentOperation.a(0);
                return finderIdentificationIntentOperation.c.a((dyyw) obj).a();
            }
        };
        eqgk eqgkVar = eqeq.a;
        eqgc.t(b.f(new eqeb(eqdvVar), eqexVar).g().e(Throwable.class, new ekut() { // from class: cyen
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof dyzd;
                FinderIdentificationIntentOperation finderIdentificationIntentOperation = FinderIdentificationIntentOperation.this;
                if (z || (th instanceof dyze) || (th instanceof dyzh)) {
                    ausn ausnVar2 = cxze.a;
                    finderIdentificationIntentOperation.a(-1);
                } else if (th instanceof dyzk) {
                    ausn ausnVar3 = cxze.a;
                    finderIdentificationIntentOperation.b();
                } else {
                    ((eluo) ((eluo) cxze.a.i()).s(th)).x("Unexpected error reading device identifier.");
                    finderIdentificationIntentOperation.b();
                }
                return fgpr.b;
            }
        }, eqexVar), new cyeo(this), eqexVar);
    }
}
