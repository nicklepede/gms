package com.google.android.gms.nearby.fastpair.sass.wear;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.wear.WearScannerHelper$2;
import defpackage.chky;
import defpackage.ciqy;
import defpackage.ciqz;
import defpackage.cjaw;
import defpackage.cjvu;
import defpackage.ckxu;
import defpackage.eluo;
import defpackage.eztz;
import defpackage.ezua;
import defpackage.ftes;
import defpackage.itk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WearScannerHelper$2 extends TracingBroadcastReceiver {
    public final /* synthetic */ ckxu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearScannerHelper$2(ckxu ckxuVar) {
        super("nearby");
        this.a = ckxuVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || !intent.getAction().equals("com.google.android.gms.nearby.fastpair.sass.device.ACTION_CONNECTING_UI_LAUNCHING")) {
            return;
        }
        if (ftes.be()) {
            String b = ciqz.SASS_UI_LAUNCHING_ON_WEAR_INTENT.b(chky.a.nextInt());
            this.a.m = ciqy.a(ciqy.c(b, cjvu.SMART_AUDIO_SOURCE_SWITCHING), b);
        }
        ckxu ckxuVar = this.a;
        ((eluo) ckxuVar.m.d().ai(7288)).P("WearScannerHelper: [%s] Receiving UI launching broadcast, trigger switch with %s", ezua.b(eztz.CUJ_STATE, "START"), ckxuVar.l);
        ckxuVar.i.h(cjaw.class, new itk() { // from class: ckxm
            @Override // defpackage.itk
            public final void a(Object obj) {
                ((cjaw) obj).i(ckla.MEDIA, WearScannerHelper$2.this.a.m);
            }
        });
    }
}
