package com.google.android.gms.auth.api.accounttransfer;

import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;
import defpackage.xlz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PurgeAccountTransferDataChimeraService extends GmsTaskChimeraService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        xlz.b(this);
        synchronized (xlz.a) {
            Log.i("AccountTransfer", String.format("ATDatabaseManagerPurging account transfer database", new Object[0]));
            deleteDatabase("auth.account_transfer.store.db");
            xlz.b = null;
        }
        return 0;
    }
}
