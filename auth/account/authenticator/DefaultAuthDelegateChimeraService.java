package com.google.android.gms.auth.account.authenticator;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aczy;
import defpackage.ausn;
import defpackage.wxb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DefaultAuthDelegateChimeraService extends Service {
    public static final ausn a = wxb.a("DefaultAuthDelegateChimeraService");

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new aczy(this);
    }
}
