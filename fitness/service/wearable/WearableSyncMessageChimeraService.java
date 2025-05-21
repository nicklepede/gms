package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.aqxo;
import defpackage.bggg;
import defpackage.bggi;
import defpackage.bhaz;
import defpackage.bhbb;
import defpackage.deqr;
import defpackage.djki;
import defpackage.djks;
import defpackage.dkbc;
import defpackage.fodd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WearableSyncMessageChimeraService extends dkbc {
    private djki a;
    private deqr b;

    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(MessageEventParcelable messageEventParcelable) {
        if (!fodd.a.a().J()) {
            this.a.a(messageEventParcelable);
            return;
        }
        String str = bhaz.d(messageEventParcelable)[0];
        this.b.d(str);
        try {
            this.a.a(messageEventParcelable);
        } finally {
            this.b.n(str);
        }
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        bggi a = bggg.a(this);
        Context applicationContext = getApplicationContext();
        aqxo e = djks.e(a.C().a);
        bhbb w = a.w();
        a.a();
        this.a = new bhaz(applicationContext, a, e, w);
        this.b = new deqr(this, 1, "WearableSyncMessageChimeraService", null, "com.google.android.gms");
    }
}
