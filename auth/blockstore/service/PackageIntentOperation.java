package com.google.android.gms.auth.blockstore.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import defpackage.accb;
import defpackage.accc;
import defpackage.acjh;
import defpackage.acku;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.rek;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PackageIntentOperation extends IntentOperation {
    private static final ausn a = accc.b("PackageIntentOperation");
    private accb b = null;

    private final accb a() {
        if (this.b == null) {
            this.b = accc.a(this, accc.c(this));
        }
        return this.b;
    }

    private final void b(acjh acjhVar, String str, Signature[] signatureArr, DeleteBytesRequest deleteBytesRequest) {
        try {
            if (((acku) acjhVar.a(str, signatureArr, deleteBytesRequest).get()).a) {
                ((eluo) a.h()).B("Removed Blockstore data for %s upon clearing data.", str);
                accb a2 = a();
                fgrc v = rek.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                rek rekVar = (rek) fgriVar;
                rekVar.c = 1;
                rekVar.b |= 1;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                rek rekVar2 = (rek) fgriVar2;
                str.getClass();
                rekVar2.b |= 2;
                rekVar2.d = str;
                if (!fgriVar2.L()) {
                    v.U();
                }
                rek rekVar3 = (rek) v.b;
                rekVar3.e = 1;
                rekVar3.b |= 4;
                a2.b((rek) v.Q());
            }
        } catch (InterruptedException | ExecutionException e) {
            ((eluo) ((eluo) a.i()).s(e)).x("data store operation failed.");
        }
    }

    private static boolean c(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete") == 0;
        } catch (Settings.SettingNotFoundException e) {
            ((eluo) ((eluo) a.j()).s(e)).x("USER_SETUP_COMPLETE setting not found.");
            return true;
        }
    }

    private static final String d(Intent intent) {
        Uri data = intent.getData();
        return data == null ? "" : data.getSchemeSpecificPart();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:139|140|141)|(7:143|144|145|146|(3:148|149|(1:151))|153|(3:(0)|114|115))|159|144|145|146|(0)|153|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0385, code lost:
    
        if (r9 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0382, code lost:
    
        if ((r6 - r2) <= defpackage.fnmw.a.lK().c()) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x040e, code lost:
    
        if (r9 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03e1, code lost:
    
        ((defpackage.eluo) ((defpackage.eluo) com.google.android.gms.auth.blockstore.service.PackageIntentOperation.a.j()).s(r0)).x("Could not check if package is preinstalled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d8 A[Catch: NameNotFoundException -> 0x03e0, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x03e0, blocks: (B:146:0x03d2, B:148:0x03d8), top: B:145:0x03d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040c  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.blockstore.service.PackageIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
