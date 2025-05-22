package com.google.android.gms.appset.tasks;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.appset.tasks.AppSetIdRemovalTaskService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fmqs;
import defpackage.wdj;
import defpackage.wfe;
import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppSetIdRemovalTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private wdj b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fmqs.g()) {
            return eqgc.i(0);
        }
        final Context a2 = AppContextProvider.a();
        final wdj wdjVar = this.b;
        return eqcq.f(eqdl.f(eqgb.h(wdjVar.c.c(new eqdv() { // from class: wcz
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                wen wenVar = (wen) obj;
                fgrc fgrcVar = (fgrc) wenVar.iQ(5, null);
                fgrcVar.X(wenVar);
                HashMap hashMap = new HashMap(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((wen) fgrcVar.b).b)));
                for (String str : hashMap.keySet()) {
                    wej wejVar = (wej) hashMap.get(str);
                    c.j();
                    fgub h = fgvq.h(System.currentTimeMillis());
                    if (!wdj.g(wejVar, h)) {
                        Context context = a2;
                        wdj.this.a.b(context, str);
                        fgrcVar.bj(str);
                        wdj.e(context, wejVar, h);
                    }
                }
                return eqgc.i((wen) fgrcVar.Q());
            }
        }, wdjVar.b)), new ekut() { // from class: wex
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = AppSetIdRemovalTaskService.a;
                return 0;
            }
        }, wfe.a()), Throwable.class, new ekut() { // from class: wey
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = AppSetIdRemovalTaskService.a;
                d.d(a2, "PvidRemovalTaskFailure", "PVID removal task failed.");
                return 2;
            }
        }, wfe.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.b = wdj.b(AppContextProvider.a());
    }
}
