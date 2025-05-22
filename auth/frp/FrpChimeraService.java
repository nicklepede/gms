package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import defpackage.adof;
import defpackage.fmxa;
import defpackage.wun;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FrpChimeraService extends Service {
    private adof a;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            try {
                FrpSnapshot a = this.a.a();
                printWriter.write(String.format("WriteEncrypted: %b\n", Boolean.valueOf(fmxa.a.lK().h())));
                printWriter.write(String.format("SFB: %b\n", Boolean.valueOf(wun.b(this.a.a))));
                printWriter.write("Snapshot:\n");
                printWriter.write(String.format("\tS: %b\n", Boolean.valueOf(a.b)));
                printWriter.write(String.format("\tR: %b\n", Boolean.valueOf(a.c)));
                printWriter.write(String.format("\tLS: %b\n", Boolean.valueOf(a.d)));
            } catch (RemoteException e) {
                printWriter.write("Dump failed due to exception: " + e.getMessage());
            }
        } finally {
            printWriter.flush();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        adof adofVar = this.a;
        adofVar.asBinder();
        return adofVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new adof(this);
    }
}
