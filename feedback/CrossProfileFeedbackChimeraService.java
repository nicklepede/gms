package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.bagc;
import defpackage.rkk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CrossProfileFeedbackChimeraService extends BoundService {
    private final rkk a = new bagc(this);

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final /* synthetic */ IBinder onBind(Intent intent) {
        return this.a;
    }
}
