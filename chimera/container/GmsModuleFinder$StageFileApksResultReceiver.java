package com.google.android.gms.chimera.container;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
