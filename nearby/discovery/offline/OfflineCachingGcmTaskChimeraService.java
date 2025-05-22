package com.google.android.gms.nearby.discovery.offline;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzna;
import defpackage.cauf;
import defpackage.cher;
import defpackage.eluo;
import defpackage.ftes;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class OfflineCachingGcmTaskChimeraService extends GmsTaskChimeraService {
    private final int a = (int) (ftes.a.lK().au() / ftes.z());

    private final bzlv d() {
        return bzna.a(this, "nearby", "nearby:gellercountpreference", 0);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        try {
            int a = (d().a("GELLER_PREFERENCE_KEY", 0) + 1) % this.a;
            if (a == 0) {
                startService(new Intent("com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE").setClassName(this, "com.google.android.gms.nearby.discovery.service.DiscoveryService"));
                a = 0;
            }
            bzlt c = d().c();
            c.f("GELLER_PREFERENCE_KEY", a);
            c.b().get();
        } catch (IOException | InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            ((eluo) ((eluo) ((eluo) cher.a.i()).s(e)).ai((char) 6940)).x("Fail to get how many times offline service has started");
        }
        startService(new Intent("com.google.android.gms.nearby.discovery.fastpair.service.CLEAN_CACHE").setClassName(this, "com.google.android.gms.nearby.discovery.service.DiscoveryService"));
        return 0;
    }
}
