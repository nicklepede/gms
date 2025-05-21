package com.google.android.gms.appset.tasks;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.appset.tasks.DeveloperGroupIdRefreshTaskService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeveloperGroupIdRefreshTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int b = 0;
    public enss a;
    private uhk c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!fkan.e()) {
            return ensj.i(0);
        }
        this.a = ujf.a().submit(new Callable() { // from class: uja
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DeveloperGroupIdRefreshTaskService developerGroupIdRefreshTaskService = DeveloperGroupIdRefreshTaskService.this;
                return new uhr(new uhv(developerGroupIdRefreshTaskService, developerGroupIdRefreshTaskService.getClass().getName()));
            }
        });
        final Context a = AppContextProvider.a();
        final uhk uhkVar = this.c;
        final enss enssVar = this.a;
        return enox.g(enps.g(ensi.h(uhkVar.c.c(new enqc() { // from class: ugy
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                uio uioVar = (uio) obj;
                final fecj fecjVar = (fecj) uioVar.iB(5, null);
                fecjVar.X(uioVar);
                final ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((uio) fecjVar.b).c)).keySet());
                ensi h = ensi.h(enssVar);
                final uhk uhkVar2 = uhk.this;
                return enps.g(h, new enqc() { // from class: uhj
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        uhx uhxVar = (uhx) obj2;
                        final ArrayList arrayList2 = new ArrayList();
                        final List list = arrayList;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(uhxVar.a((String) it.next()));
                        }
                        final fecj fecjVar2 = fecjVar;
                        return ensj.c(arrayList2).a(new Callable() { // from class: uhi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i = uhk.d;
                                ArrayList arrayList3 = arrayList2;
                                int size = arrayList3.size();
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    fecj fecjVar3 = fecjVar2;
                                    if (i2 >= size) {
                                        return (uio) fecjVar3.Q();
                                    }
                                    String str = ((uhs) ensj.r((enss) arrayList3.get(i2))).a;
                                    fecj v = uij.a.v();
                                    c.j();
                                    fefi h2 = fegx.h(System.currentTimeMillis());
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar = v.b;
                                    uij uijVar = (uij) fecpVar;
                                    str.getClass();
                                    uijVar.b |= 1;
                                    uijVar.c = str;
                                    if (!fecpVar.L()) {
                                        v.U();
                                    }
                                    List list2 = list;
                                    uij uijVar2 = (uij) v.b;
                                    h2.getClass();
                                    uijVar2.d = h2;
                                    uijVar2.b |= 2;
                                    fecjVar3.bg((String) list2.get(i3), (uij) v.Q());
                                    i2++;
                                    i3++;
                                }
                            }
                        }, uhk.this.b);
                    }
                }, uhkVar2.b);
            }
        }, uhkVar.b)), new enqc() { // from class: ujb
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                ((uhr) ensj.r(DeveloperGroupIdRefreshTaskService.this.a)).c();
                return ensj.i(0);
            }
        }, ujf.a()), Throwable.class, new enqc() { // from class: ujc
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                enps.f(DeveloperGroupIdRefreshTaskService.this.a, new eiho() { // from class: ujd
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        int i = DeveloperGroupIdRefreshTaskService.b;
                        ((uhr) ((uhx) obj2)).c();
                        return null;
                    }
                }, ujf.a());
                d.d(a, "DeveloperIdRefreshTaskFailure", "Developer ID refresh task failed.");
                return ensj.i(2);
            }
        }, ujf.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.c = uhk.b(AppContextProvider.a());
    }
}
