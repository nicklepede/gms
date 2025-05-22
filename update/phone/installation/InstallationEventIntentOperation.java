package com.google.android.gms.update.phone.installation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.phone.installation.InstallationEventIntentOperation;
import defpackage.auad;
import defpackage.dhlq;
import defpackage.djol;
import defpackage.djuz;
import defpackage.ftnj;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class InstallationEventIntentOperation extends IntentOperation {
    private static final auad a = djuz.h("InstallationEventIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.h("Received intent: %s", intent);
        if (ftnj.c() && Objects.equals(intent.getAction(), "com.google.android.gms.update.SYSTEM_UPDATE_DOWNLOAD_STARTED")) {
            djol.a(this).e().z(new dhlq() { // from class: djyq
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) obj;
                    auad auadVar = djyw.a;
                    if (ftnj.c() && djyw.c(InstallationEventIntentOperation.this) && !systemUpdateStatus.N) {
                        fgrc v = emtl.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        emtl emtlVar = (emtl) v.b;
                        emtlVar.f = 2;
                        emtlVar.b |= 8;
                        djyw.d(v, systemUpdateStatus);
                    }
                }
            });
        }
    }
}
