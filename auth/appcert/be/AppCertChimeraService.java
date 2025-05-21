package com.google.android.gms.auth.appcert.be;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.arxo;
import defpackage.uyy;
import defpackage.zrc;
import defpackage.zre;
import defpackage.zxe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppCertChimeraService extends Service {
    public static final arxo a = new arxo("GLSUser", "AppCertChimeraService");

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new zrc(new uyy(new zxe(this)), zre.a(this));
    }
}
