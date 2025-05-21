package com.google.android.gms.adsidentity.service;

import android.content.Context;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.byln;
import defpackage.eiho;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enre;
import defpackage.enss;
import defpackage.fkas;
import defpackage.tdq;
import defpackage.tdx;
import defpackage.tft;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdsidentityStorageGmsTaskBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Context a = AppContextProvider.a();
        tdq a2 = tdq.a(a);
        try {
            tft.b();
            enss a3 = tft.a().a();
            eiho eihoVar = new eiho() { // from class: tfs
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return ((tdw) obj).b;
                }
            };
            enre enreVar = enre.a;
            List<tdx> list = (List) ((enpf) enps.f(a3, eihoVar, enreVar)).u();
            if (list.isEmpty()) {
                byjl.a(a).d("AdsidentityStorageTask", AdsidentityStorageGmsTaskBoundService.class.getName());
            } else {
                for (tdx tdxVar : list) {
                    if (System.currentTimeMillis() - tdxVar.c > fkas.a.a().d()) {
                        tft.b();
                        final String str = tdxVar.b;
                        ((enpf) tft.a().b(new eiho() { // from class: tfr
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                tdw tdwVar = (tdw) obj;
                                fecj fecjVar = (fecj) tdwVar.iB(5, null);
                                fecjVar.X(tdwVar);
                                for (int i = 0; i < ((tdw) fecjVar.b).b.size(); i++) {
                                    if (((tdx) ((tdw) fecjVar.b).b.get(i)).b.equals(str)) {
                                        if (!fecjVar.b.L()) {
                                            fecjVar.U();
                                        }
                                        tdw tdwVar2 = (tdw) fecjVar.b;
                                        fedh fedhVar = tdwVar2.b;
                                        if (!fedhVar.c()) {
                                            tdwVar2.b = fecp.E(fedhVar);
                                        }
                                        tdwVar2.b.remove(i);
                                    }
                                }
                                return (tdw) fecjVar.Q();
                            }
                        }, enreVar)).u();
                        a2.d("Request exceeds TTL and is cleaned up from ProtoDataStore. Request creation timestamp: %s", Long.valueOf(tdxVar.c));
                    }
                }
            }
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            a2.b(e);
            return 2;
        }
    }
}
