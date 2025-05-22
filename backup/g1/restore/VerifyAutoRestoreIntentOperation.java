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
import defpackage.ajif;
import defpackage.ajwt;
import defpackage.aleh;
import defpackage.alhn;
import defpackage.dqmr;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fodw;
import defpackage.wlb;
import defpackage.wwy;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes3.dex */
public class VerifyAutoRestoreIntentOperation extends IntentOperation {
    public static final ajwt a = new ajwt("VerifyAutoRestoreIntentOperation");

    public final void a() {
        Intent startIntent;
        alhn alhnVar = alhn.a;
        int j = alhn.j(this);
        int k = alhn.k(this);
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
        if (fodw.r() && k == 0) {
            return;
        }
        if (j == 1) {
            if (Build.VERSION.SDK_INT < 27 && getPackageManager().queryIntentActivities(new Intent(fodw.n()).setPackage(fodw.o()), 0).isEmpty()) {
                return;
            }
            Intent startIntent2 = IntentOperation.getStartIntent(this, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
            if (startIntent2 != null) {
                startService(startIntent2);
            }
        }
        if (fodw.r() && k == 1 && (startIntent = IntentOperation.getStartIntent(this, StartPhotosRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_PHOTOS_RESTORE")) != null) {
            startService(startIntent);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fodw.a.lK().W()) {
            a();
            return;
        }
        final ajif ajifVar = new ajif(this);
        wwy wwyVar = new wwy(this);
        wlb a2 = GetAccountsRequest.a();
        a2.b("com.google");
        a2.a = elgo.l("googleone");
        eqgl b = dqmr.b(wwyVar.b(a2.a()));
        ekut ekutVar = new ekut() { // from class: alef
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                boolean z;
                List list = ((GetAccountsResponse) obj).a;
                Account a3 = ajif.this.a();
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
        eqex eqexVar = eqex.a;
        eqgc.t(eqdl.f(b, ekutVar, eqexVar), new aleh(this), eqexVar);
    }
}
