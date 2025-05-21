package com.google.android.gms.auth.account.authenticator;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aazy;
import defpackage.asot;
import defpackage.vbb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DefaultAuthDelegateChimeraService extends Service {
    public static final asot a = vbb.a("DefaultAuthDelegateChimeraService");

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new aazy(this);
    }
}
