package com.google.android.gms.core.filecompliance;

import android.content.Intent;
import com.google.android.gms.chimera.modules.core.AppContextProvider;
import defpackage.anya;
import defpackage.aseu;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.eijr;
import defpackage.fmut;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class FileComplianceInitHandler extends anya {
    static final CountDownLatch a = new CountDownLatch(1);
    private bqqa b = null;

    @Override // defpackage.anya
    public final void b(Intent intent, int i) {
        if (fmut.l()) {
            if (this.b == null) {
                eijr eijrVar = bqqe.a;
                this.b = new bqqa();
            }
            bqqa.a(aseu.FILE_COMPLIANCE_INIT);
            if ((i & 3) == 0) {
                byjl a2 = byjl.a(AppContextProvider.a());
                byko bykoVar = new byko();
                bykoVar.w(ComplianceFileGarbageCollectionService.class.getName());
                bykoVar.q("ComplianceFileGarbageCollectionTask");
                bykoVar.v(2);
                bykoVar.l(false);
                bykoVar.p = true;
                bykoVar.a = bykv.k;
                a2.f(bykoVar.b());
                a.countDown();
            }
        }
    }
}
