package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.IntentOperation;
import defpackage.aqsz;
import defpackage.asiu;
import defpackage.dnnr;
import defpackage.fmqg;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FindBinderBufferSizeOperation extends IntentOperation {
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final int a(android.os.IBinder r9) {
        /*
            fmqg r0 = defpackage.fmqg.a
            fmqh r0 = r0.a()
            boolean r0 = r0.a()
            r1 = 0
            r2 = 1032(0x408, float:1.446E-42)
            r3 = r1
            r4 = r2
        Lf:
            r5 = 8
            java.lang.String r6 = "FindBufferSizeOperation"
            if (r3 >= r5) goto L4d
            int r5 = r4 * 1024
            android.os.Parcel r7 = android.os.Parcel.obtain()
            android.os.Parcel r8 = android.os.Parcel.obtain()
            defpackage.bqod.b(r7, r5)     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L36
            r5 = 1
            r9.transact(r5, r7, r8, r1)     // Catch: android.os.RemoteException -> L32 java.lang.Throwable -> L34
            if (r0 == 0) goto L2e
            r7.recycle()
            r8.recycle()
        L2e:
            int r4 = r4 + r4
            int r3 = r3 + 1
            goto Lf
        L32:
            r2 = r4
            goto L3b
        L34:
            r9 = move-exception
            goto L44
        L36:
            java.lang.String r9 = "OOM allocating parcel. NullBinder will use default size."
            android.util.Log.w(r6, r9)     // Catch: java.lang.Throwable -> L34
        L3b:
            if (r0 == 0) goto L43
            r7.recycle()
            r8.recycle()
        L43:
            return r2
        L44:
            if (r0 == 0) goto L4c
            r7.recycle()
            r8.recycle()
        L4c:
            throw r9
        L4d:
            java.lang.String r9 = "Could not trigger a RemoteException. NullBinder will use default size."
            android.util.Log.w(r6, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.FindBinderBufferSizeOperation.a(android.os.IBinder):int");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        aqsz aqszVar = new aqsz();
        Intent startIntent = BoundService.getStartIntent(this, true != fmqg.a.a().b() ? "com.google.android.gms.chimera.container.BIND_FIND_BUFFER_SIZE" : "com.google.android.gms.chimera.container.BIND_FIND_BUFFER_SIZE_IN_UNSTABLE_PROCESS");
        if (startIntent == null) {
            Log.w("FindBufferSizeOperation", "Failed to get the intent to bind to FindBinderBufferSizeBoundService. NullBinder will use a pre-determined size.");
            return;
        }
        asiu.a().d(this, startIntent, aqszVar, 1);
        try {
            try {
                int a = a(aqszVar.b(5000L, TimeUnit.MILLISECONDS));
                asiu.a().c(this, aqszVar);
                try {
                    FileWriter fileWriter = new FileWriter(new File(dnnr.b(this).getFilesDir(), "binder_buffer_size.txt"));
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
                asiu.a().c(this, aqszVar);
            }
        } catch (Throwable th) {
            asiu.a().c(this, aqszVar);
            throw th;
        }
    }
}
