package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acvw;
import defpackage.acws;
import defpackage.acww;
import defpackage.acxf;
import defpackage.atzb;
import defpackage.ausn;
import defpackage.dhbk;
import defpackage.eluo;
import defpackage.fnpd;
import defpackage.fpkc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UserPresenceUpdateIntentOperation extends IntentOperation {
    private static final ausn a = acws.a("UserPresenceUpdateIntentOperation");
    private acxf b;

    public UserPresenceUpdateIntentOperation() {
    }

    public static Intent a(Context context, int i) {
        Intent startIntent = IntentOperation.getStartIntent(context, UserPresenceUpdateIntentOperation.class, "com.google.android.gms.auth.easyunlock.userpresence.USER_PRESENCE_UPDATED");
        startIntent.putExtra("detection_type", i);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = acxf.a(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("detection_type", 0);
        try {
            if (fnpd.d()) {
                acxf acxfVar = this.b;
                synchronized (acxfVar.d) {
                    acxfVar.b(intExtra == 3);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra == 3) {
                                acxfVar.c.b();
                            } else if (intExtra != 4) {
                                ((eluo) acxf.a.i()).z("Unexpected detection type: %d", intExtra);
                            } else if (acxfVar.g != 2) {
                                acxfVar.c.c();
                            }
                        } else if (acxfVar.g == 2) {
                            acxfVar.c.b();
                        }
                    } else if (acxfVar.g == 2) {
                        acxfVar.c.b();
                    }
                }
            } else {
                ((eluo) a.j()).x("Proximity feature is not available on current device.");
            }
            if (!fpkc.i()) {
                dhbk.c(intent);
                return;
            }
            if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
                acww.c(intent);
            } else if (intExtra != 4) {
                dhbk.c(intent);
            } else {
                PeriodicCheckChimeraReceiver.b(intent);
            }
        } catch (Throwable th) {
            if (!fpkc.i()) {
                dhbk.c(intent);
            } else if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
                acww.c(intent);
            } else if (intExtra != 4) {
                dhbk.c(intent);
            } else {
                PeriodicCheckChimeraReceiver.b(intent);
            }
            throw th;
        }
    }

    UserPresenceUpdateIntentOperation(acxf acxfVar, acvw acvwVar) {
        atzb.s(acxfVar);
        this.b = acxfVar;
        atzb.s(acvwVar);
    }
}
