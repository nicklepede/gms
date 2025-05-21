package com.google.android.gms.thunderbird;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.apta;
import defpackage.aqxe;
import defpackage.aqxo;
import defpackage.aqye;
import defpackage.aslq;
import defpackage.bwct;
import defpackage.byjl;
import defpackage.byln;
import defpackage.dfbl;
import defpackage.dfwo;
import defpackage.dfzq;
import defpackage.dfzr;
import defpackage.dgam;
import defpackage.dhqf;
import defpackage.dnmt;
import defpackage.ejhf;
import defpackage.ekuy;
import defpackage.ekuz;
import defpackage.fecj;
import defpackage.fief;
import defpackage.fsnb;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdSchedulerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private dfzq b;
    private apta c;
    private aqxo d;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!"PeriodicLogging".equals(bylnVar.a)) {
            dgam.a(new IllegalStateException());
            return 2;
        }
        if (fsnb.a.a().Y()) {
            try {
                aslq.a(this.b.g());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ((ejhf) ((ejhf) dfzr.a.j()).ah((char) 11257)).x("debug logs failed to ttl");
            }
        }
        if (fsnb.a.a().aK()) {
            bwct v = bwct.v();
            fecj v2 = ekuz.a.v();
            fecj v3 = ekuy.a.v();
            boolean l = this.b.l();
            if (!v3.b.L()) {
                v3.U();
            }
            ekuy ekuyVar = (ekuy) v3.b;
            ekuyVar.b |= 1;
            ekuyVar.c = l;
            if (!v2.b.L()) {
                v2.U();
            }
            ekuz ekuzVar = (ekuz) v2.b;
            ekuy ekuyVar2 = (ekuy) v3.Q();
            ekuyVar2.getClass();
            ekuzVar.d = ekuyVar2;
            ekuzVar.b = 2 | ekuzVar.b;
            v.f((ekuz) v2.Q());
            return 0;
        }
        try {
            if (!((aqye) dfbl.n(this.d.aL())).r()) {
                byjl.a(this).d("PeriodicLogging", ThunderbirdSchedulerService.class.getName());
            } else if (Math.random() < fsnb.a.a().c()) {
                fecj v4 = ekuz.a.v();
                fecj v5 = ekuy.a.v();
                boolean l2 = this.b.l();
                if (!v5.b.L()) {
                    v5.U();
                }
                ekuy ekuyVar3 = (ekuy) v5.b;
                ekuyVar3.b |= 1;
                ekuyVar3.c = l2;
                if (!v4.b.L()) {
                    v4.U();
                }
                ekuz ekuzVar2 = (ekuz) v4.b;
                ekuy ekuyVar4 = (ekuy) v5.Q();
                ekuyVar4.getClass();
                ekuzVar2.d = ekuyVar4;
                ekuzVar2.b |= 2;
                this.c.j(v4.Q(), dnmt.b(this, new dfwo())).d();
            }
            return 0;
        } catch (InterruptedException unused2) {
            return 2;
        } catch (ExecutionException e) {
            if ((e.getCause() instanceof aqxe) && ((aqxe) e.getCause()).a() == 17) {
                return 2;
            }
            dgam.a(e);
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        aqxo a2 = dhqf.a(this);
        apta k = apta.k(this, "THUNDERBIRD");
        dfzq b = dfzq.b(this);
        if (this.d == null) {
            this.d = a2;
        }
        if (this.c == null) {
            this.c = k;
            k.h(fief.UNMETERED_OR_DAILY);
        }
        if (this.b == null) {
            this.b = b;
        }
    }
}
