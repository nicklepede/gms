package com.google.android.gms.core.filecompliance;

import android.content.Intent;
import com.google.android.gms.chimera.modules.core.AppContextProvider;
import defpackage.apzs;
import defpackage.auio;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.ekww;
import defpackage.fpmr;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class FileComplianceInitHandler extends apzs {
    static final CountDownLatch a = new CountDownLatch(1);
    private bsxr b = null;

    @Override // defpackage.apzs
    public final void b(Intent intent, int i) {
        if (fpmr.l()) {
            if (this.b == null) {
                ekww ekwwVar = bsxv.a;
                this.b = new bsxr();
            }
            bsxr.a(auio.FILE_COMPLIANCE_INIT);
            if ((i & 3) == 0) {
                casd a2 = casd.a(AppContextProvider.a());
                catg catgVar = new catg();
                catgVar.w(ComplianceFileGarbageCollectionService.class.getName());
                catgVar.q("ComplianceFileGarbageCollectionTask");
                catgVar.v(2);
                catgVar.l(false);
                catgVar.p = true;
                catgVar.a = catn.k;
                a2.f(catgVar.b());
                a.countDown();
            }
        }
    }
}
