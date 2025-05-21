package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import defpackage.anxh;
import defpackage.anxi;
import defpackage.anxk;
import defpackage.asng;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.fshf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChimeraOperationService extends anxi {
    private static final anxk a = new anxk();

    public ChimeraOperationService() {
        super("StatementServiceOpSvc", a, fshf.a.a().f(), byhj.b.d(byhp.HIGH_SPEED));
    }

    public static void c(Context context, anxh anxhVar) {
        a.add(anxhVar);
        context.startService(asng.j("com.google.android.gms.statementservice.EXECUTE"));
    }

    @Override // defpackage.anxi, defpackage.anxm, android.os.Handler.Callback
    public final /* bridge */ /* synthetic */ boolean handleMessage(Message message) {
        super.handleMessage(message);
        return true;
    }

    @Override // defpackage.anxi, defpackage.anxm, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.anxi, defpackage.anxm, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
