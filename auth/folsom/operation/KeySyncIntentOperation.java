package com.google.android.gms.auth.folsom.operation;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import defpackage.abkp;
import defpackage.abkr;
import defpackage.abks;
import defpackage.abkt;
import defpackage.abnb;
import defpackage.abng;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fkyh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class KeySyncIntentOperation extends IntentOperation {
    public static final arxo a = abng.a("KeySyncIntentOperation");
    public static final asot b = abng.b("KeySyncIntentOperation");

    public KeySyncIntentOperation() {
    }

    public static boolean a(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "backup_encryption_opt_in_displayed", 0) == 1;
    }

    public static boolean b(Context context) {
        try {
            return new BackupManager(context).isBackupEnabled();
        } catch (SecurityException e) {
            ((ejhf) ((ejhf) b.j()).s(e)).x("Error getting backup state");
            return false;
        }
    }

    public static int c(Account account, int i) {
        abks abksVar = new abks();
        abksVar.a = account;
        abksVar.b = i == 18 ? abkt.NEW_SNAPSHOT : abkt.SYNC_PERIODIC;
        try {
            new abkr(abksVar.a()).m();
            return 2;
        } catch (abkp e) {
            a.g("Failed to sync with FolsomSyncManager", e, new Object[0]);
            return 1;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!abnb.b) {
            a.h("Build is lower than P. No need to handle action=[%s]", intent.getAction());
            return;
        }
        if (!fkyh.c()) {
            a.m("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
            return;
        }
        String action = intent.getAction();
        a.d("onHandleIntent. action: %s", action);
        if ("android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT".equals(action)) {
            new asmf(1, 10).execute(new Runnable() { // from class: abfx
                @Override // java.lang.Runnable
                public final void run() {
                    KeySyncIntentOperation keySyncIntentOperation = KeySyncIntentOperation.this;
                    for (Account account : bqna.b(keySyncIntentOperation).p("com.google")) {
                        if (KeySyncIntentOperation.c(account, 18) == 1) {
                            ((ejhf) KeySyncIntentOperation.b.h()).x("Scheduling a retry after failed newSnapshot sync");
                            String str = account.name;
                            arxo arxoVar = FolsomGcmTaskChimeraService.a;
                            FolsomGcmTaskChimeraService.h(keySyncIntentOperation, str, fkyk.a.a().m(), fkyk.a.a().l());
                        }
                    }
                }
            });
        }
    }

    public KeySyncIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
