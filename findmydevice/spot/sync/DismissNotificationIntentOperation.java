package com.google.android.gms.findmydevice.spot.sync;

import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfnn;
import defpackage.bgcx;
import defpackage.bgda;
import defpackage.bgux;
import defpackage.bhds;
import defpackage.dziv;
import defpackage.eqgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DismissNotificationIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("StopKeychainNotifIntent", auid.FIND_MY_DEVICE_SPOT);
    public final dziv b;
    public final bgux c;
    private final bgcx d;
    private final bhds e;
    private final eqgo f;

    /* JADX WARN: Type inference failed for: r5v0, types: [bhds, java.lang.Object] */
    public DismissNotificationIntentOperation() {
        this(((bgda) bgda.a()).j(), bgda.a().i(), ((bgda) bgda.a()).u(), ((bgda) bgda.a()).I(), bgda.a().G());
    }

    private static int a(int i) {
        bfnn bfnnVar = bfnn.SELF_PROVISIONING;
        return i + (-1) != 1 ? 3 : 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(final android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public DismissNotificationIntentOperation(dziv dzivVar, bgcx bgcxVar, bgux bguxVar, bhds bhdsVar, eqgo eqgoVar) {
        this.b = dzivVar;
        this.d = bgcxVar;
        this.c = bguxVar;
        this.e = bhdsVar;
        this.f = eqgoVar;
    }
}
