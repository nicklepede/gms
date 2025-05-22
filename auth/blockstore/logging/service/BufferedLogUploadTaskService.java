package com.google.android.gms.auth.blockstore.logging.service;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acbn;
import defpackage.accb;
import defpackage.accc;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgl;
import defpackage.fnnh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BufferedLogUploadTaskService extends GmsTaskBoundService {
    public static final ausn a = accc.b("BufferedLogUploadTaskService");
    public accb b;

    public static eqgl d(final Context context) {
        final Bundle bundle = new Bundle();
        final acbn acbnVar = new acbn();
        return eqdl.g(eqgb.h(acbnVar.c()), new eqdv() { // from class: accu
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                aclq aclqVar = (aclq) obj;
                ausn ausnVar = BufferedLogUploadTaskService.a;
                final aclq aclqVar2 = aclq.TASK_SCHEDULED;
                if (aclqVar == aclqVar2) {
                    ((eluo) BufferedLogUploadTaskService.a.h()).x("There is already a buffer flush task scheduled, skipping this time.");
                    return eqgf.a;
                }
                acbe acbeVar = acbnVar;
                BufferedLogUploadTaskService.e(context, bundle);
                ((eluo) BufferedLogUploadTaskService.a.h()).x("Buffer flush one-off task scheduled.");
                ((eluo) acbn.a.h()).B("Updating BufferFlushTaskStatus to: %s", aclqVar2);
                return ((acbn) acbeVar).b.b(new ekut() { // from class: acbj
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        acls aclsVar = (acls) obj2;
                        ausn ausnVar2 = acbn.a;
                        fgrc fgrcVar = (fgrc) aclsVar.iQ(5, null);
                        fgrcVar.X(aclsVar);
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        aclq aclqVar3 = aclq.this;
                        acls aclsVar2 = (acls) fgrcVar.b;
                        acls aclsVar3 = acls.a;
                        aclsVar2.d = aclqVar3.d;
                        aclsVar2.b |= 1;
                        return (acls) fgrcVar.Q();
                    }
                }, eqex.a);
            }
        }, eqex.a);
    }

    public static void e(Context context, Bundle bundle) {
        catb catbVar = new catb();
        catbVar.e(TimeUnit.MILLISECONDS.toSeconds(fnnh.b()), TimeUnit.MILLISECONDS.toSeconds(fnnh.b() + fnnh.a.lK().b()));
        catbVar.u = bundle;
        catbVar.t("BlockstoreBufferedLogUploadTask");
        catbVar.w(BufferedLogUploadTaskService.class.getName());
        catbVar.x(0, 0);
        catbVar.g(2);
        casd.a(context).f(catbVar.b());
        ((eluo) a.h()).x("One off task scheduled.");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        acbn acbnVar = new acbn();
        ((eluo) acbn.a.h()).x("flushing all buffered events");
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        dzwm dzwmVar = acbnVar.b;
        ekut ekutVar = new ekut() { // from class: acbl
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                acls aclsVar = (acls) obj;
                ausn ausnVar = acbn.a;
                if (aclsVar == null) {
                    ((eluo) acbn.a.i()).x("No buffer data on device!");
                    return null;
                }
                atomicReference.set(aclsVar.c);
                fgrc fgrcVar = (fgrc) aclsVar.iQ(5, null);
                fgrcVar.X(aclsVar);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                ((acls) fgrcVar.b).c = fgtj.a;
                aclq aclqVar = aclq.TASK_EXECUTED;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                acls aclsVar2 = (acls) fgrcVar.b;
                aclsVar2.d = aclqVar.d;
                aclsVar2.b |= 1;
                return (acls) fgrcVar.Q();
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.g(eqgb.h(eqdl.f(dzwmVar.b(ekutVar, eqexVar), new ekut() { // from class: acbm
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = acbn.a;
                return (List) atomicReference.get();
            }
        }, eqexVar)), new eqdv() { // from class: accv
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                List<aclr> list = (List) obj;
                if (list == null) {
                    ((eluo) BufferedLogUploadTaskService.a.j()).x("bufferedEvents is null. Skip the task.");
                    return eqgc.i(0);
                }
                ((eluo) BufferedLogUploadTaskService.a.h()).z("Flushed out %s events. Try logging them to Clearcut now.", list.size());
                for (aclr aclrVar : list) {
                    BufferedLogUploadTaskService bufferedLogUploadTaskService = BufferedLogUploadTaskService.this;
                    if (bufferedLogUploadTaskService.b == null) {
                        bufferedLogUploadTaskService.b = accc.a(bufferedLogUploadTaskService.getApplicationContext(), accc.c(bufferedLogUploadTaskService.getApplicationContext()));
                    }
                    accb accbVar = bufferedLogUploadTaskService.b;
                    int i = aclrVar.c;
                    if (i == 2) {
                        accbVar.l((rga) aclrVar.d, aclrVar.f);
                    } else if (i == 3) {
                        accbVar.a((reh) aclrVar.d, aclrVar.f);
                    } else if (i == 4) {
                        accbVar.e((rev) aclrVar.d, aclrVar.f);
                    }
                }
                return eqgc.i(0);
            }
        }, eqexVar);
    }
}
