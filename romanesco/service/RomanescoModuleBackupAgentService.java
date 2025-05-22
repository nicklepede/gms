package com.google.android.gms.romanesco.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.daaf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RomanescoModuleBackupAgentService extends BoundService {
    public static final ausn a = ausn.b("CBR_RomanescoBrAgent", auid.ROMANESCO);

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return new daaf(this);
    }
}
