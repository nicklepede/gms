package com.google.android.gms.nearby.connection.service.analytics.buffers;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asmf;
import defpackage.byln;
import defpackage.cfjt;
import defpackage.cfju;
import defpackage.edkl;
import defpackage.ensj;
import defpackage.enss;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class CleanBufferedLogsService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private edkl b;

    private final void d() {
        final cfjt cfjtVar;
        List c;
        enss i;
        Context applicationContext = getApplicationContext();
        asmf asmfVar = new asmf(1, 9);
        cfju.a.b().p("One off task started", new Object[0]);
        try {
            edkl edklVar = this.b;
            cfjtVar = new cfjt(applicationContext);
            c = edklVar.c("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            cfju.a.e().i("Failed to upload and cleanup buffered %s logs: %s", e.getClass().getSimpleName(), String.valueOf(e.getMessage()));
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
        if (c != null && !c.isEmpty()) {
            final int size = c.size();
            i = asmfVar.submit(new Callable() { // from class: cfjr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context = cfjt.this.a;
                    if (cfjt.a(context)) {
                        edkl a2 = edkl.a(context);
                        int i2 = edkh.a;
                        if (edkh.a(context)) {
                            List<byte[]> c2 = a2.c("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
                            if (c2 != null && !c2.isEmpty()) {
                                cexs cexsVar = new cexs(context.getApplicationContext(), 2, new cexr() { // from class: cfjs
                                    @Override // defpackage.cexr
                                    public final void a(fecj fecjVar, Object obj) {
                                        exvh exvhVar = (exvh) obj;
                                        if (!fecjVar.b.L()) {
                                            fecjVar.U();
                                        }
                                        exwc exwcVar = (exwc) fecjVar.b;
                                        exwc exwcVar2 = exwc.a;
                                        exvhVar.getClass();
                                        exwcVar.g = exvhVar;
                                        exwcVar.b |= 16;
                                    }
                                });
                                for (byte[] bArr : c2) {
                                    if (bArr != null) {
                                        try {
                                            fecp y = fecp.y(exwc.a, bArr, 0, bArr.length, febw.a());
                                            fecp.M(y);
                                            cexsVar.c((exwc) y);
                                        } catch (fedk e2) {
                                            cfju.a.e().h("Failed to parse NearbyClientLog from buffered log. %s", e2);
                                            a2.e("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
                                        }
                                    }
                                }
                                int i3 = size;
                                a2.e("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
                                return Integer.valueOf(i3);
                            }
                            cfju.a.b().p("No persisted metrics found.", new Object[0]);
                        } else {
                            cfju.a.b().p("User did not opt-in for usage reporting.", new Object[0]);
                            a2.d();
                        }
                    } else {
                        cfju.a.b().p("User setup isn't completed yet.", new Object[0]);
                    }
                    return -1;
                }
            });
            i.get(20L, TimeUnit.SECONDS);
            cfju.a.b().p("One off task Success", new Object[0]);
        }
        i = ensj.i(0);
        i.get(20L, TimeUnit.SECONDS);
        cfju.a.b().p("One off task Success", new Object[0]);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        d();
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.b = edkl.a(getApplicationContext());
    }
}
