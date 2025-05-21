package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import defpackage.aqzv;
import defpackage.arcf;
import defpackage.artw;
import defpackage.arul;
import defpackage.azoc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g extends arul {
    public g(Context context, Looper looper, artw artwVar, aqzv aqzvVar, arcf arcfVar) {
        super(context, looper, 216, artwVar, aqzvVar, arcfVar);
    }

    @Override // defpackage.artq, defpackage.aqxc
    public final int a() {
        return 19729000;
    }

    @Override // defpackage.artq
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }

    @Override // defpackage.artq
    protected final String c() {
        return "com.google.android.gms.ads.eventattestation.internal.IEventAttestationService";
    }

    @Override // defpackage.artq
    protected final String d() {
        return "com.google.android.gms.ads.identifier.service.EVENT_ATTESTATION";
    }

    @Override // defpackage.artq
    public final Feature[] f() {
        return azoc.f;
    }
}
