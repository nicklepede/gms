package com.google.android.gms.adsidentity.service;

import android.content.Context;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.cauf;
import defpackage.ekut;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgl;
import defpackage.fmqy;
import defpackage.uzq;
import defpackage.uzx;
import defpackage.vbt;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdsidentityStorageGmsTaskBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Context a = AppContextProvider.a();
        uzq a2 = uzq.a(a);
        try {
            vbt.b();
            eqgl a3 = vbt.a().a();
            ekut ekutVar = new ekut() { // from class: vbs
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return ((uzw) obj).b;
                }
            };
            eqex eqexVar = eqex.a;
            List<uzx> list = (List) ((eqcy) eqdl.f(a3, ekutVar, eqexVar)).u();
            if (list.isEmpty()) {
                casd.a(a).d("AdsidentityStorageTask", AdsidentityStorageGmsTaskBoundService.class.getName());
            } else {
                for (uzx uzxVar : list) {
                    if (System.currentTimeMillis() - uzxVar.c > fmqy.a.lK().d()) {
                        vbt.b();
                        final String str = uzxVar.b;
                        ((eqcy) vbt.a().b(new ekut() { // from class: vbr
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                uzw uzwVar = (uzw) obj;
                                fgrc fgrcVar = (fgrc) uzwVar.iQ(5, null);
                                fgrcVar.X(uzwVar);
                                for (int i = 0; i < ((uzw) fgrcVar.b).b.size(); i++) {
                                    if (((uzx) ((uzw) fgrcVar.b).b.get(i)).b.equals(str)) {
                                        if (!fgrcVar.b.L()) {
                                            fgrcVar.U();
                                        }
                                        uzw uzwVar2 = (uzw) fgrcVar.b;
                                        fgsa fgsaVar = uzwVar2.b;
                                        if (!fgsaVar.c()) {
                                            uzwVar2.b = fgri.E(fgsaVar);
                                        }
                                        uzwVar2.b.remove(i);
                                    }
                                }
                                return (uzw) fgrcVar.Q();
                            }
                        }, eqexVar)).u();
                        a2.d("Request exceeds TTL and is cleaned up from ProtoDataStore. Request creation timestamp: %s", Long.valueOf(uzxVar.c));
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
