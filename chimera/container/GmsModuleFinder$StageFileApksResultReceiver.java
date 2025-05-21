package com.google.android.gms.chimera.container;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsModuleFinder$StageFileApksResultReceiver extends ResultReceiver {
    public final ArrayBlockingQueue a;

    public GmsModuleFinder$StageFileApksResultReceiver(Handler handler) {
        super(handler);
        this.a = new ArrayBlockingQueue(1);
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        try {
            this.a.add(Integer.valueOf(i));
        } catch (IllegalStateException unused) {
            Log.w("GmsModuleFndr", "Duplicate result received");
        }
    }
}
