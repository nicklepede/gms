package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.ckpb;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SassProcessChimeraService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        ((eluo) ckpb.a.d().ai(7217)).x("SassProcessChimeraService onBind");
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        ((eluo) ckpb.a.d().ai(7218)).x("SassProcessChimeraService onUnbind");
        return false;
    }
}
