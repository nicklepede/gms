package com.google.android.gms.auth.blockstore.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.service.FolsomIntentOperation;
import defpackage.aacc;
import defpackage.aaey;
import defpackage.aagm;
import defpackage.asmf;
import defpackage.asop;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.enrv;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.fkvs;
import defpackage.fkwa;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FolsomIntentOperation extends IntentOperation {
    public static final asot a = aacc.b("FolsomIntentOperation");
    private final enrv b = new aaey();
    private final ensv c = new asmf(Integer.MAX_VALUE, 10);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!asop.c(fkvs.d())) {
            ((ejhf) a.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        if (!"com.google.android.gms.auth.folsom.SUCCESSFUL_RECOVERY".equals(intent.getAction())) {
            ((ejhf) a.h()).x("Not an intent event that Blockstore needs to handle. Skipping.");
            return;
        }
        asot asotVar = a;
        ((ejhf) asotVar.h()).x("FOLSOM_SUCCESSFUL_RECOVERY_INTENT received");
        final long longExtra = intent.getLongExtra("com.google.android.gms.auth.folsom.EXTRA_SOURCE_ANDROID_ID", 0L);
        if (!fkwa.g() || !fkwa.a.a().q()) {
            ((ejhf) asotVar.h()).x("feature flags not enabled, skipping restore.");
        } else {
            if (longExtra == 0) {
                ((ejhf) asotVar.j()).x("No source android id found from Folsom broadcast.");
                return;
            }
            ensv ensvVar = this.c;
            final aagm b = aagm.b();
            ensj.t(ensi.h(ensvVar.submit(new Callable() { // from class: aaex
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    asot asotVar2 = FolsomIntentOperation.a;
                    aagn a2 = aagp.a();
                    a2.b(longExtra);
                    a2.c(aago.SINGLE_DEVICE);
                    a2.b = 2;
                    return Integer.valueOf(aagm.this.a(a2.a()));
                }
            })), this.b, ensvVar);
        }
    }
}
