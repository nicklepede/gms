package com.google.android.gms.location.gnssassistance;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.iri;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GnssAssistanceChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = iri.a;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        int i = iri.a;
        return null;
    }
}
