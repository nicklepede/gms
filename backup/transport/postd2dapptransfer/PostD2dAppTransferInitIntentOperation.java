package com.google.android.gms.backup.transport.postd2dapptransfer;

import android.content.Intent;
import com.google.android.gms.backup.transport.postd2dapptransfer.PostD2dAppTransferInitIntentOperation;
import defpackage.ajwt;
import defpackage.amkx;
import defpackage.amlm;
import defpackage.apzs;
import defpackage.auad;
import defpackage.fogi;
import defpackage.ral;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PostD2dAppTransferInitIntentOperation extends apzs {
    private static final auad a = ajwt.a("PostD2dAppTransferInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fogi fogiVar = fogi.a;
        if (fogiVar.lK().M()) {
            if ((i == 4 || i == 8) && !fogiVar.lK().K()) {
                return;
            }
            a.j("Init PostD2dAppTransfer feature on action ".concat(String.valueOf(intent.getAction())), new Object[0]);
            auad auadVar = amkx.a;
            final ral ralVar = new ral(this, amkx.b);
            final amlm amlmVar = new amlm();
            amkx.b(new Runnable() { // from class: amll
                @Override // java.lang.Runnable
                public final void run() {
                    amlp f = amlp.f(PostD2dAppTransferInitIntentOperation.this);
                    amkx.c(f, amlmVar);
                    amkx.e(f.b(), ralVar);
                }
            }, "Failed to refresh app data cleanup listener configurations on device boot up event", amlmVar);
        }
    }
}
