package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import defpackage.atck;
import defpackage.ateu;
import defpackage.atwl;
import defpackage.atxa;
import defpackage.bbry;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g extends atxa {
    public g(Context context, Looper looper, atwl atwlVar, atck atckVar, ateu ateuVar) {
        super(context, looper, 216, atwlVar, atckVar, ateuVar);
    }

    @Override // defpackage.atwf, defpackage.aszr
    public final int a() {
        return 19729000;
    }

    @Override // defpackage.atwf
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.eventattestation.internal.IEventAttestationService");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }

    @Override // defpackage.atwf
    protected final String c() {
        return "com.google.android.gms.ads.eventattestation.internal.IEventAttestationService";
    }

    @Override // defpackage.atwf
    protected final String d() {
        return "com.google.android.gms.ads.identifier.service.EVENT_ATTESTATION";
    }

    @Override // defpackage.atwf
    public final Feature[] f() {
        return bbry.f;
    }
}
