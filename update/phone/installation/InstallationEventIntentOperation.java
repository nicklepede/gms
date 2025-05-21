package com.google.android.gms.update.phone.installation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.phone.installation.InstallationEventIntentOperation;
import defpackage.arxo;
import defpackage.dfak;
import defpackage.dhdf;
import defpackage.dhjt;
import defpackage.fqtk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class InstallationEventIntentOperation extends IntentOperation {
    private static final arxo a = dhjt.h("InstallationEventIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.h("Received intent: %s", intent);
        if (fqtk.c() && Objects.equals(intent.getAction(), "com.google.android.gms.update.SYSTEM_UPDATE_DOWNLOAD_STARTED")) {
            dhdf.a(this).e().z(new dfak() { // from class: dhnk
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) obj;
                    arxo arxoVar = dhnq.a;
                    if (fqtk.c() && dhnq.c(InstallationEventIntentOperation.this) && !systemUpdateStatus.N) {
                        fecj v = ekfz.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekfz ekfzVar = (ekfz) v.b;
                        ekfzVar.f = 2;
                        ekfzVar.b |= 8;
                        dhnq.d(v, systemUpdateStatus);
                    }
                }
            });
        }
    }
}
