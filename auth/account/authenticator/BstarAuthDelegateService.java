package com.google.android.gms.auth.account.authenticator;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.wyr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BstarAuthDelegateService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return new wyr(this);
    }
}
