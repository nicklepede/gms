package com.google.android.gms.droidguard;

import com.google.android.gms.chimera.modules.droidguard.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.azyk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DroidGuardFastRefreshGmsTaskBoundService extends GmsTaskBoundService {
    private final azyk a;

    static {
        ausn.b("DGFR", auid.DROID_GUARD);
    }

    public DroidGuardFastRefreshGmsTaskBoundService() {
        this.a = azyk.a(AppContextProvider.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r2 == 0) goto L13;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.droidguard.DroidGuardFastRefreshGmsTaskBoundService.a(cauf):int");
    }

    public DroidGuardFastRefreshGmsTaskBoundService(azyk azykVar) {
        this.a = azykVar;
    }
}
