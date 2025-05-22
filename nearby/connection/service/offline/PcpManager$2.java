package com.google.android.gms.nearby.connection.service.offline;

import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.connection.service.offline.PcpManager$2;
import defpackage.chsf;
import defpackage.cidm;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PcpManager$2 extends NetworkCallbackWrapper {
    final /* synthetic */ String a;
    final /* synthetic */ chsf b;
    public final /* synthetic */ cidm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PcpManager$2(cidm cidmVar, String str, chsf chsfVar) {
        super("nearby", "PcpManager");
        this.a = str;
        this.b = chsfVar;
        this.c = cidmVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        final String str = this.a;
        final chsf chsfVar = this.b;
        this.c.T(new Runnable() { // from class: ciar
            @Override // java.lang.Runnable
            public final void run() {
                final chsf chsfVar2;
                final PcpManager$2 pcpManager$2 = PcpManager$2.this;
                cidm cidmVar = pcpManager$2.c;
                chux chuxVar = cidmVar.k;
                final String str2 = str;
                final chut c = chuxVar.c(str2);
                if (c == null || (chsfVar2 = chsfVar) == null || chsfVar2.B(str2) == null || chsfVar2.o() == null) {
                    return;
                }
                if (!chsfVar2.cl(str2)) {
                    cheb.d(chrg.a, new Runnable() { // from class: cias
                        @Override // java.lang.Runnable
                        public final void run() {
                            chrg.a.b().h("retryBandwidthUpgradeWhenConnectedToWifi sendSupportedMediumsToRemoteDevice after %d ms.", Long.valueOf(ftdq.x()));
                            PcpManager$2.this.c.W(chsfVar2, c, str2);
                        }
                    }, ftdq.x(), cidmVar.o);
                    return;
                }
                chrg.a.b().p("retryBandwidthUpgradeWhenConnectedToWifi requestSupportedMediumsFromRemoteDevice.", new Object[0]);
                try {
                    fgrc v = ezwl.b.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    ezwl ezwlVar = (ezwl) v.b;
                    ezwlVar.c |= 1;
                    ezwlVar.e = true;
                    c.u(chxs.b(ezxz.BANDWIDTH_UPGRADE_RETRY, (ezwl) v.Q()).r());
                } catch (IOException e) {
                    chrg.a.b().f(e).p("retryBandwidthUpgradeWhenConnectedToWifi requestSupportedMediumsFromRemoteDevice failed", new Object[0]);
                }
            }
        });
    }
}
