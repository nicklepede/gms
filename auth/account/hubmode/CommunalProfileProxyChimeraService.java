package com.google.android.gms.auth.account.hubmode;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.xgj;
import defpackage.xgk;
import defpackage.xgp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CommunalProfileProxyChimeraService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        Context a = AppContextProvider.a();
        if (xgk.a(a)) {
            return new xgp(new xgj(a));
        }
        return null;
    }
}
