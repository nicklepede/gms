package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acpt;
import defpackage.acpw;
import defpackage.aecr;
import defpackage.aely;
import defpackage.aens;
import defpackage.aent;
import defpackage.aeqc;
import defpackage.aeqe;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.ausn;
import defpackage.bzpt;
import defpackage.cauf;
import defpackage.dxyi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluo;
import defpackage.euzc;
import defpackage.fntm;
import defpackage.wwy;
import defpackage.wxf;
import defpackage.wxh;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BetterTogetherFeatureSupportIntentOperation extends IntentOperation {
    public static final ausn a = aeqc.a("BetterTogetherFeatureSupportIntentOperation");
    private final aeqe b = new aeqe();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class RetryGmsTaskBoundService extends GmsTaskBoundService {
        public static final /* synthetic */ int a = 0;

        @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
        public final int a(cauf caufVar) {
            if (!fntm.e()) {
                return 0;
            }
            startService(BetterTogetherFeatureSupportIntentOperation.a(this).putExtras(caufVar.b));
            return 0;
        }
    }

    public BetterTogetherFeatureSupportIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, BetterTogetherFeatureSupportIntentOperation.class, "com.google.android.gms.auth.proximity.UPDATE_FEATURE_SUPPORT");
    }

    private static void b(euzc euzcVar, boolean z, aecr aecrVar, Context context, aely aelyVar) {
        Status status;
        try {
            ekww a2 = ekxd.a(new wxf());
            dxyi.f(context);
            for (Account account : wxh.a(context, new wwy(context), a2)) {
                acpt acptVar = new acpt(context);
                ausn ausnVar = aent.a;
                AtomicReference atomicReference = new AtomicReference();
                try {
                    new aent(new aens(atomicReference), euzcVar.name(), z, account.name, acptVar, aelyVar, null).f(context);
                    status = (Status) atomicReference.get();
                } catch (RemoteException e) {
                    ((eluo) ((eluo) aent.a.j()).s(e)).x("Unable to setFeatureSupported (RemoteException)");
                    status = Status.d;
                } catch (bzpt e2) {
                    ((eluo) ((eluo) aent.a.j()).s(e2)).x("Unable to setFeatureSupported (OperationException)");
                    status = e2.a;
                }
                String a3 = acpw.a(status.i);
                if (status.e()) {
                    ((eluo) a.h()).T("setFeatureSupported for [%s] to %b finished with status [%s].", euzcVar.name(), Boolean.valueOf(z), a3);
                    aecrVar.a(0);
                } else {
                    ((eluo) a.j()).T("Failed to setFeatureSupported for [%s] to %b with status [%s].", euzcVar.name(), Boolean.valueOf(z), a3);
                    aecrVar.a(1);
                }
            }
        } catch (RemoteException | asxb | asxc e3) {
            ((eluo) ((eluo) a.j()).s(e3)).x("Failed to get Accounts.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.proximity.BetterTogetherFeatureSupportIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    BetterTogetherFeatureSupportIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
