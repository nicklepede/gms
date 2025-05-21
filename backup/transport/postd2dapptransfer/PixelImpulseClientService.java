package com.google.android.gms.backup.transport.postd2dapptransfer;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.backup.transport.postd2dapptransfer.PixelImpulseClientService;
import defpackage.ahwd;
import defpackage.akjw;
import defpackage.akkm;
import defpackage.arxo;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.pgn;
import defpackage.phh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PixelImpulseClientService extends BoundService {
    private static final arxo a = ahwd.a("PixelImpulseClientService");

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        a.j("PixelImpulseClientService onBind", new Object[0]);
        arxo arxoVar = akjw.a;
        final phh phhVar = new phh(this, akjw.b);
        final akkm akkmVar = new akkm();
        return new pgn(phhVar, new fvaf() { // from class: akjs
            @Override // defpackage.fvaf
            public final Object a() {
                final PixelImpulseClientService pixelImpulseClientService = PixelImpulseClientService.this;
                final akkm akkmVar2 = akkmVar;
                final phh phhVar2 = phhVar;
                akjw.c(new Runnable() { // from class: akjr
                    @Override // java.lang.Runnable
                    public final void run() {
                        akka a2 = akjw.a(PixelImpulseClientService.this);
                        akjw.d(a2, akkmVar2);
                        akjw.f(a2, phhVar2);
                    }
                }, "Failed to refresh app data cleanup listener configurations on server start", akkmVar2);
                return fuvs.a;
            }
        }, new fvaq() { // from class: akjp
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                final phl phlVar = (phl) obj;
                final phh phhVar2 = phhVar;
                final PixelImpulseClientService pixelImpulseClientService = PixelImpulseClientService.this;
                final akkm akkmVar2 = akkmVar;
                akjw.c(new Runnable() { // from class: akjq
                    @Override // java.lang.Runnable
                    public final void run() {
                        akjw.e(phlVar, akjw.a(PixelImpulseClientService.this), phhVar2, akkmVar2);
                    }
                }, "Failed to handle PixelStateChangeEvents", akkmVar2);
                return fuvs.a;
            }
        });
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        a.j("PixelImpulseClientService onCreate", new Object[0]);
    }
}
