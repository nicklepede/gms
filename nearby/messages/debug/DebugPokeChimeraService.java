package com.google.android.gms.nearby.messages.debug;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.asiu;
import defpackage.asot;
import defpackage.cexg;
import defpackage.ckcu;
import defpackage.eybg;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DebugPokeChimeraService extends Service {
    public CountDownLatch a;
    private final eybg b = new eybg(this);
    private final ServiceConnection c = new ckcu(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        asot asotVar = cexg.a;
        this.a = new CountDownLatch(1);
        asiu a = asiu.a();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE");
        intent.setComponent(new ComponentName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        a.d(this, intent, this.c, 1);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        asot asotVar = cexg.a;
        asiu.a().b(this, this.c);
        super.onDestroy();
    }
}
