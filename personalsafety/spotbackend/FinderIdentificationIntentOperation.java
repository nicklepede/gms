package com.google.android.gms.personalsafety.spotbackend;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.personalsafety.spotbackend.FinderIdentificationIntentOperation;
import com.google.android.gms.personalsafety.utils.LocalBroadcastReceiver;
import defpackage.asot;
import defpackage.cvpo;
import defpackage.cvul;
import defpackage.cvum;
import defpackage.cvur;
import defpackage.dwfk;
import defpackage.dwhd;
import defpackage.dwhe;
import defpackage.dwim;
import defpackage.egmv;
import defpackage.eiho;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.enqi;
import defpackage.enqx;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensr;
import defpackage.fixm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FinderIdentificationIntentOperation extends IntentOperation {
    cvul a;
    public dwim b;
    public dwfk c;

    public final void a(int i) {
        LocalBroadcastReceiver.c(getApplicationContext(), new Intent("com.google.android.gms.personalsafety.FINDER_IDENTIFICATION_CONNECTION").putExtra("FinderIdentificationStatusCodeKey", i));
    }

    public final void b() {
        LocalBroadcastReceiver.c(getApplicationContext(), new Intent("com.google.android.gms.personalsafety.FINDER_GET_IDENTIFIER_ACTION").putExtra("FinderIdentificationStatusCodeKey", -1));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((ejhf) cvpo.a.i()).x("Intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.gms.personalsafety.FINDER_IDENTIFICATION_START")) {
            ((ejhf) cvpo.a.j()).B("Unknown action received: %s", action);
            return;
        }
        asot asotVar = cvpo.a;
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("MacAddressKey")) {
            return;
        }
        String string = extras.getString("MacAddressKey");
        if (eiif.c(string)) {
            ((ejhf) cvpo.a.i()).x("invalid mac address");
            return;
        }
        if (this.a == null) {
            fixm fixmVar = cvum.a;
            this.a = new cvul();
        }
        this.a.a(this);
        dwhd a = dwhe.a();
        a.b(30000);
        a.d(3);
        dwhe a2 = a.a();
        enre enreVar = enre.a;
        egmv b = this.b.b(string, a2);
        enqc enqcVar = new enqc() { // from class: cvup
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                FinderIdentificationIntentOperation finderIdentificationIntentOperation = FinderIdentificationIntentOperation.this;
                finderIdentificationIntentOperation.a(0);
                return finderIdentificationIntentOperation.c.a((dwmv) obj).a();
            }
        };
        ensr ensrVar = enqx.a;
        ensj.t(b.f(new enqi(enqcVar), enreVar).g().d(Throwable.class, new eiho() { // from class: cvuq
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof dwnc;
                FinderIdentificationIntentOperation finderIdentificationIntentOperation = FinderIdentificationIntentOperation.this;
                if (z || (th instanceof dwnd) || (th instanceof dwng)) {
                    asot asotVar2 = cvpo.a;
                    finderIdentificationIntentOperation.a(-1);
                } else if (th instanceof dwnj) {
                    asot asotVar3 = cvpo.a;
                    finderIdentificationIntentOperation.b();
                } else {
                    ((ejhf) ((ejhf) cvpo.a.i()).s(th)).x("Unexpected error reading device identifier.");
                    finderIdentificationIntentOperation.b();
                }
                return feay.b;
            }
        }, enreVar), new cvur(this), enreVar);
    }
}
