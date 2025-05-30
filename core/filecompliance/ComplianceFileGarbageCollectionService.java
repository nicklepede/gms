package com.google.android.gms.core.filecompliance;

import com.google.android.gms.chimera.modules.core.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
import defpackage.fpmr;
import j$.time.Instant;
import java.io.File;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ComplianceFileGarbageCollectionService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (fpmr.l()) {
            File[] listFiles = AppContextProvider.a().getCacheDir().listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file : listFiles) {
                if (file.getName().startsWith("fc947472") && Instant.now().toEpochMilli() - file.lastModified() > 259200000) {
                    file.delete();
                }
            }
        }
        return 0;
    }
}
