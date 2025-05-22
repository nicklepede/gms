package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import defpackage.apyz;
import defpackage.apza;
import defpackage.apzc;
import defpackage.aura;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.fvcd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ChimeraOperationService extends apza {
    private static final apzc a = new apzc();

    public ChimeraOperationService() {
        super("StatementServiceOpSvc", a, fvcd.a.lK().f(), caqb.b.d(caqh.HIGH_SPEED));
    }

    public static void c(Context context, apyz apyzVar) {
        a.add(apyzVar);
        context.startService(aura.j("com.google.android.gms.statementservice.EXECUTE"));
    }

    @Override // defpackage.apza, defpackage.apze, android.os.Handler.Callback
    public final /* bridge */ /* synthetic */ boolean handleMessage(Message message) {
        super.handleMessage(message);
        return true;
    }

    @Override // defpackage.apza, defpackage.apze, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.apza, defpackage.apze, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
