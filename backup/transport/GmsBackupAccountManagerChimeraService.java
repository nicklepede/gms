package com.google.android.gms.backup.transport;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.amdz;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsBackupAccountManagerChimeraService extends Service {
    public static final ausn a = ausn.b("GmsBackupAccountManagerChimeraService", auid.BACKUP);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new amdz(this);
    }
}
