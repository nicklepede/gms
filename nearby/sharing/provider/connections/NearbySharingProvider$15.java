package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$15;
import defpackage.cqyr;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NearbySharingProvider$15 extends TracingBroadcastReceiver {
    public final /* synthetic */ cqyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbySharingProvider$15(cqyr cqyrVar) {
        super("nearby", "CertificatesDownloadReceiver");
        this.a = cqyrVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        this.a.aY(new Runnable() { // from class: cqxb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                chet b = conm.a.b();
                cqyr cqyrVar = NearbySharingProvider$15.this.a;
                Map map = cqyrVar.a;
                b.h("Reparse endpoints size: %s", Integer.valueOf(((buy) map).d));
                elgo i = elgo.i(map.keySet());
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) i.get(i2);
                    byte[] bArr = (byte[]) map.remove(str);
                    if (bArr != null) {
                        cqyrVar.aM(str, bArr);
                    }
                }
                if (ftgf.a.lK().aT()) {
                    Map map2 = cqyrVar.Y;
                    elgo i3 = elgo.i(map2.entrySet());
                    int size2 = i3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Map.Entry entry = (Map.Entry) i3.get(i4);
                        String str2 = (String) entry.getKey();
                        cqxy cqxyVar = (cqxy) entry.getValue();
                        cqyz cqyzVar = cqyrVar.t;
                        cqyy cqyyVar = cqxyVar.b;
                        cqzh d = cqyzVar.d(cqyyVar.d, cqyyVar.c);
                        if (d != null) {
                            Uri P = cqyrVar.P(d);
                            String ao = cqyr.ao(cqxyVar.b, d);
                            atzb.s(ao);
                            Map map3 = cqyrVar.e;
                            cqyb cqybVar = (cqyb) map3.remove(cqxyVar.a);
                            if (cqybVar == null) {
                                map2.remove(str2);
                            } else {
                                coiu b2 = cqxyVar.a.b();
                                b2.b = ao;
                                b2.c = P;
                                b2.b();
                                b2.s = d.c;
                                ShareTarget a = b2.a();
                                cqybVar.c = d;
                                map3.put(a, cqybVar);
                                coix coixVar = cqyrVar.n;
                                if (coixVar != null) {
                                    coixVar.d(a);
                                }
                                map2.remove(str2);
                            }
                        }
                    }
                }
            }
        });
    }
}
