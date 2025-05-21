package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aavw;
import defpackage.aaws;
import defpackage.aaww;
import defpackage.aaxf;
import defpackage.arwm;
import defpackage.asot;
import defpackage.deqh;
import defpackage.ejhf;
import defpackage.fkxx;
import defpackage.fmse;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UserPresenceUpdateIntentOperation extends IntentOperation {
    private static final asot a = aaws.a("UserPresenceUpdateIntentOperation");
    private aaxf b;

    public UserPresenceUpdateIntentOperation() {
    }

    public static Intent a(Context context, int i) {
        Intent startIntent = IntentOperation.getStartIntent(context, UserPresenceUpdateIntentOperation.class, "com.google.android.gms.auth.easyunlock.userpresence.USER_PRESENCE_UPDATED");
        startIntent.putExtra("detection_type", i);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = aaxf.a(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("detection_type", 0);
        try {
            if (fkxx.d()) {
                aaxf aaxfVar = this.b;
                synchronized (aaxfVar.d) {
                    aaxfVar.b(intExtra == 3);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra == 3) {
                                aaxfVar.c.b();
                            } else if (intExtra != 4) {
                                ((ejhf) aaxf.a.i()).z("Unexpected detection type: %d", intExtra);
                            } else if (aaxfVar.g != 2) {
                                aaxfVar.c.c();
                            }
                        } else if (aaxfVar.g == 2) {
                            aaxfVar.c.b();
                        }
                    } else if (aaxfVar.g == 2) {
                        aaxfVar.c.b();
                    }
                }
            } else {
                ((ejhf) a.j()).x("Proximity feature is not available on current device.");
            }
            if (!fmse.h()) {
                deqh.c(intent);
                return;
            }
            if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
                aaww.c(intent);
            } else if (intExtra != 4) {
                deqh.c(intent);
            } else {
                PeriodicCheckChimeraReceiver.b(intent);
            }
        } catch (Throwable th) {
            if (!fmse.h()) {
                deqh.c(intent);
            } else if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
                aaww.c(intent);
            } else if (intExtra != 4) {
                deqh.c(intent);
            } else {
                PeriodicCheckChimeraReceiver.b(intent);
            }
            throw th;
        }
    }

    UserPresenceUpdateIntentOperation(aaxf aaxfVar, aavw aavwVar) {
        arwm.s(aaxfVar);
        this.b = aaxfVar;
        arwm.s(aavwVar);
    }
}
