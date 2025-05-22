package com.google.android.gms.findmydevice.spot.wearables;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.bgda;
import defpackage.bhgp;
import defpackage.bhkl;
import defpackage.dlvf;
import defpackage.dmmv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class WearableCompanionListenerChimeraService extends dmmv {
    private final bhgp a;

    public WearableCompanionListenerChimeraService() {
        this(bgda.a());
    }

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        this.a.a(messageEventParcelable);
    }

    @Override // defpackage.dmmv, defpackage.dlvd
    public final void b(dlvf dlvfVar) {
        this.a.b(dlvfVar);
    }

    public WearableCompanionListenerChimeraService(bhkl bhklVar) {
        this.a = bhklVar.z();
    }
}
