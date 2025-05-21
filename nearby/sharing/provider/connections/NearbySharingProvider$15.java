package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$15;
import defpackage.copw;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NearbySharingProvider$15 extends TracingBroadcastReceiver {
    public final /* synthetic */ copw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbySharingProvider$15(copw copwVar) {
        super("nearby", "CertificatesDownloadReceiver");
        this.a = copwVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        this.a.aY(new Runnable() { // from class: coog
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                cexi b = cmfe.a.b();
                copw copwVar = NearbySharingProvider$15.this.a;
                Map map = copwVar.a;
                b.h("Reparse endpoints size: %s", Integer.valueOf(((bul) map).d));
                eitj i = eitj.i(map.keySet());
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) i.get(i2);
                    byte[] bArr = (byte[]) map.remove(str);
                    if (bArr != null) {
                        copwVar.aM(str, bArr);
                    }
                }
                if (fqmk.a.a().aX()) {
                    Map map2 = copwVar.Y;
                    eitj i3 = eitj.i(map2.entrySet());
                    int size2 = i3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Map.Entry entry = (Map.Entry) i3.get(i4);
                        String str2 = (String) entry.getKey();
                        copd copdVar = (copd) entry.getValue();
                        coqe coqeVar = copwVar.t;
                        coqd coqdVar = copdVar.b;
                        coqm d = coqeVar.d(coqdVar.d, coqdVar.c);
                        if (d != null) {
                            Uri P = copwVar.P(d);
                            String ao = copw.ao(copdVar.b, d);
                            arwm.s(ao);
                            Map map3 = copwVar.e;
                            copg copgVar = (copg) map3.remove(copdVar.a);
                            if (copgVar == null) {
                                map2.remove(str2);
                            } else {
                                cmam b2 = copdVar.a.b();
                                b2.b = ao;
                                b2.c = P;
                                b2.b();
                                b2.s = d.c;
                                ShareTarget a = b2.a();
                                copgVar.c = d;
                                map3.put(a, copgVar);
                                cmap cmapVar = copwVar.n;
                                if (cmapVar != null) {
                                    cmapVar.d(a);
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
