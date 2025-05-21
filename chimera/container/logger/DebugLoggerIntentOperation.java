package com.google.android.gms.chimera.container.logger;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import defpackage.azji;
import defpackage.brbv;
import defpackage.btbz;
import defpackage.btcc;
import defpackage.eike;
import defpackage.emyb;
import defpackage.emyd;
import defpackage.emye;
import defpackage.emzw;
import defpackage.emzx;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fmro;
import defpackage.fwac;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DebugLoggerIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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

    static final void a(emzx emzxVar) {
        fmro fmroVar = fmro.a;
        if (fmroVar.a().f()) {
            emye emyeVar = emzxVar.j;
            if (emyeVar == null) {
                emyeVar = emye.a;
            }
            int a = emyd.a(emyeVar.c);
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
                    case fwac.q /* 17 */:
                    case 18:
                        if (a == 50 || fmroVar.a().e()) {
                            brbv l = btbz.v().l(emzxVar);
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
            brbv l2 = btbz.v().l(emzxVar);
            l2.f = "chimera";
            l2.a();
            return;
        }
        brbv l3 = btcc.v().l(emzxVar);
        l3.f = "chimera";
        l3.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        emye emyeVar;
        String action = intent.getAction();
        eike.e(action);
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
                fecp y = fecp.y(emzx.a, byteArrayExtra, 0, byteArrayExtra.length, febw.a());
                fecp.M(y);
                a((emzx) y);
                return;
            } catch (fedk e) {
                throw new IllegalStateException(e);
            }
        }
        if (!z) {
            throw new IllegalStateException("Unknown action: ".concat(action));
        }
        Executor executor = azji.a;
        int a = emyd.a(intent.getIntExtra("STATUS", 0));
        if (a == 0 || !azji.d(a)) {
            Log.w("DynamiteDebugLogger", "Invalid dynamite logging status.");
            emyeVar = null;
        } else {
            emyb emybVar = (emyb) emye.a.v();
            if (!emybVar.b.L()) {
                emybVar.U();
            }
            emye emyeVar2 = (emye) emybVar.b;
            emyeVar2.c = a - 1;
            emyeVar2.b |= 1;
            String stringExtra = intent.getStringExtra("REASON");
            if (stringExtra != null) {
                if (stringExtra.length() > 128) {
                    stringExtra = stringExtra.substring(0, 128);
                }
                if (!emybVar.b.L()) {
                    emybVar.U();
                }
                emye emyeVar3 = (emye) emybVar.b;
                stringExtra.getClass();
                emyeVar3.b |= 2;
                emyeVar3.d = stringExtra;
            }
            emyeVar = (emye) emybVar.Q();
        }
        if (emyeVar != null) {
            emzw emzwVar = (emzw) emzx.a.v();
            if (!emzwVar.b.L()) {
                emzwVar.U();
            }
            emzx emzxVar = (emzx) emzwVar.b;
            emzxVar.j = emyeVar;
            emzxVar.b |= 16;
            a((emzx) emzwVar.Q());
        }
    }
}
