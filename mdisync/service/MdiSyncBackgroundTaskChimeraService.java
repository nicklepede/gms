package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskChimeraService;
import defpackage.ceyv;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluq;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdiSyncBackgroundTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final eluq b = ceyv.b();
    private final ekww c;

    public MdiSyncBackgroundTaskChimeraService() {
        this(new ekww() { // from class: cezv
            @Override // defpackage.ekww
            public final Object lK() {
                int i = MdiSyncBackgroundTaskChimeraService.a;
                cexa a2 = cexa.a();
                flnj flnjVar = a2.M;
                flnj flnjVar2 = a2.B;
                flnj flnjVar3 = a2.C;
                flnj flnjVar4 = a2.Q;
                flnjVar.getClass();
                flnjVar2.getClass();
                flnjVar3.getClass();
                flnjVar4.getClass();
                ekut ekutVar = new ekut() { // from class: cezu
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        int i2 = MdiSyncBackgroundTaskChimeraService.a;
                        cewv b2 = cexa.a().b((Account) obj);
                        flnj flnjVar5 = b2.d;
                        return elgx.m(cfbg.WIPEOUT, new cfbk(new elqn(new cewi(b2.a, (dtjh) flnjVar5.a(), new dtnz((drvx) b2.p.A.a())))), cfbg.PROFILE_SYNC, (cfbc) b2.n.a());
                    }
                };
                Map a3 = ((flnf) flnjVar).a();
                a3.getClass();
                cbgj cbgjVar = (cbgj) flnjVar2.a();
                cbgjVar.getClass();
                aupz aupzVar = new aupz(2, 10);
                ekww ekwwVar = (ekww) flnjVar3.a();
                ekwwVar.getClass();
                ceyw ceywVar = (ceyw) flnjVar4.a();
                ceywVar.getClass();
                return new cezx(a3, ekutVar, cbgjVar, aupzVar, ekwwVar, ceywVar);
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
    public final int a(defpackage.cauf r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskChimeraService.a(cauf):int");
    }

    public MdiSyncBackgroundTaskChimeraService(ekww ekwwVar) {
        this.c = ekxd.a(ekwwVar);
    }
}
