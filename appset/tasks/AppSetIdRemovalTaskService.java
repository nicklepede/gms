package com.google.android.gms.appset.tasks;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.appset.tasks.AppSetIdRemovalTaskService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fkan;
import defpackage.uhk;
import defpackage.ujf;
import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppSetIdRemovalTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private uhk b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!fkan.g()) {
            return ensj.i(0);
        }
        final Context a2 = AppContextProvider.a();
        final uhk uhkVar = this.b;
        return enox.f(enps.f(ensi.h(uhkVar.c.c(new enqc() { // from class: uha
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                uio uioVar = (uio) obj;
                fecj fecjVar = (fecj) uioVar.iB(5, null);
                fecjVar.X(uioVar);
                HashMap hashMap = new HashMap(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((uio) fecjVar.b).b)));
                for (String str : hashMap.keySet()) {
                    uik uikVar = (uik) hashMap.get(str);
                    c.j();
                    fefi h = fegx.h(System.currentTimeMillis());
                    if (!uhk.g(uikVar, h)) {
                        Context context = a2;
                        uhk.this.a.b(context, str);
                        fecjVar.bj(str);
                        uhk.e(context, uikVar, h);
                    }
                }
                return ensj.i((uio) fecjVar.Q());
            }
        }, uhkVar.b)), new eiho() { // from class: uiy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = AppSetIdRemovalTaskService.a;
                return 0;
            }
        }, ujf.a()), Throwable.class, new eiho() { // from class: uiz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = AppSetIdRemovalTaskService.a;
                d.d(a2, "PvidRemovalTaskFailure", "PVID removal task failed.");
                return 2;
            }
        }, ujf.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.b = uhk.b(AppContextProvider.a());
    }
}
