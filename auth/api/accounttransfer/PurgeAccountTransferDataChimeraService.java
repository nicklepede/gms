package com.google.android.gms.auth.api.accounttransfer;

import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.byln;
import defpackage.vpy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PurgeAccountTransferDataChimeraService extends GmsTaskChimeraService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        vpy.b(this);
        synchronized (vpy.a) {
            Log.i("AccountTransfer", String.format("ATDatabaseManagerPurging account transfer database", new Object[0]));
            deleteDatabase("auth.account_transfer.store.db");
            vpy.b = null;
        }
        return 0;
    }
}
