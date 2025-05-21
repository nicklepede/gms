package com.google.android.gms.nearby.discovery.offline;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxek;
import defpackage.byln;
import defpackage.cexg;
import defpackage.ejhf;
import defpackage.fqkx;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OfflineCachingGcmTaskChimeraService extends GmsTaskChimeraService {
    private final int a = (int) (fqkx.a.a().au() / fqkx.z());

    private final bxdf d() {
        return bxek.a(this, "nearby", "nearby:gellercountpreference", 0);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        try {
            int a = (d().a("GELLER_PREFERENCE_KEY", 0) + 1) % this.a;
            if (a == 0) {
                startService(new Intent("com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE").setClassName(this, "com.google.android.gms.nearby.discovery.service.DiscoveryService"));
                a = 0;
            }
            bxdd c = d().c();
            c.f("GELLER_PREFERENCE_KEY", a);
            c.b().get();
        } catch (IOException | InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((ejhf) ((ejhf) ((ejhf) cexg.a.i()).s(e)).ah((char) 6992)).x("Fail to get how many times offline service has started");
        }
        startService(new Intent("com.google.android.gms.nearby.discovery.fastpair.service.CLEAN_CACHE").setClassName(this, "com.google.android.gms.nearby.discovery.service.DiscoveryService"));
        return 0;
    }
}
