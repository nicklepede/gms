package com.google.android.gms.auth.folsom.operation;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import defpackage.adkp;
import defpackage.adkr;
import defpackage.adks;
import defpackage.adkt;
import defpackage.adnb;
import defpackage.adng;
import defpackage.auad;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fnpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class KeySyncIntentOperation extends IntentOperation {
    public static final auad a = adng.a("KeySyncIntentOperation");
    public static final ausn b = adng.b("KeySyncIntentOperation");

    public KeySyncIntentOperation() {
    }

    public static boolean a(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "backup_encryption_opt_in_displayed", 0) == 1;
    }

    public static boolean b(Context context) {
        try {
            return new BackupManager(context).isBackupEnabled();
        } catch (SecurityException e) {
            ((eluo) ((eluo) b.j()).s(e)).x("Error getting backup state");
            return false;
        }
    }

    public static int c(Account account, int i) {
        adks adksVar = new adks();
        adksVar.a = account;
        adksVar.b = i == 18 ? adkt.NEW_SNAPSHOT : adkt.SYNC_PERIODIC;
        try {
            new adkr(adksVar.a()).m();
            return 2;
        } catch (adkp e) {
            a.g("Failed to sync with FolsomSyncManager", e, new Object[0]);
            return 1;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!adnb.b) {
            a.h("Build is lower than P. No need to handle action=[%s]", intent.getAction());
            return;
        }
        if (!fnpo.c()) {
            a.m("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
            return;
        }
        String action = intent.getAction();
        a.d("onHandleIntent. action: %s", action);
        if ("android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT".equals(action)) {
            new aupz(1, 10).execute(new Runnable() { // from class: adfx
                @Override // java.lang.Runnable
                public final void run() {
                    KeySyncIntentOperation keySyncIntentOperation = KeySyncIntentOperation.this;
                    for (Account account : bsup.b(keySyncIntentOperation).p("com.google")) {
                        if (KeySyncIntentOperation.c(account, 18) == 1) {
                            ((eluo) KeySyncIntentOperation.b.h()).x("Scheduling a retry after failed newSnapshot sync");
                            String str = account.name;
                            auad auadVar = FolsomGcmTaskChimeraService.a;
                            fnpr fnprVar = fnpr.a;
                            FolsomGcmTaskChimeraService.h(keySyncIntentOperation, str, fnprVar.lK().m(), fnprVar.lK().l());
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
