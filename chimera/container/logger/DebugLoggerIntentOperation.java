package com.google.android.gms.chimera.container.logger;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import defpackage.bbne;
import defpackage.btjm;
import defpackage.bvjx;
import defpackage.bvka;
import defpackage.ekxj;
import defpackage.epls;
import defpackage.eplu;
import defpackage.eplv;
import defpackage.epnn;
import defpackage.epno;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fpjm;
import defpackage.fywe;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DebugLoggerIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ExternalChimeraService extends Service {
        @Override // com.google.android.chimera.Service
        public final IBinder onBind(Intent intent) {
            return null;
        }

        @Override // com.google.android.chimera.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            Intent startIntent;
            String action = intent == null ? null : intent.getAction();
            if ("com.google.android.gms.chimera.container.DYNAMITE_LOG".equals(action) && (startIntent = IntentOperation.getStartIntent(this, DebugLoggerIntentOperation.class, action)) != null) {
                startIntent.putExtras(intent);
                startService(startIntent);
            }
            stopSelf(i2);
            return 2;
        }
    }

    static final void a(epno epnoVar) {
        fpjm fpjmVar = fpjm.a;
        if (fpjmVar.lK().f()) {
            eplv eplvVar = epnoVar.j;
            if (eplvVar == null) {
                eplvVar = eplv.a;
            }
            int a = eplu.a(eplvVar.c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 20 && i != 53 && i != 83 && i != 128 && i != 49 && i != 50) {
                switch (i) {
                    default:
                        switch (i) {
                        }
                    case 14:
                    case 15:
                    case 16:
                    case fywe.q /* 17 */:
                    case 18:
                        if (a == 50 || fpjmVar.lK().e()) {
                            btjm l = bvjx.v().l(epnoVar);
                            l.f = "chimera";
                            l.a();
                            break;
                        }
                        break;
                }
                return;
            }
            if (a == 50) {
            }
            btjm l2 = bvjx.v().l(epnoVar);
            l2.f = "chimera";
            l2.a();
            return;
        }
        btjm l3 = bvka.v().l(epnoVar);
        l3.f = "chimera";
        l3.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        eplv eplvVar;
        String action = intent.getAction();
        ekxj.e(action);
        int hashCode = action.hashCode();
        if (hashCode != -1492206664) {
            if (hashCode == 2044451954 && action.equals("com.google.android.gms.chimera.container.DYNAMITE_LOG")) {
                z = true;
            }
            z = -1;
        } else {
            if (action.equals("com.google.android.gms.chimera.container.CHIMERA_LOG")) {
                z = false;
            }
            z = -1;
        }
        if (!z) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("EVENT_PROTO_BYTES");
            if (byteArrayExtra == null) {
                Log.e("DebugLoggerIntentOp", "eventProtoBytes==null");
                return;
            }
            try {
                fgri y = fgri.y(epno.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a());
                fgri.M(y);
                a((epno) y);
                return;
            } catch (fgsd e) {
                throw new IllegalStateException(e);
            }
        }
        if (!z) {
            throw new IllegalStateException("Unknown action: ".concat(action));
        }
        Executor executor = bbne.a;
        int a = eplu.a(intent.getIntExtra("STATUS", 0));
        if (a == 0 || !bbne.d(a)) {
            Log.w("DynamiteDebugLogger", "Invalid dynamite logging status.");
            eplvVar = null;
        } else {
            epls eplsVar = (epls) eplv.a.v();
            if (!eplsVar.b.L()) {
                eplsVar.U();
            }
            eplv eplvVar2 = (eplv) eplsVar.b;
            eplvVar2.c = a - 1;
            eplvVar2.b |= 1;
            String stringExtra = intent.getStringExtra("REASON");
            if (stringExtra != null) {
                if (stringExtra.length() > 128) {
                    stringExtra = stringExtra.substring(0, 128);
                }
                if (!eplsVar.b.L()) {
                    eplsVar.U();
                }
                eplv eplvVar3 = (eplv) eplsVar.b;
                stringExtra.getClass();
                eplvVar3.b |= 2;
                eplvVar3.d = stringExtra;
            }
            eplvVar = (eplv) eplsVar.Q();
        }
        if (eplvVar != null) {
            epnn epnnVar = (epnn) epno.a.v();
            if (!epnnVar.b.L()) {
                epnnVar.U();
            }
            epno epnoVar = (epno) epnnVar.b;
            epnoVar.j = eplvVar;
            epnoVar.b |= 16;
            a((epno) epnnVar.Q());
        }
    }
}
