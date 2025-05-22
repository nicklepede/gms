package com.google.android.gms.nearby.connection.service.analytics.buffers;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aupz;
import defpackage.cauf;
import defpackage.chrf;
import defpackage.chrg;
import defpackage.efxh;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class CleanBufferedLogsService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private efxh b;

    private final void d() {
        final chrf chrfVar;
        List c;
        eqgl i;
        Context applicationContext = getApplicationContext();
        aupz aupzVar = new aupz(1, 9);
        chrg.a.b().p("One off task started", new Object[0]);
        try {
            efxh efxhVar = this.b;
            chrfVar = new chrf(applicationContext);
            c = efxhVar.c("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            chrg.a.e().i("Failed to upload and cleanup buffered %s logs: %s", e.getClass().getSimpleName(), String.valueOf(e.getMessage()));
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
        if (c != null && !c.isEmpty()) {
            final int size = c.size();
            i = aupzVar.submit(new Callable() { // from class: chrd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context = chrf.this.a;
                    if (chrf.a(context)) {
                        efxh a2 = efxh.a(context);
                        int i2 = efxd.a;
                        if (efxd.a(context)) {
                            List<byte[]> c2 = a2.c("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
                            if (c2 != null && !c2.isEmpty()) {
                                chfd chfdVar = new chfd(context.getApplicationContext(), 2, new chfc() { // from class: chre
                                    @Override // defpackage.chfc
                                    public final void a(fgrc fgrcVar, Object obj) {
                                        fajt fajtVar = (fajt) obj;
                                        if (!fgrcVar.b.L()) {
                                            fgrcVar.U();
                                        }
                                        fako fakoVar = (fako) fgrcVar.b;
                                        fako fakoVar2 = fako.a;
                                        fajtVar.getClass();
                                        fakoVar.g = fajtVar;
                                        fakoVar.b |= 16;
                                    }
                                });
                                for (byte[] bArr : c2) {
                                    if (bArr != null) {
                                        try {
                                            fgri y = fgri.y(fako.a, bArr, 0, bArr.length, fgqp.a());
                                            fgri.M(y);
                                            chfdVar.c((fako) y);
                                        } catch (fgsd e2) {
                                            chrg.a.e().h("Failed to parse NearbyClientLog from buffered log. %s", e2);
                                            a2.e("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
                                        }
                                    }
                                }
                                int i3 = size;
                                a2.e("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
                                return Integer.valueOf(i3);
                            }
                            chrg.a.b().p("No persisted metrics found.", new Object[0]);
                        } else {
                            chrg.a.b().p("User did not opt-in for usage reporting.", new Object[0]);
                            a2.d();
                        }
                    } else {
                        chrg.a.b().p("User setup isn't completed yet.", new Object[0]);
                    }
                    return -1;
                }
            });
            i.get(20L, TimeUnit.SECONDS);
            chrg.a.b().p("One off task Success", new Object[0]);
        }
        i = eqgc.i(0);
        i.get(20L, TimeUnit.SECONDS);
        chrg.a.b().p("One off task Success", new Object[0]);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        d();
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.b = efxh.a(getApplicationContext());
    }
}
