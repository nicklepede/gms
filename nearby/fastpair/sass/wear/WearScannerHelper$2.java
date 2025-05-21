package com.google.android.gms.nearby.fastpair.sass.wear;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.wear.WearScannerHelper$2;
import defpackage.cfdm;
import defpackage.cgiv;
import defpackage.cgiw;
import defpackage.cgst;
import defpackage.chnt;
import defpackage.cipp;
import defpackage.ejhf;
import defpackage.exfq;
import defpackage.exfr;
import defpackage.fqkx;
import defpackage.iru;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class WearScannerHelper$2 extends TracingBroadcastReceiver {
    public final /* synthetic */ cipp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearScannerHelper$2(cipp cippVar) {
        super("nearby");
        this.a = cippVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (intent == null || TextUtils.isEmpty(intent.getAction()) || !intent.getAction().equals("com.google.android.gms.nearby.fastpair.sass.device.ACTION_CONNECTING_UI_LAUNCHING")) {
            return;
        }
        if (fqkx.be()) {
            String b = cgiw.SASS_UI_LAUNCHING_ON_WEAR_INTENT.b(cfdm.a.nextInt());
            this.a.m = cgiv.a(cgiv.c(b, chnt.SMART_AUDIO_SOURCE_SWITCHING), b);
        }
        cipp cippVar = this.a;
        ((ejhf) cippVar.m.d().ah(7339)).P("WearScannerHelper: [%s] Receiving UI launching broadcast, trigger switch with %s", exfr.b(exfq.CUJ_STATE, "START"), cippVar.l);
        cippVar.i.h(cgst.class, new iru() { // from class: ciph
            @Override // defpackage.iru
            public final void a(Object obj) {
                ((cgst) obj).i(cicv.MEDIA, WearScannerHelper$2.this.a.m);
            }
        });
    }
}
