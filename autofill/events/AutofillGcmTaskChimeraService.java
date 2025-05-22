package com.google.android.gms.autofill.events;

import com.google.android.gms.autofill.events.AutofillGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.afpy;
import defpackage.agll;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.agso;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cbfo;
import defpackage.cbgj;
import defpackage.cbhd;
import defpackage.dtlq;
import defpackage.dtlt;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.fgrn;
import defpackage.fxqo;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("AutofillGcmTaskChimeraService", auid.AUTOFILL);
    private elgx c;
    private fxqo d;
    private fxqo e;
    private fxqo f;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        elgx elgxVar = this.c;
        String str = caufVar.a;
        final agll agllVar = (agll) elgxVar.get(str);
        if (agllVar == null) {
            ((eluo) ((eluo) b.j()).ai((char) 945)).B("No affiliated Task for Tag: %s", str);
            return 2;
        }
        dtlq a2 = ((cbhd) this.d.a()).a(str);
        fgrn fgrnVar = a2.a;
        if (fgrnVar == afpy.SYNC_ID_UNKNOWN) {
            ((eluo) ((eluo) b.j()).ai((char) 944)).B("Unknown syncId for tag: %s", str);
            return 2;
        }
        cbfo l = ((cbgj) this.e.a()).l((afpy) fgrnVar);
        int i = a2.b;
        return l.a(l.b(new dtlt() { // from class: agkz
            @Override // defpackage.dtlt
            public final eqgl a() {
                int i2 = AutofillGcmTaskChimeraService.a;
                return agll.this.a();
            }
        }, i, (Executor) this.f.a()), i);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        agsm a2 = agsl.a(this);
        this.c = a2.u();
        agso agsoVar = (agso) a2;
        this.e = agsoVar.s;
        this.d = agsoVar.q;
        this.f = agsoVar.U;
    }
}
