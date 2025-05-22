package com.google.android.gms.backup.base;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.backup.base.AppContextProvider;
import defpackage.ajma;
import defpackage.ajwt;
import defpackage.athr;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupAccountManagerChimeraService extends Service {
    public static final ausn a = ausn.b("BackupAccountManagerChimeraService", auid.BACKUP);
    public static final ajwt b = new ajwt("BackupAccountManagerService");

    public static Intent a() {
        Intent intent = new Intent("com.google.android.gms.backup.GmsBackupAccountManagerService").setPackage("com.google.android.gms");
        AppContextProvider appContextProvider = AppContextProvider.c;
        if ((appContextProvider == null ? athr.a() : appContextProvider.a).getPackageManager().resolveService(intent, 0) != null) {
            return intent;
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new ajma(this);
    }
}
