package com.google.android.gms.romanesco.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.cxqi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RomanescoModuleBackupAgentService extends BoundService {
    public static final asot a = asot.b("CBR_RomanescoBrAgent", asej.ROMANESCO);

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return new cxqi(this);
    }
}
