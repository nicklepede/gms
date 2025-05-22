package com.google.android.gms.auth.account.be;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.atad;
import defpackage.ausn;
import defpackage.dffq;
import defpackage.dgng;
import defpackage.dgnh;
import defpackage.ekvl;
import defpackage.wxb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FinishBootstrapIntentOperation extends IntentOperation {
    private static final ausn a = wxb.a("FinishBootstrapMessengerService");
    private dgnh b;

    public FinishBootstrapIntentOperation() {
    }

    private static final Message a(String str) {
        Message obtain = Message.obtain((Handler) null, 1001);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = FinishBootstrapIntentOperation.class.getClassLoader();
        ekvl.y(classLoader);
        bundle.setClassLoader(classLoader);
        bundle.putString("errorMsg", str);
        obtain.setData(bundle);
        return obtain;
    }

    private static final Message b(Exception exc, String str) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return a(str);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aszs aszsVar = dffq.a;
        this.b = new atad((Context) this, (byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[Catch: RemoteException -> 0x0107, TryCatch #3 {RemoteException -> 0x0107, blocks: (B:6:0x0012, B:8:0x001e, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:17:0x0048, B:20:0x0052, B:22:0x0060, B:23:0x0103, B:25:0x0068, B:27:0x006e, B:29:0x0078, B:35:0x0080, B:39:0x0086, B:41:0x008e, B:43:0x00e9, B:44:0x00b5, B:37:0x00cd, B:47:0x00e1, B:51:0x00f3, B:56:0x00fd), top: B:5:0x0012 }] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    FinishBootstrapIntentOperation(dgng dgngVar, dgnh dgnhVar) {
        this.b = dgnhVar;
    }
}
