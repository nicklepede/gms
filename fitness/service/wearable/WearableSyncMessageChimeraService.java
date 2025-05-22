package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.atad;
import defpackage.bikw;
import defpackage.biky;
import defpackage.bjfp;
import defpackage.bjfr;
import defpackage.dhbu;
import defpackage.dlwb;
import defpackage.dlwl;
import defpackage.dmmv;
import defpackage.fqvm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class WearableSyncMessageChimeraService extends dmmv {
    private dlwb a;
    private dhbu b;

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        if (!fqvm.a.lK().J()) {
            this.a.a(messageEventParcelable);
            return;
        }
        String str = bjfp.d(messageEventParcelable)[0];
        this.b.d(str);
        try {
            this.a.a(messageEventParcelable);
        } finally {
            this.b.n(str);
        }
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        biky a = bikw.a(this);
        Context applicationContext = getApplicationContext();
        atad e = dlwl.e(a.C().a);
        bjfr w = a.w();
        a.a();
        this.a = new bjfp(applicationContext, a, e, w);
        this.b = new dhbu(this, 1, "WearableSyncMessageChimeraService", null, "com.google.android.gms");
    }
}
