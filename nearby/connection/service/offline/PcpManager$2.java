package com.google.android.gms.nearby.connection.service.offline;

import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.connection.service.offline.PcpManager$2;
import defpackage.cfkt;
import defpackage.cfwc;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PcpManager$2 extends NetworkCallbackWrapper {
    final /* synthetic */ String a;
    final /* synthetic */ cfkt b;
    public final /* synthetic */ cfwc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PcpManager$2(cfwc cfwcVar, String str, cfkt cfktVar) {
        super("nearby", "PcpManager");
        this.a = str;
        this.b = cfktVar;
        this.c = cfwcVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        final String str = this.a;
        final cfkt cfktVar = this.b;
        this.c.T(new Runnable() { // from class: cfth
            @Override // java.lang.Runnable
            public final void run() {
                final cfkt cfktVar2;
                final PcpManager$2 pcpManager$2 = PcpManager$2.this;
                cfwc cfwcVar = pcpManager$2.c;
                cfnn cfnnVar = cfwcVar.k;
                final String str2 = str;
                final cfnj c = cfnnVar.c(str2);
                if (c == null || (cfktVar2 = cfktVar) == null || cfktVar2.B(str2) == null || cfktVar2.o() == null) {
                    return;
                }
                if (!cfktVar2.ck(str2)) {
                    cewq.d(cfju.a, new Runnable() { // from class: cfti
                        @Override // java.lang.Runnable
                        public final void run() {
                            cfju.a.b().h("retryBandwidthUpgradeWhenConnectedToWifi sendSupportedMediumsToRemoteDevice after %d ms.", Long.valueOf(fqjy.x()));
                            PcpManager$2.this.c.W(cfktVar2, c, str2);
                        }
                    }, fqjy.x(), cfwcVar.o);
                    return;
                }
                cfju.a.b().p("retryBandwidthUpgradeWhenConnectedToWifi requestSupportedMediumsFromRemoteDevice.", new Object[0]);
                try {
                    fecj v = exia.b.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    exia exiaVar = (exia) v.b;
                    exiaVar.c |= 1;
                    exiaVar.e = true;
                    c.u(cfqi.b(exjo.BANDWIDTH_UPGRADE_RETRY, (exia) v.Q()).r());
                } catch (IOException e) {
                    cfju.a.b().f(e).p("retryBandwidthUpgradeWhenConnectedToWifi requestSupportedMediumsFromRemoteDevice failed", new Object[0]);
                }
            }
        });
    }
}
