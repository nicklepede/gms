package com.google.android.gms.thunderbird;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arvr;
import defpackage.aszt;
import defpackage.atad;
import defpackage.atat;
import defpackage.aupk;
import defpackage.bylf;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dhmr;
import defpackage.diht;
import defpackage.dikv;
import defpackage.dikw;
import defpackage.dilr;
import defpackage.dkbl;
import defpackage.dpxc;
import defpackage.eluo;
import defpackage.enik;
import defpackage.enil;
import defpackage.fgrc;
import defpackage.fkuc;
import defpackage.fvik;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdSchedulerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private dikv b;
    private arvr c;
    private atad d;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!"PeriodicLogging".equals(caufVar.a)) {
            dilr.a(new IllegalStateException());
            return 2;
        }
        if (fvik.a.lK().Y()) {
            try {
                aupk.a(this.b.g());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ((eluo) ((eluo) dikw.a.j()).ai((char) 11260)).x("debug logs failed to ttl");
            }
        }
        if (fvik.a.lK().aK()) {
            bylf v = bylf.v();
            fgrc v2 = enil.a.v();
            fgrc v3 = enik.a.v();
            boolean l = this.b.l();
            if (!v3.b.L()) {
                v3.U();
            }
            enik enikVar = (enik) v3.b;
            enikVar.b |= 1;
            enikVar.c = l;
            if (!v2.b.L()) {
                v2.U();
            }
            enil enilVar = (enil) v2.b;
            enik enikVar2 = (enik) v3.Q();
            enikVar2.getClass();
            enilVar.d = enikVar2;
            enilVar.b = 2 | enilVar.b;
            v.f((enil) v2.Q());
            return 0;
        }
        try {
            if (!((atat) dhmr.n(this.d.aK())).q()) {
                casd.a(this).d("PeriodicLogging", ThunderbirdSchedulerService.class.getName());
            } else if (Math.random() < fvik.a.lK().c()) {
                fgrc v4 = enil.a.v();
                fgrc v5 = enik.a.v();
                boolean l2 = this.b.l();
                if (!v5.b.L()) {
                    v5.U();
                }
                enik enikVar3 = (enik) v5.b;
                enikVar3.b |= 1;
                enikVar3.c = l2;
                if (!v4.b.L()) {
                    v4.U();
                }
                enil enilVar2 = (enil) v4.b;
                enik enikVar4 = (enik) v5.Q();
                enikVar4.getClass();
                enilVar2.d = enikVar4;
                enilVar2.b |= 2;
                this.c.j(v4.Q(), dpxc.b(this, new diht())).d();
            }
            return 0;
        } catch (InterruptedException unused2) {
            return 2;
        } catch (ExecutionException e) {
            if ((e.getCause() instanceof aszt) && ((aszt) e.getCause()).a() == 17) {
                return 2;
            }
            dilr.a(e);
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        atad a2 = dkbl.a(this);
        arvr k = arvr.k(this, "THUNDERBIRD");
        dikv b = dikv.b(this);
        if (this.d == null) {
            this.d = a2;
        }
        if (this.c == null) {
            this.c = k;
            k.h(fkuc.UNMETERED_OR_DAILY);
        }
        if (this.b == null) {
            this.b = b;
        }
    }
}
