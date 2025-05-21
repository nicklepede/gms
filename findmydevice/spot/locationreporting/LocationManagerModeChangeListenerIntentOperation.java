package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.belh;
import defpackage.benu;
import defpackage.beyh;
import defpackage.bfdp;
import defpackage.bfdr;
import defpackage.bfiy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LocationManagerModeChangeListenerIntentOperation extends IntentOperation {
    private final benu a;
    private final beyh b;

    static {
        asot.b("LocationModeChangeIntOp", asej.FIND_MY_DEVICE_SPOT);
    }

    public LocationManagerModeChangeListenerIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdr.b() && bfdp.b(intent, "android.location.MODE_CHANGED")) {
            this.b.a();
            if (bfiy.a(this)) {
                return;
            }
            benu benuVar = this.a;
            synchronized (benuVar.b) {
                benuVar.c.clear();
                benuVar.d = 0;
            }
        }
    }

    public LocationManagerModeChangeListenerIntentOperation(belh belhVar) {
        this.a = belhVar.s();
        this.b = belhVar.x();
    }
}
