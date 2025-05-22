package com.google.android.gms.appset.tasks;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.appset.tasks.DeveloperGroupIdRefreshTaskService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeveloperGroupIdRefreshTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int b = 0;
    public eqgl a;
    private wdj c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fmqs.e()) {
            return eqgc.i(0);
        }
        this.a = wfe.a().submit(new Callable() { // from class: wez
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DeveloperGroupIdRefreshTaskService developerGroupIdRefreshTaskService = DeveloperGroupIdRefreshTaskService.this;
                return new wdq(new wdu(developerGroupIdRefreshTaskService, developerGroupIdRefreshTaskService.getClass().getName()));
            }
        });
        final Context a = AppContextProvider.a();
        final wdj wdjVar = this.c;
        final eqgl eqglVar = this.a;
        return eqcq.g(eqdl.g(eqgb.h(wdjVar.c.c(new eqdv() { // from class: wcx
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                wen wenVar = (wen) obj;
                final fgrc fgrcVar = (fgrc) wenVar.iQ(5, null);
                fgrcVar.X(wenVar);
                final ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((wen) fgrcVar.b).c)).keySet());
                eqgb h = eqgb.h(eqglVar);
                final wdj wdjVar2 = wdj.this;
                return eqdl.g(h, new eqdv() { // from class: wdi
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        wdw wdwVar = (wdw) obj2;
                        final ArrayList arrayList2 = new ArrayList();
                        final List list = arrayList;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(wdwVar.a((String) it.next()));
                        }
                        final fgrc fgrcVar2 = fgrcVar;
                        return eqgc.c(arrayList2).a(new Callable() { // from class: wdh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i = wdj.d;
                                ArrayList arrayList3 = arrayList2;
                                int size = arrayList3.size();
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    fgrc fgrcVar3 = fgrcVar2;
                                    if (i2 >= size) {
                                        return (wen) fgrcVar3.Q();
                                    }
                                    String str = ((wdr) eqgc.r((eqgl) arrayList3.get(i2))).a;
                                    fgrc v = wei.a.v();
                                    c.j();
                                    fgub h2 = fgvq.h(System.currentTimeMillis());
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar = v.b;
                                    wei weiVar = (wei) fgriVar;
                                    str.getClass();
                                    weiVar.b |= 1;
                                    weiVar.c = str;
                                    if (!fgriVar.L()) {
                                        v.U();
                                    }
                                    List list2 = list;
                                    wei weiVar2 = (wei) v.b;
                                    h2.getClass();
                                    weiVar2.d = h2;
                                    weiVar2.b |= 2;
                                    fgrcVar3.bg((String) list2.get(i3), (wei) v.Q());
                                    i2++;
                                    i3++;
                                }
                            }
                        }, wdj.this.b);
                    }
                }, wdjVar2.b);
            }
        }, wdjVar.b)), new eqdv() { // from class: wfa
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                ((wdq) eqgc.r(DeveloperGroupIdRefreshTaskService.this.a)).c();
                return eqgc.i(0);
            }
        }, wfe.a()), Throwable.class, new eqdv() { // from class: wfb
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                eqdl.f(DeveloperGroupIdRefreshTaskService.this.a, new ekut() { // from class: wfc
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        int i = DeveloperGroupIdRefreshTaskService.b;
                        ((wdq) ((wdw) obj2)).c();
                        return null;
                    }
                }, wfe.a());
                d.d(a, "DeveloperIdRefreshTaskFailure", "Developer ID refresh task failed.");
                return eqgc.i(2);
            }
        }, wfe.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.c = wdj.b(AppContextProvider.a());
    }
}
