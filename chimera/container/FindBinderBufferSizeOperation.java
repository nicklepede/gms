package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.IntentOperation;
import defpackage.asvp;
import defpackage.aumo;
import defpackage.bsvt;
import defpackage.dpya;
import defpackage.fpie;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FindBinderBufferSizeOperation extends IntentOperation {
    static final int a(IBinder iBinder) {
        int i = 1032;
        int i2 = 1032;
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i2 * 1024;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    bsvt.b(obtain, i4);
                    try {
                        iBinder.transact(1, obtain, obtain2, 0);
                        obtain.recycle();
                        obtain2.recycle();
                        i2 += i2;
                    } catch (RemoteException unused) {
                        i = i2;
                        return i;
                    }
                } catch (OutOfMemoryError unused2) {
                    Log.w("FindBufferSizeOperation", "OOM allocating parcel. NullBinder will use default size.");
                    return i;
                }
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        Log.w("FindBufferSizeOperation", "Could not trigger a RemoteException. NullBinder will use default size.");
        return 1032;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        asvp asvpVar = new asvp();
        Intent startIntent = BoundService.getStartIntent(this, true != fpie.a.lK().a() ? "com.google.android.gms.chimera.container.BIND_FIND_BUFFER_SIZE" : "com.google.android.gms.chimera.container.BIND_FIND_BUFFER_SIZE_IN_UNSTABLE_PROCESS");
        if (startIntent == null) {
            Log.w("FindBufferSizeOperation", "Failed to get the intent to bind to FindBinderBufferSizeBoundService. NullBinder will use a pre-determined size.");
            return;
        }
        aumo.a().d(this, startIntent, asvpVar, 1);
        try {
            try {
                int a = a(asvpVar.b(5000L, TimeUnit.MILLISECONDS));
                aumo.a().c(this, asvpVar);
                try {
                    FileWriter fileWriter = new FileWriter(new File(dpya.b(this).getFilesDir(), "binder_buffer_size.txt"));
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a);
                        fileWriter.write(sb.toString());
                        fileWriter.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    Log.w("FindBufferSizeOperation", "Failed to write binder buffer size to file. NullBinder will use default size.");
                }
            } catch (InterruptedException | TimeoutException unused2) {
                Log.w("FindBufferSizeOperation", "Binding interrupted or timed out. NullBinder will use a pre-determined size.");
                aumo.a().c(this, asvpVar);
            }
        } catch (Throwable th) {
            aumo.a().c(this, asvpVar);
            throw th;
        }
    }
}
