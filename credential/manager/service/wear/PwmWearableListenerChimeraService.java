package com.google.android.gms.credential.manager.service.wear;

import android.content.Intent;
import com.google.android.gms.credential.manager.service.wear.PwmWearableListenerChimeraService;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dmmv;
import defpackage.eluo;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PwmWearableListenerChimeraService extends dmmv {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("PwmWls", auid.CREDENTIAL_MANAGER);
    private final fxqu c = new fxre(new fxwd() { // from class: ayzt
        @Override // defpackage.fxwd
        public final Object a() {
            int i = PwmWearableListenerChimeraService.a;
            return awhj.a().putExtra("utm_source", "wearable").addFlags(268435456);
        }
    });

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        fxxm.f(messageEventParcelable, "messageEvent");
        ((eluo) b.h()).B("PwmWls: received message event: %s", messageEventParcelable);
        if (fxxm.n(messageEventParcelable.b, "/credential/manager/open_pwm")) {
            startActivity((Intent) this.c.a());
        }
    }
}
