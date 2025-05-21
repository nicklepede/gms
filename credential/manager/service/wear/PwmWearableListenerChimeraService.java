package com.google.android.gms.credential.manager.service.wear;

import android.content.Intent;
import com.google.android.gms.credential.manager.service.wear.PwmWearableListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.asej;
import defpackage.asot;
import defpackage.dkbc;
import defpackage.ejhf;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PwmWearableListenerChimeraService extends dkbc {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("PwmWls", asej.CREDENTIAL_MANAGER);
    private final fuuw c = new fuvg(new fvaf() { // from class: awvt
        @Override // defpackage.fvaf
        public final Object a() {
            int i = PwmWearableListenerChimeraService.a;
            return aude.a().putExtra("utm_source", "wearable").addFlags(268435456);
        }
    });

    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(MessageEventParcelable messageEventParcelable) {
        fvbo.f(messageEventParcelable, "messageEvent");
        ((ejhf) b.h()).B("PwmWls: received message event: %s", messageEventParcelable);
        if (fvbo.n(messageEventParcelable.b, "/credential/manager/open_pwm")) {
            startActivity((Intent) this.c.a());
        }
    }
}
