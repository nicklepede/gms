package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.bcjy;
import defpackage.tdo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CrossProfileFeedbackChimeraService extends BoundService {
    private final tdo a = new bcjy(this);

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final /* synthetic */ IBinder onBind(Intent intent) {
        return this.a;
    }
}
