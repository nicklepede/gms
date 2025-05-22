package com.google.android.gms.auth.account.be.legacy;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.abxe;
import defpackage.aczb;
import defpackage.wuy;
import defpackage.xad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleAccountDataChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        abxe abxeVar = new abxe(this);
        return new aczb(new wuy(abxeVar), new xad(abxeVar));
    }
}
