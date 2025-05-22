package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aefo;
import defpackage.aeqf;
import defpackage.auad;
import defpackage.bugy;
import defpackage.fbpe;
import defpackage.fbph;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fnuf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class NearbyConnectionsIntentOperation extends IntentOperation {
    private aeqf e;
    private static final auad c = new auad("ProximityAuth", "NearbyConnectionsIntentOperation");
    public static final Map a = new HashMap();
    private static final aefo d = new aefo();
    public static boolean b = false;

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, NearbyConnectionsIntentOperation.class, "com.google.android.gms.auth.proximity.START_NEARBY");
    }

    public static Intent b(Context context) {
        return IntentOperation.getStartIntent(context, NearbyConnectionsIntentOperation.class, "com.google.android.gms.auth.proximity.STOP_NEARBY");
    }

    private final void c(int i) {
        if (!fnuf.y() || this.e == null) {
            return;
        }
        if (!fnuf.H()) {
            aeqf aeqfVar = this.e;
            if (fnuf.y()) {
                int i2 = i - 1;
                aeqfVar.b();
                fgrc v = fbph.a.v();
                aeqfVar.e(v, "NearbyConnectionAdvertisementEvent");
                fgrc v2 = fbpe.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fbpe fbpeVar = (fbpe) v2.b;
                fbpeVar.c = i2;
                fbpeVar.b |= 1;
                fbpe fbpeVar2 = (fbpe) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                fbph fbphVar = (fbph) v.b;
                fbpeVar2.getClass();
                fbphVar.d = fbpeVar2;
                fbphVar.c = 3;
                bugy.v().f((fbph) v.Q());
                return;
            }
            return;
        }
        aeqf aeqfVar2 = this.e;
        boolean z = b;
        if (fnuf.y()) {
            int i3 = i - 1;
            aeqfVar2.b();
            fgrc v3 = fbph.a.v();
            aeqfVar2.e(v3, "NearbyConnectionAdvertisementEvent");
            fgrc v4 = fbpe.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            fgri fgriVar = v4.b;
            fbpe fbpeVar3 = (fbpe) fgriVar;
            fbpeVar3.c = i3;
            fbpeVar3.b |= 1;
            int i4 = true != z ? 2 : 3;
            if (!fgriVar.L()) {
                v4.U();
            }
            fbpe fbpeVar4 = (fbpe) v4.b;
            fbpeVar4.d = i4 - 1;
            fbpeVar4.b = 2 | fbpeVar4.b;
            fbpe fbpeVar5 = (fbpe) v4.Q();
            if (!v3.b.L()) {
                v3.U();
            }
            fbph fbphVar2 = (fbph) v3.b;
            fbpeVar5.getClass();
            fbphVar2.d = fbpeVar5;
            fbphVar2.c = 3;
            bugy.v().f((fbph) v3.Q());
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
