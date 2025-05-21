package com.google.android.gms.significantplaces.shim;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.aspo;
import defpackage.bqpn;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvic;
import defpackage.fvid;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignificantPlacesShimChimeraService extends BoundService {
    private final fvic a;

    public SignificantPlacesShimChimeraService() {
        fuyx fuyxVar = bqpn.a;
        this.a = fvid.b(bqpn.f);
    }

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        fvbo.f(fileDescriptor, "fd");
        fvbo.f(printWriter, "writer");
        fvbo.f(strArr, "args");
        aspo aspoVar = new aspo(printWriter, "  ");
        aspoVar.println();
        aspoVar.b();
        aspoVar.a();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        fvbo.f(intent, "intent");
        if (fvbo.n(intent.getAction(), "com.android.trust.provider.SignificantPlaceProvider.BIND")) {
            throw new IllegalStateException("Check failed.");
        }
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        fvid.e(this.a, null);
    }
}
