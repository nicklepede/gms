package com.google.android.gms.common.heapdump;

import defpackage.atvd;
import defpackage.fpot;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class HeapDumpGmsBoundService extends HeapDumpBoundService {
    public HeapDumpGmsBoundService() {
        super("HeapDumpGmsBoundService");
    }

    @Override // com.google.android.gms.common.heapdump.HeapDumpBoundService
    public final boolean e() {
        return fpot.c();
    }

    HeapDumpGmsBoundService(ScheduledExecutorService scheduledExecutorService, atvd atvdVar) {
        super("HeapDumpGmsBoundService", scheduledExecutorService, atvdVar);
    }
}
