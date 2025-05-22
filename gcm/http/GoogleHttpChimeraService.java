package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bkkb;
import defpackage.bkkc;
import defpackage.bniz;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleHttpChimeraService extends Service {
    private bniz a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("\nGoogleHttpService stats:");
        bkkc a = bkkc.a();
        printWriter.println("BackoffStatuses:");
        Map map = a.b;
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                printWriter.print((String) entry.getKey());
                printWriter.print("[");
                printWriter.print("failureCount: ");
                printWriter.print(((bkkb) entry.getValue()).a);
                printWriter.print(", currentBackoff: ");
                printWriter.print(((bkkb) entry.getValue()).b);
                printWriter.println("]");
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new bniz(this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
