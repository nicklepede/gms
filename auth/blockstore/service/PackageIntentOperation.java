package com.google.android.gms.auth.blockstore.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import defpackage.aacb;
import defpackage.aacc;
import defpackage.aajh;
import defpackage.aaku;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.plg;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PackageIntentOperation extends IntentOperation {
    private static final asot a = aacc.b("PackageIntentOperation");
    private aacb b = null;

    private final aacb a() {
        if (this.b == null) {
            this.b = aacc.a(this, aacc.c(this));
        }
        return this.b;
    }

    private final void b(aajh aajhVar, String str, Signature[] signatureArr, DeleteBytesRequest deleteBytesRequest) {
        try {
            if (((aaku) aajhVar.a(str, signatureArr, deleteBytesRequest).get()).a) {
                ((ejhf) a.h()).B("Removed Blockstore data for %s upon clearing data.", str);
                aacb a2 = a();
                fecj v = plg.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                plg plgVar = (plg) fecpVar;
                plgVar.c = 1;
                plgVar.b |= 1;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                plg plgVar2 = (plg) fecpVar2;
                str.getClass();
                plgVar2.b |= 2;
                plgVar2.d = str;
                if (!fecpVar2.L()) {
                    v.U();
                }
                plg plgVar3 = (plg) v.b;
                plgVar3.e = 1;
                plgVar3.b |= 4;
                a2.b((plg) v.Q());
            }
        } catch (InterruptedException | ExecutionException e) {
            ((ejhf) ((ejhf) a.i()).s(e)).x("data store operation failed.");
        }
    }

    private static boolean c(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete") == 0;
        } catch (Settings.SettingNotFoundException e) {
            ((ejhf) ((ejhf) a.j()).s(e)).x("USER_SETUP_COMPLETE setting not found.");
            return true;
        }
    }

    private static final String d(Intent intent) {
        Uri data = intent.getData();
        return data == null ? "" : data.getSchemeSpecificPart();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:150|151|152|(7:154|155|156|157|(3:159|160|(1:162))|164|(3:(0)|125|126))|170|155|156|157|(0)|164|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03af, code lost:
    
        if (r10 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03ac, code lost:
    
        if ((r6 - r2) <= defpackage.fkvs.a.a().c()) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0438, code lost:
    
        if (r10 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x040a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x040b, code lost:
    
        ((defpackage.ejhf) ((defpackage.ejhf) com.google.android.gms.auth.blockstore.service.PackageIntentOperation.a.j()).s(r0)).x("Could not check if package is preinstalled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0402 A[Catch: NameNotFoundException -> 0x040a, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x040a, blocks: (B:157:0x03fc, B:159:0x0402), top: B:156:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0436  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.blockstore.service.PackageIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
