package com.google.android.gms.smartdevice.d2d;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.ddbw;
import defpackage.ddbx;
import defpackage.ddri;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetAccountImportController$ChallengeIntentHelper extends ResultReceiver {
    public final Context a;
    public final Queue b;
    public final ddri c;
    public final ddbx d;
    public boolean e;

    public TargetAccountImportController$ChallengeIntentHelper(Context context, Handler handler, ddri ddriVar, ddbx ddbxVar) {
        super(handler);
        this.b = new ArrayDeque();
        this.a = context;
        this.c = ddriVar;
        this.d = ddbxVar;
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        ddbw.a.j("Received result from challenge %d", Integer.valueOf(i));
        PendingIntent pendingIntent = (PendingIntent) this.b.poll();
        if (pendingIntent != null) {
            this.d.f(pendingIntent);
        } else {
            this.c.a();
            this.e = false;
        }
    }
}
