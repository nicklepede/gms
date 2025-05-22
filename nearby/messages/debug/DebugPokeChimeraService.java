package com.google.android.gms.nearby.messages.debug;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aumo;
import defpackage.ausn;
import defpackage.cher;
import defpackage.cmkz;
import defpackage.faps;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DebugPokeChimeraService extends Service {
    public CountDownLatch a;
    private final faps b = new faps(this);
    private final ServiceConnection c = new cmkz(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ausn ausnVar = cher.a;
        this.a = new CountDownLatch(1);
        aumo a = aumo.a();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE");
        intent.setComponent(new ComponentName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        a.d(this, intent, this.c, 1);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ausn ausnVar = cher.a;
        aumo.a().b(this, this.c);
        super.onDestroy();
    }
}
