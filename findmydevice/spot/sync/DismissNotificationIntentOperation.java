package com.google.android.gms.findmydevice.spot.sync;

import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bdmb;
import defpackage.bebl;
import defpackage.bebo;
import defpackage.betk;
import defpackage.bfcc;
import defpackage.dwwv;
import defpackage.ensv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DismissNotificationIntentOperation extends IntentOperation {
    public static final asot a = asot.b("StopKeychainNotifIntent", asej.FIND_MY_DEVICE_SPOT);
    public final dwwv b;
    public final betk c;
    private final bebl d;
    private final bfcc e;
    private final ensv f;

    /* JADX WARN: Type inference failed for: r5v0, types: [bfcc, java.lang.Object] */
    public DismissNotificationIntentOperation() {
        this(((bebo) bebo.a()).j(), bebo.a().i(), ((bebo) bebo.a()).u(), ((bebo) bebo.a()).I(), bebo.a().G());
    }

    private static int a(int i) {
        bdmb bdmbVar = bdmb.SELF_PROVISIONING;
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

    public DismissNotificationIntentOperation(dwwv dwwvVar, bebl beblVar, betk betkVar, bfcc bfccVar, ensv ensvVar) {
        this.b = dwwvVar;
        this.d = beblVar;
        this.c = betkVar;
        this.e = bfccVar;
        this.f = ensvVar;
    }
}
