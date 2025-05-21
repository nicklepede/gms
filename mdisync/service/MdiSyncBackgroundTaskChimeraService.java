package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskChimeraService;
import defpackage.ccqb;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhh;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdiSyncBackgroundTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final ejhh b = ccqb.b();
    private final eijr c;

    public MdiSyncBackgroundTaskChimeraService() {
        this(new eijr() { // from class: ccrb
            @Override // defpackage.eijr
            public final Object a() {
                int i = MdiSyncBackgroundTaskChimeraService.a;
                ccog a2 = ccog.a();
                fixm fixmVar = a2.M;
                fixm fixmVar2 = a2.B;
                fixm fixmVar3 = a2.C;
                fixm fixmVar4 = a2.Q;
                fixmVar.getClass();
                fixmVar2.getClass();
                fixmVar3.getClass();
                fixmVar4.getClass();
                eiho eihoVar = new eiho() { // from class: ccra
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        int i2 = MdiSyncBackgroundTaskChimeraService.a;
                        ccob b2 = ccog.a().b((Account) obj);
                        fixm fixmVar5 = b2.d;
                        return eits.m(ccsm.WIPEOUT, new ccsq(new ejdg(new ccno(b2.a, (dqyz) fixmVar5.a(), new drdr((dplo) b2.p.A.a())))), ccsm.PROFILE_SYNC, (ccsi) b2.n.a());
                    }
                };
                Map a3 = ((fixi) fixmVar).a();
                a3.getClass();
                byxs byxsVar = (byxs) fixmVar2.a();
                byxsVar.getClass();
                asmf asmfVar = new asmf(2, 10);
                eijr eijrVar = (eijr) fixmVar3.a();
                eijrVar.getClass();
                ccqc ccqcVar = (ccqc) fixmVar4.a();
                ccqcVar.getClass();
                return new ccrd(a3, eihoVar, byxsVar, asmfVar, eijrVar, ccqcVar);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskChimeraService.a(byln):int");
    }

    public MdiSyncBackgroundTaskChimeraService(eijr eijrVar) {
        this.c = eijy.a(eijrVar);
    }
}
