package com.google.android.gms.auth.account.be.legacy;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aazb;
import defpackage.uyy;
import defpackage.vec;
import defpackage.zxe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleAccountDataChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        zxe zxeVar = new zxe(this);
        return new aazb(new uyy(zxeVar), new vec(zxeVar));
    }
}
