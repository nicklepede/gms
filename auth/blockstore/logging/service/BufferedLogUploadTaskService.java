package com.google.android.gms.auth.blockstore.logging.service;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aabn;
import defpackage.aacb;
import defpackage.aacc;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.enss;
import defpackage.fkwd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BufferedLogUploadTaskService extends GmsTaskBoundService {
    public static final asot a = aacc.b("BufferedLogUploadTaskService");
    public aacb b;

    public static enss d(final Context context) {
        final Bundle bundle = new Bundle();
        final aabn aabnVar = new aabn();
        return enps.g(ensi.h(aabnVar.c()), new enqc() { // from class: aacu
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                aalq aalqVar = (aalq) obj;
                asot asotVar = BufferedLogUploadTaskService.a;
                if (aalqVar == aalq.TASK_SCHEDULED) {
                    ((ejhf) BufferedLogUploadTaskService.a.h()).x("There is already a buffer flush task scheduled, skipping this time.");
                    return ensm.a;
                }
                aabe aabeVar = aabnVar;
                BufferedLogUploadTaskService.e(context, bundle);
                ((ejhf) BufferedLogUploadTaskService.a.h()).x("Buffer flush one-off task scheduled.");
                final aalq aalqVar2 = aalq.TASK_SCHEDULED;
                ((ejhf) aabn.a.h()).B("Updating BufferFlushTaskStatus to: %s", aalqVar2);
                return ((aabn) aabeVar).b.b(new eiho() { // from class: aabj
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        aals aalsVar = (aals) obj2;
                        asot asotVar2 = aabn.a;
                        fecj fecjVar = (fecj) aalsVar.iB(5, null);
                        fecjVar.X(aalsVar);
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        aalq aalqVar3 = aalq.this;
                        aals aalsVar2 = (aals) fecjVar.b;
                        aals aalsVar3 = aals.a;
                        aalsVar2.d = aalqVar3.d;
                        aalsVar2.b |= 1;
                        return (aals) fecjVar.Q();
                    }
                }, enre.a);
            }
        }, enre.a);
    }

    public static void e(Context context, Bundle bundle) {
        bykj bykjVar = new bykj();
        bykjVar.e(TimeUnit.MILLISECONDS.toSeconds(fkwd.b()), TimeUnit.MILLISECONDS.toSeconds(fkwd.b() + fkwd.a.a().b()));
        bykjVar.u = bundle;
        bykjVar.t("BlockstoreBufferedLogUploadTask");
        bykjVar.w(BufferedLogUploadTaskService.class.getName());
        bykjVar.x(0, 0);
        bykjVar.g(2);
        byjl.a(context).f(bykjVar.b());
        ((ejhf) a.h()).x("One off task scheduled.");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        aabn aabnVar = new aabn();
        ((ejhf) aabn.a.h()).x("flushing all buffered events");
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        dxkm dxkmVar = aabnVar.b;
        eiho eihoVar = new eiho() { // from class: aabl
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                aals aalsVar = (aals) obj;
                asot asotVar = aabn.a;
                if (aalsVar == null) {
                    ((ejhf) aabn.a.i()).x("No buffer data on device!");
                    return null;
                }
                atomicReference.set(aalsVar.c);
                fecj fecjVar = (fecj) aalsVar.iB(5, null);
                fecjVar.X(aalsVar);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ((aals) fecjVar.b).c = feeq.a;
                aalq aalqVar = aalq.TASK_EXECUTED;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                aals aalsVar2 = (aals) fecjVar.b;
                aalsVar2.d = aalqVar.d;
                aalsVar2.b |= 1;
                return (aals) fecjVar.Q();
            }
        };
        enre enreVar = enre.a;
        return enps.g(ensi.h(enps.f(dxkmVar.b(eihoVar, enreVar), new eiho() { // from class: aabm
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = aabn.a;
                return (List) atomicReference.get();
            }
        }, enreVar)), new enqc() { // from class: aacv
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                List<aalr> list = (List) obj;
                if (list == null) {
                    ((ejhf) BufferedLogUploadTaskService.a.j()).x("bufferedEvents is null. Skip the task.");
                    return ensj.i(0);
                }
                ((ejhf) BufferedLogUploadTaskService.a.h()).z("Flushed out %s events. Try logging them to Clearcut now.", list.size());
                for (aalr aalrVar : list) {
                    BufferedLogUploadTaskService bufferedLogUploadTaskService = BufferedLogUploadTaskService.this;
                    if (bufferedLogUploadTaskService.b == null) {
                        bufferedLogUploadTaskService.b = aacc.a(bufferedLogUploadTaskService.getApplicationContext(), aacc.c(bufferedLogUploadTaskService.getApplicationContext()));
                    }
                    aacb aacbVar = bufferedLogUploadTaskService.b;
                    int i = aalrVar.c;
                    if (i == 2) {
                        aacbVar.l((pmw) aalrVar.d, aalrVar.f);
                    } else if (i == 3) {
                        aacbVar.a((pld) aalrVar.d, aalrVar.f);
                    } else if (i == 4) {
                        aacbVar.e((plr) aalrVar.d, aalrVar.f);
                    }
                }
                return ensj.i(0);
            }
        }, enreVar);
    }
}
