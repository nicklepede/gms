package com.google.android.gms.significantplaces.shim;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.auti;
import defpackage.bsxe;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fyea;
import defpackage.fyeb;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignificantPlacesShimChimeraService extends BoundService {
    private final fyea a;

    public SignificantPlacesShimChimeraService() {
        fxuv fxuvVar = bsxe.a;
        this.a = fyeb.b(bsxe.f);
    }

    @Override // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        fxxm.f(fileDescriptor, "fd");
        fxxm.f(printWriter, "writer");
        fxxm.f(strArr, "args");
        auti autiVar = new auti(printWriter, "  ");
        autiVar.println();
        autiVar.b();
        autiVar.a();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        fxxm.f(intent, "intent");
        if (fxxm.n(intent.getAction(), "com.android.trust.provider.SignificantPlaceProvider.BIND")) {
            throw new IllegalStateException("Check failed.");
        }
        return null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        fyeb.e(this.a, null);
    }
}
