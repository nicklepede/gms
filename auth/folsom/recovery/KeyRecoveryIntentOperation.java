package com.google.android.gms.auth.folsom.recovery;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.recovery.KeyRecoveryIntentOperation;
import defpackage.adhh;
import defpackage.adnb;
import defpackage.adnf;
import defpackage.adng;
import defpackage.auad;
import defpackage.aupz;
import defpackage.eqgo;
import defpackage.fgqi;
import defpackage.fnpo;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class KeyRecoveryIntentOperation extends IntentOperation {
    public static final auad a = adng.a("KeyRecoveryIntentOperation");
    public String b;
    private final eqgo c = new aupz(1, 10);

    public KeyRecoveryIntentOperation() {
    }

    private final void c(int i) {
        adnf.k(i, 6, this.b);
    }

    public final void a(PendingIntent pendingIntent, int i) {
        b(pendingIntent, i, null);
    }

    public final void b(PendingIntent pendingIntent, int i, fgqi fgqiVar) {
        c(i);
        Intent intent = new Intent();
        if (fgqiVar != null) {
            if (i != 3) {
                if (i == 7) {
                    i = 7;
                }
            }
            intent.putExtra("android.security.action.EXTRA_COOL_OFF_PERIOD_SECONDS", fgqiVar.b);
        }
        intent.putExtra("com.google.android.gms.auth.folsom.EXTRA_RECOVERY_RESULT", adhh.a(i));
        try {
            pendingIntent.send(this, -1, intent);
        } catch (PendingIntent.CanceledException e) {
            a.g("Canceled sending PendingIntent.", e, new Object[0]);
            c(18);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        this.b = UUID.randomUUID().toString();
        if (!adnb.a) {
            a.h("Build is lower than P. No need to handle [%s]", intent.getAction());
            return;
        }
        if (!fnpo.c()) {
            a.m("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
            return;
        }
        String action = intent.getAction();
        auad auadVar = a;
        auadVar.j("onHandleIntent. action: %s", action);
        if ("com.google.android.gms.auth.folsom.START_RECOVERY".equals(action)) {
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                auadVar.f("Intent has null extras.", new Object[0]);
                return;
            }
            final PendingIntent pendingIntent = (PendingIntent) extras.getParcelable("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT");
            if (pendingIntent == null) {
                auadVar.f("Stop recovery since the received intent does not contain a PendingIntent.", new Object[0]);
            } else {
                this.c.execute(new Runnable() { // from class: adhe
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeyRecoveryIntentOperation keyRecoveryIntentOperation = KeyRecoveryIntentOperation.this;
                        Bundle bundle = extras;
                        PendingIntent pendingIntent2 = pendingIntent;
                        try {
                            adhf a2 = adhf.a(bundle);
                            adhd adhdVar = new adhd(keyRecoveryIntentOperation, a2, keyRecoveryIntentOperation.b);
                            try {
                                KeyRecoveryIntentOperation.a.h("Sending start recovery request to VaultService", new Object[0]);
                                try {
                                    eqos a3 = adhdVar.a();
                                    eqou b = eqou.b(a3.b);
                                    if (b == null) {
                                        b = eqou.UNRECOGNIZED;
                                    }
                                    KeyRecoveryIntentOperation.a.h("OpenVault result %s", b.toString());
                                    if (b == eqou.GUESS_VALID) {
                                        try {
                                            adhdVar.b(null);
                                        } catch (adhg e) {
                                            KeyRecoveryIntentOperation.a.g("Recovery Exception", e, new Object[0]);
                                            keyRecoveryIntentOperation.a(pendingIntent2, e.a);
                                            adhdVar.close();
                                            return;
                                        }
                                    }
                                    fgqi fgqiVar = a3.d;
                                    if (fgqiVar == null) {
                                        fgqiVar = fgqi.a;
                                    }
                                    int b2 = adhh.b(b);
                                    keyRecoveryIntentOperation.b(pendingIntent2, b2, fgqiVar);
                                    if (b2 == 2) {
                                        auad auadVar2 = KeyRecoveryIntentOperation.a;
                                        auadVar2.d("broadcasting a successful recovery.", new Object[0]);
                                        Intent startIntent = IntentOperation.getStartIntent(keyRecoveryIntentOperation, "com.google.android.gms.auth.blockstore.service.FolsomIntentOperation", "com.google.android.gms.auth.folsom.SUCCESSFUL_RECOVERY");
                                        if (startIntent == null) {
                                            auadVar2.f("Failed to get Blockstore FolsomIntentOperation", new Object[0]);
                                        } else {
                                            try {
                                                long a4 = adgi.a(a2.h.M());
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("com.google.android.gms.auth.folsom.EXTRA_SOURCE_ANDROID_ID", a4);
                                                startIntent.putExtras(bundle2);
                                                keyRecoveryIntentOperation.startService(startIntent);
                                            } catch (adkp e2) {
                                                KeyRecoveryIntentOperation.a.g("sendSuccessfulRecoveryBroadcast failed with FolsomSyncException", e2, new Object[0]);
                                            }
                                        }
                                    }
                                    adhdVar.close();
                                } catch (adbv e3) {
                                    KeyRecoveryIntentOperation.a.g("Network exception while performing recovery", e3, new Object[0]);
                                    keyRecoveryIntentOperation.a(pendingIntent2, 10);
                                    adhdVar.close();
                                } catch (adhg e4) {
                                    KeyRecoveryIntentOperation.a.g("Exception while performing recovery", e4, new Object[0]);
                                    keyRecoveryIntentOperation.a(pendingIntent2, e4.a);
                                    adhdVar.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    adhdVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (adhg e5) {
                            KeyRecoveryIntentOperation.a.g("Exception creating recoveryData", e5, new Object[0]);
                            keyRecoveryIntentOperation.a(pendingIntent2, e5.a);
                        }
                    }
                });
            }
        }
    }

    protected KeyRecoveryIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
