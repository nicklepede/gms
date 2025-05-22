package com.google.android.gms.auth.appcert.be;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.abrc;
import defpackage.abre;
import defpackage.abxe;
import defpackage.auad;
import defpackage.wuy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppCertChimeraService extends Service {
    public static final auad a = new auad("GLSUser", "AppCertChimeraService");

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new abrc(new wuy(new abxe(this)), abre.a(this));
    }
}
