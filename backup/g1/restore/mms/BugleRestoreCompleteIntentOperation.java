package com.google.android.gms.backup.g1.restore.mms;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.ajwt;
import defpackage.akey;
import defpackage.akfi;
import defpackage.alhn;
import defpackage.ausi;
import defpackage.btco;
import defpackage.fodw;
import defpackage.fpmr;
import java.io.File;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BugleRestoreCompleteIntentOperation extends IntentOperation {
    private static final ajwt a = new ajwt("BugleRestoreCompleteIntentOperation");
    private static final Uri b = new Uri.Builder().scheme("content").authority("com.google.android.gms.fileprovider").appendPath("mms").build();

    private final void a() {
        try {
            ausi.e(fpmr.i() ? new File(btco.a.b(getFilesDir(), "mms")) : new File(getFilesDir(), "mms"));
            akey akeyVar = new akey(this);
            ausi.e(akeyVar.b);
            ausi.e(akeyVar.a);
            akfi.f(this);
        } catch (Exception e) {
            a.n("Error cleaning up file.", e, new Object[0]);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        alhn alhnVar = alhn.a;
        if (alhn.l(this)) {
            a.j("MMS restore is complete", new Object[0]);
            return;
        }
        if (!alhn.m(this)) {
            a.j("MMS restore was not started", new Object[0]);
            return;
        }
        if (intent == null) {
            a.j("No intent provided, ignoring", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            a.j("No action provided, ignoring", new Object[0]);
            return;
        }
        if (action.equals("com.google.android.gms.backup.g1.BUGLE_RESTORE_ABORT")) {
            a.j("MMS restore was aborted", new Object[0]);
            if (fodw.a.lK().aD()) {
                alhnVar.b(this, false);
            } else {
                alhnVar.b(this, true);
            }
            a();
            revokeUriPermission(b, 1);
            return;
        }
        if (!action.equals("com.google.android.gms.backup.g1.BUGLE_RESTORE_COMPLETE")) {
            a.j("Unrecognized action provided, ignoring", new Object[0]);
            return;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.backup.g1.BUGLE_RESTORE_RESULT_CODE", 1);
        if (intExtra == 0) {
            alhnVar.b(this, true);
            a();
            a.j("MMS restore completed successfully", new Object[0]);
        } else if (intExtra == 1) {
            a.j("MMS restore failed", new Object[0]);
        } else if (intExtra != 2) {
            a.j("MMS restore completed; result code is unrecognized", new Object[0]);
        } else {
            a.j("MMS restore failed; was not default sms provider", new Object[0]);
        }
        revokeUriPermission(b, 1);
    }
}
