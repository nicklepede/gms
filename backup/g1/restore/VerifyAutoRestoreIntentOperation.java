package com.google.android.gms.backup.g1.restore;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.backup.g1.restore.mms.StartMmsRestoreIntentOperation;
import com.google.android.gms.backup.g1.restore.photos.StartPhotosRestoreIntentOperation;
import defpackage.ahhp;
import defpackage.ahwd;
import defpackage.ajdp;
import defpackage.ajgv;
import defpackage.doci;
import defpackage.eiho;
import defpackage.eitj;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.flmm;
import defpackage.upc;
import defpackage.vay;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes3.dex */
public class VerifyAutoRestoreIntentOperation extends IntentOperation {
    public static final ahwd a = new ahwd("VerifyAutoRestoreIntentOperation");

    public final void a() {
        Intent startIntent;
        ajgv ajgvVar = ajgv.a;
        int j = ajgv.j(this);
        int k = ajgv.k(this);
        if (j == 2) {
            if (k == 2) {
                a.j("User opted out of G1 restores.", new Object[0]);
                return;
            }
            j = 2;
        }
        if (j == 0) {
            return;
        }
        if (flmm.r() && k == 0) {
            return;
        }
        if (j == 1) {
            if (Build.VERSION.SDK_INT < 27 && getPackageManager().queryIntentActivities(new Intent(flmm.n()).setPackage(flmm.o()), 0).isEmpty()) {
                return;
            }
            Intent startIntent2 = IntentOperation.getStartIntent(this, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
            if (startIntent2 != null) {
                startService(startIntent2);
            }
        }
        if (flmm.r() && k == 1 && (startIntent = IntentOperation.getStartIntent(this, StartPhotosRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_PHOTOS_RESTORE")) != null) {
            startService(startIntent);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (flmm.a.a().W()) {
            a();
            return;
        }
        final ahhp ahhpVar = new ahhp(this);
        vay vayVar = new vay(this);
        upc a2 = GetAccountsRequest.a();
        a2.b("com.google");
        a2.a = eitj.l("googleone");
        enss b = doci.b(vayVar.b(a2.a()));
        eiho eihoVar = new eiho() { // from class: ajdn
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                boolean z;
                List list = ((GetAccountsResponse) obj).a;
                Account a3 = ahhp.this.a();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    GoogleAccount googleAccount = (GoogleAccount) it.next();
                    if (a3 != null && googleAccount.c.equals(a3.name)) {
                        z = true;
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        enre enreVar = enre.a;
        ensj.t(enps.f(b, eihoVar, enreVar), new ajdp(this), enreVar);
    }
}
