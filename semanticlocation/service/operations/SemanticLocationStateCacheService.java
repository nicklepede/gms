package com.google.android.gms.semanticlocation.service.operations;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.internal.SemanticLocationParameters;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.czir;
import defpackage.frxn;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
                if (semanticLocationState.c < Duration.ofMillis(System.currentTimeMillis()).minusSeconds(frxn.f()).toSeconds()) {
                    asot asotVar = czir.a;
                    map.remove(semanticLocationParameters);
                    return null;
                }
            }
            return semanticLocationState;
        }
    }

    public static synchronized void e(Context context, SemanticLocationParameters semanticLocationParameters, SemanticLocationState semanticLocationState) {
        synchronized (SemanticLocationStateCacheService.class) {
            if (frxn.f() > 0) {
                asot asotVar = czir.a;
                frxn.f();
                b.put(semanticLocationParameters, semanticLocationState);
                byjl a2 = byjl.a(context);
                bykj bykjVar = new bykj();
                bykjVar.w(a);
                bykjVar.t("SemanticLocationStateCacheService");
                bykjVar.v(1);
                bykjVar.e(frxn.f(), frxn.f() + 60);
                a2.f(bykjVar.b());
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        asot asotVar = czir.a;
        long seconds = Duration.ofMillis(System.currentTimeMillis()).minusSeconds(frxn.f()).toSeconds();
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
