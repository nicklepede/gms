package com.google.android.gms.auth.folsom.recovery;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.recovery.KeyRecoveryIntentOperation;
import defpackage.abhh;
import defpackage.abnb;
import defpackage.abnf;
import defpackage.abng;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.ensv;
import defpackage.febp;
import defpackage.fkyh;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class KeyRecoveryIntentOperation extends IntentOperation {
    public static final arxo a = abng.a("KeyRecoveryIntentOperation");
    public String b;
    private final ensv c = new asmf(1, 10);

    public KeyRecoveryIntentOperation() {
    }

    private final void c(int i) {
        abnf.k(i, 6, this.b);
    }

    public final void a(PendingIntent pendingIntent, int i) {
        b(pendingIntent, i, null);
    }

    public final void b(PendingIntent pendingIntent, int i, febp febpVar) {
        c(i);
        Intent intent = new Intent();
        if (febpVar != null) {
            if (i != 3) {
                if (i == 7) {
                    i = 7;
                }
            }
            intent.putExtra("android.security.action.EXTRA_COOL_OFF_PERIOD_SECONDS", febpVar.b);
        }
        intent.putExtra("com.google.android.gms.auth.folsom.EXTRA_RECOVERY_RESULT", abhh.a(i));
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
        if (!abnb.a) {
            a.h("Build is lower than P. No need to handle [%s]", intent.getAction());
            return;
        }
        if (!fkyh.c()) {
            a.m("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
            return;
        }
        String action = intent.getAction();
        arxo arxoVar = a;
        arxoVar.j("onHandleIntent. action: %s", action);
        if ("com.google.android.gms.auth.folsom.START_RECOVERY".equals(action)) {
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                arxoVar.f("Intent has null extras.", new Object[0]);
                return;
            }
            final PendingIntent pendingIntent = (PendingIntent) extras.getParcelable("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT");
            if (pendingIntent == null) {
                arxoVar.f("Stop recovery since the received intent does not contain a PendingIntent.", new Object[0]);
            } else {
                this.c.execute(new Runnable() { // from class: abhe
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeyRecoveryIntentOperation keyRecoveryIntentOperation = KeyRecoveryIntentOperation.this;
                        Bundle bundle = extras;
                        PendingIntent pendingIntent2 = pendingIntent;
                        try {
                            abhf a2 = abhf.a(bundle);
                            abhd abhdVar = new abhd(keyRecoveryIntentOperation, a2, keyRecoveryIntentOperation.b);
                            try {
                                KeyRecoveryIntentOperation.a.h("Sending start recovery request to VaultService", new Object[0]);
                                try {
                                    eoaz a3 = abhdVar.a();
                                    eobb b = eobb.b(a3.b);
                                    if (b == null) {
                                        b = eobb.UNRECOGNIZED;
                                    }
                                    KeyRecoveryIntentOperation.a.h("OpenVault result %s", b.toString());
                                    if (b == eobb.GUESS_VALID) {
                                        try {
                                            abhdVar.b(null);
                                        } catch (abhg e) {
                                            KeyRecoveryIntentOperation.a.g("Recovery Exception", e, new Object[0]);
                                            keyRecoveryIntentOperation.a(pendingIntent2, e.a);
                                            abhdVar.close();
                                            return;
                                        }
                                    }
                                    febp febpVar = a3.d;
                                    if (febpVar == null) {
                                        febpVar = febp.a;
                                    }
                                    int b2 = abhh.b(b);
                                    keyRecoveryIntentOperation.b(pendingIntent2, b2, febpVar);
                                    if (b2 == 2) {
                                        arxo arxoVar2 = KeyRecoveryIntentOperation.a;
                                        arxoVar2.d("broadcasting a successful recovery.", new Object[0]);
                                        Intent startIntent = IntentOperation.getStartIntent(keyRecoveryIntentOperation, "com.google.android.gms.auth.blockstore.service.FolsomIntentOperation", "com.google.android.gms.auth.folsom.SUCCESSFUL_RECOVERY");
                                        if (startIntent == null) {
                                            arxoVar2.f("Failed to get Blockstore FolsomIntentOperation", new Object[0]);
                                        } else {
                                            try {
                                                long a4 = abgi.a(a2.h.M());
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("com.google.android.gms.auth.folsom.EXTRA_SOURCE_ANDROID_ID", a4);
                                                startIntent.putExtras(bundle2);
                                                keyRecoveryIntentOperation.startService(startIntent);
                                            } catch (abkp e2) {
                                                KeyRecoveryIntentOperation.a.g("sendSuccessfulRecoveryBroadcast failed with FolsomSyncException", e2, new Object[0]);
                                            }
                                        }
                                    }
                                    abhdVar.close();
                                } catch (abbv e3) {
                                    KeyRecoveryIntentOperation.a.g("Network exception while performing recovery", e3, new Object[0]);
                                    keyRecoveryIntentOperation.a(pendingIntent2, 10);
                                    abhdVar.close();
                                } catch (abhg e4) {
                                    KeyRecoveryIntentOperation.a.g("Exception while performing recovery", e4, new Object[0]);
                                    keyRecoveryIntentOperation.a(pendingIntent2, e4.a);
                                    abhdVar.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    abhdVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (abhg e5) {
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
