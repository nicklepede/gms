package com.google.android.gms.auth.account.accounttransfer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atly;
import defpackage.auid;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.aupv;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.dffq;
import defpackage.dgnh;
import defpackage.down;
import defpackage.ekvl;
import defpackage.wmv;
import defpackage.wyg;
import defpackage.wyh;
import defpackage.wyi;
import defpackage.wyj;
import defpackage.wyk;
import defpackage.wyl;
import defpackage.xjq;
import defpackage.xkh;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountTransferIntentOperation extends IntentOperation {
    xkh a;
    dgnh b;
    private aupq c;

    private final wyh a() {
        return new wyh(this, new wyj(this.a), this.b, bsup.b(this), this.a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aupq aupqVar = new aupq("AccountTransferIntentOperation", 9);
        this.c = aupqVar;
        aupqVar.start();
        int i = xjq.a;
        this.a = new xkh(this, null);
        aszs aszsVar = dffq.a;
        this.b = new atad((Context) this, (byte[]) null);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        aupq aupqVar = this.c;
        if (aupqVar != null) {
            aupqVar.quit();
            this.c = null;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            Log.w("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferIntentOperation] onHandleIntent(intent=null)", new Object[0]));
            return;
        }
        String stringExtra = intent.getStringExtra("key_extra_account_type");
        if (stringExtra == null) {
            Log.w("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferIntentOperation] onHandleIntent(accountType=null)", new Object[0]));
            return;
        }
        if (!"com.google".equals(stringExtra)) {
            Log.w("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferIntentOperation] Not handling account type in onHandleIntent(accountType=%s). Sending completion status", stringExtra));
            int i = xjq.a;
            wyl.e(new xkh(this, null), stringExtra);
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE".equals(action)) {
            a().a();
            return;
        }
        if ("com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE".equals(action)) {
            int i2 = wyi.a;
            wyj wyjVar = new wyj(this.a);
            dgnh dgnhVar = this.b;
            bsup b = bsup.b(this);
            wmv wmvVar = (wmv) wmv.a.b();
            aupq aupqVar = this.c;
            ekvl.y(aupqVar);
            wyi.a(ausn.c("Auth", auid.AUTH_ACCOUNT_DATA, "AccountTransferImporter"), this, wyjVar, dgnhVar, b, wmvVar, new wyk(this, new aupp(aupqVar)), this.a, new down(new aupv(1, 10), atly.b(this), atly.a(this)));
            return;
        }
        if ("com.google.android.gms.auth.START_ACCOUNT_EXPORT".equals(action)) {
            wyh a = a();
            try {
                a.b();
            } catch (wyg e) {
                Log.e("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferExporter] startAccountExport() error", new Object[0]), e);
                wyl.c(a.a);
            }
        }
    }
}
