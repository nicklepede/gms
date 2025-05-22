package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.SendSurfaceChimeraService;
import defpackage.acs;
import defpackage.atzb;
import defpackage.chdw;
import defpackage.chke;
import defpackage.cofp;
import defpackage.coft;
import defpackage.coig;
import defpackage.cojh;
import defpackage.conm;
import defpackage.cpcr;
import defpackage.ekus;
import defpackage.ekww;
import defpackage.ekxc;
import defpackage.ekxd;
import defpackage.ftgi;
import defpackage.ing;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SendSurfaceChimeraService extends coft {
    public coig b;
    private cojh c;
    private cofp d;
    private cpcr e;
    public final Context a = new acs(this, R.style.Sharing_ShareSheet);
    private final ekww f = ekxd.a(new ekww() { // from class: coid
        @Override // defpackage.ekww
        public final Object lK() {
            return new cpcr(SendSurfaceChimeraService.this.a);
        }
    });
    private final BroadcastReceiver g = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.SendSurfaceChimeraService.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            Intent intent2;
            if (ekus.a(intent.getAction(), "com.google.android.gms.nearby.sharing.TRANSITION_TO_BACKGROUND")) {
                SendSurfaceChimeraService sendSurfaceChimeraService = SendSurfaceChimeraService.this;
                if (sendSurfaceChimeraService.b == null || (intent2 = (Intent) ing.a(intent, "nearby_share_fg_intent", Intent.class)) == null) {
                    return;
                }
                coig coigVar = sendSurfaceChimeraService.b;
                coigVar.c = coigVar.d;
                coigVar.d = intent2;
                Iterator it = coigVar.b.keySet().iterator();
                while (it.hasNext()) {
                    coigVar.a.h(((Long) it.next()).intValue());
                }
            }
        }
    };

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.coft, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (this.c == null) {
            this.c = chdw.e(this);
        }
        if (this.d == null) {
            this.d = cofp.d(this.a);
        }
        if (ftgi.s()) {
            this.b = new coig(this.d, this.c, this.f);
        } else {
            this.e = new cpcr(this.a);
            this.b = new coig(this.d, this.c, new ekxc(this.e));
        }
        cojh cojhVar = this.c;
        coig coigVar = this.b;
        cojhVar.J(coigVar, coigVar, 0);
        chke.b(this, this.g, new IntentFilter("com.google.android.gms.nearby.sharing.TRANSITION_TO_BACKGROUND"));
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.d.e();
        this.c.N(this.b);
        if (ftgi.s()) {
            cpcr cpcrVar = (cpcr) this.f.lK();
            atzb.s(cpcrVar);
            cpcrVar.c();
        } else {
            this.e.c();
        }
        chke.f(this, this.g);
        conm.a.b().p("SendSurfaceService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        conm.a.b().p("SendSurfaceService started", new Object[0]);
        return 1;
    }
}
