package com.google.android.gms.semanticlocation.service.operations;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.internal.SemanticLocationParameters;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.dbsp;
import defpackage.fush;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationStateCacheService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocation.service.operations.SemanticLocationStateCacheService";
    private static final Map b = new HashMap();

    public static synchronized SemanticLocationState d(SemanticLocationParameters semanticLocationParameters) {
        synchronized (SemanticLocationStateCacheService.class) {
            Map map = b;
            if (map.isEmpty()) {
                return null;
            }
            SemanticLocationState semanticLocationState = (SemanticLocationState) map.get(semanticLocationParameters);
            if (semanticLocationState != null) {
                if (semanticLocationState.c < Duration.ofMillis(System.currentTimeMillis()).minusSeconds(fush.f()).toSeconds()) {
                    ausn ausnVar = dbsp.a;
                    map.remove(semanticLocationParameters);
                    return null;
                }
            }
            return semanticLocationState;
        }
    }

    public static synchronized void e(Context context, SemanticLocationParameters semanticLocationParameters, SemanticLocationState semanticLocationState) {
        synchronized (SemanticLocationStateCacheService.class) {
            if (fush.f() > 0) {
                ausn ausnVar = dbsp.a;
                fush.f();
                b.put(semanticLocationParameters, semanticLocationState);
                casd a2 = casd.a(context);
                catb catbVar = new catb();
                catbVar.w(a);
                catbVar.t("SemanticLocationStateCacheService");
                catbVar.v(1);
                catbVar.e(fush.f(), fush.f() + 60);
                a2.f(catbVar.b());
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ausn ausnVar = dbsp.a;
        long seconds = Duration.ofMillis(System.currentTimeMillis()).minusSeconds(fush.f()).toSeconds();
        Iterator it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((SemanticLocationState) entry.getValue()).c < seconds) {
                long j = ((SemanticLocationState) entry.getValue()).c;
                it.remove();
            }
        }
        return 0;
    }
}
