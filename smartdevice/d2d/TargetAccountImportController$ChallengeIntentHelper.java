package com.google.android.gms.smartdevice.d2d;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.dfnb;
import defpackage.dfnc;
import defpackage.dgcn;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetAccountImportController$ChallengeIntentHelper extends ResultReceiver {
    public final Context a;
    public final Queue b;
    public final dgcn c;
    public final dfnc d;
    public boolean e;

    public TargetAccountImportController$ChallengeIntentHelper(Context context, Handler handler, dgcn dgcnVar, dfnc dfncVar) {
        super(handler);
        this.b = new ArrayDeque();
        this.a = context;
        this.c = dgcnVar;
        this.d = dfncVar;
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        dfnb.a.j("Received result from challenge %d", Integer.valueOf(i));
        PendingIntent pendingIntent = (PendingIntent) this.b.poll();
        if (pendingIntent != null) {
            this.d.f(pendingIntent);
        } else {
            this.c.a();
            this.e = false;
        }
    }
}
