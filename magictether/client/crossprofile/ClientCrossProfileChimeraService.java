package com.google.android.gms.magictether.client.crossprofile;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.cdvf;
import defpackage.tdo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ClientCrossProfileChimeraService extends BoundService {
    private final tdo a = new cdvf(this);

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final /* synthetic */ IBinder onBind(Intent intent) {
        return this.a;
    }
}
