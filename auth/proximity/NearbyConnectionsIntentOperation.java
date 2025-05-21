package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acfo;
import defpackage.acqf;
import defpackage.arxo;
import defpackage.brzd;
import defpackage.ezaq;
import defpackage.ezat;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.flcw;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class NearbyConnectionsIntentOperation extends IntentOperation {
    private acqf e;
    private static final arxo c = new arxo("ProximityAuth", "NearbyConnectionsIntentOperation");
    public static final Map a = new HashMap();
    private static final acfo d = new acfo();
    public static boolean b = false;

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, NearbyConnectionsIntentOperation.class, "com.google.android.gms.auth.proximity.START_NEARBY");
    }

    public static Intent b(Context context) {
        return IntentOperation.getStartIntent(context, NearbyConnectionsIntentOperation.class, "com.google.android.gms.auth.proximity.STOP_NEARBY");
    }

    private final void c(int i) {
        if (!flcw.y() || this.e == null) {
            return;
        }
        if (!flcw.H()) {
            acqf acqfVar = this.e;
            if (flcw.y()) {
                int i2 = i - 1;
                acqfVar.b();
                fecj v = ezat.a.v();
                acqfVar.e(v, "NearbyConnectionAdvertisementEvent");
                fecj v2 = ezaq.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ezaq ezaqVar = (ezaq) v2.b;
                ezaqVar.c = i2;
                ezaqVar.b |= 1;
                ezaq ezaqVar2 = (ezaq) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                ezat ezatVar = (ezat) v.b;
                ezaqVar2.getClass();
                ezatVar.d = ezaqVar2;
                ezatVar.c = 3;
                brzd.v().f((ezat) v.Q());
                return;
            }
            return;
        }
        acqf acqfVar2 = this.e;
        boolean z = b;
        if (flcw.y()) {
            int i3 = i - 1;
            acqfVar2.b();
            fecj v3 = ezat.a.v();
            acqfVar2.e(v3, "NearbyConnectionAdvertisementEvent");
            fecj v4 = ezaq.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            fecp fecpVar = v4.b;
            ezaq ezaqVar3 = (ezaq) fecpVar;
            ezaqVar3.c = i3;
            ezaqVar3.b |= 1;
            int i4 = true != z ? 2 : 3;
            if (!fecpVar.L()) {
                v4.U();
            }
            ezaq ezaqVar4 = (ezaq) v4.b;
            ezaqVar4.d = i4 - 1;
            ezaqVar4.b = 2 | ezaqVar4.b;
            ezaq ezaqVar5 = (ezaq) v4.Q();
            if (!v3.b.L()) {
                v3.U();
            }
            ezat ezatVar2 = (ezat) v3.b;
            ezaqVar5.getClass();
            ezatVar2.d = ezaqVar5;
            ezatVar2.c = 3;
            brzd.v().f((ezat) v3.Q());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018b A[Catch: all -> 0x019c, TryCatch #3 {, blocks: (B:4:0x0007, B:6:0x0014, B:8:0x0020, B:10:0x0024, B:11:0x019a, B:15:0x004c, B:17:0x0052, B:19:0x0056, B:21:0x006a, B:22:0x0074, B:24:0x009f, B:25:0x00a4, B:28:0x00ac, B:30:0x00b5, B:33:0x00ba, B:34:0x0195, B:38:0x00ca, B:40:0x00cf, B:42:0x00d7, B:44:0x00e5, B:45:0x013a, B:47:0x0141, B:49:0x018b, B:51:0x0147, B:53:0x0150, B:54:0x015e, B:56:0x0164, B:58:0x016c, B:59:0x0171, B:61:0x0179, B:63:0x0180, B:65:0x0184, B:69:0x00a2, B:70:0x0071), top: B:3:0x0007 }] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
