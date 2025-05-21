package com.google.android.gms.droidguard;

import com.google.android.gms.chimera.modules.droidguard.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.axuk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DroidGuardFastRefreshGmsTaskBoundService extends GmsTaskBoundService {
    private final axuk a;

    static {
        asot.b("DGFR", asej.DROID_GUARD);
    }

    public DroidGuardFastRefreshGmsTaskBoundService() {
        this.a = axuk.a(AppContextProvider.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r2 == 0) goto L13;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.droidguard.DroidGuardFastRefreshGmsTaskBoundService.a(byln):int");
    }

    public DroidGuardFastRefreshGmsTaskBoundService(axuk axukVar) {
        this.a = axukVar;
    }
}
