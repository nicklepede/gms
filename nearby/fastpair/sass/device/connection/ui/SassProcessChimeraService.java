package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.cigw;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SassProcessChimeraService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        ((ejhf) cigw.a.d().ah(7268)).x("SassProcessChimeraService onBind");
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        ((ejhf) cigw.a.d().ah(7269)).x("SassProcessChimeraService onUnbind");
        return false;
    }
}
