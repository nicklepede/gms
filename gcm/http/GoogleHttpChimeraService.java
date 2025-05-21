package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bifm;
import defpackage.bifn;
import defpackage.blch;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GoogleHttpChimeraService extends Service {
    private blch a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("\nGoogleHttpService stats:");
        bifn a = bifn.a();
        printWriter.println("BackoffStatuses:");
        Map map = a.b;
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                printWriter.print((String) entry.getKey());
                printWriter.print("[");
                printWriter.print("failureCount: ");
                printWriter.print(((bifm) entry.getValue()).a);
                printWriter.print(", currentBackoff: ");
                printWriter.print(((bifm) entry.getValue()).b);
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
        this.a = new blch(this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
