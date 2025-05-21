package com.google.android.gms.location.gnssassistance;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.ips;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GnssAssistanceChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = ips.a;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        int i = ips.a;
        return null;
    }
}
