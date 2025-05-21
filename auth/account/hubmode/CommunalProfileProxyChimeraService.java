package com.google.android.gms.auth.account.hubmode;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.vki;
import defpackage.vkj;
import defpackage.vko;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CommunalProfileProxyChimeraService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        Context a = AppContextProvider.a();
        if (vkj.a(a)) {
            return new vko(new vki(a));
        }
        return null;
    }
}
