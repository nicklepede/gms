package com.google.android.gms.auth.api.credentials.manager.providers.chromesync;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import defpackage.asot;
import defpackage.bmat;
import defpackage.bmeo;
import defpackage.bmfw;
import defpackage.bmgx;
import defpackage.bmkf;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.fkqz;
import defpackage.wic;
import defpackage.wlr;
import defpackage.xul;
import defpackage.yfb;
import defpackage.yfi;
import defpackage.yfj;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChromeSyncIntentOperation extends IntentOperation {
    private static final asot a = xul.a("ChromeSyncIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || "com.google.android.gms.auth.api.credentials".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ((Boolean) wlr.a.b()).booleanValue();
            AppContextProvider.a();
            if (fkqz.a.a().o()) {
                bmkf bmkfVar = (bmkf) yfj.a.a();
                bmkfVar.aj(xul.a(yfj.b(yfi.WEBAUTHN_CREDENTIAL_DATA)));
                bmkfVar.am(bmfw.AUTH_API_CREDENTIALS_PRE_SYNC_PASSKEYS, bmgx.a());
                bmkfVar.U(yfi.WEBAUTHN_CREDENTIAL_DATA).a();
            }
            if (fkqz.a.a().p()) {
                bmkf bmkfVar2 = (bmkf) yfj.a.a();
                bmkfVar2.aj(xul.a(yfj.b(yfi.PASSWORD_DATA)));
                bmkfVar2.am(bmfw.AUTH_API_CREDENTIALS_PRE_SYNC_PASSWORDS, bmgx.a());
                bmkfVar2.U(yfi.PASSWORD_DATA).a();
            }
            yfb yfbVar = new yfb(this);
            try {
                eitj b = wic.b();
                int i = ((ejcb) b).c;
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        yfbVar.e((bmat) b.get(i2)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        ((ejhf) ((ejhf) a.i()).s(e)).x("Failed to initialize sync.");
                    }
                }
            } catch (bmeo e2) {
                ((ejhf) ((ejhf) a.i()).s(e2)).x("Failed to get the accounts.");
            }
        }
    }
}
