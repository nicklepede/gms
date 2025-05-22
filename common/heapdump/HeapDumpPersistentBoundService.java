package com.google.android.gms.common.heapdump;

import defpackage.atvd;
import defpackage.fpot;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class HeapDumpPersistentBoundService extends HeapDumpBoundService {
    public HeapDumpPersistentBoundService() {
        super("HeapDumpPersistentBoundService");
    }

    @Override // com.google.android.gms.common.heapdump.HeapDumpBoundService
    public final boolean e() {
        return fpot.d();
    }

    HeapDumpPersistentBoundService(ScheduledExecutorService scheduledExecutorService, atvd atvdVar) {
        super("HeapDumpPersistentBoundService", scheduledExecutorService, atvdVar);
    }
}
