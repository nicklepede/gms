package com.google.android.gms.backup.transport;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.akdc;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsBackupAccountManagerChimeraService extends Service {
    public static final asot a = asot.b("GmsBackupAccountManagerChimeraService", asej.BACKUP);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new akdc(this);
    }
}
