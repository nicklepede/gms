package com.google.android.gms.backup.base;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.backup.base.AppContextProvider;
import defpackage.ahlk;
import defpackage.ahwd;
import defpackage.arfc;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupAccountManagerChimeraService extends Service {
    public static final asot a = asot.b("BackupAccountManagerChimeraService", asej.BACKUP);
    public static final ahwd b = new ahwd("BackupAccountManagerService");

    public static Intent a() {
        Intent intent = new Intent("com.google.android.gms.backup.GmsBackupAccountManagerService").setPackage("com.google.android.gms");
        AppContextProvider appContextProvider = AppContextProvider.c;
        if ((appContextProvider == null ? arfc.a() : appContextProvider.a).getPackageManager().resolveService(intent, 0) != null) {
            return intent;
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new ahlk(this);
    }
}
