package com.google.android.gms.auth.account.accounttransfer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arjj;
import defpackage.asej;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asmb;
import defpackage.asot;
import defpackage.bqna;
import defpackage.dcul;
import defpackage.dece;
import defpackage.dmkz;
import defpackage.eiig;
import defpackage.uqw;
import defpackage.vcg;
import defpackage.vch;
import defpackage.vci;
import defpackage.vcj;
import defpackage.vck;
import defpackage.vcl;
import defpackage.vnp;
import defpackage.vog;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountTransferIntentOperation extends IntentOperation {
    vog a;
    dece b;
    private aslw c;

    private final vch a() {
        return new vch(this, new vcj(this.a), this.b, bqna.b(this), this.a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aslw aslwVar = new aslw("AccountTransferIntentOperation", 9);
        this.c = aslwVar;
        aslwVar.start();
        int i = vnp.a;
        this.a = new vog(this, null);
        aqxd aqxdVar = dcul.a;
        this.b = new aqxo((Context) this, (byte[]) null);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        aslw aslwVar = this.c;
        if (aslwVar != null) {
            aslwVar.quit();
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
            int i = vnp.a;
            vcl.e(new vog(this, null), stringExtra);
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE".equals(action)) {
            a().a();
            return;
        }
        if ("com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE".equals(action)) {
            int i2 = vci.a;
            vcj vcjVar = new vcj(this.a);
            dece deceVar = this.b;
            bqna b = bqna.b(this);
            uqw uqwVar = (uqw) uqw.a.b();
            aslw aslwVar = this.c;
            eiig.x(aslwVar);
            vci.a(asot.c("Auth", asej.AUTH_ACCOUNT_DATA, "AccountTransferImporter"), this, vcjVar, deceVar, b, uqwVar, new vck(this, new aslv(aslwVar)), this.a, new dmkz(new asmb(1, 10), arjj.b(this), arjj.a(this)));
            return;
        }
        if ("com.google.android.gms.auth.START_ACCOUNT_EXPORT".equals(action)) {
            vch a = a();
            try {
                a.b();
            } catch (vcg e) {
                Log.e("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferExporter] startAccountExport() error", new Object[0]), e);
                vcl.c(a.a);
            }
        }
    }
}
