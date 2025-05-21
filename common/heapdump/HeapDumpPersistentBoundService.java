package com.google.android.gms.common.heapdump;

import defpackage.arso;
import defpackage.fmwu;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class HeapDumpPersistentBoundService extends HeapDumpBoundService {
    public HeapDumpPersistentBoundService() {
        super("HeapDumpPersistentBoundService");
    }

    @Override // com.google.android.gms.common.heapdump.HeapDumpBoundService
    public final boolean e() {
        return fmwu.d();
    }

    HeapDumpPersistentBoundService(ScheduledExecutorService scheduledExecutorService, arso arsoVar) {
        super("HeapDumpPersistentBoundService", scheduledExecutorService, arsoVar);
    }
}
