package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgmt;
import defpackage.bgpg;
import defpackage.bgzu;
import defpackage.bhff;
import defpackage.bhfh;
import defpackage.bhko;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class LocationManagerModeChangeListenerIntentOperation extends IntentOperation {
    private final bgpg a;
    private final bgzu b;

    static {
        ausn.b("LocationModeChangeIntOp", auid.FIND_MY_DEVICE_SPOT);
    }

    public LocationManagerModeChangeListenerIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhfh.b() && bhff.b(intent, "android.location.MODE_CHANGED")) {
            this.b.a();
            if (bhko.a(this)) {
                return;
            }
            bgpg bgpgVar = this.a;
            synchronized (bgpgVar.b) {
                bgpgVar.c.clear();
                bgpgVar.d = 0;
            }
        }
    }

    public LocationManagerModeChangeListenerIntentOperation(bgmt bgmtVar) {
        this.a = bgmtVar.s();
        this.b = bgmtVar.x();
    }
}
