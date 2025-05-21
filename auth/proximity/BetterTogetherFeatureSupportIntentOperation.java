package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aapt;
import defpackage.aapw;
import defpackage.accr;
import defpackage.acly;
import defpackage.acns;
import defpackage.acnt;
import defpackage.acqc;
import defpackage.acqe;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.asot;
import defpackage.bxhd;
import defpackage.byln;
import defpackage.dvni;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhf;
import defpackage.esjn;
import defpackage.flcd;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BetterTogetherFeatureSupportIntentOperation extends IntentOperation {
    public static final asot a = acqc.a("BetterTogetherFeatureSupportIntentOperation");
    private final acqe b = new acqe();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class RetryGmsTaskBoundService extends GmsTaskBoundService {
        public static final /* synthetic */ int a = 0;

        @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
        public final int a(byln bylnVar) {
            if (!flcd.e()) {
                return 0;
            }
            startService(BetterTogetherFeatureSupportIntentOperation.a(this).putExtras(bylnVar.b));
            return 0;
        }
    }

    public BetterTogetherFeatureSupportIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, BetterTogetherFeatureSupportIntentOperation.class, "com.google.android.gms.auth.proximity.UPDATE_FEATURE_SUPPORT");
    }

    private static void b(esjn esjnVar, boolean z, accr accrVar, Context context, acly aclyVar) {
        Status status;
        try {
            eijr a2 = eijy.a(new vbf());
            dvni.f(context);
            for (Account account : vbh.a(context, new vay(context), a2)) {
                aapt aaptVar = new aapt(context);
                asot asotVar = acnt.a;
                AtomicReference atomicReference = new AtomicReference();
                try {
                    new acnt(new acns(atomicReference), esjnVar.name(), z, account.name, aaptVar, aclyVar, null).f(context);
                    status = (Status) atomicReference.get();
                } catch (RemoteException e) {
                    ((ejhf) ((ejhf) acnt.a.j()).s(e)).x("Unable to setFeatureSupported (RemoteException)");
                    status = Status.d;
                } catch (bxhd e2) {
                    ((ejhf) ((ejhf) acnt.a.j()).s(e2)).x("Unable to setFeatureSupported (OperationException)");
                    status = e2.a;
                }
                String a3 = aapw.a(status.i);
                if (status.e()) {
                    ((ejhf) a.h()).T("setFeatureSupported for [%s] to %b finished with status [%s].", esjnVar.name(), Boolean.valueOf(z), a3);
                    accrVar.a(0);
                } else {
                    ((ejhf) a.j()).T("Failed to setFeatureSupported for [%s] to %b with status [%s].", esjnVar.name(), Boolean.valueOf(z), a3);
                    accrVar.a(1);
                }
            }
        } catch (RemoteException | aqum | aqun e3) {
            ((ejhf) ((ejhf) a.j()).s(e3)).x("Failed to get Accounts.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.proximity.BetterTogetherFeatureSupportIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    BetterTogetherFeatureSupportIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
