package com.google.android.gms.ads.jams;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.fkak;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b implements com.google.android.gms.ads.task.a {
    private final d a;

    public b(d dVar) {
        this.a = dVar;
    }

    static void c(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("NegotiationTaskType", a.a(i));
        byjl a = byjl.a(AppContextProvider.a());
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.ads.jams.NegotiationService";
        bykjVar.e(0L, fkak.c());
        bykjVar.t("jams-negotiation-task");
        bykjVar.u = bundle;
        bykjVar.v(1);
        a.f(bykjVar.b());
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("[JAMS] Next negotiation to run in 0 seconds");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0823 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0306 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a8  */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v21, types: [feex] */
    /* JADX WARN: Type inference failed for: r10v24, types: [feex] */
    /* JADX WARN: Type inference failed for: r1v40, types: [enye, feac, fecp, feeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v65, types: [byde] */
    @Override // com.google.android.gms.ads.task.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r41) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.jams.b.a(byln):int");
    }

    @Override // com.google.android.gms.ads.task.a
    public final void b() {
        if (new e(AppContextProvider.a()).g()) {
            c(5);
        }
    }
}
