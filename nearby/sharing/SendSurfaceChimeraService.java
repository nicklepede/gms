package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.SendSurfaceChimeraService;
import defpackage.acn;
import defpackage.arwm;
import defpackage.cewl;
import defpackage.cfcs;
import defpackage.clxh;
import defpackage.clxl;
import defpackage.clzy;
import defpackage.cmaz;
import defpackage.cmfe;
import defpackage.cmuj;
import defpackage.eihn;
import defpackage.eijr;
import defpackage.eijx;
import defpackage.eijy;
import defpackage.fqmn;
import defpackage.ilq;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SendSurfaceChimeraService extends clxl {
    public clzy b;
    private cmaz c;
    private clxh d;
    private cmuj e;
    public final Context a = new acn(this, R.style.Sharing_ShareSheet);
    private final eijr f = eijy.a(new eijr() { // from class: clzv
        @Override // defpackage.eijr
        public final Object a() {
            return new cmuj(SendSurfaceChimeraService.this.a);
        }
    });
    private final BroadcastReceiver g = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.SendSurfaceChimeraService.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            Intent intent2;
            if (eihn.a(intent.getAction(), "com.google.android.gms.nearby.sharing.TRANSITION_TO_BACKGROUND")) {
                SendSurfaceChimeraService sendSurfaceChimeraService = SendSurfaceChimeraService.this;
                if (sendSurfaceChimeraService.b == null || (intent2 = (Intent) ilq.a(intent, "nearby_share_fg_intent", Intent.class)) == null) {
                    return;
                }
                clzy clzyVar = sendSurfaceChimeraService.b;
                clzyVar.c = clzyVar.d;
                clzyVar.d = intent2;
                Iterator it = clzyVar.b.keySet().iterator();
                while (it.hasNext()) {
                    clzyVar.a.h(((Long) it.next()).intValue());
                }
            }
        }
    };

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.clxl, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (this.c == null) {
            this.c = cewl.e(this);
        }
        if (this.d == null) {
            this.d = clxh.d(this.a);
        }
        if (fqmn.s()) {
            this.b = new clzy(this.d, this.c, this.f);
        } else {
            this.e = new cmuj(this.a);
            this.b = new clzy(this.d, this.c, new eijx(this.e));
        }
        cmaz cmazVar = this.c;
        clzy clzyVar = this.b;
        cmazVar.J(clzyVar, clzyVar, 0);
        cfcs.b(this, this.g, new IntentFilter("com.google.android.gms.nearby.sharing.TRANSITION_TO_BACKGROUND"));
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.d.e();
        this.c.N(this.b);
        if (fqmn.s()) {
            cmuj cmujVar = (cmuj) this.f.a();
            arwm.s(cmujVar);
            cmujVar.c();
        } else {
            this.e.c();
        }
        cfcs.f(this, this.g);
        cmfe.a.b().p("SendSurfaceService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        cmfe.a.b().p("SendSurfaceService started", new Object[0]);
        return 1;
    }
}
