package com.google.android.gms.ads.jams;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.casd;
import defpackage.catb;
import defpackage.fmqp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements com.google.android.gms.ads.task.a {
    private final d a;

    public b(d dVar) {
        this.a = dVar;
    }

    static void c(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("NegotiationTaskType", a.a(i));
        casd a = casd.a(AppContextProvider.a());
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.ads.jams.NegotiationService";
        catbVar.e(0L, fmqp.c());
        catbVar.t("jams-negotiation-task");
        catbVar.u = bundle;
        catbVar.v(1);
        a.f(catbVar.b());
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("[JAMS] Next negotiation to run in 0 seconds");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0816 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0306 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a4  */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v27, types: [fgtq] */
    /* JADX WARN: Type inference failed for: r10v30, types: [fgtq] */
    /* JADX WARN: Type inference failed for: r1v40, types: [eqlx, fgov, fgri, fgsz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64, types: [calw] */
    @Override // com.google.android.gms.ads.task.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r40) {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.jams.b.a(cauf):int");
    }

    @Override // com.google.android.gms.ads.task.a
    public final void b() {
        if (new e(AppContextProvider.a()).g()) {
            c(5);
        }
    }
}
